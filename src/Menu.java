import Decarators.*;
import Factories.IphoneFactory;
import Factories.LenovaFactory;
import Factories.MSIFactory;
import Factories.SamsungFactory;
import Laptop.Laptop;
import Laptop.Lenova;
import Telephone.Samsung;
import Telephone.Telephone;


import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our Store");
        boolean selected = true;
        while (selected) {
            System.out.println("Please select the number of the product you want to review.");

            System.out.println("0 --> Telephone");
            System.out.println("1 --> Laptop");

            int selectedInt = scanner.nextInt();
            switch (selectedInt) {
                case 0:
                    selectTelephone(scanner);
                    break;
                case 1:
                    selectLaptop(scanner);
                    break;
                default:
                    System.out.println("Unvalid number");
                    selected=false;

            }
        }
    }

    public static void selectTelephone(Scanner scanner) {
        boolean selected = true;
        while (selected) {
            System.out.println("Please select the number of the product you want to review");

            System.out.println("0 --> Samsung");
            System.out.println("1 --> Iphone");
            System.out.println("2 --> Return to previous menu");
            int selectedInt = scanner.nextInt();
            switch (selectedInt) {
                case 0:
                    selectSamsung(scanner);
                    break;
                case 1:
                    selectIphone(scanner);
                    break;

                default:
                    selected=false;
            }
        }
    }
    public static void selectLaptop(Scanner scanner) {

        boolean selected = true;

       ;
        while (selected) {
            System.out.println("Please select the number of the product you want to review");
            System.out.println("0 --> Lenovo");
            System.out.println("1 --> MSI");
            System.out.println("2 --> Return to previous menu");
            int selectedInt = scanner.nextInt();
            switch (selectedInt) {
                case 0:
                    selectedLenovo(scanner);
                    break;
                case 1:
                    selectedMSI(scanner);

                default:
                    selected =false;
            }
        }
    }

    public static void selectedLenovo(Scanner scanner) {

        LenovaFactory lenovaFactory = new LenovaFactory();
        boolean selected = true;
        while (selected) {
            System.out.println("Please select the number of the product you want to review");
            System.out.println("0 --> Lenovo Legion 5");
            System.out.println("1 --> Lenovo Legion 5 Pro");
            System.out.println("2 --> Lenovo Yoga");
            System.out.println("3 --> Return to previous menu");
            int selectedInt = scanner.nextInt();
            switch (selectedInt) {
                case 0:
                    Laptop laptop=lenovaFactory.makeLaptop("Lenovo Legion 5");
                    System.out.println(laptop.getDescription());
                    System.out.println("Product Price = "+laptop.cost());
                    System.out.println("Would you like to buy?(y/n)");
                    String yes=scanner.next();
                    if (yes.equals("y")){
                        preparingLaptop();
                        addLaptopDecorators(laptop);
                    }
                    else{
                        System.out.println("Would you like to look at the list again?");
                        selectedLenovo(scanner);}

                    break;
                case 1:
                     laptop=lenovaFactory.makeLaptop("Lenovo Legion 5 Pro");
                    System.out.println(laptop.getDescription());
                    System.out.println("Product Price = "+laptop.cost());
                    System.out.println("Would you like to buy?(y/n)");
                     yes=scanner.next();
                    if (yes.equals("y")){
                        preparingLaptop();
                        addLaptopDecorators(laptop);

                    }
                    else{
                        System.out.println("Would you like to look at the list again?");
                        selectedLenovo(scanner);}
                    break;
                case 2:
                    laptop=lenovaFactory.makeLaptop("Lenovo Yoga");

                    System.out.println(laptop.getDescription());
                    System.out.println("Product Price = "+laptop.cost());
                    System.out.println("Would you like to buy?(y/n)");
                     yes=scanner.next();
                    if (yes.equals("y")){
                        preparingLaptop();
                        addLaptopDecorators(laptop);
                    }
                    else{
                        System.out.println("Would you like to look at the list again?");
                        selectedLenovo(scanner);}
                    break;

                default:
                    selected=false;
            }
        }
    }
    public static void selectedMSI(Scanner scanner) {

        MSIFactory msiFactory = new MSIFactory();
        boolean selected = true;
        while (selected) {
            System.out.println("Please select the number of the product you want to review");
            System.out.println("0 --> MSI Katana");
            System.out.println("1 --> MSI Prestige 14");
            System.out.println("2 --> MSI Summit E13");
            System.out.println("3 --> To exit this menu");
            System.out.println("4 --> Return to previous menu");
            int selectedInt = scanner.nextInt();
            switch (selectedInt) {
                case 0:
                    Laptop laptop=msiFactory.makeLaptop("MSI Katana");
                    System.out.println(laptop.getDescription());
                    System.out.println("Product Price = "+laptop.cost());
                    System.out.println("Would you like to buy?(y/n)");
                    String yes=scanner.next();
                    if (yes.equals("y")){
                        preparingLaptop();
                        addLaptopDecorators(laptop);
                    }
                    else{
                        System.out.println("Would you like to look at the list again?");
                        selectedMSI(scanner);}
                    break;
                case 1:
                    laptop=msiFactory.makeLaptop("MSI Prestige 14");
                    System.out.println(laptop.getDescription());
                    System.out.println("Product Price = " + laptop.cost());
                    System.out.println("Would you like to buy?(y/n)");
                     yes=scanner.next();
                    if (yes.equals("y")){
                        preparingLaptop();
                        addLaptopDecorators(laptop);

                    }
                    else{
                        System.out.println("Would you like to look at the list again?");
                        selectedMSI(scanner);}
                    break;
                case 2:
                    laptop=msiFactory.makeLaptop("MSI Summit E13");
                    System.out.println(laptop.getDescription());
                    System.out.println("Product Price = "+laptop.cost());
                    System.out.println("Would you like to buy?(y/n)");
                     yes=scanner.next();
                    if (yes.equals("y")){
                        preparingLaptop();
                        addLaptopDecorators(laptop);
                    }
                    else{
                        System.out.println("Would you like to look at the list again?");
                        selectedMSI(scanner);}

                    break;

                default:
                    selected=false;
            }
        }
    }

    public static void selectSamsung(Scanner scanner) {
        SamsungFactory samsungFactory = new SamsungFactory();
        boolean selected = true;
        while (selected) {
            System.out.println("Please select the number of the product you want to review");
            System.out.println("0 --> Galaxy A02");
            System.out.println("1 --> Galaxy Z Flip3");
            System.out.println("2 --> Galaxy A72");
            System.out.println("3 --> Galaxy S20 FE");
            System.out.println("4 --> Return to previous menu");
            int selectedInt = scanner.nextInt();
            switch (selectedInt) {
                case 0:
                     Telephone telephone=samsungFactory.makeTelephone("Galaxy A02");
                    System.out.println(telephone.getDescription());
                    System.out.println("Product Price = "+telephone.cost());
                    System.out.println("Would you like to buy?(y/n)");
                    String yes=scanner.next();
                    if (yes.equals("y")){
                        preparingTelephone();
                        addTelephoneDecorators(telephone);
                    }
                    else{
                        System.out.println("Would you like to look at the list again?");
                        selectSamsung(scanner);}
                    break;
                case 1:
                    telephone=samsungFactory.makeTelephone("Galaxy Z Flip3");
                    System.out.println(telephone.getDescription());
                    System.out.println("Product Price = "+telephone.cost());
                    System.out.println("Would you like to buy?(y/n)");
                     yes=scanner.next();
                    if (yes.equals("y")){
                        preparingTelephone();
                        addTelephoneDecorators(telephone);
                    }
                    else{
                        System.out.println("Would you like to look at the list again?");
                        selectSamsung(scanner);}
                    break;
                case 2:
                    telephone=samsungFactory.makeTelephone("Galaxy A72");
                    System.out.println(telephone.getDescription());
                    System.out.println("Product Price"+telephone.cost());
                    System.out.println("Would you like to buy?(y/n)");
                    yes=scanner.next();
                    if (yes.equals("y")){
                        preparingTelephone();
                        addTelephoneDecorators(telephone);
                            }
                    else{
                        System.out.println("Would you like to look at the list again?");
                        selectSamsung(scanner);}
                    break;

                case 3:
                    telephone=samsungFactory.makeTelephone("Galaxy S20 FE");
                    System.out.println(telephone.getDescription());
                    System.out.println("Product Price = "+telephone.cost());
                    System.out.println("Would you like to buy?(y/n)");
                    yes=scanner.next();
                    if (yes.equals("y")){
                        preparingTelephone();
                        addTelephoneDecorators(telephone);

                    }
                    else{
                        System.out.println("Would you like to look at the list again?");
                        selectSamsung(scanner);}
                    break;

                default:
                    selected=false;
                    }
                }
            }

    public static void selectIphone(Scanner scanner) {
        IphoneFactory iphoneFactory = new IphoneFactory();
        boolean selected = true;

        while (selected) {
            System.out.println("Please select the number of the product you want to review");
            System.out.println("0 --> Iphone 11");
            System.out.println("1 --> Iphone 12");
            System.out.println("2 --> Iphone SE");
            System.out.println("3 --> Return to previous menu");
            int selectedInt = scanner.nextInt();
            switch (selectedInt) {
                case 0:
                    Telephone telephone=iphoneFactory.makeTelephone("Iphone 11");

                    System.out.println(telephone.getDescription());
                    System.out.println("Product Price = " + telephone.cost());
                    System.out.println("Would you like to buy?(y/n)");
                    String yes=scanner.next();
                    if (yes.equals("y")){
                        preparingTelephone();
                        addTelephoneDecorators(telephone);

                    }
                    else{
                        System.out.println("Would you like to look at the list again?");
                        selectIphone(scanner);}

                    break;
                case 1:
                    telephone=iphoneFactory.makeTelephone("Iphone 12");
                    System.out.println(telephone.getDescription());
                    System.out.println("Product Price = "+telephone.cost());
                    System.out.println("Would you like to buy?(y/n)");
                     yes=scanner.next();
                    if (yes.equals("y")){
                        preparingTelephone();
                        addTelephoneDecorators(telephone);

                    }
                    else{
                        System.out.println("Would you like to look at the list again?");
                        selectIphone(scanner);}

                    break;
                case 2:
                    telephone=iphoneFactory.makeTelephone("Iphone SE");

                    System.out.println(telephone.getDescription());
                    System.out.println("Product Price = " +telephone.cost());
                    System.out.println("Would you like to buy?(y/n)");
                     yes=scanner.next();
                    if (yes.equals("y")){
                        preparingTelephone();
                        addTelephoneDecorators(telephone);

                    }
                    else{
                        System.out.println("Would you like to look at the list again?");
                        selectIphone(scanner);}
                    break;

                default:
                    selected=false;
            }

        }
    }
    public static void preparingTelephone() {
      Samsung samsung=new Samsung();
        samsung.prepareTelephone();
    }

    public static void preparingLaptop() {
        Lenova lenova=new Lenova() {
        };
        lenova.prepareLaptop();
    }


   public static void addLaptopDecorators(Laptop laptop){
        Scanner scanner=new Scanner(System.in);
       boolean selected = true;
       while (selected) {
           System.out.println();
           System.out.println("Do you want to add Laptop accessories?");
           System.out.println("0 --> Monitor");
           System.out.println("1 --> Printer");
           System.out.println("2 --> Security Software");
           System.out.println("3 --> Laptop Cooler");
           System.out.println("4 --> Laptop Bag");
           System.out.println("5 --> Return to previous menu");
           System.out.println("6 --> Finish my shopping");
           int decarotor=scanner.nextInt();


           switch (decarotor) {
               case 0:
                   laptop = new Monitor(laptop);
                   System.out.println(laptop.getDescription() + " =  " + laptop.cost() + " TL ");
                   break;
               case 1:
                   laptop = new Printer(laptop);
                   System.out.println(laptop.getDescription() + " =  " + laptop.cost() + " TL ");
                   break;
               case 2:
                   laptop = new SecuritySoftware(laptop);
                   System.out.println(laptop.getDescription() + " =  " + laptop.cost() + " TL ");
                   break;
               case 3:
                   laptop = new Laptop_Cooler(laptop);
                   System.out.println(laptop.getDescription() + " =  " + laptop.cost() + " TL ");
                   break;
               case 4:
                   laptop = new LaptopBag(laptop);
                   System.out.println(laptop.getDescription() + " =  " + laptop.cost() + " TL ");
                   break;

               case 5:
                   selected=false;
                   break;

               default:
                   System.exit(1);



           }
       }
   }

    public static void addTelephoneDecorators( Telephone telephone) {

        Scanner scanner = new Scanner(System.in);

        boolean selected = true;

        while (selected) {

            System.out.println();
            System.out.println("Do you want to add Telephone accessories?");
            System.out.println("0 --> Samsung Galaxy Watch");
            System.out.println("1 --> Apple Wacth SE");
            System.out.println("2 --> Screensaver");
            System.out.println("3 --> Portable Battery");
            System.out.println("4 --> PhoneCase");
            System.out.println("5 --> Headphone");
            System.out.println("6 --> Return to previous menu");
            System.out.println("7 --> Finish my shopping");
            int decarotor = scanner.nextInt();
            System.out.println(decarotor);

            switch (decarotor) {
                case 0:
                    telephone = new SamsungGalaxyWatch(telephone);
                    System.out.println(telephone.getDescription() + " =  " + telephone.cost() + " TL ");
                    break;
                case 1:
                    telephone = new AppleWacthSE(telephone);
                    System.out.println(telephone.getDescription() + " =  " + telephone.cost() + " TL ");
                    break;
                case 2:
                    telephone = new Screensaver(telephone);
                    System.out.println(telephone.getDescription() + " =  " + telephone.cost() + " TL ");
                    break;
                case 3:
                    telephone = new Portable_Battery(telephone);
                    System.out.println(telephone.getDescription() + " =  " + telephone.cost() + " TL ");
                    break;
                case 4:
                    telephone = new PhoneCase(telephone);
                    System.out.println(telephone.getDescription() + " =  " + telephone.cost() + " TL ");
                    break;
                case 5:
                    telephone = new Headphone(telephone);
                    System.out.println(telephone.getDescription() + " =  " + telephone.cost() + " TL ");
                    break;

                case 6:
                    selected=false;
                    break;
                default:
                    System.exit(1);

            }


        }
    }

}
