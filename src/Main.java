public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        //Задача 1
        System.out.println("Задача 1");
        int storage1 = 15000;
        int total1 = 0;
        int month = 0;
        while (total1 < 2_459_000) {
            total1 = total1 + storage1;
            month = month + 1;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + total1 + " рублей");
    }
    public static void task2() {
        //Задача 2
        System.out.println("Задача 2");
        int number = 1;
        while (number <= 10) {
            System.out.print(number + " ");
            number = number + 1;
        }
        System.out.println();
        number = number - 1;
        for (; number > 0; number--) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
    public static void task3() {
        //Задача 3
        System.out.println("Задача 3");
        float totalPeople = 12_000_000;
        float bornPeople = 17 / 1000f;
        float deathPeople = 8 / 1000f;
        for (int i = 1; i <= 10; i++) {
            totalPeople = totalPeople + totalPeople * bornPeople - totalPeople * deathPeople;
            System.out.println("Год " + i + "й, численность населения составляет " + Math.round(totalPeople) + " человек");
        }
    }
    public static void task4() {
        //Задача 4
        System.out.println("Задача 4");
        int storage4 = 15000;
        float total4 = 0;
        float percent4 = 7 / 100f;
        int goal4 = 12_000_000;
        for (int i = 1; total4 < goal4; i++) {
            total4 = total4 + total4 * percent4;
            total4 = total4 + storage4;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total4 + " рублей");
        }
    }
    public static void task5() {
        //Задача 5
        System.out.println("Задача 5");
        int storage5 = 15000;
        float total5 = 0f;
        float percent5 = 7 / 100f;
        int goal5 = 12_000_000;
        for (int i = 1; total5 < goal5; i++) {
            total5 = total5 + total5 * percent5;
            total5 = total5 + storage5;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total5 + " рублей");
            }
        }
    }
    public static void task6() {
        //Задача 6
        System.out.println("Задача 6");
        int storage6 = 15000;
        float total6 = 0f;
        float percent6 = 7 / 100f;
        int period = 9 * 12;
        for (int i = 1; i <= period; i++) {
            total6 = total6 + total6 * percent6;
            total6 = total6 + storage6;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total6 + " рублей");
            }
        }
    }
    public static void task7() {
        //Задача 7
        System.out.println("Задача 7");
        int friday = 4;
        for (int i = 1; i <= 31; i++) {
            if (i == friday) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
                friday = friday + 7;
            }
        }
    }
    public static void task8() {
        //Задача 8
        System.out.println("Задача 8");
        int year = 2023;
        int comet = 79;
        int yearBefore = year - 200;
        int yearAfter = year + 100;
        for (int i = yearBefore; i <= yearAfter; i++) {
            if (i % comet == 0) {
                System.out.println(i);
            }
        }
    }
}