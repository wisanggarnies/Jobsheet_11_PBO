package interfacelatihan;

public class Sarjana extends Mahasiswa implements ICumlaude {
    
    public Sarjana(String nama) {
        super (nama);
    }

    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,51");
    }
}
