package Decarators;

import Laptop.Laptop;

public class Monitor extends LaptopDecorators {

    Laptop laptop;

    public Monitor(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String getDescription() {
        return laptop.getDescription()+" ,Monitor ";
    }

    @Override
    public double cost() {
        return 2.655+laptop.cost();
    }
}
