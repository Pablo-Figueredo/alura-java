public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean IncluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022 ) {
            System.out.println("Lançamento que os clientes estão assistindo");
        } else {
            System.out.println("Filme retro que vale apena assistir");
        }

        if (IncluidoNoPlano == true && tipoPlano.equals("Plus")) {
            System.out.println("Filme disponível no plano escolhido");
        } else {
            System.out.println("Filme indisponível no plano escolhido");
        }
    }
}
