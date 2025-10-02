public class Calculadora {
    public int suma(int a, int b) {
        return a + b;
    }

    public int resta(int a, int b) {
        return a - b;
    }

    public int multiplicación(int a, int b) {
        return a * b;
    }

    public double división(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("El divisor no puede ser cero.");
        }
        return (double) a / b;
    }

    public int módulo(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("El divisor no puede ser cero.");
        }
        return a % b;
    }

    public int potencia(int base, int exponente) {
        return (int) Math.pow(base, exponente);
    }

    public double raizCuadrada(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo.");
        }
        return (double) Math.sqrt(a);
    }

    public double raizCúbica(int a) {
        return (double) Math.cbrt(a);
    }

    public int logaritmo(int a, int base) {
        if (a <= 0 || base <= 1) {
            throw new IllegalArgumentException("El número debe ser mayor que 0 y la base debe ser mayor que 1.");
        }
        return (int) (Math.log(a) / Math.log(base));
    }
}