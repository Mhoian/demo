#!/usr/bin/env bash
docker-compose -f SeleniumHub.yml up --scale chrome=4 -d
mvn clean test -Denv $1
errorCode=$? # save the exit code as the first thing done in the trap function
docker-compose -f SeleniumHub.yml down
exit $errorCode
