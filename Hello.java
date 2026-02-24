import java.util.Scanner;
class Calculator {
    public int add(int n1, int n2) {
        return n1+n2;
    }
    
}
public class Hello {
    public static int sub(int n1, int n2) {
        return n1-n2;
    }
    public static void main(String a[]) {
        int num1;
        int num2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of first element");
        num1 = sc.nextInt();
        System.out.println("Enter the value of second element");
        num2 = sc.nextInt();
        Calculator cal = new Calculator();
        int res = cal.add(num1,num2);
        System.out.println("The result of "+ num1+" and "+num2+" is "+ res);
        //System.out.println("Hello 1235");         
        int subres= Hello.sub(num1, num2);
        System.out.println(subres);

    }
}