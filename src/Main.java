public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int total = 0;
        int saving = 15000;
        int month = 0;
        int amountOfAccumulation = 2_459_000;
        while (total <= amountOfAccumulation) {
            total += saving;
            month += 1;
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
        int death = 8;
        int life = 17;
        int perPerson = 1000;
        for (int i = 1; i <= 10; i = i + 1) {
            int birthRate = life * population/perPerson;
            int mortalityRate = death * population/perPerson;
            population = population + birthRate - mortalityRate;
            System.out.println("Год " + i + " численность населения состовляет " + population + " человек");

        }

        System.out.println("Задача 4");

        total = 0;
        saving = 15000;
        month = 0;
        int percentage = (saving * 7)/100;
        int depositWithInerest = saving + percentage;
        amountOfAccumulation = 12_000_000;
        while (total <= amountOfAccumulation) {
            total += depositWithInerest;
            month += 1;
            System.out.println("Месяц " + month + " сумма накопления " + total + " рублей");

        }

        System.out.println("Задача 5");

        total = 0;
        saving = 15000;
        month = 0;
        while (total <= amountOfAccumulation) {
            total += depositWithInerest;
            month += 1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накопления " + total + " рублей");
            }

        }

        System.out.println("Задача 6");

        saving = 15000;
        total = 0;
        int year = 9;
        int monthYear = 12;
        int totalMonth = year * monthYear;
        for (int month3 = 1; month3 <= totalMonth; month3++){
            total += depositWithInerest;
            total += saving;
            if(month3 % 6 == 0) {
                System.out.println("Месяц " + month3 + " сумма накопления " + total);
            }

        }


        System.out.println("Задача 7");

        int friday = 5;
        int daysInAMonth = 31;
        while (friday <= daysInAMonth) {
            System.out.println("Сегодня пятница, " + friday + "-е число.Необходимо подготовить отчет");
            friday += 7;
        }

        System.out.println("Задача 8");


        int yearBefore = 2024 - 200;
        int yearAfter = 2024 + 100;
        int cametsArrivalInterval = 79;
        for (year = yearBefore; year < yearAfter; year++) {
            if (year % cametsArrivalInterval == 0) {
                System.out.println(year);
            }

        }







        











    }


}
