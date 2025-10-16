public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        String nome = "Naruto Uzumaki";

        String nomeMaiusculo = nome.toUpperCase();

        System.out.println("\n");
        System.out.println("Este texto está em Maiúsculo: " + nomeMaiusculo);
        
        String aldeia = "Vila da Folha";
        
        String aldeiaMinusculo = aldeia.toLowerCase();
        
        System.out.println("\n");
        System.out.println("O nome da aldeia do " + nome + " está em minúsculo " + aldeiaMinusculo);
    }
}
