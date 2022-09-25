package backend.fourthweek.factoryPattern.gui.factory.concretes;

import backend.fourthweek.factoryPattern.gui.component.Component;
import backend.fourthweek.factoryPattern.gui.component.button.concretes.OSXButton;
import backend.fourthweek.factoryPattern.gui.component.imageView.concretes.OSXImageView;
import backend.fourthweek.factoryPattern.gui.factory.abstracts.ComponentFactory;

public class OSX implements ComponentFactory {
    @Override
    public Component createButton() {
        return new OSXButton();
    }

    @Override
    public Component createImageView() {
        return new OSXImageView();
    }
}
