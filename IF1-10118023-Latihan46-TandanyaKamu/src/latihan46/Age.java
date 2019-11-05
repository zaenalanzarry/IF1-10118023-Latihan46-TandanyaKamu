/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan46;
import java.util.Scanner;

/**
 *
 * @author Zaenal PC
 */
public final class Age {
    private int yearBirth;
    private final int yearNow;
    private static final String red = "\u001B[31m";
    
    public Age(int yearNow){
        this.yearNow = yearNow;
        Scanner input = new Scanner(System.in);
        
        //input
        System.out.print("Masukkan Tahun Lahir Anda : ");
        setYearBirth(input.nextInt());
        
        //output
        System.out.println("\n======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir anda : " + getYearBirth());
        System.out.println("Hari ini tahun : " + getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + hitungUmur() + " tahun");
        System.out.println("Tandanya Kamu " + red + tandanyaKamu(hitungUmur()));
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }
    
    public int hitungUmur(){
        return yearNow - yearBirth;
    }
    
    public String tandanyaKamu(int umur){
        
        if((umur >= 0) && (umur <=5) ){
            return "LAGI LUCU-LUCU NYA";
        }
        else if((umur > 5 ) && umur <= 10 ) {
            return "MASIH ANAK-ANAK";
        }
        else if ((umur > 10) && (umur <= 13)){
            return "MASIH REMAJA";
        }
        else if((umur > 13) && (umur <= 19)){
            return "ALAY";
        }
        else if((umur > 19) && (umur <= 29)){
            return "LAGI GALAU NYARI JODOH";
        }
        else if((umur > 29) && (umur <= 35)){
            return "LAGI SIBUK NYARI UANG";
        }
        else if((umur > 35) && (umur <= 150)){
            return "SUDAH TUA";
        }
        else {
            return "TIDAK TERDETEKSI DI KEHIDUPAN";
        }        
    }
        
}
