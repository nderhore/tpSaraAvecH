@echo off
call mvn clean package
call docker build -t com.coffee.jee/coffee .
call docker rm -f coffee
call docker run -d -p 9080:9080 -p 9443:9443 --name coffee com.coffee.jee/coffee