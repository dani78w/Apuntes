       //librerias y constantes
	    	#include <stdio.h>
	    	#include <locale.h>
	    	#include <string.h>
	    //prototipado de funciones y procedimientos
	    	int inputPositivo();
	    	int comparadorNum(int x,int y);
	    	void comparacionProced();
	    //programa principal
    	main(){
    		int num1=50;
    		int num2=40;
    		setlocale(LC_ALL, "spanish");
    		//funcion1 + comprobación
	    		if(inputPositivo()>0){
	    			printf("la funcion es correcta\n\n");
				}
			//funcion2
    			printf("El mayor de los numero guardados es  %d \n\n",comparadorNum(num1,num2));
    		//procedimiento1
    			comparacionProced();
		}
		//definicion de funciones y procedimientos
			int inputPositivo(){
				int x;	x=0;
				do{
					printf("Introduce un número POSITIVO \n");	
					scanf("%d",&x);
		   			fflush(stdin);
				}while(x<0);
					}
					
			int comparadorNum(int x,int y){
					
		   		if(x>y){
				   return(x);
				   }else if(x<y){return(y);
				   		}else if(x==y){return(x);
				   			}
			}			
			
			void comparacionProced(){
			int x;	x=0;
			int y;	y=0;
			do{
				printf("Introduce un número POSITIVO \n");	
				scanf("%d",&x);
	   			fflush(stdin);
			}while(x<0);
			do{
				printf("Introduce otro numero POSITIVO \n");	
				scanf("%d",&y);
	   			fflush(stdin);
			}while(x<0);
			
			if(x>y){
			   printf("El mayor es %d\n",x);
			   }else if(x<y){printf("El mayor es %d\n",y);
			   		}else if(x==y){printf("son iguales\n");
			   			}

		}
