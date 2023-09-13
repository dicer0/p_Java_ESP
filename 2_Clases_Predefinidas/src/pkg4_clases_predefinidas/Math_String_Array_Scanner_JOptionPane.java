package pkg4_clases_predefinidas;
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
import javax.swing.*;

public class Math_String_Array_Scanner_JOptionPane {

    public static void main(String[] args) {
        /*REFUNDICIÓN: Sirve para cambiar un tipo de dato numérico en otro de 
        la siguiente manera:
        tipo_primitivo_1    variable_original = valor;
        tipo_primitivo_2    variable_transformada = (tipo_primitivo_2) variable_original;
        */
        long refundicion = 257866813;
        int entero = (int)refundicion;
        //La variable refundicion fue cambiada de tipo long a tipo int
        System.out.println(entero);
        
        
        /*CLASES PREDEFINIDAS:
        Math: Para cálculos numéricos
        String: Para manipulación y análisis de palabras
        Scanner: Para introducir datos por medio de la consola
        JOptionPane: Para introducir datos por medio de una ventana emergente
        Integer: Para convertir palabras a números enteros
        Double: Para convertir palabras a números decimales*/
        
        
        //CLASE MATH: Para operaciones matemáticas
        //Método sqrt(): Obtiene la raiz del número que pongamos como parámetro
        /*Métodos estáticos: Se aplican poniendo solo el nombre de la clase más 
        el nombre del método que queremos usar*/
        double raiz = Math.sqrt(4);//En la API se nos dice cómo usar el método
        /*Tanto el parámetro como el resultado que devuelve el método son de 
        tipo double pero no es necesario indicarlo explícitamente para el 
        parámetro*/
        System.out.println("La raíz de 4 es " + raiz);
        
        //Método round(): redondea el número decimal que pongamos como parámetro
        float num1 = 8.56f;//Los float se deben poner con el sufijo f
        int redondeo1 = Math.round(num1);
        //Si el parámetro es un float el método devolverá un número tipo int
        double num2 = 0.8566661;
        long redondeo2 = Math.round(num2);
        //Si el parámetro es un double el método devolverá un número tipo long
        System.out.println("El redondeo de " + num1 + " es: " + redondeo1 
                + " y el redondeo de " + num2 + " es: "+ redondeo2);
        
        //Método pow(): Eleva el primer parámetro a la potencia del segundo
        double potencia = Math.pow(2, 2);
        int potencia_entero = (int)potencia;//Uso de la refundición
        System.out.println("La potencia de 2 a la 2 es " + potencia_entero);
        
        
        
        
        //CLASE STRING: Para manipulación de cadenas de caracteres
        //Objeto o instancia de la clase predefinida String
        String miNombre = "Diego";
        System.out.println("Mi nombre es " + miNombre);
        /*Los métodos de la clase String son NO estáticos, por lo que se deben 
        aplicar por medio de un objeto y el nombre del método que quiera usar*/
        
        //Método length(): Retorna un número int que indica el largo de la palabra
        /*Métodos NO estáticos: Para aplicarse debemos haber previamente creado 
        un objeto o instancia de la clase y usarlo con el nombre del método*/
        System.out.println("Mi nombre tiene " + miNombre.length() + " letras");
        
        /*Método charAt(): Me dará una letra o caracter de un objeto String, 
        para ello debo indicar en su parámetro la ubiación de la letra que 
        quiero, las posiciones se cuentan desde el cero*/
        System.out.println("La primera letra de " + miNombre + " es la " + 
                miNombre.charAt(0) + " y la última letra es " + 
                miNombre.charAt(miNombre.length()-1));
        /*Para obtener la última letra le resté un 1 porque el método .length()
        cuenta desde 1 y el método .charAt() cuenta desde cero*/
        
        //Nuevo objeto o instancia de la clase predefinida String
        String frase = "Que pedotl prros, ola ke ase";
        /*Método subString(): Extrae una parte del objeto String, los espacios 
        también se considera que ocupan una posición del objeto String y se 
        empiezan a contar desde cero*/
        String resumen_frase = frase.substring(18, 21);
        System.out.println("Lo que extraje de mi frase fue: " + resumen_frase);
        
        /*Método equals(): Compara dos objetos String para ver si son iguales 
        tomando en cuenta mayúsculas y minúsculas*/
        String wey1 = "DonVergas";
        String wey2 = "donVergas";
        System.out.println(wey1.equals(wey2));
        //Retorna un valor booleano false si no son iguales y true si lo son
        
        /*Método equalsIgnoreCase(): Compara dos objetos String para ver si son 
        iguales sin tomar en cuenta mayúsculas y minúsculas*/
        System.out.println(wey1.equalsIgnoreCase(wey2));
        //Retorna un valor booleano false si no son iguales y true si lo son
        
        
        
        /*CLASE SCANNER: Para introducir datos al programa por medio de la 
        consola*/
        /*Para crear un objeto de la clase Scanner y por medio de éste recibir 
        datos usando de la consola del sistema, usaremos el primer constructor 
        que viene indicado en la API, cuya documentación dice lo siguiente:
        Scanner(File source)
        Como File source pondremos System.in ya que esto le dice al constructor 
        que la fuente o source por la cual introduciremos datos al programa 
        es la consola*/
        Scanner introDatosPorConsola = new Scanner(System.in);
        //Objeto o instancia de la clase predefinida Scanner
        
        /*Método nextLine(): Permite introducir al programa una cadena de 
        caracteres, osea una palabra que se debe almacenar en un objeto String*/
        /*Métodos NO estáticos: Para aplicarse debemos haber previamente creado 
        un objeto o instancia de la clase y usarlo con el nombre del método*/
        System.out.println("Uso del método nextLine() de la clase Scanner,"
                + " Introduce tu nombre por favor:");
        /*El método retorna un objeto String por lo cual lo que haya dentro del
        objeto Scanner lo debo almacenar en un objeto String, esto se debe 
        almacenar de jalón*/
        String nombre_usuario = introDatosPorConsola.nextLine();
        
        //Método nextInt(): Permite introducir al programa un número entero
        System.out.println("Uso del método nextInt() de la clase Scanner,"
                + " Introduzca un número entero:");
        //Se puede usar el mismo objeto Scanner para aplicar diferentes métodos
        /*El método retorna un número entero por lo que lo debo almacenar en 
        un tipo de dato int y se debe almacenar de inmediato*/
        int edad_usuario = introDatosPorConsola.nextInt();
        
        //Método nextDouble(): Permite introducir al programa un número decimal
        System.out.println("Uso del método nextInt() de la clase Scanner,"
                + " Introduzca un número entero:");
        //Se puede usar el mismo objeto Scanner para aplicar diferentes métodos
        /*El método retorna un número entero por lo que lo debo almacenar en 
        un tipo de dato int y se debe almacenar de inmediato*/
        double promedio_usuario = introDatosPorConsola.nextDouble();
        
        System.out.println("Los datos que introduzco el usuario son: " + 
                nombre_usuario + ", " + edad_usuario + " y " + 
                promedio_usuario + ".El próximo año " + nombre_usuario + 
                " tendrá " + (edad_usuario + 1) + " años.");
        //Para sumar dentro de una concatenación se debe poner entre paréntesis
        
        
        
        /*CLASE JOPTIONPANE: Para introducir datos al programa por medio de una 
        ventana emergente*/
        /*Método showInputDialog(): Permite introducir al programa una variedad
        de datos dependiendo de lo que reciba como parámetro*/
        /*Métodos estáticos: Se aplican poniendo solo el nombre de la clase más 
        el nombre del método que queremos usar*/
        String mensaje_usuario = JOptionPane.showInputDialog("Introduce tu mensaje bitch");
        /*El método retorna un objeto String por lo cual lo que haya dentro del
        objeto Scanner lo debo almacenar en un objeto String, esto se debe 
        almacenar de jalón*/
        
        
        /*CLASE INTEGER: Sirve para convertir un objeto String en un número 
        entero*/
        /*Cuando quiera introducir números usando la ventana emergente lo que 
        debo hacer es aplicar el método parseInt() de la clase Integer*/
        String perritos_usuario = JOptionPane.showInputDialog("Cuántos perritos tienes bitch?");
        /*Método parseInt(): Permite convertir un objeto String en un número 
        entero*/
        int num_perritos = Integer.parseInt(perritos_usuario);
        
        System.out.println("El usuario dice que " + mensaje_usuario + 
                " y tiene " + num_perritos + " perritos, dice que luego "
                + "quiere tener " + (num_perritos + 1) + " perritos.");
        
        
        /*CLASE DOUBLE: Sirve para convertir un objeto String en un número 
        decimal*/
        /*Cuando quiera introducir números decimales usando la ventana emergente 
        lo que debo hacer es aplicar el método parseDouble() de la clase Double*/
        String numero1 = JOptionPane.showInputDialog("Introduce un número para sacar su raiz cuadrada");
        /*Método parseDouble(): Permite convertir un objeto String en un número 
        entero*/
        double numero2 = Double.parseDouble(numero1);
        //Método sqrt(): Obtiene la raiz del número que pongamos como parámetro
        double raiz_cuadrada = Math.sqrt(numero2);
        
        System.out.print("La raiz de " + numero2 + " es ");
        /*Para cuando quiera que un resultado numérico salga con un número 
        determinado de decimales en consola uso la instrucción printf y como 
        primer parámetro pongo "%1.número_de_decimales_que_quiero f"*/
        System.out.printf("%1.6f", raiz_cuadrada);
    }
    
}
