int suma = 0;
int resta = 0;
int multiplicacion = 0;
float division = 0;

public class main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        suma = calc.sumar(5, 3);
        resta = calc.restar(5, 3);
        multiplicacion = calc.multiplicar(5, 3);
        division = calc.dividir(5, 3);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division " + division);
    }
}