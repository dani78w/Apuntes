//librerias y constantes
	#include <stdio.h>
	#include <locale.h>
	#define tam 30
// REQUISITOS 
	// El cuadrado de 8 es: 64
	// 8*8 = 64")
	// 8unidades a 2,6 euros son: 48 euros 
	// Ana tiene 8 años
	// la siguiente letra de la x es la y
main(){
	//Español
		setlocale(LC_ALL, "spanish");
	//declaración e iniciación
		int num =0;int var =0;float precio = 0;char letra = ' ';char nombre[tam]="";
	
	//proceso pedir datos
		printf("Introduzca el precio: ");
		scanf("%f",&precio);				//ampersan para variables no cadenas
		fflush(stdin);						//fflush(stdin) borra el buffer es importante!
								
		printf("Introduzca el número: ");
		scanf("%d",&num);
		fflush(stdin);
		
		printf("Introduzca una letra: ");
		scanf("%c",&letra);
		fflush(stdin);
		
		printf("Introduzca un nombre: ");
		scanf("%s",&nombre);
		fflush(stdin);
	//proceso dar datos
		printf("El cuadrado de %d es %d \n",num,num*num);
		printf("%d * %d es %d \n",num,num,num*num);
		printf("%d unidades a %.2f son %.2f \n",num,precio,num*precio);
		printf("%s tiene %d años \n",nombre,num);
		printf("La sigueinte letra de la \"%c\" es \"%c\"",letra,letra+1);
	//Comprobar si ha salido por el final
		return(0);	
}
