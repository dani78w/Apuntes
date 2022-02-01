#include <stdio.h>
#include <locale.h>
#define TAM 51

#define randomize (srand(time(NULL)))
int strCuenta(int tam,char arrayF[tam]);
void main(){
		setlocale(LC_ALL, "spanish");
	
	int cont=0;
	int contLetras = 0;
	int contNums = 0;
	int contadorNulls = 0;
	int i = 0;

	int array[TAM]={0};
	gets(array);
	
	printf("Introduzca una frase no mayor a 50 caracteres \n");
	gets(array);
	printf("  la cadena tiene: %d caracteres",strCuenta(TAM,array));
}
int strCuenta(int tam,char arrayF[tam]){
	int contLetras = 0;
	int contNums = 0;
	int contadorNulls = 0;
	int contadorCaracter=0;
	int i = 0;
	
	for(i=0;i<TAM-1;i=i+1){
		if (isalpha(arrayF[i])!=0) {
    		contLetras=contLetras+1;
		} else if (isdigit(arrayF[i])!=0) {
		    contNums=contNums+1;
		} else if(arrayF[i]=""){
		    contadorNulls=contadorNulls+1;
		}
	}
	contadorCaracter=contLetras+contNums;
	printf("\n-->\n  RESULTADO DE LA FUNCIÓN:",contLetras);
	printf("\n  hay %d letras\n",contLetras);
	printf("  hay %d numeros\n",contNums);
	printf("  hay %d valores nullos \n",contadorNulls);
	printf("  hay %d caracteres \n",(contadorNulls-contadorCaracter));
	printf("  La cadena es de %d\n",contLetras+contNums);
	printf("-->\n");
	return contLetras+contNums;
	
}
