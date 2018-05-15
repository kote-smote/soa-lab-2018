#!/bin/bash

echo "building login docker image"
cd login
./mvnw install dockerfile:build -DskipTests=true
cd ..

echo "building recruitment docker image"
cd recruitment
./mvnw install dockerfile:build -DskipTests=true
cd ..

echo "building demo-app docker image"
cd demo-app
./mvnw install dockerfile:build -DskipTests=true
cd ..

echo "building eureka-server docker image"
cd eureka-server
./mvnw install dockerfile:build -DskipTests=true
cd ..

echo "building zuul docker image"
cd zuul
./mvnw install dockerfile:build -DskipTests=true
cd ..

echo "building gateway docker image"
cd gateway
./mvnw install dockerfile:build -DskipTests=true
cd ..


echo "You are ready to start docker-compose: docker-compose up"
