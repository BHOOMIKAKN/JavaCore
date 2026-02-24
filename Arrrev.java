import java.util.Scanner;

public class Arrrev {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a[] = new int [5];
        for(int i=0;i<5; i++) {
            a[i]=sc.nextInt();
        }
        for(int j=4; j>=0; j--) {
            System.out.print(a[j]+ " ");
        }
        //   this is for getting string
        String s=new String();
        s=sc.nextLine();
        System.out.println(s);
            // this is for reversing the given sentence
        int n=sc.nextInt();
        String  [] arr=new String[n];
        for(int i=0;i<n;i++) {
            arr[i]= sc.next();
        }
        for(int i=n-1;i>=0;i--) {
            System.out.print(arr[i]+ " ");
        }
        //  this is reversing all elements and also words
        String si=new String();
        si=sc.nextLine();
        System.out.println(si);
        String rev ="";
        for(int i=s.length()-1;i>=0;i--) {
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);
//         bhoomi is a good
// doog a si imoohb     
        
    }
}
