#!/usr/bin/env

java -jar -Xdebug -Xnoagent -Xrunjdwp:transport=dt_socket,address=58000,server=y,suspend=n /idea-docker-plugin-usage.jar --server.port=58080