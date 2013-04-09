#!/bin/bash

x=0
while [ $x = 0 ]
do
	clear
	echo "Do you like this (y/n) - Press q for quit."
	read answer

	case "$answer" in
		y)
		echo "You said Yes!"
		x=1
		;;
		n)
		echo "You said No!"
		x=1
		;;
		q)
		echo "Exiting..."
		x=1
		sleep 3
		;;
		*)
		clear 
		echo "This is not an option"
		sleep 3
	esac


done

