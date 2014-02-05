#!/bin/bash

COUNTER=1
while [ 1 ]
do
   echo "-----------------------"
   echo "Build number: $COUNTER"
   echo "-----------------------"
   sbt clean compile || exit $?
   COUNTER=$[$COUNTER +1]
done
