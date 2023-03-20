import java.time.LocalDate;

public class Main {
    public static void printSeparator() {
        System.out.println("------------------");
    }


    public static void main(String[] args) {

        System.out.println("Задача №1:");
        int year = 2000;
        determineYear(year);
        printSeparator();

        System.out.println("Задача №2:");
        System.out.println("Вам, предлагается скачать приложение с учетом года выпуска телефона и операционной системой пользователя. Если iOS нажми os - 0, если Android нажми os - 1 и выбери год выпуска телефона.");
        printLink (1,2003);   //int currentYear = LocalDate.now().getYear(); - текущий год в методе
        printSeparator();

        System.out.println("Задача №3:");
        System.out.println("Доставка карт на дом.");
        int distance = 88;
        deliveryCard(distance);

    }


    public static void determineYear(int year) {

        if (returnYears(year)) {
            System.out.println(" - Год " + year + " является високосным.");

        } else {
            System.out.println(" - Год " + year + " не является високосным.");

        }
    }
    public static boolean returnYears(int year) {

        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }



    public static void printLink(int os, int year) {
        int currentYear = LocalDate.now().getYear();
       if (os == 0 && year < currentYear) {
            System.out.println(" - Установите облегченную версию приложения для iOS по ссылке.");

        } else if (os == 0 && year == currentYear)  {
           System.out.println (" - Установите обычную версию приложения для iOS по ссылке.");
       }
       if (os == 1 && year < currentYear) {
            System.out.println(" - Установите облегченную версию приложения для Android по ссылке.");
        } else if (os == 1 && year == currentYear) {
            System.out.println(" - Установите обычную версию приложения для Android по ссылке.");
        }

    }

    public static int deliveryCard(int distance) {

        int deliveryPeriod1 = 1;
        int deliveryPeriod2 = 2;
        int deliveryPeriod3 = 3;

        if (distance < 20) {
            System.out.println("Потребуется дней: " + deliveryPeriod1);
            return 1;
        } else if (distance >= 20 && distance < 60) {
            System.out.println("Потребуется дней: " + deliveryPeriod2);
            return 2;
        } else if (distance >= 60 && distance < 100) {
            System.out.println("Потребуется дней: " + deliveryPeriod3);
            return 3;
        } else {
            System.out.println("доставки нет");
            return 4;

        }


        }

    }






