up:
	docker-compose up -d && docker logs server -f

down:
	docker-compose down && docker-compose rm

