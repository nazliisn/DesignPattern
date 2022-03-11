package Factories;

import Laptop.Laptop;
import Telephone.Telephone;
import Laptop.*;

public class LenovaFactory implements LaptopFactory {
    @Override
    public Laptop makeLaptop(String laptopModel) {
        switch (laptopModel) {
            case "Lenovo Legion 5":
                return new Lenovo_Legion_5();
            case "Lenovo Legion 5 Pro":
                return new Lenovo_Legion_5_Pro();
            case "Lenovo Yoga":
                return new Lenovo_Yoga();
            default:
                return null;

        }

    }
}

