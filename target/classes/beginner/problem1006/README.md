# Problem 1006 - Avarage 2

## Details

@Author Neilor Tonin (adapted)

@URL https://www.urionlinejudge.com.br/judge/en/problems/view/1002

@Timelimite 1

## Description

 Read three values (variables A, B and C), which are the three student's grades. Then, calculate the average, considering that grade A has weight 2, grade B has weight 3 and the grade C has weight 5. Consider that each grade can go from 0 to 10.0, always with one decimal place.

### Input

The input file contains 3 values of floating points with one digit after the decimal point.

### Output

Print **MEDIA**(average in Portuguese) according to the following example, with a blank space before and after the equal signal.

| Input Samples | Output Samples |
|---------------|---------------|
| 5.0 | MEDIA = 6.3 |
| 6.0 | |
| 7.0 | |
| | |
| 5.0 | MEDIA = 9.0 |
| 10.0 | |
| 10.0 | |
| | |
| 10.0 | MEDIA = 7.5 |
| 10.0 | |
| 5.0 | |

## Solution details

To solve this problem the code use a class 'BufferedReader' and 'InputStreamReader'.

Only one variable, 'x'.

Only one print line using 'System.out.printf()' to show the area with a 'double' formated and the endline

With this solution you can reach the RUNTIME = 0.060

## More inputs and outputs

| Input Samples | Output Samples |
|---------------|---------------|
| 0.0 | MEDIA = 5.3 |
| 6.0 | |
| 7.0 | |
| | |
| 10.0 | MEDIA = 10.0 |
| 10.0 | |
| 10.0 | |
| | |
| 0.0 | MEDIA = 2.5 |
| 0.0 | |
| 5.0 | |

