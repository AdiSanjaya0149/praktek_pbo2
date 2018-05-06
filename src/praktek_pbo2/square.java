package praktek_pbo2;
public class square {
    double sisi;
   
    void cetakInfo(){
        System.out.println("=================");
        System.out.println("sisi : "+sisi);
        System.out.println("=================");
        
                
    }
    double hitungLuas(){
        double luas;
        luas=sisi*sisi;
        return luas;
    }
}
