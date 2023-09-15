import java.util.Scanner;

public class Calculadora {

    
    public static void main (String[]args){
Scanner sc= new Scanner(System.in);

System.out.println("Digite o primeiro número:");
double num1 = sc.nextDouble();

System.out.println("Digite o segundo número:");
double num2 = sc.nextDouble();

sc.close();
 double soma = num1 + num2;
 double diferenca = num1 - num2;
 double produto = num1 * num2;


 System.out.println("a soma dos números é:" + soma);
 System.out.println("a diferença dos números é:" + diferenca);
 System.out.println("o produto dos números é:" + produto);


}
}
