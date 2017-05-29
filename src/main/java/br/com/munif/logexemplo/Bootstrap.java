package br.com.munif.logexemplo;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class Bootstrap extends AbstractAnnotationConfigDispatcherServletInitializer {

    public Bootstrap() {
        Logger.getLogger(this.getClass().getSimpleName()).log(Level.INFO, "Construtor");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{Application.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/api"};
    }

}
