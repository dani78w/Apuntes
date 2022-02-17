#include <time.h>
#include <stdio.h>
#include <locale.h>

void main(){
	setlocale(LC_ALL, "spanish");
	time_t fecha=0;
	struct tm fechaIni;
	struct tm fechaFin;
	struct tm fechaTotal;
	
	/*fechaIni.tm_hour=2-1;
	fechaIni.tm_mday=0; ?????????????
	fechaIni.tm_year=2022-1900;*/
	
	fecha=mktime(&fechaIni);
	fecha=mktime(&fechaFin);
	fecha=mktime(&fechaTotal);
	
	printf("[ dia , mes ,año ]\n");
	scanf("%hd",&fechaIni.tm_hour);
	fflush(stdin);
	scanf("%hd",&fechaIni.tm_mday);
	fflush(stdin);
	scanf("%hd",&fechaIni.tm_year);
	fflush(stdin);
	
	printf("FECHA INICIAL : %s",ctime(&fechaIni));
	
	printf("[ dia , mes ,año ]\n");
	scanf("%d",&fechaFin.tm_hour);
	fflush(stdin);
	scanf("%d",&fechaFin.tm_mday);
	fflush(stdin);
	scanf("%d",&fechaFin.tm_year);
	fflush(stdin);

}


