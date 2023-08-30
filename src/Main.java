public class Main {
    public static void main(String[] args) {

        byte a = 111;
        short b = 1001;
        int c = -47000;
        long d = 53645636;
        float f = 3.75f;
        double e = 1.7e+303;
        char j = 6553;

        System.out.printf("Значение переменной " + a + b + c + d + f + e + j);

        byte q = 67;
        short w = -159;
        int s = -569;
        long z = 987678965549L;
        float x = 2.786f;
        double v = 27.12;
        char n = 27897;
        System.out.printf("Назначение переменной " + q + w + s + z + x + v + n);

        byte students1 = 23;
        byte students2 = 27;
        byte students3 = 30;
        float allStudents = students1 + students2 +students3;
        float pages = 480 / allStudents;
        System.out.printf("На каждого ученика рассчитано " + pages + " листов бумаги");
        {

            byte allClass = 120 / (2 + 4);
            byte whitePaint = 20 * 2;
            byte brownPaint = 20 * 4;
            System.out.printf(" В школе, где " + allClass + "  классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски ");

            int weightBanana = 80;
            int weightMilk = 105;
            int weightIceCream = 100;
            int weightEgg = 70;
            int countBananas = 5;
            int countMilk = 200;
            int countIceCream = 2;
            int countEggs = 4;

            int totalWeight = (weightBanana * countBananas) + (weightMilk * countMilk / 100) + (weightIceCream * countIceCream) + (weightEgg * countEggs);
            double totalWeightKg = totalWeight / 1000.0;

            System.out.printf("Вес завтрака: " + totalWeight + " грамм");
            System.out.printf("Вес завтрака: " + totalWeightKg + " килограмм");

            int targetWeight = 7;
            int minLossPerDay = 250;
            int maxLossPerDay = 500;

            int minDays = (int) Math.ceil((double) targetWeight * 1000 / maxLossPerDay);
            int maxDays = (int) Math.ceil((double) targetWeight * 1000 / minLossPerDay);

            int averageDays = (minDays + maxDays) / 2;

            System.out.println("Минимальное количество дней: " + minDays);
            System.out.println("Максимальное количество дней: " + maxDays);
            System.out.println("Среднее количество дней: " + averageDays);

            String[] employees = {"Маша", "Денис", "Кристина"};
            int[] salaries = {67760, 83690, 76230};

            double increasePercentage = 0.10; // 10% increase

            for (int i = 0; i < employees.length; i++) {
                double currentSalary = salaries[i];
                double newSalary = currentSalary * (1 + increasePercentage);
                double annualIncomeBefore = currentSalary * 12;
                double annualIncomeAfter = newSalary * 12;
                double incomeDifference = annualIncomeAfter - annualIncomeBefore;

                System.out.println("Сотрудник: " + employees[i]);
                System.out.println("Текущая зарплата: " + currentSalary);
                System.out.println("Новая зарплата: " + newSalary);
                System.out.println("Годовой доход вырос на: " + incomeDifference + " рублей ");
                System.out.println();
            }


        }
    }
}