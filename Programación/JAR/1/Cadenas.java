/*
 Un potente conjunto de métodos de la clase String nos permite convertir a cadena cualquier
 tipo de dato básico: int, float, double,… Esto es especialmente útil cuando hablamos de números.
 Ya que en múltiples ocasiones querremos mostrarles como cadenas de texto y no en su representación
 normal de número. Así podemos utilizar los siguientes métodos:
        String valueOf(boolean b);
        String valueOf(int i);
        String valueOf(long l);
        String valueOf(float f);
        String valueOf(double d);
        String valueOf(Object obj);
        
        
        
        
        String toLowerCase(); Convierte todos los caracteres en minúsculas.
        String toUpperCase(); Convierte todos los caracteres a mayúsculas.
        String trim(); Elimina los espacios en blanco de la cadena.
        String replace(char oldChar, char newChar) Este método lo utilizaremos cuando lo que queramos hacer sea el remplazar un carácter por otro. Se reemplazarán todos los caracteres encontrados.
         
        
        
        String substring(int beginIndex)Este método nos devolverá la cadena que se encuentra entre el índice pasado como argumento (beginIndex) hasta el final de la cadena origen. Así, si tenemos la siguiente cadena
        
        
        
        int indexOf(String str) Busca una cadena dentro de la cadena origen. Devuelve un entero con el índice a partir del cual está la cadena localizada. Si no encuentra la cadena devuelve un -1.
        int indexOf(String str, int fromIndex) Misma funcionalidad que indexOf(String str), pero a partir de un índice indicado como argumento del método.
        lastIndexOf(String str) Si la cadena que buscamos se repite varias veces en la cadena origen podemos utilizar este método que nos indicará el índice donde empieza la última repetición de la cadena buscada.
        lastIndexOf(String str, int fromIndex) Lo mismo que el anterior, pero a partir de un índice pasado como argumento.
        
        
        boolean equals(Object anObject) Nos permite comparar si dos cadenas de texto son iguales. En el caso de que sean iguales devolverá como valor “true”. En caso contrario devolverá “false”. Este método tiene en cuenta si los caracteres van en mayúsculas o en minúsculas. Si queremos omitir esta validación tenemos dos opciones. La primera es convertir las cadenas a mayúsculas o minúsculas con los métodos .toUpperCase() y .toLowerCase() respectivamente. Métodos que veremos más adelante. La segunda opción es utilizar el método .equalsIgnoreCase() que omite si el carácter está en mayúsculas o en minúsculas.
        boolean equalsIgnoreCase(String anotherString) Compara dos cadenas de caracteres omitiendo si los caracteres están en mayúsculas o en minúsculas.
        int compareTo(String anotherString) Este método es un poco más avanzado que el anterior, el cual, solo nos indicaba si las cadenas eran iguales o diferentes En este caso compara a las cadenas léxicamente. Para ello se basa en el valor Unicode de los caracteres. Se devuelve un entero menor de 0 si la cadena sobre la que se parte es léxicamente menor que la cadena pasada como argumento. Si las dos cadenas son iguales léxicamente se devuelve un 0. Si la cadena es mayor que la pasada como argumento se devuelve un número entero positivo. Pero que es esto de “mayor, menor o igual léxicamente”. Para describirlo lo veremos con un pequeño ejemplo
 *
 *
 *
 */
