package com.uniyaz.components;

import com.uniyaz.ui.LayoutUI;
import com.vaadin.ui.*;

public class HeaderLayout extends HorizontalLayout {

    public HeaderLayout() {

        setSizeFull();

        //String erisilecekDegisken = ((LayoutUI) UI.getCurrent()).getErisilecekDegisken();

        Label label = new Label();


        label.setSizeUndefined();

        addComponent(label);
        setComponentAlignment(label, Alignment.MIDDLE_CENTER);
        //HorizontalLayout footerLayout = ((LayoutUI) UI.getCurrent()).getFooterLayout();

    }
}