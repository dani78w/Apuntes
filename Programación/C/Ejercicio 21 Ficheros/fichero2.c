#include <stdlib.h>
#include <stdio.h>
#include <locale.h>
#include <string.h>
#define desplaz(n) sizeof(estructura)*(n-1)

struct cd{
		char nombre[25];
		char titulo[30];
	};
struct cd cd1;
	

//leer fichero de estructuras
void main(){
	
	FILE*fich;
	fich=fopen("txt2.txt","w");
	

	int cont=0;
	for(cont=1;cont<3;cont++){
		printf("nombre: ");
		scanf("%s",&cd1.nombre);
		fflush(stdin);
		
		printf("Titulo: ");
		scanf("%s",&cd1.titulo);
		fflush(stdin);
		

		
	
	};
	printf("%d",sizeof(cd1));
	
	
	fclose(fich);
	
	//segunda parte

	
};

