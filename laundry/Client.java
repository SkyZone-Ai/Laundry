package laundry;


import java.util.ArrayList;
public class Client implements User{
    
    private ArrayList<String> namaClient = new ArrayList<String>(); 
    private ArrayList<String> alamat = new ArrayList<String>(); 
    private ArrayList<String> telepon = new ArrayList<String>(); 
    private ArrayList<Integer> saldo = new ArrayList<Integer>();

    public Client() {
        this.namaClient.add("Ahmad");
        this.alamat.add("Dau");
        this.telepon.add("\t081455392");
        this.saldo.add(25000);
        this.namaClient.add("Favian");
        this.alamat.add("Lowokwaru");
        this.telepon.add("083527047");
        this.saldo.add(50000);
        this.namaClient.add("Aziz");
        this.alamat.add("Sawojajar");
        this.telepon.add("0827");
        this.saldo.add(75000);
    }
    public void setSaldo(int saldo){
        this.saldo.add(saldo);
    }
    public int getSaldo(int idClient){
        return this.saldo.get(idClient);
    }
    public void editSaldo(int idClient, int saldo){
        this.saldo.set(idClient, saldo);
    }
    public int getJmlClient(){
        return this.saldo.size();
    }
    @Override
    public void setNama(String nama){
    }
      @Override
    public String getNama(int idClient) {
        return this.namaClient.get(idClient);
}
    @Override
    public void setAlamat(String Alamat){
    }
    @Override
    public String getAlamat(int idClient){
        return this.alamat.get(idClient);
    }
    @Override
    public void setTelepon(String telepon){
        
    }
     @Override
    public String getTelepon(int idClient) {
        return this.telepon.get(idClient);
}

    int getJmlClient() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}