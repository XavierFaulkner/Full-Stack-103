import java.util.ArrayList;
import java.util.Scanner;

import javax.naming.AuthenticationException;

public class Animals {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<Animal>();
        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop");

        //using all Animal constructors
        Animal a = new Animal();
        Animal b = new Animal("Ace");
        Animal c = new Animal(true);
        Animal d = new Animal("spot", true);

        //let user input their animals
        while(true) {
            System.out.print("Please enter a name: ");
            String name = in.nextLine();
            if(name.equals(""))
                break;
            System.out.print("Is it a dog? yes or no: ");
            boolean isDog;
            while(true) {
                String yesOrNo = in.nextLine();
                if(!yesOrNo.equals("yes") && !yesOrNo.equals("no")) {
                    System.out.print("Please enter yes or no: ");
                } else {
                    if(yesOrNo.equals("yes")) {
                        isDog = true;
                    } else {
                        isDog = false;
                    }
                    break;
                }
            }
            Animal n = new Animal(name, isDog);
            animals.add(n);
        }
        //loop through animals list and print animal info
        for(int i = 0; i < animals.size(); i ++) {
            System.out.println(animals.get(i).toString());
        }
        in.close();
    }
}
