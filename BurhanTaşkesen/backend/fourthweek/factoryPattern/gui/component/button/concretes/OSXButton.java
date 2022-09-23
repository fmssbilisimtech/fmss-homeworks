package backend.fourthweek.factoryPattern.gui.component.button.concretes;

import backend.fourthweek.factoryPattern.gui.component.button.abstracts.Button;

public class OSXButton extends Button {
    @Override
    public void onClick() {
        System.out.println("OSX butona tıklandı.");
    }

    @Override
    public void draw() {
        System.out.println("OSX için buton oluşturuluyor.");
    }
}
