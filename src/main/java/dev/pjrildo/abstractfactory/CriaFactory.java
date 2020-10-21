package dev.pjrildo.abstractfactory;

public class CriaFactory {
	
	private static AbstractFactory abstFactory = null;

    static AbstractFactory getFactory(String tipofactory){
              if(tipofactory.equals("a")){
                       abstFactory = new ConcreteFactory1();
              }else if(tipofactory.equals("b")){
                                 abstFactory = new ConcreteFactory2();
                       } return abstFactory;
    }

}
