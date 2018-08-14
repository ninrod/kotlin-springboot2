# kotlin-springboot2

* the idea is to assemble a full working stack using kotlin/springboot2 as a rest api server talking to a postgresql db using the latest and greatest comming from the java framework land. We'll use angular7 for the frontend served by nginx, our reverse proxy of choice. 

## stack

* reverse proxy: nginx
* frontend: angular7
* backend: kotlin with springboot2 running on openjdk
* db: postgresql
* tests: junit5 and mockito
* logging: logback

## build

    gradle build

## run

    make
    
* then open your brower on http://localhost:8080

## LICENSE

[GNU General Public License v3](https://www.gnu.org/licenses/gpl-3.0.en.html)

Copyright (c) 2018 Filipe Silva (ninrod)
