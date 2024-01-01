package pro.sky.hw2_variables;

public class Main {

    public static void main(String[] args) {
        short myShort = 4;
        byte myByte = 3;
        int result = myShort + myByte;
        System.out.println(result);

        //Правила:
        //если у нас 1 double = double
        //если у нас 1 float, 2 не double = float
        //если у нас 1 int, 2 не double, float = int
        //иначе приводим к int

        //Задача1
        int dog = 8;
        float cat = 3.6f;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

//        Задача2
        dog = dog + 4;
        cat += 4; //cat = cat + 4
        paper += 4;

//        Задача3
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;

//        Задача4
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

//        Задача 5
        double frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

        //        Задача 6
        double boxer1Weight = 78.2;
        double boxer2Weight = 82.7;

        double totalWeight = boxer1Weight + boxer2Weight;
        double diffWeight = boxer2Weight - boxer1Weight;
        System.out.println(totalWeight);
        System.out.println(diffWeight);

//        Задача 7
        double diff2Weight = boxer2Weight % boxer1Weight;
        System.out.println(diff2Weight);

//        Задача 8
//        var workTime = 640;
//        var timePerDay = 8;
//
//        int employeeCount = workTime / timePerDay;
//
//        System.out.println("«Всего работников в компании — " + employeeCount + " человек»");
//        System.out.printf("«Всего работников в компании — %d человек»\n", employeeCount);
//        System.out.println();
//
//        employeeCount += 20;
//
//        var newTimePerDay = workTime / employeeCount;

//        System.out.printf("«Если в компании работает %d человек, то всего %d часов работы может быть поделено между сотрудниками»", employeeCount, newTimePerDay);

        System.out.println("Задача № 8");
        var allWorkHours = 640;
        var oneEmployeeHours = 8;
        var numberOfEmployees = allWorkHours / oneEmployeeHours;

        System.out.println(" 1)Всего работников в компании - " + numberOfEmployees + " человек");
        numberOfEmployees = numberOfEmployees + 94;

        var totalOperatingHours = numberOfEmployees * oneEmployeeHours;
        System.out.println(" 2)Если в компании работает " + numberOfEmployees + " человек, то всего " + totalOperatingHours + " часов работы может быть поделено между сотрудниками");
    }
}
