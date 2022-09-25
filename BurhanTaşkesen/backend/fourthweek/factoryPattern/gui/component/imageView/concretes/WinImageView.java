package backend.fourthweek.factoryPattern.gui.component.imageView.concretes;

import backend.fourthweek.factoryPattern.gui.component.imageView.abstracts.ImageView;

public class WinImageView extends ImageView {
    @Override
    public void draw() {
        System.out.println("Windows için ImageView oluşturuluyor.");
    }
}