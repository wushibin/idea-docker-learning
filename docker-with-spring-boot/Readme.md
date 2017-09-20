# Problems

## Docker fails to connect via unix:// on Mac OS X

https://youtrack.jetbrains.com/issue/IDEA-153973

socat TCP-LISTEN:2375,reuseaddr,fork,bind=localhost UNIX-CONNECT:/var/run/docker.sock

tcp://localhost:2375


## Add the arguments to the startup.sh to enable debuging
