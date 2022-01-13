//procedimiento para imprimir un array de forma completa;
#include <stdio.h>
#include<locale.h>
#define TAM 4
void imprimir(int tam,int arrayF[tam]);

void main(){

	int array[TAM] = {5, 1, 2, 3};

	imprimir(TAM,array);
}
void imprimir(int tam,int arrayF[tam]){
	
	int i = 0;
	for(i=0;i<tam;i=i+1){
		printf("%d ",arrayF[i]);
	}
	
	return 0;
}
