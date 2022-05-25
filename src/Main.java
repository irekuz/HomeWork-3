public class Main {
    public static void main(String[] args) {
        //Задание номер 1
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        //Задание номер 2
        int clientDeviceYear = 2014;
        if (clientOS == 1 && clientDeviceYear <= 2014) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear <= 2014) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //задание номер 3
        int year = 2024;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }

        //задание №4
        int deliveryDistance = 65;
        int days = 1;

        if (deliveryDistance >=20) {
            days++;}
        if (deliveryDistance >=60) {
            days++;} {
            System.out.println("Потребуется дней: " + days++ + " для доставки");
        }
        // Задание номер 5
        int monthNumber = 11;
        switch (monthNumber) {
            case 1:
                System.out.println("Januar - winter"); break;
            case 2:
                System.out.println("February - winter"); break;
            case 3:
                System.out.println("March - spring"); break;
            case 4:
                System.out.println("April - spring"); break;
            case 5:
                System.out.println("May - spring"); break;
            case 6:
                System.out.println("June - summer"); break;
            case 7:
                System.out.println("July - summer"); break;
            case 8:
                System.out.println("August - summer"); break;
            case 9:
                System.out.println("September - autumn"); break;
            case 10:
                System.out.println("October - autumn"); break;
            case 11:
                System.out.println("November - autumn"); break;
            case 12:
                System.out.println("December - winter"); break;
            default:
                System.out.println("Такой месяца нет");


        }
    }
}