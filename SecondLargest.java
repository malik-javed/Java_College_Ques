

public class SecondLargest {
    public static void main(String[] args) {
      int arr[] = {2,4,1,9,12,10,6};
   
      int max1 = arr[0];
      int max2 = arr[0]; 
      for(int i=0; i<arr.length;i++)
      {
       if(arr[i]>max1)
       {
           max2 = max1;
           max1 = arr[i];
   
       }
       if(arr[i]<max1 && arr[i]>max2)
       {
           max2 = arr[i];
       }
      }
   
   
      System.out.println(max2);
    }   
   }
