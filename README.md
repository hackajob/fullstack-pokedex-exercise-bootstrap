**Notes:**
* After you make any change you need to restart the application using the **Build & Restart application** command from the second item from the right side bar
* If you want to test the APIs from your local machine, you can find the URL in the right sidebar after you click on the first item
* Make sure to run test cases using **Run Test** button in order to validate your solution

### REST Endpoint
There is a ```PokedexController``` class in the project, leveraging Spring:
  
1. Register ```PokedexService``` as a service so it can be autowired
2. Register ```PokedexController``` as a REST controller so it is detected by the ApplicationContext
3. Add the endpoint **GET** `/pokemon/name/{name}` to the controller that allows pokemons to be RESTfully returned via the ```PokedexService``` service implemented earlier. The response is a JSON with all the details about the pokemon requested.
```json
{
   "id":1,
   "name":{
      "english":"Bulbasaur",
      "japanese":"フシギダネ",
      "chinese":"妙蛙种子",
      "french":"Bulbizarre"
   },
   "type":[
      "Grass",
      "Poison"
   ],
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

### PokedexService
There is a JSON file *pokedex.json* with all the pokemons available. This service will accept the pokemon name in english as parameter, and it will return all the details about the pokemon received.
  
### Test cases
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
   "type":[
      "Grass",
      "Poison"
   ],
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
    "type": [
      "Water"
    ],
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
  
### Reason  
Open the file `SOLUTION.md` and:
1. Explain how your implementation works
2. If you were given more time, how might you change your implementation to be better?

**Notes:**
* After you make any change you need to restart the application using the **Build & Restart application** command from the second item from the right side bar
* If you want to test the APIs from your local machine, you can find the URL in the right sidebar after you click on the first item
* Make sure to run test cases using **Run Test** button in order to validate your solution
