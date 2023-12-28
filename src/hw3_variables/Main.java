package hw3_variables;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        //задача 1
        int myInt = 10;
        byte myByte = 5;
        short myShort = 20;
        long myLong = 10000000000L;
        float myFloat = 1.5f;
        double myDouble = 2.5; //        BigDecimal
        char myChar = 1072;
        boolean myBoolean = true;



        System.out.println("Значение переменной myInt с типом int равно " + myInt);
        System.out.println("Значение переменной myByte с типом byte равно " + myByte);
        System.out.println("Значение переменной myShort с типом short равно " + myShort);
        System.out.println("Значение переменной myLong с типом long равно " + myLong);
        System.out.println("Значение переменной myFloat с типом float равно " + myFloat);
        System.out.println("Значение переменной myDouble с типом double равно " + myDouble);
        System.out.println("Значение переменной myChar с типом double равно " + myChar);

//        Задача 2
        double a = 27.12;
        long b = 987678965549L;
        float c = 2.786f;
        int d = 569;
        short e = 159;
        long f = 27897;
        byte g = 67;

//        Задача 3

        int studentsOfClass1 = 24;
        int studentsOfClass2 = 27;
        int studentsOfClass3 = 30;

        int totalSheets = 480;

        int totalStudents = studentsOfClass1 + studentsOfClass2 + studentsOfClass3;

        int sheetsPerStudent = totalSheets / totalStudents;

        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");

//        Задача 4

        int bottlesPerMinute = 16;
        int minutesInDay = 24 * 60;
        int minutesIn3Days = 3 * minutesInDay;
        int minutesInMonth = 30 * minutesInDay;

        int bottlesIn20Minutes = bottlesPerMinute * 20;
        int bottlesInDay = bottlesPerMinute * minutesInDay;
        int bottlesIn3Days = bottlesPerMinute * minutesIn3Days;
        int bottlesInMonth = bottlesPerMinute * minutesInMonth;

        System.out.println("За 20 минут машина произвела " + bottlesIn20Minutes + " штук бутылок");
        System.out.println("За сутки машина производит " + bottlesInDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesIn3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottlesInMonth + " штук бутылок");

        System.out.println("-------");
//        byte bb = 127;

//        byte resultByte = (byte)(bb + 20);//[-128, 127]

//        System.out.println(resultByte);

        System.out.println("-------");
        //Задача 5
        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;

        int totalClasses = totalCans / (whiteCansPerClass + brownCansPerClass);
        int totalWhiteCans = totalClasses * whiteCansPerClass;
        int totalBrownCans = totalClasses * brownCansPerClass;

        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");

        //Задача 6

        int bananasCount = 5;
        int bananasWeight = 80;
        int milkVolume = 200;
        double iceCreamWeight = 2 * 100;
        int eggsCount = 4;
        int eggsWeight = 70;

        int totalWeight = bananasCount * bananasWeight + milkVolume * 105 / 100 + (int) iceCreamWeight + eggsCount * eggsWeight;
        double totalWeightInKg = totalWeight / 1000.0;

        System.out.printf("Общий вес завтрака: %d грамм (%.2f кг)", totalWeight, totalWeightInKg);

//Задача 7
        int weightLossGoal = 7; // в килограммах
        double dailyWeightLossLow = 0.25; // в килограммах
        double dailyWeightLossHigh = 0.5; // в килограммах

        int daysLow = (int) Math.ceil(weightLossGoal / dailyWeightLossLow); // округляем в большую сторону
        int daysHigh = (int) Math.ceil(weightLossGoal / dailyWeightLossHigh); // округляем в большую сторону
        int daysAverage = (daysLow + daysHigh) / 2;

        System.out.println("Для похудения на " + weightLossGoal + " кг при потере веса " + dailyWeightLossLow + " кг в день нужно " + daysLow + " дней");
        System.out.println("Для похудения на " + weightLossGoal + " кг при потере веса " + dailyWeightLossHigh + " кг в день нужно " + daysHigh + " дней");
        System.out.println("В среднем потребуется " + daysAverage + " дней для похудения на " + weightLossGoal + " кг");

        //Задача 8

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

        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + (mashaAnnualIncomeAfter - mashaAnnualIncomeBefore) + " рублей.");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + (denisAnnualIncomeAfter - denisAnnualIncomeBefore) + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + (kristinaAnnualIncomeAfter - kristinaAnnualIncomeBefore) + " рублей.");

    }
}
