package Java_Interfaces.interface_2;

public class customer implements member{

    String name ;
    customer(String name){
        this.name = name;
    }
    @Override
    public void callback(){
        System.out.println("OKAY!, I will visit... " + name);
    }
}
