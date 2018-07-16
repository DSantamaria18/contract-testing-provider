# contract-testing-provider
Provider example for contract testing demo

This is an example for contract testing (provider part) using Spring Boot and Spring-Cloud-Contract

The provider is a service which requests starship information to SWApi.co and replaces links for pilots and films with the name and the title.

Example:

http://localhost:8080/starship?id=10

{
  "name": "Millennium Falcon",
  "model": "YT-1300 light freighter",
  "manufacturer": "Corellian Engineering Corporation",
  "cost_in_credits": 100000,
  "length": 34.37,
  "max_atmosphering_speed": 1050,
  "crew": 4,
  "passengers": 6,
  "cargo_capacity": 100000,
  "starship_class": "Light freighter",
  "pilots": ["Chewbacca", "Han Solo", "Lando Calrissian", "Nien Nunb"],
  "films": ["The Empire Strikes Back", "The Force Awakens", "Return of the Jedi", "A New Hope"]
}
