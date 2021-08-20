/**
 *
 * @author Ygor
 */
package Calculadora;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculadoraInterface extends Remote {
    public float somar(float n1, float n2) throws RemoteException;
    public float subtrair(float n1, float n2) throws RemoteException;
    public float multiplicar(float n1, float n2) throws RemoteException;
    public float dividir(float n1, float n2) throws RemoteException;
    
}
