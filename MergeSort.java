import java.util.Arrays;

public class MergeSort {
    public static void conqueror(int arr[],int s,int mid ,int e)
    {
        int merged[] = new int[e-s+1];

        int index1 = s;
        int index2 = mid+1;

        int i=0;
        while(index1<=mid && index2<=e)
        {
            if(arr[index1]<=arr[index2])
            {
                merged[i++] = arr[index1++];
            }
            else{
                merged[i++] = arr[index2++];
            }
        }

        while(index1<=mid)
        {
            merged[i++] = arr[index1++];
        }

        while(index2<=e)
        {
            merged[i++] = arr[index2++];
        }

        for(int k=0,l=s;k<merged.length;k++,l++)
        {
            arr[l] = merged[k];
        }
    }

    public static void divide(int arr[],int s, int e)
    {
        if(s>=e)
        {
            return;
        }
        int mid = (s+e)/2;
        divide(arr, s, mid);
        divide(arr, mid+1, e);
        conqueror(arr, s, mid, e);
        
    }
    public static void main(String[] args) {
        int arr[] = {2,5,1,3,10,4};
        divide(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
