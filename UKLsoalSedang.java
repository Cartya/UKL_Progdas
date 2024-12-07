package uklsoalsedang;
import java.text.NumberFormat;
import java.util.Locale;
public class UKLsoalSedang {

    public static void main(String[] args) {
        
        //soal Sedang no.1
        int tabungan = 100000, kenaikan = 20000, totalTabungan = 0;
                
    System.out.println("Adi menabung 100000 setiap harinya");
    System.out.println("pada bulan berikutnya ia mendapat kabar gembira");
    System.out.println("uang jajannya meningkat 50000 setiap bulannya.");
    System.out.println("total tabungan Adi selama 1 tahun: 4500000");
    System.out.println("Rincian pemasukan Tabungan: ");
    
    NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
    for(int bulan=1; bulan <= 24; bulan++){
        System.out.println("Tabungan bulan ke-"+bulan+" : " + formatter.format(tabungan));
        totalTabungan += tabungan;
        tabungan += kenaikan;
    }
        System.out.println("dan bila dijumlahkan semuanya, maka Total tabungan selama 12 bulan adalah: "+formatter.format(totalTabungan));
    }
    
}
