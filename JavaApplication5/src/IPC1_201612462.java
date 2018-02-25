
import java.util.Scanner;


public class IPC1_201612462 {
public static Scanner a = new Scanner(System.in);

    boolean exit;
    
    public static void main(String [] args) {
        IPC1_201612462 menu = new IPC1_201612462();
        menu.runMENU();
    }
    public void runMENU(){
        printHeader();
        while(!exit){
            printMenu();
            int choice =  getInput();
            performAction(choice);
            
        }
    }
    private void printHeader() {
        System.out.println("+------------------------+");
        System.out.println("|      Bienvenido al     | ");
        System.out.println("|      Menú principal    | ");
        System.out.println("+------------------------+");
    }

    private void printMenu() {
        System.out.println("[IPC1] Tarea3_201612462 ");
        System.out.println(" 1. Usuarios");
        System.out.println(" 2. Contador de dígitos ");
        System.out.println(" 3. Tres números de mayor a menor ");
        System.out.println(" 4. Calcular promedio");
        System.out.println(" 5. Salir");
    }
    
    private int getInput(){
      Scanner keyboard = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.print("Ingrese su eleción: ");
            try {
                choice = Integer.parseInt(keyboard.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Selección inválida, intente de nuevo");
            }
            if (choice < 0 || choice > 5) {
                System.out.println("Opción fuera de rango, intente de nuevo");
            }
        } while (choice < 0 || choice > 5);
        return choice;
    }
    
    private void performAction(int choice){
        switch(choice){
            case 1:
                Usuarios();
            case 2:
                Digitos();
                
            case 3:  
                MayorMenor();
            case 4:    
            case 5:   
                exit = true;
                System.out.println("Fin del programa");
                break;
            default:
                System.out.println("Un error inesperado ha ocurrido.");
            
                
        }
    }
    
    private void Usuarios(){
        boolean repetido = false;
        Scanner a = new Scanner(System.in);
        String[] persona = new String[3];
        for (int i = 0; i < 4; i++) {

            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
            persona[i] = a.nextLine();
            if (i > 0) {
                for (int j = 0; j < i; j++) {

                    if (persona[j].equals(persona[i]));
                    {
                        System.out.println("Si existe");
                        repetido = true;
                        while (repetido != false) {
                            System.out.println("Ingrese el nombre de nuevo: ");
                            persona[i] = "";
                            persona[i] = a.nextLine();

                        }
                    }
                }
            }

        }

    }
    
    private void Digitos(){
        int numero;
        String total;
        

            System.out.print("Ingrese el número:  ");
            numero = a.nextInt();
            if(numero<0){
                System.out.println("Error, número inválido.");
                System.exit(0);
            }  if(numero>100000){
                System.out.println("Error, número inválido.");
                System.exit(0);
            }
            total = Integer.toString(numero);
           System.out.println("El total es: " + total.length() );
           
        
       
    }
    
    private void MayorMenor(){
         
         int n[] = new int[3];
         int nc[] = new int[3];
         int aux;
   
        
        
        for(int i = 0; i<3;++i){
         System.out.print("Ingrese el numero No. "+(i+1)+": ");
            n[i] = a.nextInt();
        }
        for(int b=0;b<3;++b){
            aux=n[b];
            for(int c=b+1;c<3;++c){
                if(n[c]>n[b]){
                    n[b]=n[c];
                    n[c]=aux;
                    aux=n[b];
                }
                nc[b]=n[b];
            }
        }
        System.out.println("Los números ordenados son: ");
         for(int i = 0; i<3;++i){
             System.out.println(n[i]);
        }
       

    }
    }
    
    
    


