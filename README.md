# palindrome-validator
Basic algorithm to check that string is a palindrome.

This program contains two implementation:
 - The first one it's the simplest, implemented with java utilities
 - The second one it's more basic implementation: it does not contains java utilities to process the string.

With the second implementation I try to improve the efficiency of the code. But I didn't. 

The times of the second process are similar to the first one, even time is worse.

Following the Big O notation the cost of this method is O(n).

## How to test this program
There are two ways for execute this program:
 - Offline
 - Online

### Offline
To execute offline it's necessary package the program with maven and run with java:

**NOTE this program works with Java 11**
```shell script
# Sample with text ABBA and SIMPLE implementation (using java utilities)
java -jar target/palindrome-validator-1.0-SNAPSHOT.jar SIMPLE ABBA
# Sample with text ABBA and BASIC implementation (without java utilities)
java -jar target/palindrome-validator-1.0-SNAPSHOT.jar BASIC ABBA
```

### Online
To execute this program online execute a HTTP call to:
 - **url:** https://l45h8g1103.execute-api.eu-west-3.amazonaws.com/release/palindrome-validation
 - **method:** POST
 - **body:** Json with two parameters: method (SIMPLE/BASIC) and text. Two methods are mandatory. 

```shell script
# Sample with text ABBA and SIMPLE method
curl -X POST \
  https://l45h8g1103.execute-api.eu-west-3.amazonaws.com/release/palindrome-validation \
  -H 'content-type: application/json' \
  -d '{"method": "SIMPLE", "text": "ABBA"}'
# Sample with text ABBA and SIMPLE method
curl -X POST \
  https://l45h8g1103.execute-api.eu-west-3.amazonaws.com/release/palindrome-validation \
  -H 'content-type: application/json' \
  -d '{"method": "BASIC", "text": "ABBA"}'
```