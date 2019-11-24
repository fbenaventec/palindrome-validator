# palindrome-validator
Basic algorithm to check that string is a palindrome 

## How to test this program
There are two ways for execute this program:
 - Offline
 - Online

### Offline
To execute offline it's necessary package the program with maven and run with java:

**NOTE this program works with Java 11**
```shell script
# Sample with text ABBA
java -jar target/palindrome-validator-1.0-SNAPSHOT.jar ABBA
```

### Online
To execute this program online execute a HTTP call to:
 - **url:** https://l45h8g1103.execute-api.eu-west-3.amazonaws.com/release/palindrome-validation
 - **method:** POST
 - **body:** Text to check 

```shell script
# Sample with text ABBA
curl -X POST \
  https://l45h8g1103.execute-api.eu-west-3.amazonaws.com/release/palindrome-validation \
  -d '"ABBA"'
```