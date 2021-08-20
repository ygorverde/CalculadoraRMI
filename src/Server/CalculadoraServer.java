/**
 *
 * @author Ygor
 */
package Server;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class CalculadoraServer {

    public static void main (String[] argv) {
        try {
            LocateRegistry.createRegistry(1099);
            Naming.rebind ("calculadora", new calculadoraRemoto());
            System.out.println ("Servidor Iniciado com sucesso!!");
        } catch (Exception e) {
            System.out.println ("Servidor falhou: " + e);
        }
    }
}

