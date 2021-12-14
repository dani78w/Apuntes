    //librerias y constantes
    	#include <stdio.h>
    	#include <locale.h>
    	#define tam 11
    	
    main(){
    	setlocale(LC_ALL, "spanish");
    	
    	char cadena1[tam]="";
    	char cadena2[tam]="";
    	
    	printf("introduzca una palabra de como máximo 10 letras \n");
    	scanf("%c",cadena1);
	    fflush(stdin);
	    
	    printf("introduzca otra palabra de como máximo 10 letras \n");
    	scanf("%c",cadena2);
	    fflush(stdin);
	    
	    if(strcmp(cadena1,cadena2) == 0){
	    	printf("son iguales \n");
		}else{
			printf("no son iguales \n");
		}
		
		system("pause");
		system("cls");
		return 0;
	}
    	    	
