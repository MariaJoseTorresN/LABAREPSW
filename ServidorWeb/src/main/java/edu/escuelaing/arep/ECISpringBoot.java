package edu.escuelaing.arep;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;



public class ECISpringBoot {
    private static ECISpringBoot _instance = new ECISpringBoot();
    private String path;
    private Map<String, Method> servicios = new HashMap<>();
    

    private ECISpringBoot(){}

    public static ECISpringBoot get_instance() {
        return _instance;
    }

    public void startServer(){
        
        HttpServer httpServer = new HttpServer();
        
    }

    public void invokeService(String link) {
    }
}
