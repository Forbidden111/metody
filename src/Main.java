import java.time.LocalDate;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        task2(2021, 1);
        System.out.println(visokosniy(2021));
        System.out.println(getDeliveryDays(150));


    }

    public static String visokosniy(int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return year + "год является высокосным";
        } else {
            return year + "год не являеться высокосным";
        }
    }


    private static void task2(int deveceYear, int clientOS) {


        deveceYear = 2021;
        if (clientOS == 0) {
            if (deveceYear < 2015) {
                System.out.println("iOS облегченная ");
            } else {
                System.out.println("iOS обычная ");
            }
        } else if (clientOS == 1) {
            if (deveceYear < 2015) {
                System.out.println("Android облегченная ");
            } else {
                System.out.println("Android обычная ");
            }
        }
    }





    public static int getDeliveryDays(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return  2;
        } else if (deliveryDistance < 100) {
            return 3;
        } else {
            return 0;
        }
    }
}














