package Decarators;

import Laptop.Laptop;

public class LaptopBag extends LaptopDecorators {
    Laptop laptop;

    public LaptopBag(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String getDescription() {
        return laptop.getDescription() + " , Laptop Bag";
    }

    @Override
    public double cost() {
        return .300+laptop.cost();
    }
}
