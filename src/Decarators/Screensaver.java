package Decarators;

import Telephone.Telephone;

public class Screensaver extends TelephoneDecorators {
    Telephone telephone;

    public Screensaver(Telephone telephone) {
        this.telephone = telephone;
    }

    @Override
    public String getDescription() {
        return telephone.getDescription()+" ,Screensaver ";
    }

    @Override
    public double cost() {
        return .020+telephone.cost();
    }
}
