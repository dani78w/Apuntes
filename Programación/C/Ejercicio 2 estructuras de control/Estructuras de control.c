//librerias y constantes
	#include <stdio.h>
	#include <locale.h>
main(){
	setlocale(LC_ALL, "spanish");
	//declaracion e inicializacion
	short num = 0;
	
	printf("Introduzca un numero: ");
	scanf("%d",&num);
	fflush(stdin);

	if (num > 0)
		printf("El n�mero %d es positivo ",num);
	else
		if (num < 0)
			printf("El n�mero %hd es negativo",num);
		else
			printf("El n�mero %hd es nulo",num);
		
	return(0);
}
