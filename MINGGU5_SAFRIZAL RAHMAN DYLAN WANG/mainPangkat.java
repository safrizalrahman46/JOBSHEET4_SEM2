import java.util.Scanner;
public class mainPangkat {
    public static void main(String[] args) {
        
        Scanner pangto19 = new Scanner(System.in);

        System.out.println("===========================================");    
        System.out.println("masukkan jumlah elemen yang ingin di ijir");
        int elemen = pangto19.nextInt();

        pangkatpangkatan [] punk = new pangkatpangkatan[elemen];

        for (int i = 0; i < elemen;i++) {
            punk[i] = new pangkatpangkatan();
            System.out.println("Masukkan nilai yang akan dipangkatkan ke "+ (i+1)+ "::::");
            punk[i].nilai = pangto19.nextInt();
            System.out.println("Masukkan nilai yang PEMANGKAT KE"+ (i+1)+ "::::");
            punk[i].pangkat = pangto19.nextInt(); // This line was corrected
        }

        System.out.println("Choose a method:");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        int choice = pangto19.nextInt();

        if (choice == 1) {
            System.out.println("===========================================");    
            System.out.println("Hasil pangkat dengan brute force"); 
            for (int i = 0; i < elemen; i++) {
                long start = System.nanoTime();
                System.out.println("pangkat DARI NILAI -"+punk[i].nilai+"pangkat " +punk[i].pangkat +"adalah ::"+punk[i].pangkatBF(punk[i].nilai,punk[i].pangkat));
                long end = System.nanoTime();
                System.out.println("Execution time: " + (end - start) + " ns");
            }
            // Run brute force method
        } else if (choice == 2) {
            System.out.println("===========================================");    
            System.out.println("Hasil pangkat dengan DIVIDEN force"); 
            for (int i = 0; i < elemen; i++) {
                long start = System.nanoTime();
                System.out.println("pangkat DARI NILAI -"+punk[i].nilai+"pangkat " +punk[i].pangkat +"adalah ::"+punk[i].pangkatDC(punk[i].nilai,punk[i].pangkat));
                long end = System.nanoTime();
                System.out.println("Execution time: " + (end - start) + " ns");
            }
            // Run divide and conquer method
        } else {
            System.out.println("Invalid choice");
            System.out.println("===========================================");    
            System.out.println("TEKNIK PANGAN"); 
        }
        

        // System.out.println("===========================================");    
        // System.out.println("Hasil pangkat dengan brute force"); 
        // for (int i = 0; i < elemen; i++) {
        //     long start = System.nanoTime();
        //     System.out.println("pangkat DARI NILAI -"+punk[i].nilai+"pangkat " +punk[i].pangkat +"adalah ::"+punk[i].pangkatBF(punk[i].nilai,punk[i].pangkat));
        //     long end = System.nanoTime();
        //     System.out.println("Execution time: " + (end - start) + " ns");
        // }
        // System.out.println("===========================================");    
        // System.out.println("Hasil pangkat dengan DIVIDEN force"); 
        // for (int i = 0; i < elemen; i++) {
        //     long start = System.nanoTime();
        //     System.out.println("pangkat DARI NILAI -"+punk[i].nilai+"pangkat " +punk[i].pangkat +"adalah ::"+punk[i].pangkatDC(punk[i].nilai,punk[i].pangkat));
        //     long end = System.nanoTime();
        //     System.out.println("Execution time: " + (end - start) + " ns");
        // }
        // System.out.println("===========================================");    
        // System.out.println("TEKNIK PANGAN"); 
    }
    //     System.out.println("===========================================");    
    //     System.out.println("masukkan jumlah elemen yang ingin di ijir");
    //     int elemen = pangto19.nextInt();

    //     pangkatpangkatan [] punk = new pangkatpangkatan[elemen];

    //     for (int i = 0; i < elemen;i++) {
    //         punk[i] = new pangkatpangkatan();
    //         System.out.println("Masukkan nilai yang akan dipangkatkan ke "+ (i+1)+ "::::");
    //         punk[i].nilai = pangto19.nextInt();
    //         System.out.println("Masukkan nilai yang PEMANGKAT KE"+ (i+1)+ "::::");
    //         punk[i].nilai = pangto19.nextInt();
    //         //#endregion
    //     }
        
    //     System.out.println("===========================================");    
    //     System.out.println("Hasil pangkat dengan brute force"); 
    //     for (int i = 0; i < elemen; i++) {
    //         long start = System.nanoTime();
    //         System.out.println("pangkat DARI NILAI -"+punk[i].nilai+"pangkat " +punk[i].pangkat +"adalah ::"+punk[i].pangkatBF(punk[i].nilai,punk[i].pangkat));
    //         long end = System.nanoTime();
    //         System.out.println("Execution time: " + (end - start) + " ns");
    //     }
    //     System.out.println("===========================================");    
    //     System.out.println("Hasil pangkat dengan DIVIDEN force"); 
    //     for (int i = 0; i < elemen; i++) {
    //         long start = System.nanoTime();
    //         System.out.println("pangkat DARI NILAI -"+punk[i].nilai+"pangkat " +punk[i].pangkat +"adalah ::"+punk[i].pangkatDC(punk[i].nilai,punk[i].pangkat));
    //         long end = System.nanoTime();
    //         System.out.println("Execution time: " + (end - start) + " ns");
    //     }
    //     System.out.println("===========================================");    
    //     System.out.println("TEKNIK PANGAN"); 
    // }
    }
