package condicionales;
/*Las clases que pertenezcan a java.lang como Math y String no necesitan 
importar su paquete porque es el paquete principal del lenguaje Java*/

//IMPORTACIÓN DE PAQUETE PARA USAR LA CLASE SCANNER
/*Pero las clases que pertenezcan a cualquier otro paquete que no sea el 
paquete principal java.lang como por ejemplo la clase Scanner que pertenece al 
paquete java.util necesita ser importado*/
import java.util.Scanner;

//IMPORTACIÓN DE PAQUETE PARA USAR LA CLASE JOPTIONPANE
/*Como la clase JOptionPane no pertenece al paquete principal java.lang sino 
que pertenece al paquete javax.swing necesita ser importado, además con la 
instrucción .* se importan todas las clases del paquete en vez de solo una 
como se hizo con el paquete java.util.Scanner*/
import javax.swing.JOptionPane;

public class if_elseIf_switchCase {
    
    public static void main(String[] args) {
        /*Primero se debe imprimir el mensaje que quieras decir en consola ya 
        que cuando el programa llegue a usar la clase Scanner que permite 
        introducir datos al programa, se pausará la ejecución del código hasta
        que introduzca un dato*/
        System.out.println("Introduce tu edad bitch");
        
        
        /*CLASE SCANNER: Para introducir datos al programa por medio de la 
        consola*/
        /*Para crear un objeto de la clase Scanner y por medio de éste recibir 
        datos usando de la consola del sistema, usaremos el primer constructor 
        que viene indicado en la API, cuya documentación dice lo siguiente:
        Scanner(File source)
        Como File source pondremos System.in ya que esto le dice al constructor 
        que la fuente o source por la cual introduciremos datos al programa 
        es la consola*/
        Scanner introDatos = new Scanner(System.in);
        /*Objeto o instancia de la clase predefinida Scanner para usar alguno 
        de los métodos de la clase Scanner*/
        //Método nextInt(): Permite introducir al programa un número entero
        int edad = introDatos.nextInt();
        
        
        
        /*CONDICIONAL if: Sirve para analizar una condición, en este caso 
        analiza si la persona que introdujo la edad es mayor de edad o un 
        escuincle nalgas meadas*/
        if(edad>=18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres un escuincle nalgas meadas");
        }
        
        
        
        System.out.println("Te vamos a clasificar según tu edad, bitch");
        /*CONDICIONAL else if: Sirve para analizar varias condiciones 
        relacionadas entre sí, en este caso analiza si la edad de la persona 
        es menor a 18, se encuentra entre 18 y 40, se encuentra entre 40 y 60 
        o si es mayor de 60, descrito mejor por la siguiente inecuación:
                x < 18 < x < 40 < 60 < x
        Donde x es la edad introducida*/
        if(edad<18){
            System.out.println("Eres un escuincle nalgas meadas");
        }else if(edad<40){
            System.out.println("Eres un chavoruco");
        }else if(edad<60){
            System.out.println("Eres un abuelito");
        }else{
            System.out.println("Ya como que huele a muerto");
        }
        
        
        
        System.out.println("Elige una opción: \n 1: Cuadrado "
                + "\n 2: Rectángulo \n 3: Triángulo \n 4: Círculo");
        
        //Objeto de la clase Scanner usado para introducir un valor por consola
        int figura = introDatos.nextInt();
        
        /*CONDICIONAL switch-case: Con este condicional se analiza el valor de 
        la variable que esté indicada dentro del paréntesis del switch para 
        después compararla con una serie de valores pre-programados y 
        enlistados que puede adoptar, con esto se puede crear un menú, en este 
        caso se calculará el área de la figura elegida*/
        switch (figura){
            case 1: //La figura elegida con la opción 1 es el Cuadrado
                /*CLASE JOPTIONPANE: Sirve para introducir datos al programa 
                por medio de una ventana emergente*/
                /*Método showInputDialog(): Permite introducir al programa por 
                medio de una ventana emergente cualquier dato que siempre 
                ingresará al programa como un objeto String, no importando si 
                es un número. Este método es estático*/
                /*Métodos estáticos: Se aplican poniendo solo el nombre de la 
                clase, seguido del nombre del método que queremos usar*/
                String lado = JOptionPane.showInputDialog("Introduce el lado de tu cuadrado en metros");
                //Con la instrucción \n se da un salto de línea
                
                /*CLASE INTEGER: Sirve para convertir un objeto String en un 
                número entero*/
                /*Método parseInt(): Permite convertir un objeto String en un 
                número entero. También es un método estático*/
                int lado_cuadrado = Integer.parseInt(lado);
                
                //CLASE MATH: Para operaciones matemáticas
                //El área de un cuadrado es: A = lado^2
                /*Método pow(): Eleva el primer parámetro a la potencia del 
                segundo. También es un método estático*/
                System.out.println("El área del cuadrado es de " + Math.pow(lado_cuadrado, 2)
                        + " metros.");
            break;
            
            case 2: //La figura elegida con la opción 2 es el Rectángulo
                /*El proceso hecho con el cuadrado de mostrar la ventana 
                emergente con el método showInputDialog de la clase JOptionPane 
                para después convertirlo a un valor entero o double con la 
                clase Integer o Double se puede hacer todo de jalón*/
                
                /*CLASE DOUBLE: Sirve para convertir un objeto String en un 
                número decimal*/
                /*Método parseDouble(): Permite convertir un objeto String en 
                un número entero. Es un método estático*/
                double altura_rectangulo = Double.parseDouble(JOptionPane.showInputDialog("Introduce "
                        + "la altura de tu rectángulo en metros"));
                double base_rectangulo = Double.parseDouble(JOptionPane.showInputDialog("Introduce "
                        + "la base de tu rectángulo en metros"));
                
                //El área de un reatángulo es: A = base*altura
                System.out.println("El área del rectángulo es de " 
                        + (altura_rectangulo*base_rectangulo) + " metros.");
            break;
            
            case 3: //La figura elegida con la opción 3 es el Triángulo
                /*El proceso hecho con el cuadrado de mostrar la ventana 
                emergente con el método showInputDialog() de la clase 
                JOptionPane para después convertirlo a un número entero o 
                decimal con los métodos parseInt() de la clase Integer o 
                parseDouble() de la clase Double se puede hacer todo de jalón*/
                double altura_triangulo = Double.parseDouble(JOptionPane.showInputDialog("Introduce "
                        + "la altura de tu triángulo equilatero"));
                double base_triangulo = Double.parseDouble(JOptionPane.showInputDialog("Introduce "
                        + "la base de tu triángulo equilatero"));
                
                //El área de un triángulo es: A = (base*altura)/2
                System.out.println("El área del triángulo es de "
                        + (altura_triangulo*base_triangulo/2)  + " metros.");
            break;
            
            case 4: //La figura elegida con la opción 4 es el Círculo
                /*El proceso hecho con el cuadrado de mostrar la ventana 
                emergente con el método showInputDialog() de la clase 
                JOptionPane para después convertirlo a un valor numérico 
                entero o decimal con los métodos parseInt() de la clase 
                Integer o parseDouble() de la clase Double se puede hacer 
                todo de jalón*/
                double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce "
                        + "el radio de tu círculo en metros"));
                
                //CLASE MATH: Para operaciones matemáticas
                //El área de un círculo es pi por su radio al cuadrado: A = pi*radio^2
                /*Método pow(): Eleva el primer parámetro a la potencia del 
                segundo. También es un método estático*/
                System.out.println("El área del círculo es de " + 
                        Math.PI*Math.pow(radio, 2) + " metros.");
            break;
            
            default: 
                System.out.println("Opción no existente, intente de nuevo baboso");
            break;
        }      
        
    }
    
}
