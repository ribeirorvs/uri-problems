# Problem 1005 - Avarage 1

## Details

@Author Neilor Tonin (adapted)

@URL https://www.urionlinejudge.com.br/judge/en/problems/view/1005

@Timelimite 1

## Description

Read two floating points' values of double precision A and B, corresponding to two student's grades. After this, calculate the student's average, considering that grade A has weight 3.5 and B has weight 7.5. Each grade can be from zero to ten, always with one digit after the decimal point. Don’t forget to print the end of line after the result, otherwise you will receive *“Presentation Error”*. Don’t forget the space before and after the equal sign.

### Input

The input file contains 2 floating points' values with one digit after the decimal point.

### Output

Print **MEDIA**(average in Portuguese) according to the following example, with 5 digits after the decimal point and with a blank space before and after the equal signal.

| Input Samples | Output Samples |
|---------------|---------------|
| 5.0 | MEDIA = 6.43182 |
| 7.1| |
| | |
| 0.0 | MEDIA = 4.84091 |
| 7.1 | |
| | |
| 10.0 | MEDIA = 10.00000 |
| 10.0 | |

## Solution details

To solve this problem the code use a class `BufferedReader` and `InputStreamReader`.

Only one variable, `x`.

Only one print line using `System.out.printf()` to show the area with a `double` formated and the endline

With this solution you can reach the RUNTIME = 0.068

## More inputs and outputs

| Input | Output|
|-------|-------|
| 3.2 | MEDIA = 2.58636 |
| 2.3 | |
| | |
| 10.0 | MEDIA = 3.18182 |
| 0.0 | |
| | |
| 0.0 | MEDIA = 6.18182 |
| 10.0 | |
| | |
| 2.2 | MEDIA = 2.20000 |
| 2.2 | |
