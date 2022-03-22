#include <stdio.h>
#include <string.h>
#include <locale.h>
#include <time.h>
#include <ctype.h>
#define TAM 20
//maquetado
void strMAY(char cadF[TAM]); 

int main(){
	setlocale(LC_ALL, "spanish");
	char cad[TAM]="";
	strcpy(cad,"Dani");
	
	strMAY(cad);
	
	return 0;
}
//procedimiento (uso void sin return porque los metodos no lo usan)
void strMAY(char cadF[TAM]){
	
	char cad2[TAM]=""; int i=0;
	//proceso
	printf("ORIGINAL : %s\n",cadF);
	do{
		cad2[i]=toupper(cadF[i]);
		i=i+1;
	}while(i<TAM);//incluir tam
	printf("RESULTADO : %s\n",cad2);
	
}


