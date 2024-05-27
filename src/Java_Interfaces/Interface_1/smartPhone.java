package Java_Interfaces.Interface_1;

public class smartPhone extends phone implements Icamera, ImusicPlayer{

    public void videoCalling(){
        System.out.println("Smart Phone Video Calling...");
    }
    @Override
    public void click() {
        System.out.println("Smart Phone Clicking photos...");
    }

    @Override
    public void record() {
        System.out.println("Smart Phone recording video...");
    }

    @Override
    public void play() {
        System.out.println("Smart Phone Playing Music...");
    }

    @Override
    public void pause() {
        System.out.println("Smart Phone Music paused...");
    }

    @Override
    public void stop() {
        System.out.println("Smart Phone Music stopped...");
    }

//    public void videoCall() { System.out.println("Smart Phone Video Calling..."); }
//    public void click() {System.out.println("Smart Phone Clicking photos...");}
//    public void record() {System.out.println("Smart Phone recording video...");}
//    public void play() {System.out.println("Smart Phone Playing Music...");}
//    public void pause() {System.out.println("Smart Phone Music paused...");}
//    public void stop() {System.out.println("Smart Phone Music stopped...");}
}
