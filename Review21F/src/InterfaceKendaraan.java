
public interface InterfaceKendaraan {
    //interface tidak menggunakan keyword cclass
    //cara menggukan keyword implements
    
    String merk=""; //interface mendefinisikan variabel harus dengan nilai awal
    int tahun = 0;//interface tidak diperbolehkan menggunakan modifier private
    String warna="";//interface tidak diperbolehkan menggunakan modifier protected
    
    public void infoKendaraan();//method yg menggunakan keyword abstact hanya dituliskan header method
    
    //interface tidak memperbolehkan method dengan implementasi    
}
