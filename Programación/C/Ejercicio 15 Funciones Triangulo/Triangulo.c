       //librerias y constantes
    	#include <stdio.h>
    	#include <locale.h>
    	#include <string.h>
    	
    	main(){
    		setlocale(LC_ALL, "spanish");
    		int b = 0;float h= 0;
    		printf("Introduce un n�mero como base \n");	
			scanf("%f",&b);
		    fflush(stdin);
		    
		    printf("Introduce un n�mero como altura \n");	
			scanf("%f",&h);
	   		fflush(stdin);
	   		
    		Area(b,h);
    	
		}
		int Area(int x,int y){
			int area = 0;
    		area=x*y/2;
    		printf("el area del triangulo es %d",area);
    		return area;
		}
    	
	
