package bucles;

//IMPORTACIÓN DE PAQUETE PARA USAR LA CLASE SCANNER
/*Pero las clases que pertenezcan a cualquier otro paquete que no sea el 
paquete principal java.lang como por ejemplo la clase Scanner que pertenece al 
paquete java.util necesita ser importado*/
import java.util.Scanner;

//IMPORTACIÓN DE PAQUETE PARA USAR LA CLASE JOPTIONPANE
/*Como la clase JOptionPane no pertenece al paquete principal java.lang sino 
que pertenece al paquete javax.swing necesita ser importado, además con la 
instrucción .* se importan todas las clases del paquete en vez de solo una*/
import javax.swing.*;

public class for_forEach_while_doWhile {
    
    public static void main(String[] args){
        /*Lo que vamos a hacer es un bucle for que recorra toda una palabra 
        para ver si ésta es un email bien escrito o no*/
         int arroba = 0;//Esto me dirá el número de arrobas en el email
         int punto = 0;//Esto me dirá el número de puntos que haya en el email
         String email = JOptionPane.showInputDialog("Introduce un email");
         
        /*BUCLE for: Es un bucle determinado, esto implica que le diremos al 
        programa cuántas veces queremos que se ejecute, primero pondremos un 
        número de inicio, luego una condición que dicte el límite para las 
        veces que queremos que se ejecute y finalmente de cuánto en cúanto se 
        irá aumentando el número del inicio*/
        
        //CLASE STRING: Para manipulación de cadenas de caracteres
        /*Método length(): Retorna un número int que indica el largo de la 
        palabra, las letras de la palabra las empieza a contar desde 1*/
        /*Métodos NO estáticos: Para aplicarse debemos haber previamente creado 
        un objeto o instancia de la clase y usarlo con el nombre del método*/
         for(int i=0; i<email.length(); i++){
             /*Método charAt(): Me dará una letra o caracter de un objeto 
             String, para ello debo indicar en su parámetro la ubiación de 
             la letra que quiero, las posiciones se cuentan desde el cero 
             por eso es que al número de inicio se le dió un valor inicial 
             de 0 y el límite es dado por el método .length()*/
             if(email.charAt(i)=='@'){
                 /*Este condicional lo que hará es recorrer todos los 
                 caracteres, osea las letras de la palabra para ver si 
                 alguno de ellos es una arroba y si ese es el caso le sumará
                 un 1 a la variable arroba*/
                 arroba++;
             }
             if(email.charAt(i)=='@'){
                 /*Este condicional lo que hará es recorrer todos los 
                 caracteres, osea las letras de la palabra para ver si 
                 alguno de ellos es un punto y si ese es el caso le sumará
                 un 1 a la variable punto*/
                 punto+=1;//Poner esto es igual a poner punto++;
             }
         }
        /*En todas las direcciones de email bien escritas debe existir solo un 
        arroba y un punto, este condicional analizará el valor de las variables 
        arroba y punto para que solamente cuando en el correo exista uno de 
        cada uno se pueda decir que el correo está escrito correctamente*/
        if(arroba == 1 && punto==1){
            System.out.println("El email está escrito correctamente");
        }else{
            System.out.println("El email NO está escrito correctamente baboso");
        }
        
        
        
        
        /*BUCLE while: Es un bucle indeterminado, esto implica que no sabemos 
        cuántas veces se ejecutará, mientras la condición de su paréntesis se 
        cumpla, se seguirá ejecutando una y otra vez el código de dentro*/
        
        /*En este ejercicio lo que vamos a hacer es validar una contraseña por 
        medio de bucles*/
        //Objeto String que debe ser igual a la que introduzca el usuario
        String password_check = "puto el que lo escriba";
        
        /*La variable que almacenará la contraseña introducida por el usuario 
        en un inicio está inicializada como vacía*/
        String password_intro = "";
        
        //CLASE STRING: Para manipulación de cadenas de caracteres
        /*Método equals(): Compara dos objetos String para ver si son iguales 
        tomando en cuenta mayúsculas y minúsculas*/
        while(password_check.equals(password_intro)==false){
            /*CLASE JOPTIONPANE: Sirve para introducir datos al programa 
            por medio de una ventana emergente*/
            /*Método showInputDialog(): Permite introducir al programa por 
            medio de una ventana emergente cualquier dato que siempre 
            ingresará al programa como un objeto String, no importando si 
            es un número. Este método es estático*/
            /*Métodos estáticos: Se aplican poniendo solo el nombre de la 
            clase, seguido del nombre del método que queremos usar*/
            password_intro = JOptionPane.showInputDialog("Introduce la contraseña, bitch");
            
            /*CONDICIONAL if: Si la contraseña introducida por el ususario 
            sigue siendo diferente a la que debe ser, se mostrará el siguiente 
            mensaje*/
            if(password_check.equals(password_intro)==false){
                System.out.println("Contraseña incorrecta, intente de nuevo");
            }else{
                System.out.println("Contraseña correcta, acceso permitido");
            }
            
        }
        /*La condición del bucle dice que mientras password_check y 
        password_intro no sean iguales, el bucle se seguirá ejecutando*/
        
        
        
        
        /*BUCLE do while: Es un bucle indeterminado, esto implica que no sabemos 
        cuántas veces se ejecutará, funciona igual que el bucle while con la 
        única diferencia de que si la condición de su paréntesis no se cumple, 
        ni una vez, aún así se ejecutará mínimo una vez el código de dentro*/
        
        /*En este ejemplo se elaborará un juego que creará un número aleatorio 
        que esté entre 0 y 100, el chiste del juego es adivinar el número en 
        el menor número de intentos posibles, el programa nos irá dando pistas
        y se usa el bucle do while porque si el programa genera un número 
        aleatorio que sea 0, el juego nunca entraría al bucle, por lo que no 
        funcionaría correctamente*/
        //CLASE MATH: Para operaciones matemáticas
        /*Método random(): No recibe nada como parámetro y retorna un número 
        aleatorio entre 0 y 1 de tipo double*/
        /*Métodos estáticos: Se aplican poniendo solo el nombre de la clase 
        antes del nombre del método que queremos usar*/
        /*REFUNDICIÓN: Sirve para cambiar un tipo de dato numérico en otro de 
        la siguiente manera:
        tipo_primitivo_1    variable_original = valor;
        tipo_primitivo_2    variable_transformada = (tipo_primitivo_2) variable_original;
        En este caso se usa porque no nos sirve tener un número decimal, va a 
        ser mucho más complejo atinarle de esa manera al número exacto a que si 
        fuera entero*/
        int aleatorio = (int)(Math.random()*100);
        //Se multiplica por 100 para que el número esté entre 0 y 100
        
        int numero = 0;
        //El número que ingresará el usuario está inicializado en 0
        int intentos = 1;
        /*Esta variable guardará el número de intentos que le tome al usuario 
        adivinar el número aleatorio que creó el programa*/
        
        System.out.println("A ver si muy salsa, intenta adivinar que "
                    + "número aleatorio creo el programa dude...");
        
        do{
            /*Mientras el número que ingrese el usuario sea diferente al número 
            aleatorio que creó el programa, el bucle while se seguirá 
            ejecutando*/
            /*CLASE SCANNER: Se usa para introducir datos al programa por medio 
            de la consola*/
            /*Para crear un objeto de la clase Scanner y por medio de éste 
            recibir datos usando de la consola del sistema, instanciaremos la 
            clase usando el primer constructor que viene indicado en la API, 
            cuya documentación dice lo siguiente:
            Scanner(File source)
            Como su parámetro que en la API le llamaron File source pondremos 
            System.in ya que esto le dice al constructor que la fuente o 
            source por la cual introduciremos datos al programa es la consola*/
            Scanner intentoNumero = new Scanner(System.in);
            /*Objeto o instancia de la clase predefinida Scanner para usar 
            alguno de los métodos de la clase Scanner, porque sus métodos son
            no estáticos*/
            /*Método nextInt(): Permite introducir al programa un número entero.
            Es un método no estático por lo que se debe usar un objeto o 
            instancia de la clase*/
            numero = intentoNumero.nextInt();
            /*La variable numero es sobreescrita con lo que introduzca el 
            usuario*/
            
            /*CONDICIONAL else if: Sirve para analizar varias condiciones 
            relacionadas entre sí, me dará pistas de si el número que 
            introduje es más alto o más bajo que el que generó el programa 
            de manera aleatoria*/
            if(aleatorio<numero){
                System.out.println("El número que introdujiste es más alto al "
                        + "que generó el programa");
            }else if(aleatorio>numero){
                System.out.println("El número que introdujiste es más bajo al "
                        + "que generó el programa");
            }else{
                System.out.println("Ya le atinaste al número perra y sólo te "
                        + "tomó " + intentos + " intentos");
            }
            
            intentos++;
            /*Esto le sumará un 1 a la variable intentos cada vez que salgamos 
            del bucle while, osea cada vez que hagamos un intento*/
        }while(numero != aleatorio);
    }

}
