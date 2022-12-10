public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1 () {
        char clientOS = 1;
        if (clientOS == 0) {
        System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
        System.out.println("Установите версию приложения для Android по ссылке");}
    }

    public static void task2 () {
        char clientOS = 1;
        char clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void task3 () {
        int year = 2023;
        boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        if (isLeapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + "год не является високосным");
        }
    }

    public static void task4 () {
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60){
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100){
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void task5 () {
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Сезон: зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сезон: весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сезон: лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сезон: осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}