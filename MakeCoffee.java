import java.util.Scanner;
class CoffeeMachine{
static Scanner scan = new Scanner(System.in);
    private double coffee_powder, milk, water;
    private int Coffee_Count = 0;
    private int total_Sale=0;
    public CoffeeMachine(){ //Default Constructor Initialization...
        this.coffee_powder=0;
        this.milk=0;
        this.water=0;
    }
    private void SetIngredient(){   //Calling for Filling Ingredient...
        System.out.println("\nFilling...");
        this.coffee_powder = 500.0;
        this.milk = 2;
        this.water= 2;
        System.out.println("Filling Completed.");
        System.out.println("Filled 500gm Coffee.");
        System.out.println("Filled 2L Milk.");
        System.out.println("Filled 2L Water.");
    }
    private void GetIngredient(){   //To Get Status
            System.out.println("Available Coffee Power(Gram) "+String.format("%.1f",this.coffee_powder));
            System.out.println("Available Milk(Liter) "+String.format("%.1f", this.milk));
            System.out.println("Available Water(Liter) "+String.format("%.1f", this.water));
    }
    private void CleanMachine(){    //Initialization with Null In order to Clean Machine
        System.out.println("\nCleaning Machine...");
        this.coffee_powder = 0;
        this.milk = 0;
        this.water= 0;
        System.out.println("Cleaning Completed.");
    }
    private void makecoffee(){  //Coffee Selection Menu
        System.out.println("\n --------------------------------- ");
        System.out.println("|           Select Type:          |\n ---------------------------------  \n| 1:  Black Coffee                |\n| 2:  Milk Coffee                 |\n| 3:  Expresso Coffee             |\n| 4:  Cappuccino Coffee           |\n| 0   to Discard                  |");     
        System.out.println(" --------------------------------- \n");
        char t = scan.next().charAt(0);
        switch(t){
            case '1':
                this.BlackCoffee();     //Call to BlackCoffee Method
                break;
            case '2':
                this.MilkCoffee();      //Call to MilkCoffee Method
                break;
            case '3':
                this.ExpressoCoffee();
            case '4':
                this.CapCoffee();
            case '0':
                break;
            default:
                System.out.println("Enter a valid Input \nFor Help Contact 1800-235678");
                this.makecoffee();
          
        }
    }
    private void BlackCoffee(){
        if(this.coffee_powder >= 10 && this.water >= 0.2){
            System.out.println("\nMaking Black Coffee...");
            System.out.println("\nTaking 10gm of Coffee Powder.");
            this.coffee_powder = this.coffee_powder - 10;
            System.out.println("Taking 0.2 liter of Water.");
            this.water = this.water - 0.2;
            System.out.println("\nYour Black Coffee is Ready.");
            this.Coffee_Count++;
            this.total_Sale=total_Sale+80;
            System.out.println("\nPLEASE PAY Rs.80 BY SCANNING QR");
        }
        else{
            System.out.println("\nAvailable Coffee Power(Gram) "+String.format("%.1f",this.coffee_powder));
            System.out.println("Available Water(Liter) "+String.format("%.1f", this.water));
            System.out.println("\nSome Iteams Are Not Available, Please Fill before Making Coffee.");
        }
    }
    private void MilkCoffee(){
        if(this.coffee_powder >= 10 && this.milk >= 0.4 && this.water >= 0.2){
            System.out.println("\nMaking Milk Coffee...");
            System.out.println("\nTaking 10gm of Coffee Powder.");
            this.coffee_powder = this.coffee_powder - 10;
            System.out.println("Taking 0.4 Liter of Milk.");
            this.milk = this.milk - 0.4;
            System.out.println("Taking 0.2 liter of Water.");
            this.water = this.water - 0.2;
            System.out.println("\nYour Milk Coffee is Ready.");
            this.Coffee_Count++;
            this.total_Sale=total_Sale+100;
            System.out.println("\nPLEASE PAY Rs.100 BY SCANNING QR");
        }
        else{
            System.out.println("\nAvailable Coffee Power(Gram) "+String.format("%.1f",this.coffee_powder));
            System.out.println("Available Milk(Liter) "+String.format("%.1f", this.milk));
            System.out.println("Available Water(Liter) "+String.format("%.1f", this.water));
            System.out.println("\nSome Iteams Are Not Available, Please Fill before Making Coffee.");
        }
    }
    private void ExpressoCoffee(){
        if(this.coffee_powder >= 10 && this.milk >= 0.4 && this.water >= 0.2){
            System.out.println("\nMaking Expresso Coffee...");
            System.out.println("\nTaking 15gm of Coffee Powder.");
            this.coffee_powder = this.coffee_powder - 15;
            System.out.println("Taking 0.4 Liter of Milk.");
            this.milk = this.milk - 0.4;
            System.out.println("Taking 0.2 liter of Water.");
            this.water = this.water - 0.2;
            System.out.println("\nYour Expresso Coffee is Ready.");
            this.Coffee_Count++;
            this.total_Sale=total_Sale+120;
            System.out.println("\nPLEASE PAY Rs.120 BY SCANNING QR");
        }
        else{
            System.out.println("\nAvailable Coffee Power(Gram) "+String.format("%.1f",this.coffee_powder));
            System.out.println("Available Milk(Liter) "+String.format("%.1f", this.milk));
            System.out.println("Available Water(Liter) "+String.format("%.1f", this.water));
            System.out.println("\nSome Iteams Are Not Available, Please Fill before Making Coffee.");
        }
    }
    private void CapCoffee(){
        if(this.coffee_powder >= 10 && this.milk >= 0.4 && this.water >= 0.2){
            System.out.println("\nMaking Cappuccino Coffee...");
            System.out.println("\nTaking 15gm of Coffee Powder.");
            this.coffee_powder = this.coffee_powder - 15;
            System.out.println("Taking 0.7 Liter of Milk.");
            this.milk = this.milk - 0.7;
            System.out.println("Taking 0.3 liter of Water.");
            this.water = this.water - 0.3;
            System.out.println("\nYour Cappuccino Coffee is Ready.");
            this.Coffee_Count++;
            this.total_Sale=total_Sale+120;
            System.out.println("\nPLEASE PAY Rs.130 BY SCANNING QR");
        }
        else{
            System.out.println("\nAvailable Coffee Power(Gram) "+String.format("%.1f",this.coffee_powder));
            System.out.println("Available Milk(Liter) "+String.format("%.1f", this.milk));
            System.out.println("Available Water(Liter) "+String.format("%.1f", this.water));
            System.out.println("\nSome Items Are Not Available, Please Fill before Making Coffee.");
        }
    }
    public void start(){    //public Start to accese all private method of this class
        System.out.println(" ---------------------------------------------------");
        System.out.println("|                   Coffee Machine                  |");
        System.out.println(" ---------------------------------------------------");
        //System.out.println("Currently We Have Following Operations, Select as your Need:- ");
        System.out.println("\nCurrent Status: ");
        this.GetIngredient();
        boolean t = true;
        while(t){
            System.out.println("\n -------------------------------- ");
            System.out.println("|1:     Status of Ingredient     |\n -------------------------------- \n|2:      Fill Ingredient         |\n -------------------------------- \n|3:       Clean Machine          |\n -------------------------------- \n|4:        Make Coffee           |\n -------------------------------- \n|5: How many Coffee We have made?|\n -------------------------------- \n|6:        Exit                  |");
            System.out.println(" -------------------------------- \n\n");
            char c = CoffeeMachine.scan.next().charAt(0);
            switch(c){
                case '1': 
                    System.out.println("------------- Status ------------");
                    this.GetIngredient();
                    System.out.println("---------------------------------");
                    break;
                case '2':
                    this.SetIngredient();
                    break;
                case '3':
                    this.CleanMachine();
                    break;
                case '4':
                    this.makecoffee();
                    break;
                case '5':
                    System.out.println("\nWe Have Made "+this.Coffee_Count+" Coffees.");
                    System.out.println("\nWe Have Made Total Sale of Rs."+this.total_Sale);
                    break;
                case '6':
                    System.out.println("\nExiting...\n");
                    t = false;
                    break;
                default:
                System.out.println("Enter a valid Input \nFor Help Contact 1800-235678");
            }   
        } 
    }
}
public class MakeCoffee{
    public static void main(String[] args) {
        while(true)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("|--------------Welcome To VIT Coffee-----------|");
            System.out.print("\nWants to Start Machine Y or N ?:");
            char d;
            d = scan.next().charAt(0);
            if(d == 'Y' || d == 'y'){
                CoffeeMachine cm = new CoffeeMachine();     //Instances For CoffeeMachine
                cm.start();     //In order to call All Private Method Calling Public mathod
                System.out.println("Shutting Down...\n");
                System.exit(1);
            }
            else if(d== 'N'||d=='n')
            {
                System.out.println("Shutting Down...\n");
                System.exit(1);
            }
            else
                System.out.println("Invalid Input...\n");
        }
       
    }
}