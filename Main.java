/**
 * Main
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("====================================================================");
        System.out.println("=       Aplikasi Prediksi Harapan Hidup Penderita Hepatitis        =");
        System.out.println("====================================================================");
        System.out.println("====================================================================");
        System.out.println("=            Dewi Aprilia, Dinda Rahma, Levina Lintang             =");
        System.out.println("====================================================================");
        Input coba1 = new Input();

        System.out.println("******************************************************************");
        System.out.println("Metode Bayes");
        if (coba1.getPeluangHidup()>coba1.getPeluangMati()){
            System.out.println("hasilnya hidup");
            System.out.println("peluang hidup: "+ coba1.getPeluangHidup());
            System.out.println("peluang mati: "+ coba1.getPeluangMati());
        } else if (coba1.getPeluangHidup() == coba1.getPeluangMati()) {
            System.out.println("hasilnya tidak ditemukan");
            System.out.println("peluang hidup: " + coba1.getPeluangHidup());
            System.out.println("peluang mati: " + coba1.getPeluangMati());
        }
        else{
            System.out.println("hasilnya mati");
            System.out.println("peluang hidup: "+ coba1.getPeluangHidup());
            System.out.println("peluang mati: "+ coba1.getPeluangMati());
        }
        
    }
    
}