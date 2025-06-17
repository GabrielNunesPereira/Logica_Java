public class BombaRelogio {
    public static void main(String[] args) {
        try {
            // Contagem regressiva de 30 até 0
            for (int i = 30; i >= 0; i--) {
                System.out.println(i);
                Thread.sleep(1000); // Pausa de 1 segundo (1000 milissegundos)
            }

            // Mensagem final
            System.out.println("EXPLOSÃO 💥");
        } catch (InterruptedException e) {
            System.out.println("A contagem foi interrompida!");
        }
    }
}