     //librerias y constantes
    	#include <stdio.h>
    	#include <locale.h>
    	#define tam 3
    	#define tam2 tam*2
    	    	
main(){
		setlocale(LC_ALL, "spanish");
	//DECLARACION E INICIACION DE VARIABLES LOCALES
	
		int arrayInt[tam];
	    int i = 0;
		int max[tam];
		int min[tam];
	//INICIACION DE PROCESO Y PROCESO DE RECOGIDA DE ARRAY
	
	    i=0;
	    for( i = 0 ; i < tam ; i = i+1){
	        printf("Introdudzca un int para la posicion %d \n",i);
	    	scanf("%d",&arrayInt[i]);
	    	fflush(stdin);
	    }
	    
	    i=0;
		printf("La cadena se compone por:\n");
	    for( i = 0 ; i <tam ; i = i+1){
	        printf("[%d]\n",arrayInt[i]);
	    }
	    
	//PROCESO DE MANIPULACION DE ARRAY
	
	    i=0;
		max[1]=arrayInt[i];
		min[1]=arrayInt[i];
		
	    for( i = 0 ; i < tam ; i = i+1){
	        if(arrayInt[i]	<=	min[1]){
	        	min[1]=arrayInt[i];
	        	min[2]=i;
				}
	        else if(arrayInt[i]	>=max[1]){
	        	max[1]=arrayInt[i];
	        	max[2]=i;
				}
				
	    }
	    printf("El menor es %d en la posición %d \n",min[1],min[2]);
	    printf("El mayor es %d en la posición %d \n",max[1],max[2]);
	    
	    
		
	return(0);

}
