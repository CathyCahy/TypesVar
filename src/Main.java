public class Main { public static void main(String[] args) {
    //System.out.println("Hello world!");
    // Задача 1
    byte a = 2;
    short b = 1000;
    int c = 500000;
    long d = 1000000000;
    float e = 4.6f;
    double f = 1.999999999;
    System.out.println("Значение переменной a с типом byte равно " + a);
    System.out.println("Значение переменной b с типом short равно " + b);
    System.out.println("Значение переменной c с типом int равно " + c);
    System.out.println("Значение переменной d с типом long равно " + d);
    System.out.println("Значение переменной e с типом float равно " + e);
    System.out.println("Значение переменной f с типом double равно " + f);

    // Задача 2
    float g = 27.12f;
    long h = 987678965549L;
    float i = 2.786f;
    short j = 569;
    short k = -159;
    int l = 27897;
    byte m = 67;

    // Задача 3
    byte studentsNumberLp = 23;
    byte studentsNumberAs = 27;
    byte studentsNumberEa = 30;
    byte studentsNumber =(byte) (studentsNumberLp + studentsNumberAs + studentsNumberEa);
    short paperNumber = 480;
    byte paperForEachStudent = (byte) (paperNumber / studentsNumber);
    System.out.println("На каждого ученика рассчитано "+ paperForEachStudent + " листов бумаги.");

   // Задача 4
    byte bottleNumberInTwoMinutes = 16;
    byte minutes = 2;
    byte bottleNumberInMinute = (byte) (bottleNumberInTwoMinutes/minutes);
    minutes = 20;
    short bottleNumberInTime =(short) (bottleNumberInMinute * minutes);
    System.out.println("За " + minutes + " минут машина произвела " + bottleNumberInTime +" штук бутылок");
    short minutesInDay = 24*60;
    short bottleNumberInDay =(short) (bottleNumberInMinute * minutesInDay);
    System.out.println("За сутки машина произвела " + bottleNumberInDay +" штук бутылок");
    int minutesInThreeDay = minutesInDay*3;
    int bottleNumberInThreeDay = bottleNumberInMinute * minutesInThreeDay;
    System.out.println("За 3 дня машина произвела " + bottleNumberInThreeDay +" штук бутылок");
    byte daysInMonth = 30;
    int bottleNumberInMonth = bottleNumberInDay * daysInMonth;
    System.out.println("За месяц машина произвела " + bottleNumberInMonth +" штук бутылок");

    // Задача 5
    byte whitePaintForOneClass = 2;
    byte brownPaintForOneClass = 4;
    byte numberClasses =(byte) (120/(whitePaintForOneClass + brownPaintForOneClass));
    byte whitePaintForAllClasses =(byte)(whitePaintForOneClass * numberClasses);
    byte brownPaintForAllClasses = (byte)(brownPaintForOneClass * numberClasses);
    System.out.println("В школе, где "+ numberClasses + " классов, нужно " + whitePaintForAllClasses + " банок белой краски и "+ brownPaintForAllClasses + " банок коричневой краски.");

   // Задача 6
    short bananaWeight = 5*80;
    short milkWeight = 2*105;
    short iceCreamWeight = 2*100;
    short eggsWeight = 4*70;
    short breakfastWeight = (short)( bananaWeight + milkWeight + iceCreamWeight + eggsWeight);
    System.out.println("Вес завтрака в граммах " + breakfastWeight + " г.");
    float breakfastWeightInKg = (float) breakfastWeight/100;
    System.out.println("Вес завтрака в килограммах "+ breakfastWeightInKg + " кг.");

    // Задача 7
    byte weighLoss = 7;
    short weighLossInGrams = 7*1000;
    short gramsInDay = 250;
    byte days = (byte)(weighLossInGrams / gramsInDay);
    System.out.println("Если спортсмен будет худеть в день на " + gramsInDay + "г., то ему потребуется " + days + " дней, чтобы похудеть на "+ weighLoss + " кг.");
    gramsInDay = 500;
    days = (byte)(weighLossInGrams / gramsInDay);
    System.out.println("Если спортсмен будет худеть в день на " + gramsInDay + "г., то ему потребуется " + days + " дней, чтобы похудеть на "+ weighLoss + " кг.");
    short averageGrams = (250+500)/2;
    days = (byte)(weighLossInGrams/averageGrams);
    System.out.println("В среднем спортсмен похудеет за " + days + " дней на "+ weighLoss + " кг.");

    // Задача 8
    int payMasha = 67760;
    int payDenis = 83690;
    int payKristina = 76230;
    int payMashaAfterRaising = payMasha + payMasha*10/100;
    int payDenisAfterRaising = payDenis + payDenis*10/100;
    int payKristinaAfterRaising = payKristina + payKristina*10/100;
    int diffPayMashaInYear = (payMashaAfterRaising - payMasha)*12;
    int diffPayDenisInYear = (payDenisAfterRaising - payDenis)*12;
    int diffPayKristinaInYear = (payKristinaAfterRaising - payKristina)*12;
    System.out.println("Маша тепенрь получает " + payMashaAfterRaising + " рублей. Годовой доход вырпос на " + diffPayMashaInYear + " рублей.");
    System.out.println("Денис тепенрь получает " + payDenisAfterRaising + " рублей. Годовой доход вырпос на " + diffPayDenisInYear + " рублей.");
    System.out.println("Кристина тепенрь получает " + payKristinaAfterRaising + " рублей. Годовой доход вырпос на " + diffPayKristinaInYear + " рублей.");

}

}