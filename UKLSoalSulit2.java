
package uklsoalsulit2;
import java.util.Scanner;
import java.util.ArrayList;

public class UKLSoalSulit2 {
    private static ArrayList<Integer> data = new ArrayList<Integer>();
    
    public static void input(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan angka ('n' untuk selesai)");
        String input = scanner.next();
        
        if (input.equalsIgnoreCase("n")) {
            output();
        } else {
            data.add(Integer.valueOf(input));
            input();
        }
    }
    
    public static void output() {
        ArrayList<String> negatif = new ArrayList<String>();
        
//        for (int angka : data) {
//            if (angka < 0) {
//                negatif.add(String.valueOf(angka));
//            }
//        }

        for (int index = 0; index < data.size(); index++) {
            Integer angka = data.get(index);
            
            if (angka > 0) {
                negatif.add(String.valueOf(angka));
            }
        }
        
        if (!negatif.isEmpty()) {
            System.out.print("Array mengandung elemen negatif: ");
            System.out.println(String.join(", ", negatif));
        }else if(negatif.isEmpty()){
            System.out.println("Array tidak mengandung elemen negatif.");
        }
    }
    
    public static void main(String[] args) {
        input();
    }
    
}
