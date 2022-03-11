package Decarators;

import Telephone.Telephone;

public class Headphone extends TelephoneDecorators {
    Telephone telephone;

    public Headphone(Telephone telephone) {
        this.telephone = telephone;
    }

    @Override
    public String getDescription() {
        return telephone.getDescription() + " ,HeadPhone ";
    }

    @Override
    public double cost() {
        return .085+telephone.cost();
    }
}
