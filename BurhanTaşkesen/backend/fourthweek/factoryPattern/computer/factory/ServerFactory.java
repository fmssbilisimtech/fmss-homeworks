package backend.fourthweek.factoryPattern.computer.factory;
import backend.fourthweek.factoryPattern.computer.abstracts.Computer;
import backend.fourthweek.factoryPattern.computer.concretes.Server;

public class ServerFactory implements Factory{
    @Override
    public Computer create(String ram, String hdd, String cpu) {
        return new Server(ram, hdd, cpu);
    }
}
