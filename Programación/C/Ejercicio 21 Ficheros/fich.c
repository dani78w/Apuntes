#include <stdlib.h>
#include <stdio.h>
#include <locale.h>
#include <string.h>
#define TAM 50
void main(){
	setlocale(LC_ALL, "spanish");
	
	FILE*fich;
	fich=fopen("txt.txt","w");
	fputs("cadena",fich);
	fputc('x',fich);
	
	while(feof(fich) != 0){
		printf("%c",fgetc(fich));
	
	};
	fclose(fich);
	

}
