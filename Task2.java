interface Communication {
    void connect(String network);
}

interface PowerManagement {
    void powerOn();
    void powerOff();
    void checkBattery();
}

class Printer implements Communication, PowerManagement {
    private Integer battery = 100; 
    public void connect(String Network) {
        System.out.println("Printer connected to " + Network + " network.");
    }

    public void powerOn() {
        System.out.println("Printer powered on.");
    }

    public void powerOff() {
        System.out.println("Printer powered off.");
    }

    public void checkBattery() {
        System.out.println("Printer battery level: "+this.battery+"%");
    }
}

class scanner implements Communication, PowerManagement {
    private Integer battery = 100; 
    public void connect(String Network) {
        System.out.println("Scanner connected to " + Network + " network.");
    }

    public void powerOn() {
        System.out.println("Scanner powered on.");
    }

    public void powerOff() {
        System.out.println("Scanner powered off.");
    }

    public void checkBattery() {
        System.out.println("Scanner battery level: "+this.battery+"%");
    }
}

public class Task2 {

    public static void main(String[] args) {

        Printer printer = new Printer();
        System.out.println("Printer");
        printer.connect("Office WiFi");
        printer.powerOn();
        printer.checkBattery();
        printer.powerOff();
        
        scanner scanner = new scanner();
        System.out.println("Scanner");
        scanner.connect("Office WiFi");
        scanner.powerOn();
        scanner.checkBattery();
        scanner.powerOff();
    }
}