    //librerias y constantes
    	#include <stdio.h>
    	#include <locale.h>
    	#include <string.h>
    	#define tam 10
    	#define ctam 50
    	
    //cabeceras
    	int sumaDosNum();
    	
    main(){
    	setlocale(LC_ALL, "spanish");
    	sumaDosNum();
 	}
 	
	//definici�n de funciones
	int sumaDosNum(){
			int a = 0;
			int b = 0;
			int suma=0;
			
			printf("Introduce un n�mero  \n");	
			scanf("%d",&a);
		    fflush(stdin);
		    printf("Introduce un n�mero  \n");	
			scanf("%d",&b);
		    fflush(stdin);
		    
    		suma=a+b;
			printf("El resultado es %d",suma);
    		return suma;
		}
