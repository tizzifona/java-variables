public class Cakes {
    public static void main(String[] args) {

        int cake = 1;
        int people = 5;

        System.out.println("Cada persona se lleva " + ((double)cake / people) + " partes de pastel");

        double doubleValue = 1.2;
        System.out.println("Valor original de double: " + doubleValue);

        int intValue = (int) doubleValue;
        System.out.println("Valor convertido de double a int: " + intValue);

        int anotherIntValue = 5;
        System.out.println("Valor original de int: " + anotherIntValue);

        System.out.println("Valor convertido de int a double: " + (double) anotherIntValue);
               
    }
}
