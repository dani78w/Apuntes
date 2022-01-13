//Es una año bisisesto o no?¿?
//hacer un procedimineto que nos devuelva si o no mediante parametro por referencia

#include <stdio.h>
#include<locale.h>
#define TAM 4
void Bisiesto(int yearP);

void main(){
	int year = 2020;
	printf("{%d} \n %s (funcion)",year,esBisiesto(year));
	Bisiesto(year);
}

int esBisiesto(int yearF){
	if((yearF%4)==0){
		return "Es bisiesto";
	}else{
		return "No es bisiesto";
	}
}
void Bisiesto(int yearP){
	
	if((yearP%4)==0){
		printf("Es bisiesto (procedimiento)");
	}else{
		printf("No es bisiesto (procedimiento)");
	}
	return;
}





