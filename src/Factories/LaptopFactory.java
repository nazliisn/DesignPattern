package Factories;

import Laptop.Laptop;
import Telephone.Telephone;

public interface LaptopFactory {
    public Laptop makeLaptop(String laptopModel);

}
