public class sumpitak {
    public int elemen;
    public double keuntungan[];
    public double total;

    sumpitak(int elemen){
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
        this.total = 0;
    }

    double totalBF(double arr[]){
        for (int i = 0; i < elemen; i++) {
            total = total + arr[i];
        }
        return total;
    }

    double totalDC(double arr[], int l, int r){
        if (l==r) {
            return arr[l];
        } else if (l<r) {
            int mid=(l+r)/2;
            double lsumpitak=totalDC(arr,l,mid); // Corrected here
            double rsumpitak=totalDC(arr,mid+1,r); // Corrected here
            return lsumpitak+rsumpitak;
        }
        return 0;
    }
    // public int elemen;
    // public double keuntungan[];
    // public double total;

    // sumpitak(int elemen){
    //     this.elemen = elemen;
    //     this.keuntungan = new double[elemen];
    //     this.total = 0;
    // }

    // double totalBF(double arr[]){
    //     for (int i = 0; i < elemen; i++) {
    //         total = total + arr[i];
    //     }
    //     return total;
    // }

    // double totalDC(double arr[], int l, int r){
    //     if (l==r) {
    //         return arr[l];
    //     } else if (l<r) {
    //         int mid=(l+r)/2;
    //             double lsumpitak=totalDC(arr,l,mid-l);
    //             double rsumpitak=totalDC(arr,mid+l,r);
    //             return lsumpitak+rsumpitak+arr[mid];
    //         }
    //     return 0;
    // }
}
