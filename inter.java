import java.util.LinkedHashMap;

public class Practice {

    public static void main(String[] args) {
        int arr[] = {-3,-2,-1,2,3,6,8};
        // System.out.println(arr[0]);
        // System.out.println(Math.abs(arr[0]));

        System.out.println(distinctValue(arr));
        

               
    }

    public static int distinctValue(int arr[])
    {
        int left=0;
        int right=arr.length-1;
        int count=0;
        while(left<=right)
        {
            int leftAbs = Math.abs(arr[left]);
            int rightAbs = Math.abs(arr[right]);

            if(leftAbs == rightAbs)
            {
                left++;
                right--;
                count++;
                
            }
            else if(leftAbs > rightAbs)
            {
                left++;
                count++;
            }
            else{
                right--;
                count++;
            }
        }

        return count;
    }

    // --------------- Using LinkedHashMap -> have Insertion Order ---------------
    // --------------- Time = O(n) --------------------------
    // public static int unique(int arr[])
    // {
    //     LinkedHashMap<Integer,Integer> hm = new LinkedHashMap<>();
        
    //     for(int num : arr)
    //     {
    //         if(hm.containsKey(num))
    //         {
    //             hm.put(num ,hm.get(num) +1);
    //         }
    //         else{
    //             hm.put(num ,1);
    //         }
    //     }

    //     for(int key : hm.keySet())
    //     {
    //         if(hm.get(key)==1)
    //         {
    //             return key;
    //         }
    //     }
        


    //     return -1;
    // }

    // --------------- Using Brute Force ---------------
    // --------------- O(n^2) --------------------------
    // public static int unique()
    // {
    //     int arr[] = {2,4,3,1,1,5,2,4};
        
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         int count=0;
    //         for(int j=0;j<arr.length;j++)            
    //         {
    //             if(arr[i]==arr[j])
    //             {
    //                 count++;
    //             }
    //         }

    //         if(count==1)
    //         {
    //             return arr[i];
    //         }
    //     }

    //     return -1;
    // }

}
