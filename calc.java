/*
 * 3) Реализовать простой калькулятор
+ - / *

Введите первое число: A \n
Введите знак: *
Введите второе число: B
Результат: A*B
К калькулятору из предыдущего ДЗ добавить логирование. 4+2=6 6-1=5
 */

import java.util.Scanner;
import java.io.IOException;
import java.util.logging.*;

public class calc {

    public static void main(String[] args) {

        Logger ii = Logger.getLogger(sort.class.getName());
        String logsPath = "log.txt";
        try {
            FileHandler fh = new FileHandler(logsPath, false);
            ii.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
        }

        catch (Exception e) {

        }

        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double a = iScanner.nextDouble();
        System.out.print("Введите операцию: ");
        String op = iScanner.next();
        System.out.print("Введите второе число: ");
        double b = iScanner.nextDouble();
        double c = 0;

        switch (op) {
            case "*":
                c = a * b;
                res(c);
                break;
            case "/":
                c = a / b;
                res(c);
                break;
            case "+":
                c = a + b;
                res(c);
                break;
            case "-":
                c = a - b;
                res(c);
                break;

            default:
                System.out.println("Данные не верны, попробуйте еще раз");
                break;

        }
        ii.log(Level.INFO, a + op + b + "=" + c);
        ii.log(Level.WARNING, "logger off");
        ii.info("test");
        ii.warning("logsPath");

    }

    public static void res(double result) {

        System.out.printf("Результат операции: %.2f", result);

    }

}
