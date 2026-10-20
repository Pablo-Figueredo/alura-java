import java.util.Scanner;

public class leitura {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner (System.in);

        System.out.println("Digite o nome do filme: ");
        String nomeFilme = leitura.nextLine();
        

        System.out.println("Digite o ano de lançamento do filme: ");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Digite a nota do filme: ");
        double notaDoFilme = leitura.nextDouble();
        
        System.out.println(nomeFilme);
        System.out.println(anoDeLancamento);
        System.out.println(notaDoFilme);
    }
    
}
