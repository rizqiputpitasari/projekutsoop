import java.util.LinkedList;
import java.util.Scanner;
import model.*;
import service.*;

public class Aplikasi {

    private static Scanner scanner;
    private static SuratkeluarService service;

    public static void main(String args[]) {
        int opsi = 0;
        scanner = new Scanner(System.in);
        service = new SuratkeluarService();

        do {
            cetakMenu();
            opsi = scanner.nextInt();
            switch(opsi) {
                case 1 :
                  modulAdd();
                  break;
                case 2 :
                  ubahData(); break;
                case 3 :
                  hapusData(); break;
                case 4 :
                  tampilData();
                  break;
            }
        } while(opsi != 0);

    }

    private static void cetakMenu() {
        System.out.println("\n\n");
        System.out.println("APLIKASI SURAT KELUAR");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Tampilkan data");
        System.out.println("---------------------");
        System.out.println("0. KELUAR");
        System.out.println("\n");
        System.out.print("Pilihan > ");
    }

    private static void modulAdd() {
        String nomor, hal, tanggal_keluar, alamat;

        System.out.println("--- tambah data ---");
        System.out.print("nomor : ");
        scanner = new Scanner(System.in);
        nomor = scanner.nextLine();
        System.out.print("hal : ");
        hal = scanner.nextLine();
        System.out.print("tanggal_keluar : ");
        tanggal_keluar = scanner.nextLine();
        System.out.print("alamat : ");
        alamat = scanner.nextLine();
        service.addData(new Suratkeluar(nomor, hal, tanggal_keluar, alamat));
    }

    private static void tampilData() {
        LinkedList<Suratkeluar> result = (LinkedList<Suratkeluar>) service.getAllData();

        int i=1;
        for(Suratkeluar sk : result) {
            System.out.println("data ke-" + i++);
            System.out.println("  nomor: " + sk.getNomor());
            System.out.println("  hal: " + sk.getHal());
            System.out.println("  tanggal_keluar: " + sk.getTanggal_keluar());
            System.out.println("  alamat: " + sk.getAlamat());
        }
    }

    private static void ubahData() {
        String nomor, hal, tanggal_keluar, alamat;

        System.out.println("--- perubahan data ---");
        System.out.print("nomor : ");
        scanner = new Scanner(System.in);
        nomor = scanner.nextLine();
        System.out.print("hal : ");
        hal = scanner.nextLine();
        System.out.print("tanggal_keluar : ");
        tanggal_keluar = scanner.nextLine();
        System.out.print("alamat : ");
        alamat = scanner.nextLine();
        service.updateData(new Suratkeluar(nomor, hal, tanggal_keluar, alamat));
    }

    private static void hapusData() {
        String nomor;

        System.out.println("--- hapus data ---");
        System.out.print("nomor : ");
        scanner = new Scanner(System.in);
        nomor = scanner.nextLine();
        service.deleteData(new Suratkeluar(nomor, null, null, null));
    }

}