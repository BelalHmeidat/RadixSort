class BucketRow {
    static final int BUCKETSIZE = 20;
    final int [] [] BUCKETROW = new int[10][BUCKETSIZE];

    BucketRow(){}

}
public class Main {
    public static void arraySort(int arr[]){
        if (arr.length == 0 || arr.length > BucketRow.BUCKETSIZE) return;
        BucketRow firstRow = new BucketRow();
        BucketRow secondRow = new BucketRow();
        for (int i =0; i < arr.length; i++) {
            if (arr[i] % 10 == 0) firstRow.BUCKETROW[0][i] = arr[i];
            if (arr[i] % 10 == 1) firstRow.BUCKETROW[1][i] = arr[i];
            if (arr[i] % 10 == 2) firstRow.BUCKETROW[2][i] = arr[i];
            if (arr[i] % 10 == 3) firstRow.BUCKETROW[3][i] = arr[i];
            if (arr[i] % 10 == 4) firstRow.BUCKETROW[4][i] = arr[i];
            if (arr[i] % 10 == 5) firstRow.BUCKETROW[5][i] = arr[i];
            if (arr[i] % 10 == 6) firstRow.BUCKETROW[6][i] = arr[i];
            if (arr[i] % 10 == 7) firstRow.BUCKETROW[7][i] = arr[i];
            if (arr[i] % 10 == 8) firstRow.BUCKETROW[8][i] = arr[i];
            if (arr[i] % 10 == 9) firstRow.BUCKETROW[9][i] = arr[i];
        }
            else secondRow.BUCKETROW[0][i] = arr[i];
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}