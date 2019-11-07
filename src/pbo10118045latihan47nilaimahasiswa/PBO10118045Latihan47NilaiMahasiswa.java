/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan47nilaimahasiswa;

/**
 *
 * @author
 *  Nama              : Muhammad Ilham Apriyadi
 *  Kelas             : IF2
 *  NIM               : 10118045
 *  Deskripsi Program : menghitung nilai mahasiswa 
 */
public class PBO10118045Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Nilai nilai = new Nilai(75.0,45.0,34.0);
        
        System.out.println("QUIZ\t\t= "+nilai.getQuiz());
        System.out.println("UTS\t\t= "+nilai.getUts());
        System.out.println("UAS\t\t= "+nilai.getUas());
        System.out.println("");
        System.out.println("Nilai Akhir\t= "+nilai.hitungNilaiAkhir());
        System.out.println("");
        System.out.println("Index = " +nilai.Index(nilai.hitungNilaiAkhir()));
        System.out.println("Keterangan = "+nilai.Ket(nilai.Index(nilai.hitungNilaiAkhir())) );
        
    }
    
}
