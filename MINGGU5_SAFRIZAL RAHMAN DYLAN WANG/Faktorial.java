import java.util.Scanner;
public class Faktorial {
    public int nilai;

    public long faktorialBF(int n) {
        long result = 1;
        int i = 1;
        while (i <= n) {
            result *= i;
            i++;
        }
        return result;
    }
    
    // public int faktorialBF(int n){
    //     int fukto = 1;
    //     for (int i = 1; i <= n; i++){
    //         fukto = fukto * i;
    //     }
    //     return fukto;
    // }

    public int faktorialDC(int n){
        if (n==1) {
            return 1;
        }
        else 
        {
            int fukto = n * faktorialDC(n-1);
            return fukto; 
        }
    }
}
