#!/bin/bash

[ $(which greadlink | wc -l) -gt 0 ] && readlink(){ greadlink $@ ; } && echo "Enable GUN readlink"

cpath=$(dirname $(readlink -f $0)) \
|| ( echo 'Make sure you have GUN type of readlink.' && exit 99 ) || exit 99

JAVA_HEAP_SIZE=${JAVA_HEAP_SIZE:-1G}

cd $cpath/lib

cp="../classes"
for i in $(ls ./); do cp="$cp:$i"; done

log=$cpath/log/robot.log

if [ "$1" = "console" ]; then
    java \
    -Xms$JAVA_HEAP_SIZE -Xmx$JAVA_HEAP_SIZE \
    -cp $cp \
    cn.weicelove.robot.RobotApplication
else
    java \
    -Xms$JAVA_HEAP_SIZE -Xmx$JAVA_HEAP_SIZE \
    -cp $cp \
    cn.weicelove.robot.RobotApplication \
    &
    echo "Robot Service started. Please check log file \n tail -1000f $log"
fi