public class Main {
    public static void main(String[] args) {
        Device tv = new TV();                  
        Remote remote = new AdvancedRemote(tv); 

        remote.turnOn();    
        remote.turnOff();   
        ((AdvancedRemote) remote).mute(); 
    }
}
