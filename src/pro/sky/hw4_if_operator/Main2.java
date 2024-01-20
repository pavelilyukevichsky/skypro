package pro.sky.hw4_if_operator;

public class Main2 {

    public static void main(String[] args) {
        //
        {
            int clientOS = 0; // инициализация переменной clientOS, где 0 - iOS, 1 - Android, 2 - PC

//        boolean hasIOS = clientOS == 0;
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
//            if () {
//            } else {
//            }
            } else if (clientOS == 1) {
                //            if () {
//            } else {
//            }

                System.out.println("Установите версию приложения для Android по ссылке");
            } else if (clientOS == 2) {
                System.out.println("Установите версию приложения для PC по ссылке");
            } else {
                System.out.println("Неизвестная операционная система");
            }
        }

        {
            int clientOS = 0; // 0 - iOS, 1 - Android
            int clientDeviceYear = 2015;

            if (clientOS != 0 && clientOS != 1) {
                System.out.println("Неизвестная операционная система");
            } else {
                String operationSystem;
                if (clientOS == 0) {
                    operationSystem = "iOS";
                } else {
                    operationSystem = "Android";
                }

                String message;
                if (clientDeviceYear < 2015) {
                    message = "Установите облегченную версию приложения для " + operationSystem +
                            " по ссылке";
                } else {
                    message = "Установите версию приложения для " + operationSystem +
                            " по ссылке";
                }

                System.out.println(message);
            }
        }

        int year = 2021;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }



        int deliveryDistance = 15;
        int deliveryTime = 1;

        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else {
            if (deliveryDistance > 20 && deliveryDistance <= 60) {
                deliveryTime++;
            } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
                deliveryTime += 2;
            }
        }
        System.out.println("Потребуется дней: " + deliveryTime);


        int monthNumber = 13;
        String season = null;

        switch(monthNumber) {
            case 1:
            case 2:
            case 12:
                season = "зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "осень";
                break;
            default:
                System.out.println("Неверный номер месяца.");
        }
        if (season !=null) {
            System.out.println("Месяц номер " + monthNumber + " принадлежит к сезону " + season + ".");
        }
    }
}
