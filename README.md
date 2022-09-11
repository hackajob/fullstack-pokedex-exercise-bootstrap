**Notes:**
* After you make any change you need to restart the applications using the **Build & Restart applications** command from the second item from the right sidebar
* If you want to test the APIs or the frontend app from your local machine, you can find the URL in the right sidebar after you click on the first item
* If you want to see the logs you can use the **Show backend logs** or **Show frontend logs** commands from the second item from the right sidebar
* Make sure to run test cases using **Run Test** button in order to validate your solution
   
Your task is to create the following backend and frontend applications. Please read the instructions and run the tests as many times as possible in order to validate your solution.
&nbsp;  
&nbsp;   
## Backend Application
There is a ```PokedexController``` class in the project, leveraging Spring:
  
1. Register ```PokedexService``` as a service so it can be autowired
2. Register ```PokedexController``` as a REST controller so it is detected by the ApplicationContext
3. Add the endpoint **GET** `/pokemon/name/{name}` to the controller that allows pokemons to be RESTfully returned via the ```PokedexService``` service implemented earlier. The response is a JSON with all the details about the pokemon requested
```json
{
   "id":1,
   "name":{
      "english":"Bulbasaur",
      "japanese":"フシギダネ",
      "chinese":"妙蛙种子",
      "french":"Bulbizarre"
   },
   "base":{
      "HP":45,
      "Attack":49,
      "Defense":49,
      "Sp. Attack":65,
      "Sp. Defense":65,
      "Speed":45
   }
}
```
  
#### PokedexService ####
There is a JSON file *src/main/resources/pokedex.json* with all the pokemons available. This service will accept the pokemon name in english as parameter, and it will return all the details about the pokemon received.
  
#### Test cases ####
There is a ```PokedexServiceTest``` class, it has the following two example pokemons declared as statics. Make sure to implement tests using these example names:  
  
* Bulbasaur
```json
{
   "id":1,
   "name":{
      "english":"Bulbasaur",
      "japanese":"フシギダネ",
      "chinese":"妙蛙种子",
      "french":"Bulbizarre"
   },
   "base":{
      "HP":45,
      "Attack":49,
      "Defense":49,
      "Sp. Attack":65,
      "Sp. Defense":65,
      "Speed":45
   }
}
```
* Wartortle
```json
 {
    "id": 8,
    "name": {
      "english": "Wartortle",
      "japanese": "カメール",
      "chinese": "卡咪龟",
      "french": "Carabaffe"
    },
    "base": {
      "HP": 59,
      "Attack": 63,
      "Defense": 80,
      "Sp. Attack": 65,
      "Sp. Defense": 80,
      "Speed": 58
    }
  }
```
  
#### Reason ####
Open the file `backend/SOLUTION.md` and:
1. Explain how your implementation works
2. If you were given more time, how might you change your implementation to be better?
&nbsp;  
&nbsp;   
## Frontend Application
Build a search application in React that is using the API created before in order to see details about Pokemons.  
Create it using the folowing requirements:  
- Provide a HTML textbox with `pokemon-name` id for capturing the name of a new pokemon
   
- Create a `clickable` element with `search-pokemon` id; by clicking this element, the pokemon details are displayed
   
- Create a validation rule to prevent searching pokemons without a name
   
- Each pokemon item container must have a `pokemon-item` class:
```html
<div class="pokemon-item"></div>
```
   
- Inside of each pokemon item container must have the following items:
    * Name in a container with class `name`
    * HP in a container with class `hp`
    * Attack in a container with class `attack`
    * Defense in a container with class `defense`
    
#### Reason ####
Open the file `frontend/SOLUTION.md` and:
1. Explain how your implementation works
2. If you were given more time, how might you change your implementation to be better?
  
**Notes:**
* After you make any change you need to restart the applications using the **Build & Restart applications** command from the second item from the right sidebar
* If you want to test the APIs or the frontend app from your local machine, you can find the URL in the right sidebar after you click on the first item
* If you want to see the logs you can use the **Show backend logs** or **Show frontend logs** commands from the second item from the right sidebar
* Make sure to run test cases using **Run Test** button in order to validate your solution
