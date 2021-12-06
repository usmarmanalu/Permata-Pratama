package com.mycompany.Pbo;

import java.io.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

class tanggal  {
    public String getTanggal(){
        DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }
}

public class Project1 {
    public static void main(String[] args)throws IOException {  
        InputStreamReader Keyreader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(Keyreader);
        
        int i,jd;
        int jumlahtotal=0;
        String namapetugas;
        System.out.println("PT. PERMATA PRATAMA");
        System.out.println("");
        
        System.out.println("Masukkan nama petugas : ");
        namapetugas = input.readLine();
        tanggal tgl = new tanggal();
        System.out.println("Tanggal : "+ tgl.getTanggal());
        System.out.println(" ");
        
        
        String[] kodebarang = new String[10];
        String[] namabarang = new String[10];
        int[] jumlahbarang = new int[10];
        int[] hargabarang = new int[10];
        int[] totalharga = new int[10];
        
        String tanya ="";
        
        do {
            System.out.println("Jumlah data yang dimasukkan : ");
            jd = Integer.parseInt(input.readLine());
            System.out.println("");
            
            for(i=1; i<=jd; i++) {
                System.out.println("Date Ke- "+i);
                System.out.println("Kode Barang[P0001] [V0001] [M0001]");
                kodebarang[i] = input.readLine();
                System.out.println("Jumlah Barang : ");
                jumlahbarang[i] = Integer.parseInt(input.readLine());
                
                System.out.println(" ");
                
                if (kodebarang[i].equalsIgnoreCase("P0001")) {
                    namabarang[i] = "Printer    ";
                    hargabarang[i] = 700000;
                }else if (kodebarang[i].equalsIgnoreCase("V0001")) {
                    namabarang[i] = "VGA card   ";
                    hargabarang[i] = 75000;
                }else if (kodebarang[i].equalsIgnoreCase("M0001")){
                    namabarang[i] = "Motherboard";
                    hargabarang[i] = 950000;
                }else {
                    System.out.println("Maaf Kode Barang Tidak Tersedia");
                }
            }
            System.out.println("                       \t\tPT. PERMATA PRATAMA");
            System.out.println(" ");
            System.out.println("Nama Petugas : "+namapetugas + "\t\t\t\t\t"+"Tanggal : "+tgl.getTanggal());
            System.out.println("Jumlah data yang dimasukkan : "+jd);
            System.out.println(" ");
            System.out.println("Data ke \t Kode Barang \t Nama Barang \t Harga Barang \t Jumlah Barang \t Total Harga");
            System.out.println(" ");
            
            for(i=1; i<=jd; i++) {
                totalharga[i] = jumlahbarang[i] * hargabarang[i];
                System.out.println(i +"\t "+ kodebarang[i] + "\t\t "+ namabarang[i]+ " \t "+ hargabarang[i]+ "\t\t "+jumlahbarang[i]+"\t\t "+totalharga[i]);
                jumlahtotal = jumlahtotal+(jumlahbarang[i] * hargabarang[i]);
                System.out.println(" ");
            }
                System.out.println("Total Pendapatan pada tanggal"+" "+tgl.getTanggal()+" "+"adalah sebesar"+" "+jumlahtotal);
                System.out.println("Ingin input data lagi ?");
                tanya = input.readLine();
            }while(tanya.equals("y")|| tanya.equals("Y"));        
        }
    }
