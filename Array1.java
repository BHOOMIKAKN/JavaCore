// Sum of array
// Max/min element
// Second largest element
// Reverse array
// Count even/odd
// Frequency of element

class DiffOp {
    public int sumOfArray(int [] a) {
        int sum =0;
        for(int i = 0;i<a.length;i++) {
            sum+=a[i];
        }
        return sum;
    }
    public int maxelement(int [] a) {
        int max = a[0];
        for(int i=1; i<a.length; i++) {
            if(a[i]>max ) {
                max=a[i];
            }
            
        }
        return max;
    }
    public int minelement(int [] a) {
        int min = a[0];
        for(int i=1; i<a.length; i++) {
            if(a[i]<min ) {
                min =a[i];
            }
            
        }
        return min;
    }
    public int secondmaxelement(int [] a) {
       int max = a[0];
       int secmax = 0;
       for(int i=1;i<a.length;i++) {
        if(a[i]>max){
            secmax = max;
            max=a[i];
        }
        else if(a[i] > secmax && a[i] !=max) {
            secmax = a[i];
        }
       } 
       return secmax;
       
    }
    public void revarray(int [] a) {
        for(int i=a.length-1; i>=0;i--) {
            System.out.print(a[i]+ " ");
        }
        System.out.println("Reverse array");

    }
    public void countevnodd(int [] a) {
        int evencount=0;
        int oddcount=0;
        for(int i=0;i<a.length;i++) {
            if(a[i]%2==0) {
                evencount+=1;
            }
            else oddcount=oddcount+1;
        }
        System.out.println(evencount+ " Even count and odd count is "+oddcount);
    }
    public void frequencyelement(int [] a) {
        boolean[] vis = new boolean[a.length];
        for(int i=0;i<a.length;i++) {
            if(vis[i]) continue;
            int count=1;
            for(int j=i+1; j<a.length;j++) {
                if(a[i]==a[j]) {
                    count++;
                    vis[j] = true;
                }
            }
            System.out.println(a[i]+ "-->"+count+" times" );
        }
    }
}
public class Array1 {
    public static void main(String[] args) {
        DiffOp diffOp = new DiffOp();
        int arr[]= new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        int arraysum = diffOp.sumOfArray(arr);
        System.out.println(arraysum+ " Array sum "); 
        int maxelement = diffOp.maxelement(arr);
        System.out.println(maxelement+ " Max element");
        int minelement = diffOp.minelement(arr);
        System.out.println(minelement+ " Min element");
        int secmaxi = diffOp.secondmaxelement(arr);
        System.out.println(secmaxi+ " Sec max element");
        diffOp.revarray(arr);
        diffOp.countevnodd(arr);
        diffOp.frequencyelement(arr);

    }
}
