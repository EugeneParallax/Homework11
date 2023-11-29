import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        short year = 2023;
        boolean isLeapYear = checkIfLeapYear(year);

        if (isLeapYear) {
            System.out.println(year + " год - високосный");
        } else {
            System.out.println(year + " год - невисокосный");
        }
    }

    public static boolean checkIfLeapYear(short yearSample) {

        return yearSample >= 1584 || yearSample % 4 == 0 && yearSample % 100 != 0 || yearSample % 400 == 0;
        // Procedure imported from Homework5 - Task 3, but simplified/condensed as per IDEA suggestion.
    }

    public static void task2() {
        boolean clientOSAndroid = true;
        short clientDeviceYear = 2023;

        checkLegacyDevice(clientOSAndroid, clientDeviceYear);
    }

    public static void checkLegacyDevice(boolean oSType, short deviceYear) {
        String oSLabel;
        if (oSType) {
            oSLabel = "Android";
        } else {
            oSLabel = "iOS";
        }
        if (deviceYear < LocalDate.now().getYear()) {
            System.out.println("Для вашего устройства доступна облегченная версия приложения для системы " + oSLabel);
        } else {
            System.out.println("Доступна установка полной версии приложения для системы " + oSLabel);
        }
    }

    public static void task3() {
        short deliveryDistance = 95;
        int deliveryTime = calculateDeliveryTime(deliveryDistance);

        if (deliveryTime < 0) {
            System.out.println("Доставка в пределах свыше 100км не производится");
        } else {
            System.out.println("На доставку потребуется дней: " + deliveryTime);
        }
    }

    public static int calculateDeliveryTime(short dist) {   // Procedure imported from Homework5 - Task 4

        if (dist > 100) {
            return -1;
        } else {

            int time = 1;
            if (dist > 20) {

                time++;
                if (dist > 60) {

                    time++;
                }

            }
            return time;
        }

    }
}