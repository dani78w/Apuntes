    //librerias y constantes
    	#include <stdio.h>
    	#include <locale.h>
    	#define tam 10
    	#define ctam 50
    	
    main(){
    	setlocale(LC_ALL, "spanish");
    	char matriz[tam][ctam];
    	int i = 0;int aux= 0;
    	for(i=0;i<=tam;i=i+1){
    		printf("Introduce un nombre (con o sin apellido) \n");
			gets(matriz[i]);
			}
	    	
		printf("Introduce un número como índice \n");	
		scanf("%d",&aux);
	    fflush(stdin);
		aux=aux-1;
		printf("%s \n",matriz[aux]);
	}
