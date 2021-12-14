#include <stdio.h>
#include <locale.h>
// TODO

int main() {
//DECLARACION E INICIALIZACION 
	int total = 0;
	int numero = 2;
	setlocale(LC_ALL, "spanish");
    int tabMax=0;int NumTab=0; int i=0; int num=0;
    char punt[20]="====================";
//RECOLECCION DE DATOS
	do{
		printf("introduce el número de tablas: ");
	    scanf("%d",&NumTab);
	    fflush(stdin);
	}while(NumTab<=0);
	do{
		printf("introduce el tamaño de tablas: ");
    	scanf("%d",&tabMax);
    	fflush(stdin);
	}while(tabMax<=0);
   
    
    
//PROCESO DE REPRESENTADO DE DATOS
    i=0;
    num=0;
    for(num=1;num<=NumTab;num=num+1){
    	for(i=1;i<=tabMax;i=i+1){
    		printf("%d X %d : %d\n",num,i,i*num);
    		total=total+(i*num);
		}
		printf("%s \n",punt);
	}
	printf("Resultado acumulado es :%d \n",total);
    return 0;
}

