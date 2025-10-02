import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("Menú:");
        System.out.println(" 1. Suma");
        System.out.println(" 2. Resta");
        System.out.println(" 3. Multiplicación");
        System.out.println(" 4. División");
        System.out.println(" 5. Módulo");
        System.out.println(" 6. Potencia");
        System.out.println(" 7. Raíz cuadrada");
        System.out.println(" 8. Raíz cúbica");
        System.out.println(" 9. Logaritmo");
        System.out.print("Elige una de las anteriores opciones: ");
        int choice = sc.nextInt();

        double resultado = 0;
        int a, b;

        switch (choice) {
            case 1:
                System.out.print("Ingresa el primer número: ");
                a = sc.nextInt();
                System.out.print("Ingresa el segundo número: ");
                b = sc.nextInt();
                resultado = calc.suma(a, b);
                break;

            case 2:
                System.out.print("Ingresa el primer número: ");
                a = sc.nextInt();
                System.out.print("Ingresa el segundo número: ");
                b = sc.nextInt();
                resultado = calc.resta(a, b);
                break;

            case 3:
                System.out.print("Ingresa el primer número: ");
                a = sc.nextInt();
                System.out.print("Ingresa el segundo número: ");
                b = sc.nextInt();
                resultado = calc.multiplicación(a, b);
                break;

            case 4:
                System.out.print("Ingresa el dividendo: ");
                a = sc.nextInt();
                System.out.print("Ingresa el divisor: ");
                b = sc.nextInt();
                resultado = calc.división(a, b);
                break;

            case 5:
                System.out.print("Ingresa el primer número: ");
                a = sc.nextInt();
                System.out.print("Ingresa el segundo número: ");
                b = sc.nextInt();
                resultado = calc.módulo(a, b);
                break;

            case 6:
                System.out.print("Ingresa la base: ");
                a = sc.nextInt();
                System.out.print("Ingresa el exponente: ");
                b = sc.nextInt();
                resultado = calc.potencia(a, b);
                break;

            case 7:
                System.out.print("Ingresa el número: ");
                a = sc.nextInt();
                resultado = calc.raizCuadrada(a);
                break;

            case 8:
                System.out.print("Ingresa el número: ");
                a = sc.nextInt();
                resultado = calc.raizCúbica(a);
                break;

            case 9:
                System.out.print("Ingresa el número: ");
                a = sc.nextInt();
                System.out.print("Ingresa la base del logaritmo: ");
                b = sc.nextInt();
                resultado = calc.logaritmo(a, b);
                break;

            default:
                System.out.println("La opción elegida no se encuentra en el menú.");
                sc.close();
                return;
        }

        System.out.println("El resultado es: " + resultado);
        sc.close();
    }
}