package basiclogic;
import basiclogic.word;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class basic {
    static Scanner leia = new Scanner(System.in);
    /* 
    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println(10 * 2);
        System.out.println(10 + 2);
        System.out.println(10 - 2);
        System.out.println(10 / 2);
    }   */

    public static void main(String[] args) {
       System.out.println("Olá, como vai?");
       try {Thread.sleep (2000);}catch (InterruptedException ex){}
       System.out.println("Funcionário ou Gerente? Selecione 1 para Funcionário e 2 para Gerente");
       int profile = leia.nextInt();
            if(profile == 1){
                System.out.println("Certo. Agora, nos diga seu nome.");
                one.name = leia.nextLine();

                try {Thread.sleep (2000);}catch(InterruptedException ex){}

                System.out.println("Apresente seu gênero");
                one.gender = leia.nextLine();

                try {Thread.sleep (1000);}catch(InterruptedException ex){}

                System.out.println("Qual a sua idade?");
                one.age = leia.nextInt();

            } if (profile == 2) {

                System.out.println("Certo. Agora, nos diga seu nome.");
                two.name = leia.nextLine(); 

                try {Thread.sleep (2000);}catch(InterruptedException ex){}

                System.out.println("Apresente seu gênero");
                two.gender = leia.nextLine();

                try {Thread.sleep (1000);}catch(InterruptedException ex){}

                System.out.println("Qual a sua idade?");
                two.age = leia.nextInt();

            } else {
                
            }
    }

    private class one{
        Object Employee;
            static String name;
            static String gender;
            static int age;
    }

    private class two{
        Object Employee;
            static String name;
            static String gender;
            static int age;
            static int password;
    }



    private class top{
        Object Employer;
            final String name = "Alexandre";
            final String gender = "Male";
            final int age = 27;
            final int password = 12345678;
    }

   

   

 
}

