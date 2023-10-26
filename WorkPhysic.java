import java.util.Scanner;

class WorkPhysic{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Your program has started");
        System.out.println("Enter the force: ");
        float force = input.nextFloat();
        System.out.println("Enter the displacement");
        float displacement = input.nextFloat();

        float work = force*displacement;

        System.out.println("The work done is :"+work+" J");

        input.close();
    }
}