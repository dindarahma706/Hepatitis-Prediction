import java.util.Scanner;
public class Input extends prosesPeluang{
    private String nama_pasien; //encapsulasi nilai nama pasien dengan hak akses privat
    private int usia;           //encapsulasi nilai usia pasien dengan hak akses privat
    private double bilirubin;   //encapsulasi nilai bilirubin pasien dengan hak akses privat
    private int alkPhosfat;     //encapsulasi nilai alkphosfat pasien dengan hak akses privat
    private int sgot;           //encapsulasi nilai sgot pasien dengan hak akses privat
    private double albumin;     //encapsulasi nilai albumin pasien dengan hak akses privat

    public Input(){  //encapsulasi
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan nama pasien: ");
        nama_pasien = inputan.next();
        System.out.print("Masukkan Usia pasien: ");
        usia = inputan.nextInt();
        System.out.print("Masukkan kadar bilirubin: ");
        bilirubin = inputan.nextDouble();
        System.out.print("Masukkan kadar alk Phosfat: ");
        alkPhosfat = inputan.nextInt();
        System.out.print("Masukkan kadar sgot: ");
        sgot = inputan.nextInt();
        System.out.print("Masukkan kadar albumin: ");
        albumin= inputan.nextDouble();
        super.setPeluang(usia, bilirubin, alkPhosfat, sgot, albumin);
    }
    public String getNama(){ //encapsulasi nama_pasien 
        return nama_pasien;
    }
    public int getUsia(){ //encapsulasi usia
        return usia;
    }
    public double getBilirubin(){ //encapsulasi bilirubin
        return bilirubin;
    }
    public int getAlkPhosfat(){ //encapsulasi alkPhosfat
        return alkPhosfat;
    }
    public int getsgot() { //encapsulasi sgot
        return sgot;
    }
    public double getAlbumin(){ //encapsulasi albumin
        return albumin;
    }

    

}
