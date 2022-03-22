#include <stdio.h>
#include <string.h>
#include <locale.h>
#include <time.h>
#include <ctype.h>

int LEERF();
int REESCRIBIR();

typedef struct{
	char numFac[9];
	float codigo;
	int neto;
}stFich;

int main(){
	LEERF();
	REESCRIBIR();
	return 0;
}

int LEERF(){
	//lectura
	stFich st1;
	FILE *f;
	f=fopen("facturas.dat","rb+");
	if(f=="null"){printf("error de fichero");}
	int i = 0;
	if(feof(f)==0){
			printf("\n---FICHERO ABIERTO MODO LECTURA---\n");
			//funcion para leer desde el fichero (aquí)
			printf("	-registro numero- : %d\n",i);i=i+1;
			printf("	%c , %f , %d",st1.numFac,st1.codigo,st1.neto);
			fread(&st1,sizeof(st1),1,f);
	}
	printf("\n---FINAL DE FICHERO---\n");
	fclose(f);
}

int REESCRIBIR(){
	stFich st1;
	FILE *f;
	f=fopen("facturas.dat","wb+");
	
	if(feof(f)==0){
			printf("\n---FICHERO MODO LECTURA ESCRITURA---\n");
	
			fread(&st1,sizeof(st1),1,f);
	}
	fclose(f);
}
