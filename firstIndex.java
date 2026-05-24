import java.util.*;

class firstIndex
{
    public static int firstIndex(int[] arr, int idx, int d)
    {
        if(idx == arr.length)
        {
            return -1;
        }

        if(arr[idx] == d)
        {
            return idx;
        }
        else {
            int fai =  firstIndex(arr, idx+1, d);
            return fai;
        }
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the lenght of the array : ");
        int length = s.nextInt();
        int[] arr= new int[length];

        for(int i=0;i<length;i++)
        {
            System.out.print("Enter the "+(i+1)+" number : ");
            int data=s.nextInt();
            arr[i]=data;
        }

        System.out.print("Enter the target : ");
        int target=s.nextInt();

        int index=firstIndex(arr,0,target);
        System.out.print(index);
    }
}