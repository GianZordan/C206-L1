import java.util.ArrayList;
import java.util.Scanner;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Criando um arquivo
        Arquivo arq=new Arquivo();
        // Criando um Jogo
        Jogo func=new Jogo();
        // Entrada de dados
        Scanner sc=new Scanner(System.in);
        // Flag de controle
        boolean flag=true;

 // Criando os objetos
        Rockstar a=new Rockstar();
        a.setNome("Rockstar Games");
        a.setAnosExperiencia(24);
        a.setPrincipalJogo("GTA San Andreas");

        Riot b=new Riot();
        b.setNome("Riot Games");
        b.setAnosExperiencia(16);
        b.setPrincipalJogo("League of legends");

        // Lógica para vários avaliadores
        Avaliadores []avaliadores=new Avaliadores[5];

        System.out.println("---- Seja bem vindo a banca de avaliacoes para jogos ---- \n");
        System.out.println("Temos disponibilidade de duas empresas famosas no mercado para nos ajudar!!");

        avaliadores[0]=a;// Funcionário 0 é a Rockstar
        avaliadores[1]=b;// Funcionário 1 é a Riot
        for(int i=0;i< avaliadores.length;i++){
            if(avaliadores[i]!=null){
                if(avaliadores[i] instanceof Rockstar){
                    // Casting para a Rockstar
                    Rockstar auxRockstar=(Rockstar)avaliadores[i];
                    auxRockstar.mostrarInfos();

                }else if(avaliadores[i] instanceof Riot){
                    // Casting para a Riot
                    Riot auxRiot=(Riot)avaliadores[i];
                    auxRiot.mostrarInfos();

            }
        }

    }

        // Criando o menu
        while(flag){
            System.out.println("BEM VINDO AO MENU");
            System.out.println("1- Cadastrar Jogos");
            System.out.println("2- Listar Jogos");
            System.out.println("3- Avaliacao da nossa banca aos jogos cadastrados");
            System.out.println("4- Sair");
            System.out.println("Entre com a sua opcao: ");
            int opcao=sc.nextInt();
            System.out.println("\n");

            ArrayList<Jogo> jogos=arq.ler();
            sc.nextLine();
            switch(opcao){
                case 1:
                    // Atribuindo valores as informações do funcionáro
                    System.out.println("Nome do jogo: ");
                    func.setNomeJogo(sc.nextLine());
                    System.out.println("Genero do jogo: ");
                    func.setGeneroJogo(sc.nextLine());

                    arq.escrever(func);
                    break;

                case 2:
                    // Armazena o retorno do método de leitura
                    ArrayList<Jogo> games=arq.ler();

                    // Percorre o arrayList
                    for(int i=0;i<games.size();i++){
                        System.out.println("Informacoes do jogo numero "+(i+1));
                        System.out.println("Nome do jogo: " + games.get(i).getNomeJogo());
                        System.out.println("Genero do jogo: " + games.get(i).getGeneroJogo());
                        System.out.println();
                    }
                    break;

                case 3:

                    //instância um objeto da classe Random usando o construtor padrão
                        Random gerador = new Random();

                    // Percorre o arrayList e avalia os jogos
                    for(int i=0;i<jogos.size();i++){
                        System.out.println("Avaliacao do jogo numero "+(i+1));
                        System.out.println("Nome do jogo: " + jogos.get(i).getNomeJogo());
                        System.out.println("A nota foi da Rockstar para esse jogo foi de: "+gerador.nextInt(10));
                        System.out.println("A nota foi da Riot para esse jogo foi de: "+gerador.nextInt(10));
                        System.out.println();
                    } 
                    break;

                case 4:
                    flag=false;
                    break;
            }
        }
        sc.close();
    }
}
