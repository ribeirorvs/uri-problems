# Problem 1002 - Area of a Circle 

## Details

@Author Neilor Tonin (adapted)

@URL https://www.urionlinejudge.com.br/judge/en/problems/view/1002

@Timelimite 1

## Description

The formula to calculate the area of a circumference is defined as **A = π . R2**. Considering to this problem that **π = 3.14159**:

Calculate the area using the formula given in the problem description.

### Input

The input contains a value of floating point (double precision), that is the variable **R**.

### Output

Present the message "A=" followed by the value of the variable, as in the example bellow, with four places after the decimal point. Use all double precision variables. Like all the problems, don't forget to print the end of line after the result, otherwise you will receive "Presentation Error".

| Input Samples | Output Samples |
|---------------|---------------|
| 2.00 | A=12.5664 |
| | |
| 100.64 | A=31819.3103 |
| | |
| 150.00 | A=70685.7750 |

## Solution details

To solve this problem the code use a class `BufferedReader` and `InputStreamReader`.

Only one variable, `R`.

Only one print line using `System.out.printf()` to show the area with a `double` formated and the endline

With this solution you can reach the RUNTIME = 0.072

## More inputs and outputs

| Input | Output|
|-------|-------|
| 230.02 | A=166219.0149 |
| | |
| 122.00 | A=46759.4256 |
| | |
| 32 | A=3216.9882 |
| | |
| 2.2 | A=15.2053 |
