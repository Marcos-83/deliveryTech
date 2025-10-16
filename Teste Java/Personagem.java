import java.util.Scanner;

/*
     ** Rank dos ninjas
     * Gennin
     * Chunnin
     * Jonin
     * 
     **Solicitar os dados do primeiro ninja (Personagem - Naruto)
     * nome
     * idade
     * nível de poder
     * número de missões 
     * *Condições
     * 
     * Repete o processo para o segundo ninja (Personagem - Rock Lee)
     * Exibir resultado final - Comparando o nível dos ninjas.
     * fechar o Scanner
     * 
     * Objetivo: Criar classe e criar condições utilizando o nivelPoder, numeroDeMissoes
     */

public class Personagem {
    public static void main(String[] args) {

        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("\n" + "Cadastro do ninja one: ");
        System.out.println("Nome do ninja: ");
        String nomeOne = caixaDeTexto.nextLine();

        System.out.println("Idade do ninja: ");
        int idadeOne = caixaDeTexto.nextInt();

        System.out.println("Nível de poder: ");
        int nivelPoderOne = caixaDeTexto.nextInt();

        System.out.println("Números de missões: ");
        int missoesOne = caixaDeTexto.nextInt();

        String rankingOne;      
        
        if (missoesOne == 10 && nivelPoderOne > 15) {
            rankingOne = "Ranking: Chunin";
        } else if (missoesOne >= 20) {
            rankingOne = "Ranking: Jounin";
        } else {
            rankingOne = "Ranking: Genin";
        }

        System.out.println("\n Resultado Ninja One: ");

        System.out.println("Nome: " + nomeOne);
        System.out.println("Idade: " + idadeOne);
        System.out.println("Nível de poder: " + nivelPoderOne);
        System.out.println("Número de missões: " + missoesOne);
        System.out.println("Ranking" + rankingOne);
        System.out.println("\n------------------------------\n");

        caixaDeTexto.nextLine(); // Consumir a quebra de linha pendente


        System.out.println("\n" + "Cadastro do ninja Two: ");
        System.out.println("Nome do ninja: ");
        String nomeTwo = caixaDeTexto.nextLine();

        System.out.println("Idade do ninja: ");
        int idadeTwo = caixaDeTexto.nextInt();

        System.out.println("Nível de poder: ");
        int nivelPoderTwo = caixaDeTexto.nextInt();

        System.out.println("Números de missões: ");
        int missoesTwo = caixaDeTexto.nextInt();

        String rankingTwo;      
        
        if (missoesTwo == 10 && nivelPoderTwo > 15) {
            rankingTwo = "Ranking: Chunin";
        } else if (missoesTwo >= 20) {
            rankingTwo = "Ranking: Jounin";
        } else {
            rankingTwo = "Ranking: Genin";
        }

        System.out.println("\n Resultado Ninja Two: ");

        System.out.println("Nome: " + nomeTwo);
        System.out.println("Idade: " + idadeTwo);
        System.out.println("Nível de poder: " + nivelPoderTwo);
        System.out.println("Número de missões: " + missoesTwo);
        System.out.println("Ranking" + rankingTwo);
        System.out.println("\n------------------------------\n");
        
        
        System.out.println("\n----- Comparação Final -----\n");

        if (nivelPoderOne > nivelPoderTwo) {
            System.out.println("O ninja " + nomeOne + " é mais forte que o ninja " + nomeTwo);
        } else if (nivelPoderTwo > nivelPoderOne) {
            System.out.println("O ninja " + nomeTwo + " é mais forte que o ninja " + nomeOne);
        } else {
            System.out.println("Os dois ninjas possuem o mesmo nível de poder.");
        }
        

        caixaDeTexto.close();
    }
}

