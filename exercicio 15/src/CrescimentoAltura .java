public class CrescimentoAltura {
    public static void main(String[] args) {
        double alturaAnacleto = 1.50;  // metros
        double alturaFelisberto = 1.10; // metros

        double crescimentoAnacleto = 0.02;  // 2 centímetros = 0.02 metros por ano
        double crescimentoFelisberto = 0.03; // 3 centímetros = 0.03 metros por ano

        int anos = 0;

        // Enquanto Felisberto não for maior que Anacleto, simula o crescimento ano a ano
        while (alturaFelisberto <= alturaAnacleto) {
            alturaAnacleto += crescimentoAnacleto;
            alturaFelisberto += crescimentoFelisberto;
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para que Felisberto seja maior que Anacleto.");
    }
}
