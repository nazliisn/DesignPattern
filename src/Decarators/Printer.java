package Decarators;

import Laptop.Laptop;

public class Printer extends LaptopDecorators {
    Laptop laptop;

    public Printer(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String getDescription() {
        return laptop.getDescription() +" ,Printer ";
    }

    @Override
    public double cost() {
        return 579+laptop.cost();
    }
}
