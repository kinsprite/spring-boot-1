
```shell
docker build -t restdemo:latest .

docker run --rm -d  -p 8080:8080/tcp restdemo:latest

curl 127.0.0.1:8080/greeting?name=Tom
```
