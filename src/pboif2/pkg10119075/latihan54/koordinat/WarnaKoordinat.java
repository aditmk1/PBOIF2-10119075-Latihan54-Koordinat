/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119075.latihan54.koordinat;

/**
Nama : Aditiya musthafa kamil
Kelas : PBOIF2
NIM : 10119075
Deskripsi Program : Program ini berisi program untuk menampilkan warna koordinat
 */

public class WarnaKoordinat extends Koordinat {
    public String namaWarna;
    
public WarnaKoordinat(int x,int y, String namaWarna){
    super(x,y);
    this.namaWarna = namaWarna; 
}

    public String getNamaWarna() {
        return namaWarna;
    }

    public void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
    }
}  