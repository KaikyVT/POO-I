package com.mycompany.videogames;

/*
    Crie um projeto em Java com uma classe Videogame.
    Videogame deve ter um preço (double) e componentes (String).
    Videogame deve ter uma lista de exclusivos.
    O usuário deve ser capaz de adicionar exclusivos na lista e visualizar todos eles.
    Videogame deve ter um método para jogar algum jogo da lista de exclusivos.
        - O método jogar jogo pode apenas printar uma mensagem dizendo qual jogo está jogando.
        - Caso o videogame seja um portátil, jogar deve gastar a bateria CASO em modo portátil.
    Nintendo Switch, Playstation 5, Xbox Series e PSVita devem ser subclasses de Videogame.
    Nintendo Switch e PSVita são portáteis, recebendo métodos de checar bateria e trocar o modo.
        - O método checar bateria deve representar a bateria do videogame.
        - O método trocar modo realmente necessita de trocar o modo do videogame.
    Playstation 5 e Nintendo Switch possuem controles interativos, tendo alguma mensagem para
        interações diversas com o controle (EX: Mexer, virar, agitar, ...).
        - Os métodos oriundos de controles interativos podem apenas printar uma mensagem.

    NA MAIN
    Crie uma instância para cada subclasse de videogame.
    Adicione ao menos 2 exclusivos para cada videogame criado.
    Teste funcionalidades de controle e de portáteis.
    Utilize os métodos de jogar jogos, uma vez para cada videogame criado.
 */
public class Main {

    public static void main(String[] args) {

        // Criando os consoles
        Xboxseries x = new Xboxseries(5000, "Processador de ultima geração, 4k com upscaling");
        NintendoSwitch n = new NintendoSwitch(4400, "RX 550 360p com upscaling");
        Playstation5 p = new Playstation5(3400, "Processador de última geração, 4k sem upscaling");
        Psvita pv = new Psvita(1500, "Peças um pouco datadas, mas desbloqueado, com um\n catálogo cult e diverso");

        // Adicionando exclusivos
        x.addExclusivo("Halo");
        x.addExclusivo("Sunset Overdrive");
        x.addExclusivo("Forza MotoSport 7");

        p.addExclusivo("Astro Bot");
        p.addExclusivo("God of War");
        p.addExclusivo("Gran Turismo");
        p.addExclusivo("Uncharted 4");

        n.addExclusivo("Pokémon");
        n.addExclusivo("Mario");
        n.addExclusivo("The Legend of Zelda");
        n.addExclusivo("Kirby");

        pv.addExclusivo("LittleBigPlanet Vita");
        pv.addExclusivo("Uncharted Golden Abyss");
        pv.addExclusivo("Soul Sacrifice Delta");

        // Testando funcionalidades de ControleMovimento
        p.chacoalhar(678);
        n.girar();

        // Testando funcionalidades de Portatil
        n.checaBateria();
        n.trocaModo();
        System.out.println(n.modo);     // Debug para testar se mudou o modo mesmo
        n.trocaModo();
        System.out.println(n.modo);     // Debug para testar se mudou o modo mesmo
        pv.checaBateria();
        pv.trocaModo();
        System.out.println(pv.modo);     // Debug para testar se mudou o modo mesmo
        pv.trocaModo();
        System.out.println(pv.modo);     // Debug para testar se mudou o modo mesmo
        
        // Printando os exclusivos!
        p.printarExclusivos();
        x.printarExclusivos();
        n.printarExclusivos();
        pv.printarExclusivos();

        // Jogando!!!
        p.jogarJogo(0);
        x.jogarJogo(1);
        pv.jogarJogo(2);
        n.jogarJogo(3);
        
        n.checaBateria();
        pv.checaBateria();
    }
}
