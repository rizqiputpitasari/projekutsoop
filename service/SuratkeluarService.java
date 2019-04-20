package service;

import java.util.LinkedList;
import java.util.List;

import model.Suratkeluar;

public class SuratkeluarService {

    private static List<Suratkeluar> data = new LinkedList<>();

    public void addData(Suratkeluar sk) {
        data.add(sk);
        System.out.println("data tersimpan");
    }

    public void updateData(Suratkeluar sk) {
        int result = data.indexOf(sk);
        
        if(result >= 0) {
            data.set(result, sk);
            System.out.println("data telah diubah");
        } else {
            System.out.println("data yang ingin diubah tidak ditemukan");
        }
    }

    public void deleteData(Suratkeluar sk) {
        int result = data.indexOf(sk);

        if(result >= 0) {
            data.remove(result);
            System.out.println("data telah terhapus");
        } else {
            System.out.println("Data yang ingin dihapus tidak ada");
        }
    }

    public List<Suratkeluar> getAllData() {
        return data;
    }

}