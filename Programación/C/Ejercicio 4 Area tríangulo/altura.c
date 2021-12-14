//librerias y constantes
	#include <stdio.h>
	#include <locale.h>
	#define tam 30
	main(){
		int l = 0;	int h = 0;	float a = 0;
		setlocale(LC_ALL, "spanish");
		
		printf("Introdudzca la altura del triángulo \n");
		scanf("%d",&h);
		fflush(stdin);
		
		printf("Introduzca el lado del triángulo \n");
		scanf("%d",&l);
		fflush(stdin);
		
		a=(float)(l*h)/2;
		printf("El área del triángulo es: %.1f ",a);
		fflush(stdin);
		
		return 0;
								
	}
