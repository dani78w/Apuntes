#include <stdio.h>
#include <locale.h>
#include <ctype.h>
#define TAM 50
#define TAM2 9
int strCuenta(int tam,char arrayF[tam]);
void parametro(int tam2,int array2F[tam2],int num);
void main(){
	setlocale(LC_ALL, "spanish");
	int cont=0;
	int i=0;
	char array[TAM]={"0"};
	int  array2[TAM2]={1,3,4,1,3,4,1,3,4};
	
	printf("Introduzca una frase no mayor a 50 caracteres \n");
	gets(array);
	printf("  la cadena tiene: %d caracteres",strCuenta(TAM,array));
}
int strCuenta(int tam,char arrayF[tam]){
	int contLetras = 0;
	int contNums = 0;
	int contadorNulls = 0;
	int i = 0;
	
	for(i=0;i<TAM;i=i+1){
		if (isalpha(arrayF[i])!=0) {
    		contLetras=contLetras+1;
		} else if (isdigit(arrayF[i])!=0) {
		    contNums=contNums+1;
		} else {
		    contadorNulls=contadorNulls+1;
		}
	}
	
	printf("\n-->\n  RESULTADO DE LA FUNCIÓN:",contLetras);
	printf("\n  hay %d letras\n",contLetras);
	printf("  hay %d numeros\n",contNums);
	printf("  hay %d valores nullos \n",contadorNulls);
	printf("  La cadena es de %d\n",contLetras+contNums);
		printf("-->\n");
	return contLetras+contNums;
	
}
void parametro(int tam2,int array2F[tam2],int num){
	int e=0;
	int cero=0,uno=0,dos=0,tres=0,cuatro=0,cinco=0,seis=0,siete=0,ocho=0,nueve=0;
	for(e=0;e<tam2;e=e+1){
		if(array2F[e]==0){
			cero=cero+1;
		}else if(array2F[e]==1){
			uno=uno+1;
		}else if(array2F[e]==2){
			dos=dos+1;
		}else if(array2F[e]==3){
			tres=tres+1;
		}else if(array2F[e]==4){
			cuatro=cuatro+1;
		}else if(array2F[e]==5){
			cinco=cinco+1;
		}else if(array2F[e]==6){
			seis=seis+1;
		}else if(array2F[e]==7){
			siete=siete+1;
		}else if(array2F[e]==8){
			ocho=ocho+1;
		}else if(array2F[e]==9){
			nueve=nueve+1;
		}
	}
}

