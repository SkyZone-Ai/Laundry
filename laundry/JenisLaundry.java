package laundry;
import java.util.ArrayList;

public class JenisLaundry {
    String namaLaundry = "\t Anzia Laundry";
    
  private ArrayList<String> JenisLaundry = new ArrayList<String>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    private ArrayList<Integer> durasi = new ArrayList<Integer>();
   
     public JenisLaundry() {
        this.JenisLaundry.add("Cuci Setrika");
        this.harga.add(15000);
        this.durasi.add(120);
        this.JenisLaundry.add("Cuci Lipat");
        this.harga.add(10000);
        this.durasi.add(90);
        this.JenisLaundry.add("Cuci Kering");
        this.harga.add(5000);
        this.durasi.add(60);
     }
      public int getJmlLaundry() {
        return this.JenisLaundry.size();
    }

    public void setNamaLaundry(String namaBarang) {
        this.JenisLaundry.add(namaBarang);
    }

    public String getNamaLaundry(int idLaundry) {
        return this.JenisLaundry.get(idLaundry);
    }

    public void setHarga(int harga) {
        this.harga.add(harga);
    }

    public int getHarga(int idLaundry) {
        return this.harga.get(idLaundry);
    }
    public void editHarga(int idLaundry, int harga) {
        this.harga.set(idLaundry, harga);
    }

    public void setDurasi(int Durasi) {
        this.durasi.add(Durasi);
    }

    public int getDurasi(int idLaundry) {
        return this.durasi.get(idLaundry);
    }
}