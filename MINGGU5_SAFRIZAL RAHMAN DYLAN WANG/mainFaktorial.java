
import java.util.Scanner;

public class mainFaktorial {
    public static void main(String[] args) {
        Scanner Fukto19 = new Scanner(System.in);
        
        System.out.println("===========================================");    
        System.out.println("masukkan jumlah elemen yang ingin di ijir"); 
        int elemen = Fukto19.nextInt();

        Faktorial [] fk = new Faktorial[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial();
            System.out.println("MASUKKAN AJA data ke -"+ (i+1)+ "::");
            fk[i].nilai = Fukto19.nextInt();
        }
        
        System.out.println("===========================================");    
        System.out.println("Hasil FAKTORIAL dengan brute force"); 
        for (int i = 0; i < elemen; i++) {
            long start = System.nanoTime();
            System.out.println("FAKTORIAL DARI NILAI -"+fk[i].nilai+ "adalah ::"+fk[i].faktorialBF(fk[i].nilai));
            long end = System.nanoTime();
            System.out.println("Execution time: " + (end - start) + " ns");
        }
        
        System.out.println("===========================================");    
        System.out.println("Hasil FAKTORIAL dengan DIVIDE Qoncueror"); 
        for (int i = 0; i < elemen; i++) {
            long start = System.nanoTime();
            System.out.println("FAKTORIAL DARI NILAI -"+fk[i].nilai+ "adalah ::"+fk[i].faktorialDC(fk[i].nilai));
            long end = System.nanoTime();
            System.out.println("Execution time: " + (end - start) + " ns");
        }
        
        System.out.println("===========================================");    
        System.out.println("TEKNIK PANGAN"); 
    }
}

// public class mainFaktorial {
    
//     public static void main(String[] args) {
//         Scanner Fukto19 = new Scanner(System.in);
        
//         System.out.println("===========================================");    
//         System.out.println("masukkan jumlah elemen yang ingin di ijir"); 
//         int elemen = Fukto19.nextInt();

//         Faktorial [] fk = new Faktorial[elemen];
//         for (int i = 0; i < elemen; i++) {
//             fk[i] = new Faktorial();
//             System.out.println("MASUKKAN AJA data ke -"+ (i+1)+ "::");
//             fk[i].nilai = Fukto19.nextInt();
            
//         }
        
//         System.out.println("===========================================");    
//         System.out.println("Hasil FAKTORIAL dengan brute force"); 
//         for (int i = 0; i < elemen; i++) {
//             System.out.println("FAKTORIAL DARI NILAI -"+fk[i].nilai+ "adalah ::"+fk[i].faktorialBF(fk[i].nilai));
//         }
        
//         System.out.println("===========================================");    
//         System.out.println("Hasil FAKTORIAL dengan DIVIDE Qoncueror"); 
//         for (int i = 0; i < elemen; i++) {
//             System.out.println("FAKTORIAL DARI NILAI -"+fk[i].nilai+ "adalah ::"+fk[i].faktorialDC(fk[i].nilai));
//         }
        
//         System.out.println("===========================================");    
//         System.out.println("TEKNIK PANGAN"); 
//         // for (int i = 0; i < elemen; i++) {
//         //     System.out.println("FAKTORIAL DARI NILAI -"+fk[i].nilai+ "adalah ::"+fk[i].faktorialBF(fk[i].nilai));
//         // }

//     }
//     // int elemen = int.nextInt(0);
    
// }
