#include <stdio.h>
#include<locale.h>
#define TAM 6
void main(){
	int cont=0;
	int i=0;
	int array[TAM]={0};
	printf("introduce un array de %d caracteres\n",TAM);
	gets(array);

	cont=TAM;
	int flag =0;
	for(i=0;i<TAM;i=i+1){
		if(array[i]!=array[TAM]){
			flag=flag+1;
		}
	}
	if(flag==0){
		printf("\nno es palindromo");
	}else{
		printf("\nes palindromo");
	}
}
