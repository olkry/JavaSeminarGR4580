import java.util.HashSet;

import HardwareStore.Laptops;

public class App {
    public static void main(String[] args) throws Exception {

        Laptops lap1 = new Laptops("AZ-2830", "Intel", 16,
                512, "nVideo", 3, 10, 2016);
        Laptops lap2 = new Laptops("AZ-2850", "Intel", 32,
                1024, "nVideo", 3, 11, 2016);
        Laptops lap3 = new Laptops("AZ-2890", "Intel", 32,
                1024, "nVideo", 6, 11, 2017);
        Laptops lap4 = new Laptops("AA-262", "AMD", 16,
                512, "nVideo", 3, 11, 2018);
        Laptops lap5 = new Laptops("AA-265", "AMD", 32,
                1024, "Radeon", 6, 11, 2019);
        Laptops lap6 = new Laptops("AA-263", "AMD", 16,
                1024, "Radeon", 3, 10, 2019);
        Laptops lap7 = new Laptops("DTM-10", "Intel", 16,
                512, "Radeon", 3, 11, 2020);
        Laptops lap8 = new Laptops("DTM-11", "AMD", 32,
                512, "Radeon", 6, 11, 2021);
        Laptops lap9 = new Laptops("DTM-12", "Intel", 32,
                1024, "nVideo", 3, 11, 2022);

        HashSet<Laptops> laptopSet = new HashSet<Laptops>();
        laptopSet.add(lap1);
        laptopSet.add(lap2);
        laptopSet.add(lap3);
        laptopSet.add(lap4);
        laptopSet.add(lap5);
        laptopSet.add(lap6);
        laptopSet.add(lap7);
        laptopSet.add(lap8);
        laptopSet.add(lap9);

        System.out.println("Имеем список ноутбуков: ");
        System.out.println(laptopSet);

        System.out.println("Соответствие " + lap2.model + " и " + lap4.model + " - " + lap2.equals(lap4));
        System.out.println("Соответствие " + lap2.model + " и " + lap5.model + " - " + lap2.equals(lap5));
        System.out.println("Соответствие " + lap2.model + " и " + lap9.model + " - " + lap2.equals(lap9));

        System.out.println(laptopSet.contains(lap2));


    }
}
