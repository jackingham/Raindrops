<h1>Raindrops</h1>
A little program that uses basic programming and testing

## Requirements


``` 
Write a function that takes as its input a number (n) and converts it to a string, the contents of which depend on the numbers factors

- if the number has a factor of 3, output 'Pling'
- if the number has a factor of 5, output 'Plang'
- if the number has a factor of 7, output 'Plong'
- if the number does not have any of the above as a factor simply return the numbers digits

```

## Technologies Used
- ![JDK_11_badge](https://img.shields.io/badge/JDK%2011-ED8B00?style=for-the-badge&logo=java&logoColor=white)
- ![maven_badge](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache%20maven&logoColor=white)
- ![junit_badge](https://img.shields.io/badge/JUnit%205-25A162?style=for-the-badge&logo=junit5&logoColor=white)
- ![cucumber_badge](https://img.shields.io/badge/-Cucumber-23D96C?style=for-the-badge&logo=cucumber&logoColor=fff)

## Approach
I programmed this function inside it's own Java class. As it is a function as I am assuming that only ints are passed in validly. I wrote a null test but the tests will not compile as it could be null. The program cannot be run itself as it is just a method. It is called from within the JUnit test bed to test the functionality. I also added a BDD layer using Cucumber to test using gherkin syntax, which allowed me to reuse parameterised statements to aid testing.

## Test case table  

|**n**|Multiple of 3|Multiple of 5|Multiple of 7|Return|
|---|---|---|---|---|
|3|y|||Pling
|5||y||Plang
|7|||y|Plong
|15|y|y||PlingPlang
|21|y||Y|PlingPlong
|35||y|y|PlangPlong
|105|y|y|y|PlingPlangPlong
|0|y|y|y|PlingPlangPlong
|2||||2
|-105|y|y|y|PlingPlangPlong




