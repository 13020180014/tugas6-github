/* Nama: nabilatul rahma
   Nim : 13020180014
   tgl : 16-04-2020
   pengerjaan : 12.00 
*/


public class BangunDatar{
    
    // jari-jari lingkaran
    float r;
    
   
    float luas(){
        float luas = (float) (Math.PI * r * r);
        System.out.println ("Luas lingkaran: " + luas);
        return luas;
    }
    
   
    float keliling(){
        float keliling = (float) (2 * Math.PI * r);
        System.out.println ("Keliling Lingkaran: " + keliling);
        return keliling;
    }
    
}
