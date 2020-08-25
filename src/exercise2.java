import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class exercise2 {
    public static void main(String[] args) {
        // 1.-Constructor that will initialize a class variable.
        System.out.println("<----- 1.Constructor that will initialize a class variable. ---->");
        InitializeConstructor example = new InitializeConstructor("Marisol",36);
        System.out.println(example.toString());

        // 2.Apply constructor overloading..
        System.out.println("<----- 2.Apply constructor overloading.. ---->");
        InitializeConstructor example2 = new InitializeConstructor("Gabo",40);
        System.out.println(example2.toString());

        // 3.Apply method overloading...
        System.out.println("<----- 3.Apply method overloading... ---->");
        Overloading obj = new Overloading();
        obj.testOverloading("Marisol",36, "Chapalita");

        System.out.println("<----- 4.Create a property that returns a string.... ---->");
        Properties person = new Properties();
        Set names;
        String newStudent;

        person.put("Pedro", "New ingress");
        person.put("Karlita", "New ingress");
        names = person.keySet();

        for (Object name : names) {
            newStudent = (String) name;
            System.out.println("The name " + newStudent + " is " + person.getProperty(newStudent) + ".");
        }
        newStudent = person.getProperty("Alonso", "Not Found");
        System.out.println("The name Alonso is " + newStudent + ".");

        System.out.println("<-----5.Create a method to separate a list of 20 numbers between odds and even..... ---->");
        System.out.printf("", separateNumbers());

        System.out.println("<-----6.Create a method to print numbers in the following pattern - from 0 to 20...... ---->");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number 4 to indicated the rows");
        int rows = scanner.nextInt();
        int test = 1;
        System.out.println("Printing Pattern");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(test + " ");
                test++;
            }
            System.out.println();
        }
        for (int i = rows; i >= 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print(test + " ");
                test++;
            }
            System.out.println();
        }
    }

    // 1.-Constructor that will initialize a class variable.
    // 2.Apply constructor overloading..
    public static class InitializeConstructor
    {
        public String toString()
        {
            return name + "," + number;
        }
        private String name;
        private int number;
        public InitializeConstructor(String name, int number)
        {
            this.name = name;
            this.number = number;
        }
    }

    // 3.Apply method overloading...
    static class Overloading
    {
        public void testOverloading(String name, int number, String address)
        {
            System.out.println("Method testOverloading");
        }
    }

    public static Object separateNumbers()
    {
        int numberList[] = {1,2,5,6,3,4,12,15,18,28,33,89,7,0,9,11,23,22,16,20};
        System.out.println("Odd Numbers:");
        for(int i=0; i<numberList.length; i++){
            if (numberList[i]%2!=0){
                System.out.println(numberList[i]);
            }
        }
        System.out.println("Even Numbers:");
        for(int i=0;i<numberList.length;i++){
            if(numberList[i]%2==0){
                System.out.println(numberList[i]);
            }
        }
        return null;
    }


}
