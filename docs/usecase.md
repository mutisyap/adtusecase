# Use cases
## Map
- A map is used for key value storage. This is important in **Caching**: Temporarily storing objects in memory. This can be used to speed up access
by not hitting the main storage too many times, and can also serve as storage when doing tests. 
- Challenges:
    * Expiration: Objects have to be manually expired
    * Eviction: If the cache space gets full, the system will crash since the Map interface
    doesn't support eviction strategies.
    * Distribution: The map cannot be shared by different applications.
    * Persistence: The map contents are lost after restart.
    * Memory and CPU Consumption: The map consumes high memory and CPU utilization. Check this comparison I did
    of various caching technologies. [Cache Technology Comparison](https://github.com/mutisyap/cachetest)
    
     
 
 ## List
 - This is very commonly used data structure.
 - We use lists to maintain an ordered collection. This can be important in temporary storage and retrieval of data.
 - Examples:
    - When caching questions asked by each student, we can put them into a list then into a map with key the student email 
    and value List of questions asked.
    - When retrieving many students together for maybe, display on the UI.
   

## Queue
- A queue is most commonly used in a producer consumer model (PCM). A common queue will have
one or many producers adding to its rear and one or many consumers consuming from it's front.


## Set
- A set is commonly used alongside other data structures. The keys and values of a map are stored into a set. 
We retrieve all the values using keySet or valueSet from the map.
- It can also be used to explicitly return unique objects. For example, if we need to get all questions asked 
we could run into a case where multiple users asked the same general question. This question most likely 
deserves one answer.

