#!/bin/bash
#inicializacion de variables

letra="a"

#Primera parte --> Comprobador de "a"

cont=5
for (( i=1; i<=5; i=$i+1))
do
	echo inserte $cont a para comenzar
  read flag
  echo $flag
  if [ $flag == $letra ];
  then
    cont=$(($cont - 1))
  else
		i=0
    cont=5
    echo Insertaste una letra diferente de "a"
  fi
done

#Segunda parte -->
#primer proceso detector de rango
echo inserte el numero menor del rango
  read numMen
  echo $numMen
echo inserte el numero mayor del rango
  read numMay
  echo $numMay
while [ $numMen -gt $numMay ];
do
    echo el orden es erroneo,porfavor vuelva a   introducirlos
  fi
  echo inserte el numero menor del rango
    read numMen

  echo inserte el numero mayor del rango
    read numMay
done
echo el orden es correcto
#segundo proceso generador de primos
i=0
acum=0
for (( i=$numMen; $numMen -le $numMay; i=$i+1))
do
  primo=$i + 2
  if [ $(($primo%$primo)) -eq $numMay ];
  then
  acum=$(($acum+1))
done
echo en el rango hay $acum numeros primos

