#include <stdio.h>
#include <locale.h>

#define TAM 5
#define randomize (srand(time(NULL)))
#define randinter(n) (rand()%n)

void main(){
	setlocale(LC_ALL, "spanish");	
	int manoPlayer=0;
	int manoIA=0;
	int modo=0;
	//proceso de generacion de los puntos de la IA
	randomize;
	manoIA=randinter(TAM);
	//proceso de recolecion de datos
	printf("Pares?(1)... o nones(0)?... \n");	
			scanf("%d",&modo);
		    fflush(stdin);
	printf("Introduce un número  \n");	
			scanf("%d",&manoPlayer);
		    fflush(stdin);
	//proceso de seleccion de ganador
	if(modo==1){
		if((manoPlayer+manoIA)%2!=0){
			printf("Has ganado\n");
		}else{
			printf("Has perdido\n");
		}
	}else if(modo==0){
		if((manoPlayer+manoIA)%2!=1){
			printf("Has ganado\n");
		}else{
			printf("Has perdido\n");
		}
	}
	
}
