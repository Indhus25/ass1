package oopass1;

public class SmartDevice {
	String name;

    // Constructor 1
    SmartDevice() {
        this("Unknown Device"); // calls parameterized constructor in same class
        System.out.println("SmartDevice: Default constructor");
    }
    SmartDevice(String name) {
        this.name = name;
        System.out.println("SmartDevice: Parameterized constructor -> " + name);
    }
}

// Subclass
class SmartHomeAssistant extends SmartDevice {
    String version;

    SmartHomeAssistant() {
        this("1.0"); 
        System.out.println("SmartHomeAssistant: Default constructor");
    }
    SmartHomeAssistant(String version) {
        super("Home Assistant"); 
        this.version = version;
        System.out.println("SmartHomeAssistant: Parameterized constructor -> v" + version);
    }
}

// Subclass of SmartHomeAssistant
class SmartSpeaker extends SmartHomeAssistant {
    int volumeLevel;

    // Constructor
    SmartSpeaker() {
        super("2.5"); // calls SmartHomeAssistant constructor
        this.volumeLevel = 50;
        System.out.println("SmartSpeaker: Constructor -> Volume " + volumeLevel);
    }
}
