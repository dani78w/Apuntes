//librerias y constantes
	#include <stdio.h>
	#include <locale.h>
	#define tam 30
	//pedir nomrbre alumno:ROSA MELANO
	//pedir nota:7 -->ROSA MELANO tiene un notable
	
main(){
	int num = 0;
	char nombre[tam]="";
	setlocale(LC_ALL, "spanish");
	
	printf("Introduzca un nombre: \n");
	scanf("%s",&nombre);
	fflush(stdin);
	
	printf("Introduzca la nota: \n");
	scanf("%d",&num);
	fflush(stdin);
	
	switch  (num){
		case 0:		printf("%s tiene un insuficiente",nombre);	break;
		case 1:		printf("%s tiene un insuficiente",nombre);	break;
		case 2:		printf("%s tiene un insuficiente",nombre);	break;
		case 3:		printf("%s tiene un suspenso",nombre);		break;
		case 4:		printf("%s tiene un suspenso",nombre);		break;
		case 5:		printf("%s tiene un suficiente",nombre);	break;
		case 6:		printf("%s tiene un bien",nombre);			break;
		case 7:		printf("%s tiene un notable",nombre);		break;
		case 8:		printf("%s tiene un notable",nombre);		break;
		case 9:		printf("%s tiene un sobresaliente",nombre);	break;
		case 10:	printf("%s tiene un sobresaliente",nombre);	break;
		default: 	printf("%d no es una nota valida",num);		break;
		
		}
}
