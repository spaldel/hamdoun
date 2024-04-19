package org.example.springhibernateproject.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer  extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class < ? > [] getRootConfigClasses() {
        System.out.println("rrrrrrroooooooot");
        return new Class[] {
                AppContext.class
        };
        //return null;
    }

    @Override
    protected Class <? > [] getServletConfigClasses() {
        System.out.println("serrrrrrrvlet");
        return new Class[] {
                WebConfig.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {
                "/"
        };
    }

}