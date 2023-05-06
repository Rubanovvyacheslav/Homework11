public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
//        task9();
//        task10();
    }

    public static void calcLeapYear(int a) {
        boolean leapYear = (a % 400 == 0) || (a % 4 == 0 && a % 100 != 0);
        if (leapYear)
            System.out.println(a + " год является високосным");
        else
            System.out.println(a + " год не является високосным");
    }

    public static void detectionOs(int a, int b) { //clientDeaviceYear = a; clientOS = b
        if (b == 0 && a >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (b == 0 && a < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (b == 1 && a >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void calcDaysDelivery(int a) {
        if (a < 20) {
            System.out.println("Потребуется дней: 1 ");
        } else if (a >= 20 && a <= 60) {
            System.out.println("Потребуется дней: 2 ");
        } else if (a >= 60 && a <= 100) {
            System.out.println("Потребуется дней: 3 ");
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2025;
        calcLeapYear(year);
    }


    public static void task2() {
        System.out.println("Задача 2");
        int clientDeviceYear = 2014;
        byte clientOS = 1;
        detectionOs(clientDeviceYear, clientOS);
    }


    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 15;
        calcDaysDelivery(deliveryDistance);
    }
}










