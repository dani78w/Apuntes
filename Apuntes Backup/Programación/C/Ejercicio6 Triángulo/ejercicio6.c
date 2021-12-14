#include <stdio.h>
#include <locale.h>
main(){
	setlocale(LC_ALL, "spanish");
	int max=12; int i=0; int acum=0;
	printf("Introduzca la altura del triángulo:\n");
					scanf("%d",&max);
					fflush(stdin);
					printf("-------------------------------\n \n");
		do{
			do{
				printf("* ");
				acum=acum+1;
			}while(acum<=i);
			acum=0;
			printf("\n");
			i=i+1;
		}while(i<max);
		return(0);
}
			
	
