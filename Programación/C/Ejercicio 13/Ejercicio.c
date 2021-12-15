    //librerias y constantes
    	#include <stdio.h>
    	#include <locale.h>
    	#include <string.h>
    	#define tam 10
    	#define ctam 50
    	
    	
    main(){
    	
    	setlocale(LC_ALL, "spanish");
    	char matriz[tam][ctam];
    	int i = 0;int aux= 0;
    	
    	//iniciacion de matriz
    	for(i=0;i<tam;i=i+1){ 
			strcpy(matriz[i],"");
			}
    	
    	for(i=0;i<tam;i=i+1){
    		printf("Introduce un nombre (con o sin apellido) \n");
			gets(matriz[i]);
			}
			
		aux=tam;
	    do{
	    printf("Introduce un número como índice entre 1 y %d \n",tam);	
		scanf("%d",&aux);
	    fflush(stdin);
		aux=aux-1;
		
		}while(aux>=tam);
		printf("\n%s \n",matriz[aux]);
		return 0;
	}
