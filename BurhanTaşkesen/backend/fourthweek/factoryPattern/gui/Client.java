package backend.fourthweek.factoryPattern.gui;

import backend.fourthweek.factoryPattern.gui.component.Component;
import backend.fourthweek.factoryPattern.gui.factory.abstracts.ComponentFactory;
import backend.fourthweek.factoryPattern.gui.factory.concretes.Windows;

public class Client {
    public static void main(String[] args) {
        ComponentFactory componentFactory = new Windows();
        startOS(componentFactory);
    }

    public static void startOS(ComponentFactory componentFactory){
        Component button = componentFactory.createButton();
        Component imageView = componentFactory.createImageView();

        button.draw();
        imageView.draw();
    }
}
