package interfacelatihan;

import interfacelatihan.ICumlaude;
import interfacelatihan.Mahasiswa;
import interfacelatihan.PascaSarjana;
import interfacelatihan.Rektor;
import interfacelatihan.Sarjana;

public class interfacemain {
    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();

        //Mahasiswa mhs = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");

        //parektor.beriSertifikatCumlaude(mhsBiasa);
        pakrektor.beriSertifikatCumlaude(sarjanaCumlaude, sarjanaCumlaude);
        pakrektor.beriSertifikatCumlaude(masterCumlaude, masterCumlaude);
    }
}
