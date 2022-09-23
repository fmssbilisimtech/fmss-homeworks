package backend.fourthweek.factoryPattern.gui.factory.abstracts;

import backend.fourthweek.factoryPattern.gui.component.Component;

public interface ComponentFactory {
    Component createButton();
    Component createImageView();
}
