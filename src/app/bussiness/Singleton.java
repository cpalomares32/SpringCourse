
package app.bussiness;

/**
 * Singleton Pattern
 * @author java
 */
public class Singleton {
    private static Singleton instancia;
    private Singleton() {
    }
    
    public static Singleton getInstancia(){
        if(instancia == null){
            instancia = new Singleton();
        }
        return instancia;
    }
    public void probar(){
        System.out.println("Testing of singleton");
    }
}
