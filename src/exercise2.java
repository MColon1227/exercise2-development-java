import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class exercise2 {
    public static void main(String[] args) {
        // 1.-Constructor that will initialize a class variable.
        System.out.println("<----- 1.Constructor that will initialize a class variable. ---->");
        InitializeConstructorStudent example = new InitializeConstructorStudent();
        System.out.println("Name: " + example.getName());
        System.out.println("Age : " + example.getAge());

        // 2.Apply constructor overloading..
        System.out.println("<----- 2.Apply constructor overloading.. ---->");
        InitializeConstructorStudent example2 = new InitializeConstructorStudent("Gabo", 29);
        System.out.println("Name: " + example2.getName());
        System.out.println("Age : " + example2.getAge());

        // 2.Apply second constructor overloading..
        System.out.println("<----- 2.Apply second constructor overloading.. ---->");
        InitializeConstructorStudent example3 = new InitializeConstructorStudent("Kassandra", 4);
        System.out.println("Name: " + example3.getName());
        System.out.println("Age : " + example3.getAge());

        // 3.Apply method overloading...
        System.out.println("<----- 3.Apply method overloading... ---->");
        Overloading obj = new Overloading();
        obj.testOverloading("Marisol",36, "Chapalita");
        obj.testOverloading("CiudadDelSol", "Alexa", 36);

        // 4.Create a property that returns a string....
        System.out.println("<----- 4.Create a property that returns a string.... ---->");
        createProperty person = new createProperty();
        person.setName("Alexa");
        person.setAge(28);
        System.out.println("Person Name: " + person.getName());
        System.out.println("Person Age: " + person.getAge());

        // 5.Create a method to separate a list of 20 numbers between odds and even.....
        System.out.println("<-----5.Create a method to separate a list of 20 numbers between odds and even..... ---->");
        System.out.printf("", separateNumbers());

        System.out.println("<-----6.Create a method to print numbers in the following pattern - from 0 to 20...... ---->");
        System.out.println("Enter the number 4 to indicated the rows");
        printingPattern();


    }

    // 1.-Constructor that will initialize a class variable.
    // 2.Apply constructor overloading..
    static class InitializeConstructorStudent {
        static String name;
        static int age;
        InitializeConstructorStudent() {
            name = "Marisol";
            age = 36;
        }
        InitializeConstructorStudent(String name1, int age1) {
            name = name1;
            age = age1;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
    }

    // 3.Apply method overloading...
    static class Overloading {
        public void testOverloading(String name, int age, String address)
        {
            System.out.println("Method1 testOverloading: " + name + " : " + age + " : " + address );
        }
        public void testOverloading(String address, String name, int age)
        {
            System.out.println("Method2 testOverloading: " + address + " : " + name + " : " + age );
        }
    }

    // 4.Create a property that returns a string....
    public static class createProperty {
        private String name;
        private int age;

        public String getName(){
            return name;
        }
        public int getAge(){
            return age;
        }
        public void setName(String newName){
            name = newName;
        }
        public void setAge(int newAge){
            age = newAge;
        }
    }

    // 5.Create a method to separate a list of 20 numbers between odds and even.....
    public static Object separateNumbers() {
        int numberList1[] = {1,2,5,6,3,4,12,15,18,28,33,89,7,0,9,11,23,22,16,20};
        int numberList2[] = {41,57,5,5,78,1,2,9,54,7,6,20,14};
        System.out.println("Odd Numbers List1:");
        for(int i=0; i<numberList1.length; i++){
            if (numberList1[i]%2!=0){
                System.out.println(numberList1[i]);
            }
        }
        System.out.println("Even Numbers List1:");
        for(int i=0;i<numberList1.length;i++){
            if(numberList1[i]%2==0){
                System.out.println(numberList1[i]);
            }
        }
        System.out.println("Even Numbers List2:");
        for(int i=0;i<numberList2.length;i++){
            if(numberList2[i]%2==0){
                System.out.println(numberList2[i]);
            }
        }
        return null;
    }

    // 6.Create a method to print numbers in the following pattern - from 0 to 20......
    public static void printingPattern() {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int test = 1;
        for (int i = 1; i <= rows; i++) {
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
}

