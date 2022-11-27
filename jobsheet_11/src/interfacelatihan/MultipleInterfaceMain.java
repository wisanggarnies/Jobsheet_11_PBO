package interfacelatihan;

public class MultipleInterfaceMain {
    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();

        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");

        //pakrektor.beriSertifikatMawapres(sarjanaCumlaude);
        pakrektor.beriSertifikatMawapres(masterCumlaude);
    }
}
