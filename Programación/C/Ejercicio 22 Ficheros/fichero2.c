#include <stdlib.h>
#include <stdio.h>
#include <locale.h>
#include <string.h>

	struct cd{
			char 	cabSum[6];
			short	sum;
			short	numSum1;
			short	numSum2;
			char	cabRes[6];
			short	res;
			int		numRes1;
			int		numRes2;
			char	cabMult[6];
			int		mult;
			int		numMult1;
			int		numMult2;
			
	
		};
	struct cd cd1;

	

void main(){
	FILE*fich;

	
//leer valores
	fich=fopen("txt2.txt","rb");
	fread(&cd1,sizeof(cd1),1,fich);

	printf(" %s\n",cd1.cabSum);
		int sum = 0;
		sum=cd1.numSum1+cd1.numSum2;
		printf("  %hd\n ",sum);
		

	printf("%s\n",cd1.cabRes);
		int res = 0;
		res=cd1.numRes1-cd1.numRes2;
		printf("  %hd\n ",res);
		

	printf("%s\n",cd1.cabMult);
		int mult = 0;
		mult=cd1.numMult1*cd1.numMult2;
		printf("  %hd\n ",mult);
		
	fclose(fich);
	
//insertar valores;
	fich=fopen("txt2.txt","wb");
	strcpy(cd1.cabSum,"Suma: ");
	strcpy(cd1.cabRes,"Resta: ");
	strcpy(cd1.cabMult,"Multi: ");
		
	cd1.sum=sum;
	cd1.res=res;
	cd1.mult=mult;
	

	cd1.numSum1=1;
	cd1.numSum2=4;
	cd1.numRes1=1;
	cd1.numRes2=4;
	cd1.numMult1=2;
	cd1.numMult2=3;
	
	fwrite(&cd1,sizeof(cd1),1,fich);


	

	


	
	fclose(fich);
	
	//segunda parte

	
};

