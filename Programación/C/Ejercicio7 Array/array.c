    //librerias y constantes
    	#include <stdio.h>
    	#include <locale.h>
    	#define tam 5
	main(){
	    setlocale(LC_ALL, "spanish");
	    //DECLARACION E INICIACION DE VARIABLES LOCALES
		int arrayInt[tam];
	    int i = 0;
	    //INICIACION DE PROCESO Y PROCESO DE RECOGIDA DE ARRAY
	    i=0;
	    for( i = 0 ; i <= tam ; i = i+1){
	        printf("Introdudzca un int para la posicion %d \n",i);
	    	scanf("%d",&arrayInt[i]);
	    	fflush(stdin);
	    }
	    
		i=0;
		printf("La cadena se compone por:\n");
	    for( i = 0 ; i <=tam ; i = i+1){
	        printf("[%d]\n",arrayInt[i]);
	    }
	    
	    //PROCESO DE MANIPULACION DE ARRAY
	    i=0;
	    	printf("La cadena se compone por los siguientes numeros en posiciones impares:\n");
	    for( i = 1; i <= tam ; i = i+2){
	        printf(" en la posicion %d : [%d]\n ",i,arrayInt[i]);
	    }
		
		return 0;}
