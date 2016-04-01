
package fr.istic.dudcl;

import javax.jws.WebService;

@WebService(endpointInterface = "fr.istic.dudcl.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }

	@Override
	public int add(int a, int b) {
		System.out.println(a +b);
		
		return a+b;
	}

}

