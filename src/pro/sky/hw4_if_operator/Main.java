package pro.sky.hw4_if_operator;

public class Main {

    @SuppressWarnings("checkstyle:AvoidNestedBlocks")
    public static void main(String[] args) {

        //Задача1
        {
            int age = 3;
            //больше или равно 18
            if (age >= 18) {
                System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
            } else {
                System.out.println("Если возраст человека равен " + age + ", то он не совершеннолетний");
            }
        }
//        boolean flag = false;//истина
//        if (flag) {
//            //код
//            //код
//        } else{
//           //код
//        }
//        System.out.println("1");

        //Задача 2
        int temperature = 3;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        //Задача 3
        {
            int speed = 70;
            checkSpeed(speed);
        }
        {
            int speed = 30;
            checkSpeed(speed);
        }
        {
            int speed = 40;
            checkSpeed(speed);
        }
        {
            int speed = 90;
            checkSpeed(speed);
        }
        //Задача 4
        {
            // возраст человека
            int age = 26;

            if (age < 2) {
                System.out.println("Если возраст человека равен " + age + ", то ему пора спать");
            } else if (age >= 2 && age <= 6) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
            } else if (age >= 7 && age <= 18) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
            } else if (age >= 19 && age <= 23) {
                System.out.println("Если возраст человека равен " + age + ", то его место в университете");
            } else if (age >= 24 && age <= 60) {
                System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
            } else {
                System.out.println("Если возраст человека равен " + age + ", то он может отдохнуть");
            }
            //кода
        }
        String str = """
                            0   *    0      0 
                //        false && false = false
                            1   *    0      0
                //        true && false = false
                            0   *   1       0
                //        false && true = false
                            1    *   1      1
                //        true && true = true
                                
                                """;
        System.out.println(str);

        {
            // возраст ребенка
            int age = 10;

            if (age < 5) {
                System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
            } else if (age >= 5 && age < 14) {
                System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе только в сопровождении взрослого.");
            } else {
                System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
            }
        }

        int capacity = 102; // вместимость вагона
        int numSeats = 60; // количество сидячих мест в вагоне

        int numPassengers = 105; // общее количество пассажиров

        if (numPassengers < numSeats) {
            System.out.println("В вагоне есть свободные сидячие места.");
        } else if (numPassengers < capacity) {
            System.out.println("В вагоне есть свободные стоячие места.");
        } else {
            System.out.println("В вагоне нет свободных мест.");
        }

        //Задача 7
        int one = 1;
        int two = 2;
        int three = 7;

//        int[] ints = new int[10];
//        ints[0] = 1;
//        ints[9] = 1100;

        getMaxValue(one, two, three);
    }

    private static void getMaxValue(int one, int two, int three) {
        if (one >= two && one >= three) {
            System.out.println("Наибольшее число: " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Наибольшее число: " + two);
        } else {
            System.out.println("Наибольшее число: " + three);
        }
    }

    private static void checkSpeed(int speed) {
        // проверяем, превышает ли скорость 60 км/ч
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }
    }
}
