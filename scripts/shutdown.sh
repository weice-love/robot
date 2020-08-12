#!/bin/bash

pid=$(jps | grep RobotApplication  | awk '{print $1}')

[[ -z "$pid" ]] && echo "No Robot Service found." && exit 0

echo "Trying killing Robot($pid)."
kill -9 $pid

echo "Robot($pid) is killed."
