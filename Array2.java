//   ===>>>>Subarray Logic
// Maximum subarray sum (Kadane’s Algorithm – very important)
// Prefix sum
// Count subarrays with given sum
class Subarray {
    public int subarrayele(int [] a) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < a.length; i++) {
            currentSum += a[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }     
            return maxSum;
        }
        // gives max array as well as su of max array
        public void maxsubarray(int [] a){
            int currentsum = 0;
            int maxsum=Integer.MIN_VALUE;
            int start=0,end=0,tempstart=0;
            for(int i=0;i<a.length;i++) {
                currentsum+=a[i];
                if(currentsum > maxsum) {
                    maxsum = currentsum;
                    start = tempstart;
                    end = i;
                }
                if(currentsum <0) {
                    currentsum = 0;
                    tempstart =i+1;
                }
            }
            System.out.println("Max sum: "+maxsum);
            System.out.println("Subarray: ");
            for(int i = start;i<=end;i++)
                System.out.print(a[i]+ " ");
        }
        public void prefixsum(int [] a) {
            int [] pref = new int[a.length];
            pref[0] = a[0];
            for(int i=1;i<a.length;i++) {
                pref[i] = pref[i-1] + a[i];
            }
            System.out.println("Prefix sum: ");
            for(int i=0;i<pref.length;i++)
                System.out.print(pref[i] +" ");
        }
        public void countsubarray(int [] a, int item) {
            int count = 0;
            for(int i=0;i<a.length;i++) {
                int sum=0;
                for(int j=i;j<a.length;j++) {
                    sum+=a[j];
                    if(sum==item)
                        count++;
                }
                
            }
            System.out.println( " Count "+ count);
        }
}
public class Array2 {
    public static void main(String[] args) {
      int arr[] = new int[5];
      arr[0] = 1;
      arr[1] = 2;
      arr[2] = 3;
      arr[3] = 4;
      arr[4] = 5;
      Subarray sub = new Subarray();
    //   int maxisum=sub.subarrayele(arr);
        sub.maxsubarray(arr);
    
        // System.out.println(maxisum+" Maximum Subarray");
        // sub.prefixsum(arr);
        int key = 3;
        sub.countsubarray(arr, key);
    }
}
