package backend.fourthweek.factoryPattern.computer;

import backend.fourthweek.factoryPattern.computer.abstracts.Computer;
import backend.fourthweek.factoryPattern.computer.factory.ComputerFactory;

public class Main {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getPC(
                "2 GB",
                "500 GB",
                "2.4 GHz");

        Computer server = ComputerFactory.getServer(
                "16 GB",
                "1 TB",
                "2.9 GHz");

        System.out.println("Factory PC Config::"+pc);
        System.out.println("Factory Server Config::"+server);


    }

}


/*Computer pc = ComputerFactory.getPC(
                "2 GB",
                "500 GB",
                "2.4 GHz");

        Computer server = ComputerFactory.getServer(
                "16 GB",
                "1 TB",
                "2.9 GHz");

        System.out.println("Factory PC Config::"+pc);
        System.out.println("Factory Server Config::"+server);*/

/*Computer pc = ComputerFactory.getComputer(
                ComputerFactory.ComputerType.PC,
                "2 GB",
                "500 GB",
                "2.4 GHz");

        Computer server = ComputerFactory.getComputer(
                ComputerFactory.ComputerType.SERVER,
                "16 GB",
                "1 TB",
                "2.9 GHz");

        System.out.println("Factory PC Config::"+pc);
        System.out.println("Factory Server Config::"+server);*/
