public class Main {
    public static void main(String[] args) {
        System.out.println("Home Work-3");

        System.out.println("Задание-1");
        byte apple = 1;
        int orange = 23;
        short pepper = 2000;
        long tomato = 1000000;
        float sugar = 0.5f;
        double flour = 4.5;
        System.out.println("Яблоко=" + apple + "шт; " + "апельсин=" + orange + "шт; " + "перец=" + pepper + "шт; " + "помидор=" + tomato + "шт; " + "сахар=" + sugar + "кг; " + "мука=" + flour + "кг.");
        System.out.println();

        System.out.println("Задание-2");
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
        System.out.println(" float=" + a + " long=" + b + " float=" + c + " short=" + d + " short=" + e + " short=" + f + " byte=" + g);

        System.out.println();
        System.out.println("Задание-3");
        byte ludmilaPavlova = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short paper = 480;
        int students = ludmilaPavlova + annaSergeevna + ekaterinaAndreevna;
        System.out.println("Колличесво учиников с 3-х класов=" + students + " чел.");
        int peperInStudents = paper / students;
        System.out.println("На каждого ученика рассчитано " + peperInStudents + " листов бумаги");

        System.out.println();
        System.out.println("Задание-4");
        byte bottles = 16;
        byte minutes = 2;
        System.out.println("Условие - машина производит " + bottles + " шт бутылок за " + minutes + " минуты");
        int minates20 = (bottles / minutes) * 20;
        System.out.println("За 20 минут машина произвела " + minates20 + " штук бутылок");
        int day = ((bottles / minutes) * 60) * 24;
        System.out.println("За сутки машина произвела " + day + " штук бутылок");
        int day3 = day * 3;
        System.out.println("За 3 дня машина произвела " + day3 + " штук бутылок");
        int month = day * 31;
        System.out.println("За 1 месяц машина произвела " + month + " штук бутылок");

        System.out.println();
        System.out.println("Задание-5");
        byte dye = 120;
        byte white = 2;
        byte brown = 4;
        int numberClasses = dye / (white + brown);
        int dyeWhite = numberClasses * white;
        int dyeBrown = numberClasses * brown;
        System.out.println("В школе, где " + numberClasses + " классов, нужно " + dyeWhite + " банок белой краски и " + dyeBrown + " банок коричневой краски");

        System.out.println();

        System.out.println("Задание-6");
        System.out.println("Вариант-1");
        byte bananas = 5;
        byte weightBanana = 80;
        System.out.println("Масса банонов = " + bananas * weightBanana + " грамм");
        short milk = 200;
        float oneMilk = 100;
        double weightMilk = 105;
        System.out.println("Масса молока = " + weightMilk / oneMilk * milk + " грамм");
        byte iceCream = 2;
        short weightIceCream = 100;
        System.out.println("Масса мороженного бломбир = " + iceCream * weightIceCream + " грамм");
        byte eggs = 4;
        byte weightEgg = 70;
        System.out.println("Масса сырых яиц = " + eggs * weightEgg + " грамм");
        System.out.println("Вес завтрака спортсмена в граммах= " + ((bananas * weightBanana) + (weightMilk / oneMilk * milk) + (iceCream * weightIceCream) + (eggs * weightEgg)) + " грамм");
        System.out.println("Вес завтрака спортсмена в кг= " + ((bananas * weightBanana) + (weightMilk / oneMilk * milk) + (iceCream * weightIceCream) + (eggs * weightEgg)) / 1000 + " кг");

        System.out.println();
        System.out.println("Вариант-.2");
        int weightBanana1 = bananas * weightBanana;
        double weightMilk1 = (weightMilk / oneMilk) * milk;
        int weightIceCream1 = iceCream * weightIceCream;
        int weightEggs1 = eggs * weightEgg;
        double massSportBreakfast = weightBanana1 + weightMilk1 + weightIceCream1 + weightEggs1;
        System.out.println("Вес спортзавтрака в граммах=" + massSportBreakfast + " грамм");
        double massSportBreakfastKg = massSportBreakfast / 1000;
        System.out.println("Масса спортзавтрака в кг=" + massSportBreakfastKg + " кг");

        System.out.println();
        System.out.println("Задание-7");
        System.out.println("Вариант-1");
        int weightLossAthletes = 7*1000;
        int weightLossIn250 = 250;
        int weightLossIn500 = 500;
        int numberDays250 = weightLossAthletes/weightLossIn250 ;
        System.out.println("Колличество дней при потере в день 250 грамм = " + numberDays250 + " дней");
        int numberDays500 = weightLossAthletes/weightLossIn500;
        System.out.println("Колличество дней при потере в день 500 грамм = " + numberDays500 + " день");

        System.out.println("Вариант-2");
        System.out.println("Колличество дней при потере в день 250 грамм = " +  weightLossAthletes/weightLossIn250 + " дней");
        System.out.println("Колличество дней при потере в день 500 грамм = " +  weightLossAthletes/weightLossIn500 + " день");

        System.out.println();
        System.out.println("Задание-8");
        System.out.println("Вариант-1");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryChristina = 76230;
        float companyBonus = 0.1f;
        //можно как во 2-м варианте float companyBonus=10/100f;
        float increasesSalaryMasha = salaryMasha * companyBonus + salaryMasha;
        System.out.println("Зарплата Маши с этого месяця увеличена на 10 % и составит  - " + increasesSalaryMasha + " рублей");
        float increasesSalaryDenis = salaryDenis * companyBonus + salaryDenis;
        System.out.println("Зарплата Дениса с этого месяця увеличена на 10 % и составит  - " + increasesSalaryDenis + " рублей");
        float increasesSalaryChristina = salaryChristina * companyBonus + salaryChristina;
        System.out.println("Зарплата Кристины с этого месяця увеличена на 10 % и составит  - " + increasesSalaryChristina + " рублей");
        System.out.println();
        System.out.println("Вариант-2");
        System.out.println("Зарплата Маши с этого месяця увеличена на 10 % и составит  - " + ((salaryMasha * companyBonus) + salaryMasha) + " рублей");
        System.out.println("Зарплата Дениса с этого месяця увеличена на 10 % и составит  - " + ((salaryDenis * companyBonus) + salaryDenis) + " рублей");
        System.out.println("Зарплата Кристины с этого месяця увеличена на 10 % и составит  - " + ((salaryChristina * companyBonus) + salaryChristina) + " рублей");
        System.out.println("Вариант-3");
        float companyBonus1 = 110 / 100f;
        float increasesSalaryMasha1 = salaryMasha * companyBonus1;
        System.out.println("Зарплата Маши с этого месяця увеличена на 10 % и составит  - " + increasesSalaryMasha1 + " рублей");
        float increasesSalaryDenis1 = salaryDenis * companyBonus1;
        System.out.println("Зарплата Дениса с этого месяця увеличена на 10 % и составит  - " + increasesSalaryDenis1 + " рублей");
        float increaseSalaryChristina1 = salaryChristina * companyBonus1;
        System.out.println("Зарплата Кристины с этого месяця увеличена на 10 % и составит  - " + increaseSalaryChristina1 + " рублей");
        System.out.println();
        System.out.println("Годовой заработок каждого сотрудника до повышения на 10%");
        int annualEarningsMasha = salaryMasha * 12;
        int annualEarningsDenis = salaryDenis * 12;
        int annualEarningsChristina = salaryChristina * 12;
        System.out.println("Годовой заработок сотрудников до повышения зарплаты на 10%: " + "1.Маша-" + annualEarningsMasha + " рублей" + " 2.Денис-" + annualEarningsDenis + " рублей" + " 3.Кристина-" + annualEarningsChristina + " рублей");
        System.out.println();
        System.out.println("Годовой заработок каждого сотрудника полсе повышения на 10%");
        float annualEarningsIncreasesMasha = increasesSalaryMasha * 12;
        float annualEarningsIncreasesDenis = increasesSalaryDenis * 12;
        float annualEarningsIncreasesChristina = increasesSalaryChristina * 12;
        System.out.println("Годовой заработок сотрудников после повышения зарплаты на 10%: " + "1.Маша-" + annualEarningsIncreasesMasha + " рублей" + " 2.Денис-" + annualEarningsIncreasesDenis + " рублей" + " 3.Кристина-" + annualEarningsIncreasesChristina + " рублей");
        System.out.println();
        System.out.println("Разница зарабока за год каждого сотрудника до и после повышения на 10%");
        float differenceEarningsMasha = annualEarningsIncreasesMasha - annualEarningsMasha;
        float differenceEarningsDenis = annualEarningsIncreasesDenis - annualEarningsDenis;
        float differenceEarningsChristina = annualEarningsIncreasesChristina - annualEarningsChristina;
        System.out.println("Разница зарабока за год каждого сотрудника до и после повышения на 10%:" + "1.Маша=" + differenceEarningsMasha + " рублей" + " 2.Денис=" + differenceEarningsDenis + " рублей" + " 3.Кристина=" + differenceEarningsChristina + " рублей");
        System.out.println();
        System.out.println("Маша теперь получает " + increasesSalaryMasha + " рублей. Годовой доход вырос на " + differenceEarningsMasha + " рублей.");
        System.out.println("Денис теперь получает " + increasesSalaryDenis + " рублей. Годовой доход вырос на " + differenceEarningsDenis + " рублей.");
        System.out.println("Кристина теперь получает " + increasesSalaryChristina + " рублей. Годовой доход вырос на " + differenceEarningsChristina + " рублей.");
    }
}