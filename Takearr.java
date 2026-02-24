import java.util.Scanner;

public class Takearr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of elements you need to add in array");
        int n= sc.nextInt();
        int [] a= new int[n];
       System.out.println("Enter "+ n +" elements for single dim array");
        for(int i=0;i<n;i++) {
            a[i]= sc.nextInt();
        }
        
        System.out.println("Enter the value of rows and columns required");
        int p=sc.nextInt();
        int m=sc.nextInt();
System.out.println("Enter 2 dim array elements ");
       int [][] b = new int[p][m];
       for(int i=0;i<p;i++) {
        for(int j=0;j<m;j++) {
            b[i][j]=sc.nextInt();
        }
       }
       
       System.out.println("2 dim array");
        for(int j =0;j<2;j++) {
            for(int k = 0;k<3;k++) {
                System.out.print(b[j][k]+ " ");
            }
            System.out.println(" ");
        }
        


System.out.println("Single dim array");
        for(int i:a) {
            System.out.print(a[i]+" ");
        }

    }
}
