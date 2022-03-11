package Decarators;

import Laptop.Laptop;

public class Laptop_Cooler extends LaptopDecorators {
    Laptop laptop;

    public Laptop_Cooler(Laptop laptop) {
        this.laptop = laptop;
    }
    @Override
    public String getDescription() {
        return laptop.getDescription() + " ,Laptop Cooler ";
    }

    @Override
    public double cost() {
        return .599+laptop.cost();
    }
}
