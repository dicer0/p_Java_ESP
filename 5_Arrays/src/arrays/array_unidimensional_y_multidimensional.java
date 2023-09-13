package arrays;


public class array_unidimensional_y_multidimensional {

    public static void main(String[] args) {
        //ARRAY UNIDIMENSIONAL
        /*A los array se les puede llamar matriz, vector o arreglo y sirven más 
        que nada para organizar datos en categorías*/
        /*DECLARACIÓN DE UN ARRAY: Primero que nada se debe indicar el tipo de 
        datos que almacenará el array, luego se debe poner unos corchetes 
        cuadrados para indicarle al programa que estamos trabajando con un 
        array (estos corchetes [] se pueden poner antes o después del nombre 
        del array), posteriormente debo poner la palabra reservada new seguida 
        de repetir el tipo de datos que almacenará la matriz, para finalmente 
        indicar el tamaño que tendrá dentro de los corchetes que van hasta el 
        final (el tamaño se refiere al número de datos que almacenará), para 
        indicar el tamaño del vector siempre se cuenta desde 1*/
        int[] nombre_array = new int[5];
        
        /*Iniciación de un arreglo: Se debe indicar el valor que almacenará cada 
        posición del array, siempre considerando que las posiciones o índices 
        del array se cuentan desde cero, por lo que un array de tamaño 5 tendrá 
        las posiciones 0, 1, 2, 3 y 4*/
        nombre_array[0] = 10;
        nombre_array[1] = -2;
        nombre_array[2] = 20;
        nombre_array[3] = 5;
        nombre_array[4] = 7;
        
        /*Declaración e Iniciación de un array: Si quiero crear un array de 
        esta forma debo indicar el valor que tendrá cada posición directamente 
        dentro de unas llaves de apertura y cierre {} en vez de usar corchetes 
        cuadrados [], los corchetes que le indican al programa que estamos 
        creando una matriz deben ponerse antes o después del nombre del vector*/
        String paisesLatinos[] = {"España", "México", "Colombia", "Perú", 
            "Chile", "Argentina", "Ecuador", "Venezuela"};
        
        /*RECORRER UN ARRAY: Normalmente para poder recorrer los valores 
        almacenados en un array para verlos o manejarlos, lo que se hace es 
        apoyarse de un bucle for o for each*/
        
        /*BUCLE for: Es un bucle determinado, esto implica que le diremos al 
        programa cuántas veces queremos que se ejecute, primero pondremos una 
        variable con un número de inicio, luego una condición que dicte el 
        límite de veces que queremos que se ejecute y finalmente de cuánto en 
        cúanto se irá aumentando o disminuyendo la variable de inicio*/
        //Para imprimir en consola todos los valores del 1er array
        //CLASE ARRAY: Para manipulación de arrays
        /*.length: Retorna un número int que indica el largo del array, no es 
        un método*/
        for(int i=0; i<nombre_array.length; i++){
            System.out.println("El valor del índice " + i + 
                    " en mi array 1 es: " + nombre_array[i]);
        }
        
        System.out.println("");
        //Para imprimir en consola todos los valores del 2do array
        
        /*BUCLE for each: Es un bucle determinado creado específicamente para 
        recorrer arrays, primero declararemos una variable que sea del mismo 
        tipo que el array que queremos recorrer y finalmente pondremos el 
        nombre del array que queramos recorrer, todo separado por dos puntos :*/
        int numLista = 1;
        for(String imprimePaises: paisesLatinos){
            System.out.println("El país latino " + numLista +  " es: "+ imprimePaises);
            numLista++;
        }
        
        System.out.println("");
        //Para imprimir en consola las matrices multidimensionales 
        
        //ARRAY MULTIDIMENSIONAL
        /*DECLARACIÓN DE UN ARRAY MULTIDIMENSIONAL: Primero que nada se debe 
        indicar el tipo de datos que almacenará el array, luego debo poner más 
        de un par de corchetes cuadrados para indicarle al programa que estamos 
        trabajando con un arraymultidimensional (estos corchetes [] se pueden 
        poner antes o después del nombre del array y el número de corchetes que 
        ponga me dirán de qué dimensión será mi matriz), posteriormente debo 
        poner la palabra reservada new seguida del tipo de datos que almacenará 
        el array para finalmente indicar el tamaño que tendrá cada dimensión 
        del array dentro de los corchetes que van hasta el final (el tamaño se 
        refiere al número de datos que almacenará cada dimensión), para indicar 
        el tamaño del vector siempre se cuenta desde 1*/
        int array3D[][][] = new int[4][5][1];
        
        /*Iniciación de un arreglo: Se debe indicar el valor que tendrá cada 
        posición del array, siempre considerando que las posiciones o índices 
        del array se cuentan desde cero, por lo que un array de tamaño 5 tendrá 
        las posiciones 0, 1, 2, 3 y 4*/
        array3D[0][0][0] = 15;
        array3D[0][1][0] = 21;
        array3D[0][2][0] = 18;
        array3D[0][3][0] = 9;
        array3D[0][4][0] = 15;
        
        array3D[1][0][0] = 10;
        array3D[1][1][0] = 52;
        array3D[1][2][0] = 17;
        array3D[1][3][0] = 19;
        array3D[1][4][0] = 7;
        
        array3D[2][0][0] = 19;
        array3D[2][1][0] = 2;
        array3D[2][2][0] = 19;
        array3D[2][3][0] = 17;
        array3D[2][4][0] = 7;
        
        array3D[3][0][0] = 92;
        array3D[3][1][0] = 13;
        array3D[3][2][0] = 13;
        array3D[3][3][0] = 32;
        array3D[3][4][0] = 41;
        
        /*RECORRER UN ARRAY MULTIDIMENSIONAL: Para poder recorrer los valores 
        almacenados en un array multidimensional se deben anidar el mismo 
        número de bucles for o for each que conformen las dimensiones del 
        array, en el caso de un array 3D se deben anidar 3 bucles*/ 
        /*Si uso bucles for each para recorrer la matriz, lo que debo hacer es 
        declarar un vector de menor grado al que estoy recibiendo para 
        almacenarlo en cada for anidado y bajar de grado consecuentemente hasta 
        llegar a usar un vector de grado cero, esto tomando en cuenta que el 
        vector de grado o dimensión cero es igual a una variable. Los vectores 
        que almacenenen los valores de cada dimensión deben ser del mismo tipo 
        que la matriz original*/
        for(int array2D[][] : array3D){
        //El primer for each recorrerá la primera dimensión
        System.out.println("----Primera dimensión----");
            for(int array[] : array2D){
            //El segundo for each recorrerá la segunda dimensión
            System.out.println("....Segunda dimensión....");
                for(int valores : array){
                //Y el tercero recorrerá la tercera dimensión
                System.out.println(valores + " Tercera dimensión");
                /*Las variables que ponemos en los corchetes del array deben 
                estar en el órden en el que creamos los for anidados, sino 
                dará error el programa y deben estar organizados para recorrer 
                el array desde de la primera hasta la última dimensión*/
                }
            }
        }
        /*Si uso bucles for each me olvido de poner directamente el tamaño de 
        las dimensiones en mi matriz*/
        
        System.out.println("");
        //Para imprimir en consola las matrices multidimensionales 
        
        /*Declaración e Iniciación de un arreglo: Si quiero crear un array 
        multidimensional de esta forma debo indicar el valor que tendrá cada 
        posición directamente dentro de unas llaves de apertura y cierre en vez 
        de usar corchetes cuadrados, pero por ser una matriz de varias 
        dimensiones debo encerrar en llaves de apertura y cierre individuales 
        los arrays que almacena cada posición del array original, el número de 
        corchetes le indican al programa la dimensión de mi array , además de 
        definir que estamos creando una matriz y pueden ponerse antes o después 
        del nombre del array*/
        String peliculas[][] = {
            {"España", "México", "Colombia", "Perú"},
            {"Chile", "Argentina", "Ecuador", "Venezuela"}
        };
        /*Este sería un array de 2X4 porque su primera dimensión tiene tamaño 2 
        y su segunda dimensión es de tamaño de 4 por lo que se deberían de 
        usar 2 bucles for normales anidados, cada uno con su respectivo 
        límite puesto de forma manual*/
        for(int i=0; i<2; i++){
        //El primer for recorrerá la primera dimensión
        System.out.println("----Primera dimensión----");
            for(int j=0; j<4; j++){
            //El segundo for recorrerá la segunda dimensión
            System.out.println(peliculas[i][j] + " Segunda dimensión");
            }
        }
    }
    
}
