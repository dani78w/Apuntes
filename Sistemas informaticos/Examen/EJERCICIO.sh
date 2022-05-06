#!/bin/bash
cd ~/Descargas

echo "NOMBRE DE LA CARPETA: "
read dirName
mkdir $dirName
chmod 777 $dirName

echo "NUMERO DE CARPETAS: "
read j

cd ~/Descargas/$dirName
for (( i=0; i<$j; i++ )); do 
	echo "nombre de la carpeta $i"
	read dirName
	mkdir $dirName
	chmod 777 $dirName
done


echo "DESEA CREAR FICHEROS  (0 NO , 1 SI)"
read opt

while [ $opt -eq 1 ]
do
	if [ $opt -eq 1 ];then
		cd ~/Descargas/$dirName
		echo "en que carpeta desea crearlos"
		read subName
		cd $subName
		
	
		echo "CUANTOS FICHEROS DESEA?: "
		read j
		
		for (( i=0; i<$j; i++ )); do 

			echo "nombre con extension del fichero"
			read fichName
			touch $fichName
			chmod 777 $fichName
		done
		
	fi
	echo "DESEA CREAR MAS FICHEROS  (0 NO , 1 SI)"
	read opt
done

cd ~/Descargas/$dirName
tree 

	
	