import java.util.LinkedList;
import java.util.Scanner;

public class Ventanilla{
    static Scanner lectura = new Scanner(System.in);
    static Scanner lectura2 = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception{
        LinkedList operaciones = new LinkedList();
        int clientes = 0;
        int operacion = 0;
        
        /*System.out.println("Cuantas personas hay en la fila: ");
        clientes = lectura.nextInt();
        
        for(int i = 0; i < clientes; i++){
            System.out.println("Cuantas operaciones hara el cliente con el Id: " + i);
            operacion = lectura.nextInt();
            operaciones.offer(operacion);
        }*/
        operaciones.offer(1);
        operaciones.offer(2);
        operaciones.offer(5);
        System.out.println(operaciones);
        System.out.println("Tiempo en que se tardo en hacer sus transacciones: "+Ventanilla(operaciones));
        
    
    }
    
    public static int Ventanilla(LinkedList operaciones){
        LinkedList grafico = new LinkedList();
        String nombre = new String();
        nombre = "Alex";
        int tiempo = 0;
        int clientes = operaciones.size();
        int clienteId = 2;
        int transacciones = 0;
        /*System.out.println("Inserte el Id del cliente que quiera ver el tiempo que tarda en terminar sus transacciones: ");
        clienteId = lectura.nextInt();*/
        
        /*System.out.println("Inserte el nombre del cliente: ");
        nombre = lectura2.nextLine();*/
        
        int totalTransacciones = (int) operaciones.get(clienteId);
        
        for(int i = 0; i < operaciones.size(); i++){
            if(i == clienteId){
                grafico.offer(nombre);
                continue;
            }
            grafico.offer("Cliente Id: " + i);
        }
        
        
        while(operaciones.size() > 0){
            System.out.println("Transaccion: " + transacciones);
            if(grafico.getFirst() == nombre && grafico.size() == 1){
                transacciones = totalTransacciones-1;
            }
                
            if(grafico.getFirst() == nombre) transacciones++;
            
            System.out.println(grafico);
            if(operaciones.size() == 1){
                tiempo++;
                System.out.println(grafico);
                break;
            }
            
            tiempo++;
            int aux0 = ((int) operaciones.getFirst())-1;
            operaciones.removeFirst();
            String aux = (String) grafico.getFirst();
            grafico.removeFirst();
            
            if(aux0 > 0) {
                operaciones.addLast(aux0);
                grafico.addLast(aux);
            }
            if(clientes-(clienteId+1) == operaciones.size()) {
                System.out.println(grafico);
                break;
            }
        }
        
        
        System.out.println("Termino\nTransacciones en total: " + transacciones);
        
        return tiempo;
    }
}
