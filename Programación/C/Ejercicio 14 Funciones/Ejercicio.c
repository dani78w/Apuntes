    //librerias y constantes
    	#include <stdio.h>
    	#include <locale.h>
    	#include <string.h>
    	#define tam 10
    	#define ctam 50
    	
    //cabeceras
    	int sumaDosNum();
    	setlocale(LC_ALL, "spanish");
    	
    main(){
    	setlocale(LC_ALL, "spanish");
    	sumaDosNum();
    	sumaDosNumP();
 	}
  	
	//definición de funciones
	int sumaDosNum(){
			int a = 0;
			int b = 0;
			int suma=0;
			
			printf("Introduce un número  \n");	
			scanf("%d",&a);
		    fflush(stdin);
		    printf("Introduce un número  \n");	
			scanf("%d",&b);
		    fflush(stdin);
		    
    		suma=a+b;
			printf("El resultado es %d",suma);
    		return suma;
		}
	//procediminetos de funciones
	void sumaDosNumP(){
			int a = 0;
			int b = 0;
			int suma=0;
			
			printf("Introduce un número  \n");	
			scanf("%d",&a);
		    fflush(stdin);
		    printf("Introduce un número  \n");	
			scanf("%d",&b);
		    fflush(stdin);
		    
    		suma=a+b;
			printf("El resultado es %d",suma);
			return;
		}
