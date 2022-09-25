package backend.fourthweek.factoryPattern.gui.component.imageView.concretes;

import backend.fourthweek.factoryPattern.gui.component.imageView.abstracts.ImageView;

public class OSXImageView extends ImageView {
    @Override
    public void draw() {
        System.out.println("OSX ImageView oluşturuluyor");
    }
}
