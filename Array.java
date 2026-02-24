import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]= new int[4];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        int b[][] = new int[2][3];
        b[0][0] = 1;
        b[0][1] = 2;
        b[0][2] = 3;
        b[1][0] = 4;
        b[1][1] = 5;
        b[1][2] = 6;

        for(int j =0;j<2;j++) {
            for(int k = 0;k<3;k++) {
                System.out.print(b[j][k]+ " ");
            }
            System.out.println(" ");
        }



        for(int i=0;i<4; i++) {
            System.out.print(a[i]+" ");
        }

    }
}
