import java.util.Scanner;

public class mainSumpitak {
    public static void main(String[] args) {
        Scanner pangkat19 = new Scanner(System.in);
        
        System.out.println("===========================================");    
        System.out.println("masukkan jumlah elemen yang ingin di ijir SUMPITAK"); 
        int elm = pangkat19.nextInt();

        sumpitak sumpitak = new sumpitak(elm);
        System.out.println("===============================================================");
        for (int i = 0; i < sumpitak.elemen; i++) {
            System.out.println("masukkan untung bulan ke - "+(i+1)+"===");
            sumpitak.keuntungan[i] = pangkat19.nextDouble();
        }
        
        System.out.println("===============================================================");
        System.out.println("ALGORITMA BRUTE FORCE");
        System.out.println("");
        System.out.println("Total Keuntungan PERUSAHAAN selama "+ sumpitak.elemen + "bulan adalah" + sumpitak.totalBF(sumpitak.keuntungan));
        
        System.out.println("===============================================================");
        System.out.println("ALGORITMA Dividen conquer");
        System.out.println("");
        System.out.println("Total Keuntungan PERUSAHAAN selama "+ sumpitak.elemen + "bulan adalah" + sumpitak.totalDC(sumpitak.keuntungan, 0, sumpitak.elemen-1));

    }    
    //     Scanner pangkat19 = new Scanner(System.in);
        
    //     System.out.println("===========================================");    
    //     System.out.println("masukkan jumlah elemen yang ingin di ijir SUMPITAK"); 
    //     int elm = pangkat19.nextInt();

    //     sumpitak sumpitak = new sumpitak(elm);
    //     System.out.println("===============================================================");
    //     for (int i = 0; i < sumpitak.elemen; i++) {
    //         System.out.println("masukkan untung bulan ke - "+(i+1)+"===");
    //         sumpitak.keuntungan[i] = pangkat19.nextDouble();
    //     }
        
    //     System.out.println("===============================================================");
    //     System.out.println("ALGORITMA BRUTE FORCE");
    //     System.out.println("Total Keuntungan PERUSAHAAN selama "+ sumpitak.elemen + "bulan adalah" + sumpitak.totalBF(sumpitak.keuntungan));
    //     System.out.println("ALGORITMA Dividen conquer");
    //     System.out.println("Total Keuntungan PERUSAHAAN selama "+ sumpitak.elemen + "bulan adalah" + sumpitak.totalDC(sumpitak.keuntungan, 0, sumpitak.elemen-1));

    // }    
}
