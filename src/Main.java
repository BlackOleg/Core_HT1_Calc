public class Main {
    public static void main(String[] args) {

        System.out.println("Запускаем калькулятор:");
        Calculator calc = Calculator.instance.get();
        //Произведите несколько математических операций над числами:

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);
        calc.println.accept(c);
    }
}