

public abstract class Kendaraan {
    //abstract termasuk class
    //cara menggunakan keyword extends
    
    String merk; //abstract diperbolehkan mendifinisikan variabel tanpa nilai
    private int tahun;//abstact doiperbolehkan menggunakan modifer private
    protected String warna;//abstract diperbolehkan menggunkan modifer proteceted
    
    abstract void infoKendaraan();//method yg menggunakan keyword abstact hanya dituliskan header method
    
    //abstact memperbolehkan method dengan implementasi program
    void infoKendaraanAbstract(){
        
    }
}
