import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1){
            System.out.println("Digite a nota do filme ou -1 para sair: ");
            nota = leitura.nextDouble();

            if (nota != -1) {
            mediaAvaliacao += nota;
            totalDeNotas++;
            }
            
        }

        System.out.println("Media de avaliação: " + mediaAvaliacao/3);
       
    }
    
}
