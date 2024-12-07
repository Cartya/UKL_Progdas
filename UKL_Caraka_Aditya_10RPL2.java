package ukl_caraka_aditya_10rpl2;

import java.util.Scanner;

public class UKL_Caraka_Aditya_10RPL2 {
    // soal Mudah no.1
    public static void main(String[] args) {
        Scanner start = new Scanner(System.in);

        int pilihan_menu, harga = 0, diskon = 0, kembalian, harga_akhir = 0, bayar;
        String menu = null, isMember;

        while (true) {
            System.out.println("=========");
            System.out.println("Selamat Datang di Hoops Store");
            System.out.println("Apakah Anda seorang member? (ya/tidak): ");
            isMember = start.next();

            System.out.println("Apa yang mau Anda beli?");
            System.out.println("1. Bola Basket\n2. Sepatu Basket\n3. Compression Shirt");
            System.out.println("Catatan: Diskon hanya untuk member!");
            System.out.println("Diskon: Pembelian 100k - 200k = 10%, Pembelian 200k ke atas = 20%");
            System.out.println("Apa yang mau Anda beli? (ketik angka sesuai pilihan): ");

            pilihan_menu = start.nextInt();
            if (pilihan_menu == 1) {
                menu = "Bola Basket";
                harga = 90000;
                harga_akhir = harga;
            } else if (pilihan_menu == 2) {
                menu = "Sepatu Basket";
                harga = 400000;
                if (isMember.equalsIgnoreCase("ya")) {
                    diskon = 20;
                    harga_akhir = harga - (harga * diskon / 100);
                } else {
                    harga_akhir = harga;
                }
            } else if (pilihan_menu == 3) {
                menu = "Compression Shirt";
                harga = 120000;
                if (isMember.equalsIgnoreCase("ya")) {
                    diskon = 10;
                    harga_akhir = harga - (harga * diskon / 100);
                } else {
                    harga_akhir = harga;
                }
            }

            System.out.println("=========");
            System.out.println("Baik, barang yang Anda pesan adalah " + menu);
            System.out.print("Detail pesanan: ");

            if (isMember.equalsIgnoreCase("ya") && diskon > 0) {
                System.out.println("Anda mendapatkan diskon sebesar " + diskon + "%!");
                System.out.println(menu + " - Rp. " + harga + " dikurangi diskon menjadi: Rp. " + harga_akhir);
            } else {
                System.out.println(menu + " - Rp. " + harga_akhir);
                if (!isMember.equalsIgnoreCase("ya")) {
                    System.out.println("Catatan: Anda tidak mendapatkan diskon karena bukan member.");
                }
            }

            System.out.println("=========");
            System.out.println("Silakan membayar");
            System.out.println("Berapa nominal uang Anda? (masukkan angka): ");
            bayar = start.nextInt();

            if (bayar == harga_akhir) {
                System.out.println("Uang Anda pas! Silakan diterima.");
            } else if (bayar < harga_akhir) {
                System.out.println("Uang Anda kurang, silakan kembali lagi nanti.");
            } else if (bayar > harga_akhir) {
                kembalian = bayar - harga_akhir;
                System.out.println("Uang Anda lebih!");
                System.out.println("Anda menerima kembalian sebesar: Rp. " + kembalian);
                System.out.println("=========");
            }

            System.out.println("UKL mudah soal 1 selesai.");
            System.out.println("Apakah Anda ingin mengulang? (ya/tidak): ");
            String input = start.next();
            if (input.equalsIgnoreCase("tidak")) {
                System.out.println("=========");
                System.out.println("Terima kasih!");
                break;
            }
        }
    }
}
