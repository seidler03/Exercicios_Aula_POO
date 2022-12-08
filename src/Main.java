import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("1 - Somar\n"+
                "2 - Subtrair\n"+
                "3 - Dividir\n"+
                "4 - Multiplicar\n");
        int option = input.nextInt();
        Calculadora calculo = new Calculadora();
        System.out.println("Digite o primeiro número da operação");
        double valor1 = input.nextDouble();
        System.out.println("Digite o segundo número da operação");
        double valor2 = input.nextDouble();
        switch (option){
            case 1:
                System.out.println(calculo.Somar(valor1, valor2));
                break;
            case 2:
                System.out.println(calculo.Subtrair(valor1, valor2));
                break;
            case 3:
                System.out.println(calculo.Dividir(valor1, valor2));
                break;
            case 4:
                System.out.println(calculo.Multiplicar(valor1, valor2));
                break;
        }
    }
}