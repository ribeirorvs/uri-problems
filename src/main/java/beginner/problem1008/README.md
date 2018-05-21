# Problem 1008 - Salary

## Details

@Author Neilor Tonin (adapted)

@URL https://www.urionlinejudge.com.br/judge/en/problems/view/1008

@Timelimite 1

## Description

Write a program that reads an employee's number, his/her worked hours number in a month and the amount he received per hour. Print the employee's number and salary that he/she will receive at end of the month, with two decimal places.

- Don’t forget to print the line's end after the result, otherwise you will receive “Presentation Error”.
- Don’t forget the space before and after the equal signal and after the U$.

### Input

The input file contains 2 integer numbers and 1 value of floating point, representing the number, worked hours amount and the amount the employee receives per worked hour.

### Output

Print the number and the employee's salary, according to the given example, with a blank space before and after the equal signal.

| Samples Input | Samples Output|
|---------------|---------------|
| 25 | NUMBER = 25 |
| 100 | SALARY = U$ 550.00 |
| 5.50 | |
| | |
| 1 | NUMBER = 1 |
| 200 | SALARY = U$ 4100.00 |
| 20.50 | |
| | |
| 6 | NUMBER = 6 |
| 145 | SALARY U$ 2254.75 |
| 15.55 | |

## Solution details

To solve this problem the code use a class `BufferedReader` and `InputStreamReader`.

Without any variable.

Only one print line using `System.out.printf()` to show the number, the salary with `double` format and the endline

With this solution you can reach the RUNTIME = 0.056

## More inputs and outputs

| Samples Input | Samples Output|
|---------------|---------------|
| 2 | NUMBER = 2 |
| 10 | SALARY = U$ 55.00 |
| 5.50 | |
| | |
| 51 | NUMBER = 51 |
| 167 | SALARY = U$ 354.04 |
| 2.12 | |
| | |
| 60 | NUMBER = 60 |
| 15 | SALARY U$ 1575.00 |
| 105.00 | |
