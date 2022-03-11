package Factories;

import Telephone.Telephone;
import Telephone.*;

public class IphoneFactory implements TelephoneFactory {
    @Override
    public Telephone makeTelephone(String telephoneModel) {
        switch (telephoneModel) {
            case "Iphone 11":
                return new Iphone11();

            case "Iphone 12":
                return new Iphone12();

            case "Iphone SE":
                return new Iphone_SE();

        }

        return null;
    }
}
