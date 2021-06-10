import com.company.Personn;

public class Main{
    public static void main(String[]args) {
        Personn man=new Personn("SIS", 50);
        String manFullname= man.getFullname();
        int manage= man.getAge();
        System.out.println("name"+manFullname);
        System.out.println("vozr"+ manage);
        System.out.println();
        man.move();
        man.talk();


    }
}

