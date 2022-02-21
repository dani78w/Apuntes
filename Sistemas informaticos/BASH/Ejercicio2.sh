#!/bin/bash
echo "Raid 1 o Raid 0 --- (Seleccione : 0 o 1)"
read raid
echo "has seleccionado: Raid $raid"

echo "Introduzca el número de discos"
read discos
echo "has seleccionado: $discos discos"

i=0
for (( i=0; i<$discos; i++ )); do
	mkdir -p $i
	chmod 777 $i
	echo vuelta $i
done
j=0
i=0
if [ $raid -eq 0 ];then
	echo ---RAID 0---
	
	for (( i=0; i<50; i++ )); do
	
		echo muevo el archivo $i.txt a la ruta /$j
		cp $i.txt $j
		
		if [ $j -lt $(($discos-1))   ];then
			j=$(($j+1))
		else
			j=0
		fi
		
	done
	
else

	echo ---RAID 1---
	
	for (( i=0; i<50; i++ )); do
	
		
			for (( j=0; j<$discos; j++ )); do
				echo muevo el archivo $i.txt a la ruta /$j
				cp $i.txt $j

			done
			echo 
		
		
		
	done
fi