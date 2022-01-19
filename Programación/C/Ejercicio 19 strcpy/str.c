/*
PEDIR POR PANTALLA UNA CADENA DE MAXIMo 50 CARACTERES; 
Digitos cuantso digitos tiene; 
Cuantas letras mayusculas tiene ; 
Cuiantos espacios ; 
Cuantos simbolos 
Cuantos alfanumericos;  
*/

#include <stdio.h>
#include<locale.h>
#define TAM 50
void main(){
	int cont=0;
	int i=0;
	int array[TAM]={0};
	gets(array);
	printf("%s",array);
//------ numeros
	i=0;
	cont=0;
	for(i=0;i<TAM;i=i+1){
		if(isdigit(array[i])!=0){
			cont=cont+1;
		}
	}
	printf("\n hay %d numeros",cont);
//------ mayusculas
	i=0;
	cont=0;
	for(i=0;i<TAM;i=i+1){
		if(strchr(array,"abcdefghijklmnopqrstuvwxyz")!="null"){
			cont=cont+1;
		}
	}
	printf("\n hay %d minusculas",cont);
//------
	i=0;
	cont=0;
	for(i=0;i<TAM;i=i+1){
		if(strchr(array,"abcdefghijklmnopqrstuvwxyz")!="null"){
			cont=cont+1;
		}
	}
	printf("\n hay %d minusculas",cont);
//------
	i=0;
	cont=0;
}



