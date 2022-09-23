package backend.fourthweek.factoryPattern.gui.component.button.concretes;

import backend.fourthweek.factoryPattern.gui.component.button.abstracts.Button;

public class WinButton extends Button {
    @Override
    public void onClick() {
        System.out.println("Windows butona tıklandı.");
    }

    @Override
    public void draw() {
        System.out.println("Windows için buton oluşturuluyor.");
    }
}
