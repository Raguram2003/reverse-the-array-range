import java.util.Arrays;
import java.util.Scanner;
class Solution{
    public int[] Reverserange(int[] arr ,int start,int stop )
    {
        int arrLength = stop + start;
        int[] arra = new int[arr.length];
        arra = arr;
        if(arrLength % 2 == 0)
        {
            arrLength = (arrLength/2)-1;
        }
        else {
            arrLength = (arrLength/2);
        }
        int temp;
        int j=stop;
        for(int i=start;i<=arrLength;i++){
            temp=arra[i];
            arra[i] = arra[j];
            arra[j] = temp;
            j--;
        }
        return arra;
    }
}
public class ReverseTheRange {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int sizeOfArray = sc.nextInt();
        int[] arr = new int[sizeOfArray];
        System.out.print("Enter the Elements of the array : ");
        for(int i=0;i<sizeOfArray;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the start index : ");
        int start = sc.nextInt();
        System.out.print("enter the stop index : ");
        int stop = sc.nextInt();
        Solution answer = new Solution();

        System.out.println("after reversed the array : "+ Arrays.toString(answer.Reverserange(arr, start, stop)));
    }
}
