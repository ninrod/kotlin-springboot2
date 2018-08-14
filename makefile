up:
	docker-compose up -d && docker logs server -f

db:
	docker-compose up -d db

down:
	docker-compose down && docker-compose rm


