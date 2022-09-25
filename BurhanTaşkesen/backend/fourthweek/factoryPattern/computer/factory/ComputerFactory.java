package backend.fourthweek.factoryPattern.computer.factory;

import backend.fourthweek.factoryPattern.computer.concretes.PC;
import backend.fourthweek.factoryPattern.computer.concretes.Server;

/*public class ComputerFactory {
    public static Computer getComputer(ComputerType type,String ram, String hdd, String cpu){
        switch (type){
            case PC:
                return new PC(ram,hdd,cpu);
            case SERVER:
                return new Server(ram,hdd,cpu);
            default:
                return null;
        }
    }
    //OCP ??
    //Her yeni subclass için yeni bir case...

    public enum ComputerType{
        PC,SERVER;
    }
}*/

public class ComputerFactory {
    public static PC getPC(String ram, String hdd, String cpu){
        return new PC(ram,hdd,cpu);
    }

    public static Server getServer(String ram, String hdd, String cpu){
        return new Server(ram,hdd,cpu);
    }

    //OCP ??
    //Her yeni subclass için yeni bir fonksiyon...
}
