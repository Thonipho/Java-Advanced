
package Interface;


public class Main {

    public static void main(String[] args) {
        
        ITelephone thonisPhone = new DeskPhone(1234567);
        
        thonisPhone.powerOn();
        thonisPhone.callPhone(1234567);
        thonisPhone.awnser();
    }
    
}
