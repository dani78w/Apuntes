//librerias y constantes
	#include <stdio.h>
	#include <locale.h>
	#define tam 30
	//pedir nomrbre alumno:
	//pedir nota:7 --> tiene un notable
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
	
	if (num == 0)
		printf("%s tiene un insuficiente",nombre);
	else
		if (num == 1 )
			printf("%s tiene un insuficiente",nombre);
			else
				if (num == 2 )
					printf("%s tiene un insuficiente",nombre);
				else
					if (num == 3 )
						printf("%s tiene un suspenso",nombre);
					else
						if (num == 4 )
							printf("%s tiene un suspenso",nombre);
						else
							if (num == 5 )
								printf("%s tiene un aprobado",nombre);
							else
								if (num == 6 )
									printf("%s tiene un bien",nombre);
								else
									if (num == 7 )
										printf("%s tiene un notable",nombre);
									else
										if (num == 8 )
											printf("%s tiene un notable",nombre);
										else
											if (num == 9 )
												printf("%s tiene un sobresaliente",nombre);
												else
												if (num == 10 )
													printf("%s tiene un sobresaliente",nombre);
												
		
}

