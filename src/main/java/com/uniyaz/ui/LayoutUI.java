package com.uniyaz.ui;

import com.uniyaz.components.*;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.*;

/*
*
* @author Atilla Gökhan KARTAL
* @since
*
*/
@Theme("mytheme")
@Widgetset("com.uniyaz.MyAppWidgetset")
public class LayoutUI extends UI {

    private VerticalLayout mainLayout;
    private HeaderLayout headerLayout;
    private HorizontalLayout bodyLayout;
    private SidebarLayout sidebarLayout;
    private ContectLayout contentLayout;
    private FooterLayout footerLayout;

   // private String erisilecekDegisken = "TEST";

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        buildMainLayout();
        setContent(mainLayout);
    }

    private void buildMainLayout() {

        mainLayout = new VerticalLayout();
        mainLayout.setSizeFull();

        headerLayout = new HeaderLayout();
        mainLayout.addComponent(headerLayout);



         buildBodyLayout();
         mainLayout.addComponent(bodyLayout);


        footerLayout=new FooterLayout();
        mainLayout.addComponent(footerLayout);

        mainLayout.setExpandRatio(footerLayout,2f);
        mainLayout.setExpandRatio(headerLayout,2f);
        mainLayout.setExpandRatio(bodyLayout,6f);
    }




    private void buildBodyLayout() {

        bodyLayout = new HorizontalLayout();
        bodyLayout.setSizeFull();

        sidebarLayout=new SidebarLayout();
        bodyLayout.addComponent(sidebarLayout);

        contentLayout=new ContectLayout();
        bodyLayout.addComponent(contentLayout);

        bodyLayout.setExpandRatio(sidebarLayout,7f);
        bodyLayout.setExpandRatio(contentLayout,7f);

    }



}