package backend.fourthweek.factoryPattern.computer.factory;

import backend.fourthweek.factoryPattern.computer.abstracts.Computer;

public interface Factory {
    Computer create(String ram, String hdd, String cpu);
}
