import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        //System.out.println("Size "+size);
        int [] arr = new int[size];
        //System.out.println(arr);
        Integer [] arr1 = new Integer[size];
        int [] arr2 = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Values in Int array");
        for(Integer a:arr){
            System.out.println(a);
        }

        arr2 = Arrays.copyOf(arr,size);
    }
} 