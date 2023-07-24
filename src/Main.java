import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.time.LocalDate;
import java.util.Locale;
import java.util.logging.SocketHandler;

public class Main {
    public static void main(String[] args) {

        //1
        int year = 2020;
        int year2 = 2021;
        checkIsYearLeap(year);
        checkIsYearLeap(year2);

        //2
        int years = LocalDate.now().getYear();
        int os = 0;
        suggestVersion(os, year);

        //3
        int deliveryDistance = 1;
        if (deliveryDistance < 20) {
            System.out.println("нужен 1 день");
        } else if (deliveryDistance <= 60) {
            System.out.println("нужно 2 дня ");
        } else if (deliveryDistance < 100) {
            System.out.println("нужно 3 дня");
        } else {
            System.out.println("доставки нет ");
        }
    }

    public static void checkIsYearLeap(int year) {

        if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
            System.out.println(year + " год не является высокосным \n ");
        } else {
            System.out.println(year + " год является высокосным \n");
        }

    }

    public static void suggestVersion(int os, int year) {
        int borderYear = 2015;
        if (os == 0 && year < borderYear) {
            System.out.println("Установите облегченную версию ИОС по сылке");
        } else if (os == 0 && year >= borderYear) {
            System.out.println("установить для ИОС ");
        } else if (os == 1 && year < borderYear) {
            System.out.println(" установить облегченную  для андроид");
        } else if (os == 1 && year >= borderYear) {
            System.out.println("установить для андроид");
        } else {
            System.out.println(" не удалось установить ");
        }

    }
    public static void printDeliveryInfo(int deliveryDistance){
        int deliveryDays = getDeliveryDays(deliveryDistance);
        if (deliveryDays == -1){
            System.out.println("доставки нет");
        }else {
            System.out.printf("потребуется %s дней", deliveryDays);
        }
    }

    public static int getDeliveryDays(int deliveryDistance){
        if (deliveryDistance < 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance < 100) {
            return 3;
        } else {
            return -1;
        }

    }


}
















