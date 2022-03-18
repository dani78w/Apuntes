
#include <stdio.h>
#include <locale.h>
#include <string.h>
struct alumno{
    char nombre[50];
    int edad;
    float peso;
}alumno1={"Dani",19,73.4},alumno2={};

void main(){
    setlocale(LC_ALL, "spanish");
    strcpy(alumno2.nombre,"Lucía");
    printf("%s",alumno2.nombre);
}
