# Docker

Basic Command
## Docker Build

Docker build with Tag.

```bash
docker build -t my-app .
```

## Docker Run

Docker run with port
```
docker run -p 8090:8090 my-app
```

showing  running container
```
docker ps
```

showing  all container
```
docker ps -a
```

docker start the container
```
docker start <Container_id>
```

check the app :
```
http://localhost:8090/docker-hello/get/msgs --> hello
```


