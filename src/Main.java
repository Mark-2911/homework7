public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int total = 0;
        int saving = 15000;
        int month = 0;
        while (total <= 2_459_000) {
            total = total + saving;
            month = month + 1;
            System.out.println("Месяц " + month + " сумма накопления " + total + " рублей");

        }

        System.out.println("Задача 2");

        int number = 0;
        while (number < 10) {
            number = number + 1;
            System.out.print(number + " ");
        }
        System.out.println(" ");

        for (int i = 10; i > 0; i = i - 1) {
            System.out.print(i + " ");
        }

        System.out.println(" ");

        System.out.println("Задача 3");

        int population = 12_000_000;
        for (int i = 1; i <= 10; i = i + 1) {
            int birthRate = 17 * population / 1000;
            int mortalityRate = 8 * population / 1000;
            population = population + birthRate - mortalityRate;
            System.out.println("Год " + i + " численность населения состовляет " + population + " человек");

        }

        System.out.println("Задача 4");

        int total1 = 0;
        int saving1 = 15000;
        int month1 = 0;
        while (total1 <= 12_000_000) {
            total1 = total1 + saving1 + (total1 * 7)/100;
            month1 = month1 + 1;
            System.out.println("Месяц " + month1 + " сумма накопления " + total1 + " рублей");

        }

        System.out.println("Задача 5");

        int total2 = 0;
        int saving2 = 15000;
        int month2 = 0;
        while (total2 <= 12_000_000) {
            total2 = total2 + saving2 + (total2 * 7)/100;
            month2 = month2 + 1;
            if (month2 % 6 == 0)
             System.out.println("Месяц " + month2 + " сумма накопления " + total2 + " рублей");

        }

        System.out.println("Задача 6");

        int saving3 = 15000;
        int total3 = 0;
        int year = 9;
        int monthYear = 12;
        int totalMonth = year * monthYear;
        for (int month3 = 1; month3 <= totalMonth; month3++){
            total3 = total3 + (total3 * 7)/100;
            total3 = saving3 + total3;
            if(month3 % 6 == 0)
             System.out.println("Месяц " + month3 + " сумма накопления " + total3);

        }


        System.out.println("Задача 7");

        int friday = 5;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число.Необходимо подготовить отчет");
            friday += 7;
        }

        System.out.println("Задача 8");


        int yaerBefore = 2024 - 200;
        int yearAfter = 2024 + 100;
        for (year = yaerBefore; year < yearAfter; year++) {
            if (year % 79 == 0)
                System.out.println(year);

        }







        











    }


}
