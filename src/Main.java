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
    }
}