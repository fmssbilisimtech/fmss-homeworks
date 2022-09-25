package backend.fourthweek.factoryPattern.computer.factory;

public interface AbstractFactory<T> {
    T create(String type);
}
