package Decarators;

import Laptop.Laptop;

public class SecuritySoftware extends LaptopDecorators
{
    Laptop laptop;

    public SecuritySoftware(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String getDescription() {
        return laptop.getDescription() + " ,Security Software ";
    }

    @Override
    public double cost() {
        return .500 +laptop.cost();
    }
}
