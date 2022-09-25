package backend.fourthweek.factoryPattern.gui.factory.concretes;

import backend.fourthweek.factoryPattern.gui.component.Component;
import backend.fourthweek.factoryPattern.gui.component.button.concretes.WinButton;
import backend.fourthweek.factoryPattern.gui.component.imageView.concretes.WinImageView;
import backend.fourthweek.factoryPattern.gui.factory.abstracts.ComponentFactory;

public class Windows implements ComponentFactory {
    @Override
    public Component createButton() {
        return new WinButton();
    }

    @Override
    public Component createImageView() {
        return new WinImageView();
    }
}
