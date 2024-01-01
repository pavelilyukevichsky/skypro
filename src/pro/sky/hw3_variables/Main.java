package pro.sky.hw3_variables;

public class Main {

    public static void main(String[] args) {
        task1();

        task2();

        task3();

        task4();

        System.out.println("--------");
//        byte bb = 127;

//        byte resultByte = (byte)(bb + 20);//[-128, 127]

//        System.out.println(resultByte);

        System.out.println("-------");
        task5();

        task6();

        task7();

        task8();
    }

    private static void task1() {
        int myInt = 10;
        byte myByte = 5;
        short myShort = 20;
        long myLong = 10000000000L;
        float myFloat = 1.5f;
        //        BigDecimal
        double myDouble = 2.5;
        char myChar = 1072;
//        char result = 3;

        boolean myBoolean = true;

        System.out.println("Значение переменной myInt с типом int равно " + myInt);
        System.out.println("Значение переменной myByte с типом byte равно " + myByte);
        System.out.println("Значение переменной myShort с типом short равно " + myShort);
        System.out.println("Значение переменной myLong с типом long равно " + myLong);
        System.out.println("Значение переменной myFloat с типом float равно " + myFloat);
        System.out.println("Значение переменной myDouble с типом double равно " + myDouble);
        System.out.println("Значение переменной myChar с типом double равно " + myChar);
        System.out.println("Значение переменной myBoolean с типом double равно " + myBoolean);
    }

    private static void task2() {
        double aa = 27.12;
        System.out.println(aa);
        long bb = 987678965549L;
        System.out.println(bb);
        float cc = 2.786f;
        System.out.println(cc);
        int dd = 569;
        System.out.println(dd);
        short ee = 159;
        System.out.println(ee);
        long ff = 27897;
        System.out.println(ff);
        byte gg = 67;
        System.out.println(gg);
    }

    private static void task3() {
        //        Задача 3
        int studentsOfClass1 = 24;
        int studentsOfClass2 = 27;
        int studentsOfClass3 = 30;

        int totalSheets = 480;

        int totalStudents = studentsOfClass1 + studentsOfClass2 + studentsOfClass3;

        int sheetsPerStudent = totalSheets / totalStudents;

        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");
    }

    private static void task4() {
        int bottlesPerMinute = 16;
        int minutesInDay = 24 * 60;
        int minutesIn3Days = 3 * minutesInDay;
        int minutesInMonth = 30 * minutesInDay;

        int bottlesIn20Minutes = bottlesPerMinute * 20;
        int bottlesInDay = bottlesPerMinute * minutesInDay;
        int bottlesIn3Days = bottlesPerMinute * minutesIn3Days;
        int bottlesInMonth = bottlesPerMinute * minutesInMonth;

        String text = " штук бутылок";
        System.out.println("За 20 минут машина произвела " + bottlesIn20Minutes + text);
        System.out.println("За сутки машина производит " + bottlesInDay + text);
        System.out.println("За 3 дня машина произвела " + bottlesIn3Days + text);
        System.out.println("За месяц машина произвела " + bottlesInMonth + text);
    }

    private static void task5() {
        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;

        int totalClasses = totalCans / (whiteCansPerClass + brownCansPerClass);
        int totalWhiteCans = totalClasses * whiteCansPerClass;
        int totalBrownCans = totalClasses * brownCansPerClass;

        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");
    }

    private static void task6() {
        int bananasCount = 5;
        int bananasWeight = 80;
        int milkVolume = 200;
        double iceCreamWeight = 2 * 100;
        int eggsCount = 4;
        int eggsWeight = 70;

        int totalWeight = bananasCount * bananasWeight + milkVolume * 105 / 100 + (int) iceCreamWeight + eggsCount * eggsWeight;
        double totalWeightInKg = totalWeight / 1000.0;

        System.out.printf("Общий вес завтрака: %d грамм (%.2f кг)", totalWeight, totalWeightInKg);
    }

    private static void task7() {
        int weightLossGoal = 7;
        double dailyWeightLossLow = 0.25;
        double dailyWeightLossHigh = 0.5;
        // округляем в большую сторону
        int daysLow = (int) Math.ceil(weightLossGoal / dailyWeightLossLow);
        int daysHigh = (int) Math.ceil(weightLossGoal / dailyWeightLossHigh);
        int daysAverage = (daysLow + daysHigh) / 2;

        String messageTemplate = "Для похудения на %d кг при потере веса %.2f кг в день нужно %d дней";
        System.out.printf(messageTemplate, weightLossGoal, dailyWeightLossLow, daysLow);
        System.out.printf(messageTemplate, weightLossGoal, dailyWeightLossHigh, daysHigh);
        System.out.println("В среднем потребуется " + daysAverage + " дней для похудения на " + weightLossGoal + " кг");
    }

    private static void task8() {
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;

        int mashaNewSalary = (int) (mashaSalary * 1.1);
        int denisNewSalary = (int) (denisSalary * 1.1);
        int kristinaNewSalary = (int) (kristinaSalary * 1.1);

        int mashaAnnualIncomeBefore = mashaSalary * 12;
        int denisAnnualIncomeBefore = denisSalary * 12;
        int kristinaAnnualIncomeBefore = kristinaSalary * 12;

        int mashaAnnualIncomeAfter = mashaNewSalary * 12;
        int denisAnnualIncomeAfter = denisNewSalary * 12;
        int kristinaAnnualIncomeAfter = kristinaNewSalary * 12;

        String messageTemplate = "%s теперь получает %d рублей. Годовой доход вырос на %d рублей.";
        System.out.printf(messageTemplate, "Маша", mashaNewSalary, mashaAnnualIncomeAfter - mashaAnnualIncomeBefore);
        System.out.printf(messageTemplate, "Денис", denisNewSalary, denisAnnualIncomeAfter - denisAnnualIncomeBefore);
        System.out.printf("Кристина теперь получает %d рублей. Годовой доход вырос на %d рублей.", kristinaNewSalary, kristinaAnnualIncomeAfter - kristinaAnnualIncomeBefore);
    }
}
