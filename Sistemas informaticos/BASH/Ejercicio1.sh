#!/bin/bash
acum=50
i=0
while [ $i -lt $acum ];do
	touch $i.txt
	chmod 777 $i.txt
	i=$((i+1))
done