package com.uniyaz.components;

import com.vaadin.ui.*;

public class ContectLayout extends VerticalLayout {


    public ContectLayout() {

        setSizeFull();
    }


    public void Anasayfa(){
       /* Button misyon1=new Button();
        misyon1.setCaption("selamlar");
        misyon1.setHeight(100f,Unit.PERCENTAGE);
        misyon1.setWidth(100, Unit.PIXELS);
        addComponent(misyon1);*/
        Panel sample = new Panel("Panel caption");
        sample.setHeight(100.0f, Unit.PERCENTAGE);

        final VerticalLayout contentLayout = new VerticalLayout();
        contentLayout.setWidth(500, Unit.PIXELS);
        contentLayout.setSpacing(false);
        contentLayout.addComponent(new Label());
        sample.setContent(contentLayout);

    }


}
