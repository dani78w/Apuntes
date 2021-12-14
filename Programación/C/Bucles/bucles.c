	#include <stdio.h>
	#include <locale.h>
	#define max 10
	main(){
		short i = 0;
		setlocale(LC_ALL, "spanish");

		//mientras
		i = 0;
		printf("Mientras:\n");
		while(i<=max){
			printf("%hd\n",i);
			i = i+1;
			}
		system("pause");
		system("cls");
	
		//repetir MIENTRAS
		i = 0;
		printf("Repetir mientras:\n");
		do{
			printf("%hd\n",i);
			i = i+1;
		}while(i<=max);
			system("pause");
			system("cls");
		//PARA
		printf("Para:\n");
		for(i=0;i<=max;i=i+1){
			printf("%hd\n",i);
		
		}
	
		
		return 0;
		
	}
	//system("index.html"); cosa chula :)
