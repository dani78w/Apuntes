#include <stdio.h>
#include <locale.h>
//pedir Código, salario ,"Empleado con CÓDIGO y SALARIO actual, Salario nuevo_xxx;
// de 0 a 1000 se aumenta un 20 porciento
// de 1000 a 3000 se aumenta un 10 porciento
// de 3000 a 5000 se aumenta un 5 porciento
// de 5000 a + se aumenta un 2 porciento
main(){
	//declaracion e inicialización de variables
	setlocale(LC_ALL, "spanish");
	float salario = 0 ;char codigo[16]="";char flag =' ';
	//proceso
	
			//---------Introducción de datos----------------------------
			do{	
				printf("Introduzca el código del empleado: \n");
					scanf("%s",codigo);
					fflush(stdin);    
				while(salario<=0){				                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
					printf("Introduzca el salario actual del empleado: \n");
					scanf("%f",&salario);
					fflush(stdin);
					if(salario<0){
					printf("Introduzca un valor correcto\n ");
					}					
				}

			//---------Calculos-----------------------------------------
			printf("-----------------------------------------\n");
			printf("Empleado con codigo %s:\n",codigo);
			printf("Tenia un salario de %.2f \n",salario);
					if(salario<=0)
						printf("%.2f no es un salario posible \n",salario);
					else if(salario>0&&salario<=1000)
						printf("Ahora tiene un salario de %.2f \n",salario+salario*0.2);
					else if	(salario>=1000&&salario<=3000)
						printf("Ahora tiene un salario de %.2f \n",salario+salario*0.1);
					else if	(salario>=3000&&salario<=5000)
						printf("Ahora tiene un salario de %.2f \n",salario+salario*0.05);
					else if	(salario>5000)
						printf("Ahora tiene un salario de %.2f \n",salario+salario*0.02);
						
			//---------salir---------------------------------------------			
			do{
				printf("Desea continuar?(y/n): ");
				scanf("%c",&flag);
				fflush(stdin);
				if(flag!='y'&&flag!='Y'&&flag!='n'&&flag!='N')
				printf("Introduzca un valor correcto\n\n ");
			}while(flag!='y'&&flag!='Y'&&flag!='n'&&flag!='N');
			salario = 0;
				
		}while(flag=='y'|flag=='Y');
			
	return 0;
}
