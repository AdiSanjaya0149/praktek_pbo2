package praktek_pbo2;
public class square {
    double sisi;

    public square() {
        sisi=10;
    }
    
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
      void cetakLuas(){
        System.out.println("Luasnya adalah:"+hitungLuas());
    }
}
