public class Main {
    public static void main(String[] args) {
        // task 1
        System.out.println("Задача №1");
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 487956756756L;
        float A = 1.1f;
        double B = 2.2;
        System.out.println("Значение переменной byte " + "с типом целочисленных" + " равно " + a);
        System.out.println("Значение переменной short " + " с типом целочиленных" + " равно " + b);
        System.out.println("Значение переменной int " + " с типом целочисленных" + " равно " + c);
        System.out.println("Значение переменной long " + " с типом целочисленных" + " равно " + d);
        System.out.println("Значение переменной float" + " с типом плавающей точки" + " равно " + A);
        System.out.println("Значение переменной float" + " с типом плавающей точки" + " равно " + B);

        //task 2
        System.out.println("Задача №2");
        float a1 = 27.12f;
        long b1 = 987678965549l;
        float c1= 2.786f;
        short d1 = 569;
        short e1 = -159;
        int f1 = 27897;
        byte g1 = 67;
        System.out.println(g1);

        //task 3
        System.out.println("Задача №3");
        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        short peaper = 480;
        int allStudents = teacher1 + teacher2 + teacher3;
        int everyStudents = peaper / allStudents;
        System.out.println("На каждого ученика рассчитано " + everyStudents + " листов бумаги");

        //task4
        System.out.println("Задача №4");
        byte bottles = 16;
        byte minutes = 2;
        int minutes_1 = bottles / minutes; //Сколько бутылок за 1 минуту (8штук)
        int minutes_20 = minutes_1 * 20;
        System.out.println("За 20 минут машина произвела " + minutes_20 + " штук бутылок");
        int hours_1 = minutes_20 * 3;
        int day = hours_1 * 24;
        System.out.println("За cутки  машина произвела " + day + " штук бутылок");
        int threeDay = day * 3;
        System.out.println("За 3 дня  машина произвела " + threeDay + " штук бутылок");
        int month = day * 28;
        System.out.println("За 1 месяц  машина произвела " + month + " штук бутылок");

        //task5
        System.out.println("Задача №5");
        byte needPaint = 120;
        byte klass_1_white = 2;
        byte klass_1_brown = 4;
        int totalClasses = needPaint/ (klass_1_white+ klass_1_brown);
        int totalWhiteClans = klass_1_white * totalClasses;
        int totalBrownClans = klass_1_brown * totalClasses;
        System.out.println("В школе, где " + totalClasses + " класов, нужно " + totalWhiteClans + " банок белой краски и  " + totalBrownClans + " коричневой краски");

        //task6
        System.out.println("Задача №6");
        int bananasCount = 5;
        int milkCount = 2; //200 мл молока
        int iceCreamCount = 2;
        int eggCount = 4;
        int weightBananaUnit = 80; //80 грамм - 1 банана
        int weightMilkUnit = 105;
        int weightIceCreamUnit = 100;
        int weightEggUnit = 70;
        byte milkGramm = 105; //100мл - 105g
        int totalWeightInGramms = bananasCount * weightBananaUnit + milkCount * weightMilkUnit + iceCreamCount * weightIceCreamUnit + eggCount * weightEggUnit;
        double totalWeightInKG = totalWeightInGramms / 1000D;
        System.out.println("Общйи вес в граммах " + totalWeightInGramms + " в килограммах " + totalWeightInKG);

        //task7
        System.out.println("Задача №7");
        int weightForLossInGramms = 7000;
        int weightForLossDayMin = 250;
        int weightForLossDayMax = 500;
        double maxDayCount = (double) weightForLossInGramms / weightForLossDayMin;
        double minDayCount = (double) weightForLossInGramms / weightForLossDayMax;
        double lossWeightPerDayAverage = (weightForLossDayMax + weightForLossDayMin) / 2D;
        double averageDayCount = weightForLossInGramms / lossWeightPerDayAverage;
        System.out.println("Минимальное количество дней для похудения " + minDayCount);
        System.out.println("Максимальное количество дней для похудения " + maxDayCount);
        System.out.println("Среднее значение количества дней для похудения " + averageDayCount );

        //task8
        System.out.println("Задача №8");
        int MariaSalary = 67760;
        int DenisSalary = 83690;
        int KristinaSalary = 76230;
        int newSalaryMaria = MariaSalary/10 + MariaSalary; //10% в месяц
        int newSalaryDenis = DenisSalary/10 + DenisSalary; //10% в месяц
        int newSalaryKristina = KristinaSalary/10 + KristinaSalary; //10% в месяц
        int moneyYearMaria = MariaSalary * 12; //Годовая зп
        int moneyYearDenis = DenisSalary * 12; //Годовая зп
        int moneyYearKristina = KristinaSalary * 12; //Года зп
        int newMoneyYearMaria = newSalaryMaria * 12; //Годовая зп %
        int newMoneyYearDenis = newSalaryDenis * 12; //Годовая зп %
        int newMoneyYearKristina = newSalaryKristina * 12; //Годовая зп %
        int salaryMaria = newMoneyYearMaria - moneyYearMaria; //Разница
        int salaryDenis = newMoneyYearDenis - moneyYearDenis; //Разница
        int salaryKristina = newMoneyYearKristina - moneyYearKristina; //Разница
        System.out.println("Маша теперь получает " + newSalaryMaria + " рублей. Годовой доход вырос на " + salaryMaria + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + salaryDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + salaryKristina + " рублей");
        }

    }