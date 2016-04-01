package fr.istic.dudcl;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
    String sayHi(String text);
    int add (int a,int b);
    
}

