    //librerias y constantes
    	#include <stdio.h>
    	#include <locale.h>
    	#define tam 6
    	    	
main(){
		setlocale(LC_ALL, "spanish");
	//DECLARACION E INICIACION DE VARIABLES LOCALES
	
		int arrayInt[tam];
	    int i = 0;
		int flag = 0;
		int cont = tam;
	//INICIACION DE PROCESO Y PROCESO DE RECOGIDA DE ARRAY
	    i=0;
	    for( i = 0 ; i <= tam ; i = i+1){
	        printf("Introdudzca un int para la posicion %d \n",i);
	    	scanf("%d",&arrayInt[i]);
	    	fflush(stdin);
	    }
	    
	    i=0;
		printf("La cadena se compone por:\n");
	    for( i = 0 ; i <= tam ; i = i+1){
	        printf("[%d]",arrayInt[i]);
	    }
	//PROCESO DE DETECIÓN DE CAPICÚA
	    i=0;	flag=0;		cont=tam;		
	    do{
	    
	    	if(arrayInt[i]==arrayInt[cont]){
	    		flag=0;

			}
			else{
				flag=1;

			}

			cont=cont-1;
			i=i+1;
			
		}while(i<=tam && flag==0);
		
		if(flag==0)
			printf("\nEl array es capicua \n");
		else	
			printf("\nEl array no es capicua \n");	
		

		
		

	return(0);


}
