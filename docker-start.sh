echo "build de l'api"
cd ./articles-back && mvn clean package
echo "build du front"
cd ../articles-front && ng build
echo "lancement du docker-compose"
cd .. && docker-compose up --build