package praktek_pbo2;


public class squareAksi {
    public static void main(String[] args) {
        square r1  = new square();
        r1.sisi = 8;
        
        r1.cetakInfo();
        System.out.println("Luas square = "+r1.hitungLuas());
    }
}
