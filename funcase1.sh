#!/bin/bash

x=0

function apple() {
	clear
	echo "which color apple do you like"
	read color

		case "$color" in
		[Rr]ed) echo "Good, i like red apple too"
		x=1;;
		[Bb]lue) echo "oh, really do you like blue?"
		x=1;;
		*)
		clear 
		echo "This is not an option dude!"
		sleep 3
		;;
		esac
}

while [ $x = 0 ]
do
	clear
	echo  "Do you like Apple or Bananas?"
	read fruit

	case "$fruit" in
		[Aa]pple)
		echo "You said Apple!"
		sleep 3
		apple
		;;
		[Bb]ananas)
		echo "You said Bananas"
		x=1	
		;;
		*)
		echo "This is not an option"
		sleep 3
		;;
	esac
done

