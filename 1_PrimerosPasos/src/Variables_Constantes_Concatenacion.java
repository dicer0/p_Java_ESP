public class Variables_Constantes_Concatenacion {
    public static void main(String args[]){
    //Esta es la clase main, y todo el código Java debe estar dentro de ella
        System.out.println("Que pedotl");
        /*Esta línea de código imprime en consola el mensaje que tiene dentro y 
        luego da un salto de línea para que lo siguiente que imprima esté 
        debajo*/
    
    //VARIABLES
    //NUMÉRICOS ENTEROS
    /*byte: Se refiere a un dato de tipo numérico y abarca desde el número 
    -128 hasta el número 127.*/
        byte edad;
        //Declaración de variable tipo byte
        edad = 35;
        //Iniciación de la variable tipo byte
    /*short: Se refiere a un dato de tipo numérico y abarca desde el número 
    -32,768 hasta el número 32,767*/
        short manzanas = 5;
        //Declaración e iniciación de la variable tipo short
    /*int: Se refiere a un dato de tipo numérico y abarca desde el número 
    -2,147,483,648 hasta el número 2,147,483,647*/
        int planetas  = 8;
        //Declaración e iniciación de la variable tipo int
    /*long: Se refiere a un dato de tipo numérico y abarca desde el número 
    -9,223,372,036,854,775,808 hasta el número 9,223,372,036,854,775,807. 
    Para poder declarar una variable de tipo Long se debe usar el sufijo L*/
        long personas  = 5000L;
        //Declaración e iniciación de la variable tipo long con sufijo L
    
    //NUMÉRICOS DECIMALES
    /*float: Se refiere a un dato de tipo numérico decimal y permite 6 a 7 
    cifras decimales en el número.
    Para poder declarar una variable de tipo float se debe usar el sufijo f*/
        float inch_a_cm  = 2.54f;
        //Declaración e iniciación de la variable tipo float con sufijo f
    /*double: Se refiere a un dato de tipo numérico decimal y permite mostrar 
    15 cifras decimales en el número*/
        double ganas_de_verla  = 99.9999;
        //Declaración e iniciación de la variable tipo long con sufijo L
    
    //CARACTERES: Osea letras
    /*Estas se declaran siempre usando comillas simples ''*/
        char letra = 'a';
        
    //BOOLEANOS: Son valores de tipo lógico que pueden valer true o false
        boolean guapura = true;
        boolean ojos_vizcos = false;
    
        
    
    //CONSTANTES
    //Para poder declarar una constante se debe usar la palabra reservada final
        final double pi  = 3.1416;
        //Declaración e iniciación de la constante tipo double
    
        
    
    //CONCATENACIÓN
        final float pulgadas_a_cm = 2.54f;
        //Declaración de variables tipo float
        float cm, resultado;
        //Iniciación de las variables tipo float antes delaradas
        cm = 10f;
        resultado = cm/pulgadas_a_cm;
        System.out.print(cm + " cm. convertidos a pulgadas son igual a " + resultado + " in.");
        /*System.out.print imprime en consola el mensaje que tiene dentro sin 
        dar un salto de línea para que lo siguiente que imprima esté debajo*/
    }
}
