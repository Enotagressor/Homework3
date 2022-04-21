public class Main {
    public static void main(String[] args) {
        // Zadanie 1

        int clientOs = 0;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }
        else if(clientOs == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Zadanie 2

        int clientDeviceYear = 2012;
        int osClient = 1;
        if (osClient == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (osClient == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченую версию приложения для IOS по ссылке");
        } else if (osClient == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else  {
            System.out.println("Установите облегченую версию приложения для Android по ссылке");
        }

        // Zadanie 3

        int year = 2000;
        if (year%4 == 0 && year % 100 != 0 || year%400 == 0){
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // Zadanie 4

        int deliveryDistance = 10;
        if (deliveryDistance >= 20 && deliveryDistance <60){
            System.out.println("На доставку потребуется 2 дня");
        } else if (deliveryDistance < 20){
            System.out.println("На доставку потребуется 1 день");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100){
            System.out.println("На доставку потребуется 3 дня");
        } else {
            System.out.println("Доставка невозможна");
        }

        // Zadanie 5

        int monthNumber = 5;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зимний сезон");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний сезон");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний сезон");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний сезон");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}