import java.util.Scanner;
class quad{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
            // find roots of the quadratic equation
            System.out.println("Enter the coefficients of the quadratic equation");
            System.out.println("Enter the value of a");
            double a = sc.nextDouble();
            System.out.println("Enter the value of b");
            double b = sc.nextDouble();
            System.out.println("Enter the value of c");
            double c = sc.nextDouble();
            System.out.println("enter value of root[1]");
            double x = sc.nextDouble();
            // double d = b*b - 4*a*c;
            // double root1 = (-b + Math.sqrt(d))/(2*a);
            // double root2 = (-b - Math.sqrt(d))/(2*a);
            // System.out.println("The roots of the quadratic equation are "+root1+" and "+root2);
            double output = a*x*x + b*x + c;
            if(output==0){
                System.out.println("The roots are real and equal");
            }
            else{
                System.out.println("error while solving equation");
            }
    }
}