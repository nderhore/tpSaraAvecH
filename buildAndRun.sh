#!/bin/sh
mvn clean package && docker build -t com.coffee.jee/coffee .
docker rm -f coffee || true && docker run -d -p 9080:9080 -p 9443:9443 --name coffee com.coffee.jee/coffee