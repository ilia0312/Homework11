import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void checkYears(int year) {
        boolean leapYear = isLeapYear(year);
        if (leapYear) {
            System.out.println("Год " + year + " високосный");
        } else {
            System.out.println("Год " + year + " не високосный");
        }
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void checkDevice(int clientOS) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (currentYear < 2015) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для IOS по ссылке");
            }
        } else if (currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Андроид по ссылке");
        } else {
            System.out.println("Установите версию приложения для Андроид по ссылке");
        }
    }

        public static int calculateDeliveryDays(int deliveryDistance){
            int calculateDeliveryDays = 1;
            if (deliveryDistance > 20) {
                calculateDeliveryDays++;
            }
            if (deliveryDistance > 60) {
                calculateDeliveryDays++;
            }
            return calculateDeliveryDays;
        }

        public static void task1 () {
            System.out.println("Задача 1");
            int year = 2020;
            checkYears(year);

        }

        public static void task2 () {
            System.out.println("Задача 2");
            int clientOS = 1;
            checkDevice(clientOS);
        }

        public static void task3 () {
            System.out.println("Задача 3");
          int deliveryDistance = 95;
          if (deliveryDistance > 100) {
              System.out.println("Свыше 100 км, доставки нет!");
          } else {
              int deliveryDay = calculateDeliveryDays(deliveryDistance);
              System.out.println("Потребуется дней: " + deliveryDay);
          }
        }
}