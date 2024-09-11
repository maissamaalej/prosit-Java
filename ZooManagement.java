import java.util.Scanner;

public class ZooManagement
{
    int nbrCages=20;
    String zooName="my zoo";
    public static void main(String[] args) {
            ZooManagement zoo =  new  ZooManagement();
            System.out.println(zoo.zooName+ " comporte" + zoo.nbrCages + "cages");

            Scanner scanner=new Scanner(System.in);
            System.out.print("Entrez le nombre de cages :");
        zoo.nbrCages =scanner.nextInt();
            System.out.println(zoo.nbrCages);
            System.out.print("Entrez le nom de zoo :");
        zoo.zooName =scanner.next();
            System.out.println(zoo.zooName);

    }

}
