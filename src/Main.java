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

    public static void calcLeapYear(int year) {
        boolean leapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        if (leapYear)
            System.out.println(year + " год является високосным");
        else
            System.out.println(year + " год не является високосным");
    }

    public static void detectionOs(int deviceYear, int typeOs) {
        if (typeOs == 0 && deviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (typeOs == 0 && deviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (typeOs == 1 && deviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }


    public static int calcDaysDelivery(int deliveryDistance) {
        int calcDaysDelivery = 1;
        if (deliveryDistance < 20) {
            calcDaysDelivery += 0;
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            calcDaysDelivery += 1;
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            calcDaysDelivery += 2;
        } else {
            calcDaysDelivery = 0;
        }
        return calcDaysDelivery;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2025;
        calcLeapYear(year);
    }


    public static void task2() {
        System.out.println("Задача 2");
        int clientDeviceYear = 2017;
        byte clientOS = 0;
        detectionOs(clientDeviceYear, clientOS);
    }


    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 130;
        calcDaysDelivery(deliveryDistance);
        if (calcDaysDelivery(deliveryDistance) >= 1 && calcDaysDelivery(deliveryDistance) <= 3) {
            System.out.println("Потребуется дней: " + calcDaysDelivery(deliveryDistance));
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }

}










