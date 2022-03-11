package Decarators;

import Telephone.Telephone;

public class Portable_Battery extends TelephoneDecorators {
    Telephone telephone;

    public Portable_Battery(Telephone telephone) {
        this.telephone = telephone;
    }

    @Override
    public String getDescription() {
        return telephone.getDescription() + " Portable Battery";
    }

    @Override
    public double cost() {
        return .200+telephone.cost();
    }
}
