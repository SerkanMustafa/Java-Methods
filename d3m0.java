import java.util.Scanner;

public class d3m0 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = "Peter";
        int age=22;
    printPersonData("Serkan" , 23);
    printPersonData("Serkan" , 23, "Varna");

    }
       private static void print(){
            System.out.println("------=--------");
        }
        private static void printPersonData(String name,int age){
            System.out.println(name+ " e  na "+age);
        }
    private static void printPersonData(String name,int age,String city){
        System.out.println(name+ " e  na "+age+" ot grad " + city);
    }

}
