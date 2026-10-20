public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println("Media: " + media);
        String sinopse;
        sinopse = """
                Filme Top Gun: 
                Maverick, sequência do filme Top Gun de """ + anoDeLancamento + """ 
                , que traz Tom Cruise
                de volta ao papel do piloto da Marinha
                dos Estados Unidos Pete "Maverick" Mitchell.
                """;
        System.out.println("Sinopse: " + sinopse);

        int classificacao = (int) media/2;
        System.out.println("Classificação: " + classificacao + " estrelas");

        
    }
}
