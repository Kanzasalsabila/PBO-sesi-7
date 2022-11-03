
import com.lingkaran.Lingkaran;
import com.segitiga.Segitiga;

public class HitungLuasArsir {
    public static void main(String[] args) {
        Lingkaran i = new Lingkaran(10);
        Segitiga s = new Segitiga(3,3);
        
        double luas_i = i.getLuasLingkaran();
        double luas_s = s.getLuasSegitiga();
        
        double hasil = luas_i - luas_s;
    }
}
