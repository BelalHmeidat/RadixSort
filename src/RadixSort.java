class BucketRow {
    public final LnList [] BUCKETROW = new LnList[10];
    public BucketRow(){
        for (int i = 0; i < 10; i++){
            BUCKETROW[i] = new LnList();
        }
    }
    //combines the data from all buckets ordered from left to right of the bucket row and from top to bottom of the linked list
    //Takes the size of the array to be sorted and retunrs a new modified one
    public int [] combine(int arrSize){
        int [] arr = new int[arrSize];
        int index = 0;
        for (int i = 0; i < 10; i++){
            LnNode current = BUCKETROW[i].getFirst();
            while (current != null){
                arr[index] = (int) current.data;
                index++;
                current = current.next;
            }
        }
        return arr;
    }
    //Prints buckets data
    public void print(){
        for (int i = 0; i < BUCKETROW.length; i++){
            BUCKETROW[i].print();
            System.out.println("----------------");
        }
    }

}
//sorts a given integer array by radix
public class RadixSort {
    public static int getMaxLength(int arr[]){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int length = 0;
        while (max > 0){
            max /= 10;
            length++;
        }
        return length;
    }
    public static int [] sort(int arrayToBeSorted[]){
        int [] arr = arrayToBeSorted;
        if (arr.length == 0) return null; //if array is empty return null
        int length = getMaxLength(arr); //max number of digits
        int N = 0;
        for (int i =0; i < length; i++) { //Loops over the max number of digits
            int divider = (int) Math.pow(10, i); //divides to get the next digit
            BucketRow bucketRow = new BucketRow(); //one bucket used only
            for (int j = 0; j < arr.length; j++) {
                N = arr[j]/divider; //gets the needed digit
                if (N % 10 == 0) bucketRow.BUCKETROW[0].addLast(arr[j]); //0 bucket
                if (N % 10 == 1) bucketRow.BUCKETROW[1].addLast(arr[j]); //1 bucket
                if (N % 10 == 2) bucketRow.BUCKETROW[2].addLast(arr[j]); //2 bucket
                if (N % 10 == 3) bucketRow.BUCKETROW[3].addLast(arr[j]); //3 bucket
                if (N % 10 == 4) bucketRow.BUCKETROW[4].addLast(arr[j]); //4 bucket
                if (N % 10 == 5) bucketRow.BUCKETROW[5].addLast(arr[j]); //5 bucket
                if (N % 10 == 6) bucketRow.BUCKETROW[6].addLast(arr[j]); //6 bucket
                if (N % 10 == 7) bucketRow.BUCKETROW[7].addLast(arr[j]); //7 bucket
                if (N % 10 == 8) bucketRow.BUCKETROW[8].addLast(arr[j]); //8 bucket
                if (N % 10 == 9) bucketRow.BUCKETROW[9].addLast(arr[j]); //9 bucket
            }
//            bucketRow.print();
//            System.out.println("____________________");
            arr = bucketRow.combine(arr.length); //copies to the array after sorting each radix
//            print(arr);
        }
    return arr;
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

//    public static void main(String[] args) { //just to test
//        int [] arr = {8, 19 , 3, 235, 22, 32, 1, 4, 98, 43, 532, 4,56, 3, 64};
//        print(sort(arr));
//
//    }
}
