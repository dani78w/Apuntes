#include <stdio.h>
#include <locale.h>
#include <string.h>
struct st{
    char var1[10];
    char var2[10];
    char var3[10];
};
struct st st1;

int main(){
    //inicialización
    setlocale(LC_ALL, "spanish");
    int flag = 0;
    int array[10]={0};
    struct st st1;
    FILE*fich;
    fich=fopen("fich.bin","wb+");

    //rellenar el fichero
    printf("introduzca una cadena de maximo 10 caracteres\n");
    scanf("%s",&st1.var1);
    fflush(stdin);
    printf("introduzca una cadena de maximo 10 caracteres\n");
    scanf("%s",&st1.var2);
    fflush(stdin);
    printf("introduzca una cadena de maximo 10 caracteres\n");
    scanf("%s",&st1.var3);
    fflush(stdin);

    //solicitar una cadena por teclado
    printf("introduzca una cadena que quieras comparar\n");
    scanf("%s",array);
    fflush(stdin);


    //siempre que no estemos en el final abanza un fichero por cada iteración y analiza si se encuentra la cadena
    int i=0;
    do {
        fseek(fich,sizeof(st1)+i,0);
        strcasecmp(st1.var1,st1.var1);
        strcasecmp(st1.var2,st1.var2);
        strcasecmp(st1.var3,st1.var3);

        if(strcmp(array,st1.var1)==1){
            printf("se encuentra ");
            flag=flag+1;
        }else if(strcmp(array,st1.var1)==1){
            printf("se encuentra ");
            flag=flag+1;
        }else if (strcmp(array,st1.var2)==1){
                printf("se encuentra ");
            flag=flag+1;
        }else{
            printf("aun no se ha encontrado ");
        };


    }while(feof(fich)==0);

    if(flag>1){
        printf("cadena: %s",array);
        printf("la cadena ha sido encontrada %d veces",flag);
        }

    fwrite(&st1,sizeof(st1),1,fich);
    fclose(fich);

}
