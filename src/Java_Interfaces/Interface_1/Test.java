package Java_Interfaces.Interface_1;

public class Test {

    public static void main(String[] args) {

        /* if we create the object of smartPhone using smartPhone reference itself we can
            call all the methods of class phone and Icamera, Imusic interfaces
        */
        smartPhone sp = new smartPhone();

        sp.videoCalling();
        sp.click();
        sp.record();
        sp.play();
        sp.pause();
        sp.stop();

        // if we create object of smartPhone using the reference of the Icamera Interface
        // then Using smartphone object we can only accesss methods present within Icamera interface
        Icamera IC = new smartPhone();
        IC.click();
        IC.record();

        // if we create object of smartPhone using the reference of the ImusicPlayer Interface
        // then Using smartphone object we can only access methods present within ImusicPlayer Interface
        ImusicPlayer Ip = new smartPhone();
        Ip.play();
        Ip.pause();
        Ip.stop();

    }
}
