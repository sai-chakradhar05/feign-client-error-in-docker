I have created two basic microservices where "micro-service-2" communicates with "micro-service-1" using feign client.
The code is working fine in my system. But error occures when i containerized the application throught(Note:Docker containers are running on same netwoerk)

Error Message--->feign.RetryableException: Connection refused executing GET http://Ms1-Demo/ms1/hello]
