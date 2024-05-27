package Java_Interfaces.interface_2;

public class store {

    member mem[] = new member[100];
    int count = 0;

    void register(member m){
        mem[count++] = m;
    }

    void inviteSale(){
        for(int i = 0; i < count; i++){
            mem[i].callback();
        }
    }
}
