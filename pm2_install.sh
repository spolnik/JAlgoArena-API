#!/usr/bin/env bash
pm2 stop api
pm2 delete api
./gradlew clean
./gradlew stage
pm2 start pm2.config.js