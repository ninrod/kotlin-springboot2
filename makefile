up:
	docker-compose up -d

db:
	docker-compose up -d db

down:
	docker-compose down && docker-compose rm

build:
	gradle build -x test


