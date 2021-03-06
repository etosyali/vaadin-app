package com.uniyaz.components;

import com.uniyaz.ui.LayoutUI;
import com.vaadin.server.Page;
import com.vaadin.ui.*;

public class SidebarLayout extends VerticalLayout {

    public SidebarLayout() {
        setSizeFull();


        Button Anasayfa = new Button("Anasayfa", event -> {
            Notification notification=new Notification("Selam","Selam");
            notification.show(Page.getCurrent());
        });

        Button Hakkımızda = new Button("Hakkımızda", event ->{
            Notification notification = new Notification("Merhaba");
            notification.show(Page.getCurrent());
        });

        Button button1 = new Button("Buton1", event ->{
            Notification notification = new Notification("Merhaba");
            notification.show(Page.getCurrent());
        });

        Button button2 = new Button("Buton2", event ->{
            Notification notification = new Notification("Merhaba");
            notification.show(Page.getCurrent());
        });

        Button button3 = new Button("Buton3", event ->{
            Notification notification = new Notification("Merhaba");
            notification.show(Page.getCurrent());
        });



        addComponent(Anasayfa);
        addComponent(Hakkımızda);
        addComponent(button1);
        addComponent(button2);
        addComponent(button3);

        setExpandRatio(Anasayfa,1f);
        setExpandRatio(Hakkımızda,1f);
        setExpandRatio(button1, 1f);
        setExpandRatio(button2, 1f);
        setExpandRatio(button3, 1f);


    }
}
