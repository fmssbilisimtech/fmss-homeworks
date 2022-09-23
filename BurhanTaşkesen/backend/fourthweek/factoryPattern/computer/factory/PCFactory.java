package backend.fourthweek.factoryPattern.computer.factory;

import backend.fourthweek.factoryPattern.computer.abstracts.Computer;
import backend.fourthweek.factoryPattern.computer.concretes.PC;

public class PCFactory implements Factory{
    @Override
    public Computer create(String ram, String hdd, String cpu) {
        return new PC(ram, hdd, cpu);
    }
}
