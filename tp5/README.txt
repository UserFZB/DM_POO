1/2

ETAPE 3:

— Web		: Il permet de définir et d'exécuter des enchaînements des pages dans une application web. 
— JPA		: fournit une implémentation de la couche d’accès aux données pour une application Spring.
— Hibernate	: est un framework Java qui fournit un mappage objet-relationnel et permet la persistance et l'extraction de données du base de données.
— H2		: un système de gestion de base de données relationnelles en Java.
— DevTools	: inclut un serveur LiveReload intégré qui permet à l'application de déclencher automatiquement une actualisation du navigateur chaque fois que les choses changent.
— Thymeleaf	: est un moteur de template en Java sous licence Apache pouvant générer du XML/XHTML/HTML5. 
			  Son but principal est d'être utilisé dans un environnement web pour la génération de vue pour les applications web basées sur le modèle MVC (peut être utilisé dans un environnement non web). 

ETAPE 13:

1. Avec quelle partie du code avons-nous paramétré l’url d’appel /greeting ?
-> @GetMapping("/greeting") dans HelloWorldController.java.

2. Avec quelle partie du code avons-nous choisi le fichier HTML à afficher ?
-> return "greeting"; dans HelloWorldController.java.

3. Comment envoyons-nous le nom à qui nous disons bonjour avec le second lien ?
-> model.addAttribute("nomTemplate", nameGET); dans HelloWorldController.java.
 
ETAPE 17:
Dans la console de H2 on remarque la création de la table Address.

ETAPE 18:
Puisqu'on a créé la classe Adress avec l'annotation @Entity, le framework crée automatiquement une table dans la BDD qui apparait dans la console H2.

ETAPE 20:
SELECT * FROM ADDRESS;

ID  	CONTENT  								CREATION  
1		57 boulevard demorieux					2020-12-31
2		51 allee du gamay, 34080 montpellier	2020-12-31

On remarque que les requêtes INSERT dans data.sql ont été executé.

ETAPE 23:
@Autowired permet de faire l’injection de dépendances entre les beans de l’application.

ETAPE 30:
Ajoute des dépendances dans pom.xml.

2/2

ETAPE 6:
— Faut-il une clé API pour appeler OpenWeatherMap ?
-> Oui on est besoin d'une clé pour appeler l'API OpenWeatherMap.

— Quelle URL appeler ?
-> https://api.openweathermap.org/data/2.5/onecall?lat={lat}&lon={lon}&exclude={part}&appid={API key}

— Quelle méthode HTTP utiliser?
-> HTTP GET

— Comment passer les paramètres d’appels ?
-> On les passe dans l'url:
"https://api.openweathermap.org/data/2.5/onecall?lat="+x+"&lon="+y+"?lang=fr&exclude=hourly&exclude=daily&exclude=flags&units=si"+"115a9df082c9aa903a16b4d508c544d9"

— Où est l’information dont j’ai besoin dans la réponse:
	— Pour afficher la température du lieu visé par les coordonnées GPS
	-> ${meteo.currentParameters.temperature}
	— Pour afficher la prévision de météo du lieu visé par les coordonnées GPS
	-> ${meteo.currentParameters.summary}