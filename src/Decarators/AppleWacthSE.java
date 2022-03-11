package Decarators;

import Telephone.Telephone;

public class AppleWacthSE extends TelephoneDecorators {
    Telephone telephone;

    public AppleWacthSE(Telephone telephone) {
        this.telephone = telephone;
    }
    @Override
    public String getDescription() {
        return telephone.getDescription() + " ,Apple Watch SE ";
    }

    @Override
    public double cost() {
        return 4.199 + telephone.cost();
    }
}
