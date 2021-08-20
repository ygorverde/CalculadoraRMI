/**
 *
 * @author Ygor
 */
package Server;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import Calculadora.CalculadoraInterface;
import Calculadora.CalculadoraInterface;

public class calculadoraRemoto extends java.rmi.server.UnicastRemoteObject implements CalculadoraInterface  {
    
    public calculadoraRemoto()throws RemoteException{   
        float n1,n2;
    }
    
    public float somar(float n1, float n2)throws RemoteException{
        return n1+n2;
    }
    
       public float subtrair(float n1, float n2)throws RemoteException{
        return n1-n2;
    }
       
           public float multiplicar(float n1, float n2)throws RemoteException{
        return n1*n2;
    }
   
           public float dividir(float n1, float n2)throws RemoteException{
        return n1/n2;
    }
       

}