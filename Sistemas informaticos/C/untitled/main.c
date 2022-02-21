#include <time.h>
#include <stdio.h>
#include <locale.h>
void main(){

    setlocale(LC_ALL, "spanish");

    time_t fecha=0;
    struct tm fechaIni;
    struct tm fechaFin;
    //se piden las fechas iniciales
        printf("Dime el dia inicial:");
            scanf("%d",&fechaIni.tm_mday);
            fflush(stdin);

        printf("Dime el mes inicial:");
            scanf("%d",&fechaIni.tm_mon);
            fflush(stdin);

        printf("Dime el año inicial:");
            scanf("%d",&fechaIni.tm_year);
            fflush(stdin);
    //se normalizan las fechas
        fechaIni.tm_mday=fechaIni.tm_mday;
        fechaIni.tm_mon=fechaIni.tm_mon-1;
        fechaIni.tm_year=fechaIni.tm_year-1900;
        fechaIni.tm_hour=0;
        fechaIni.tm_min=0;
        fechaIni.tm_sec=0;
        fechaIni.tm_isdst=0;

    //se piden las fechas finales
        printf("Dime el dia final:");
            scanf("%d",&fechaFin.tm_mday);
            fflush(stdin);

        printf("Dime el mes final:");
            scanf("%d",&fechaFin.tm_mon);
            fflush(stdin);

        printf("Dime el año final:");
            scanf("%d",&fechaFin.tm_year);
            fflush(stdin);
    //se normalizan las fechas
        fechaFin.tm_mday=fechaFin.tm_mday;
        fechaFin.tm_mon=fechaFin.tm_mon-1;
        fechaFin.tm_year=fechaFin.tm_year-1900;
        fechaFin.tm_hour=0;
        fechaFin.tm_min=0;
        fechaFin.tm_sec=0;
        fechaFin.tm_isdst=0;

    //mktime pasa las fechas a segundos
    fecha=mktime(&fechaFin)-mktime(&fechaIni);
    //paso los segundos a días
    fecha=fecha/(3600*24);

    printf("Los dias que faltan es %d",fecha);
    char buffer[6];
    strftime(buffer,6,"%h:%m",fecha);
}