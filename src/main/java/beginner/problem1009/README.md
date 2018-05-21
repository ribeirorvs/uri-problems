# Problem 1009 - Salary with Bonus

## Details

@Author Neilor Tonin (adapted)

@URL https://www.urionlinejudge.com.br/judge/en/problems/view/1009

@Timelimite 1

## Description

Make a program that reads a seller's name, his/her fixed salary and the sale's total made by himself/herself in the month (in money). Considering that this seller receives 15% over all products sold, write the final salary (total) of this seller at the end of the month , with two decimal places.

- Don’t forget to print the line's end after the result, otherwise you will receive “Presentation Error”.

- Don’t forget the blank spaces.

### Input

The input file contains a text (employee's first name), and two double precision values, that are the seller's salary and the total value sold by him/her.

### Output

Print the seller's total salary, according to the given example.

| Samples Input | Samples Output|
|---------------|---------------|
| JOAO | TOTAL = R$ 684.54 |
| 500.00 | |
| 1230.30 | |
| | |
| PEDRO | TOTAL = R$ 700.00 |
| 700.00 | |
| 0.0 | |
| | |
| MANGOJATA | TOTAL = R$ 1884.58 |
| 1700.00 | |
| 1230.50 | |

> The truncated result can be rounded to up or down

## Solution details

To solve this problem the code use a class `BufferedReader` and `InputStreamReader`.

Without any variable.

Only one print line using `System.out.printf()` to show the salary with `double` format and the endline

With this solution you can reach the RUNTIME = 0.060

## More inputs and outputs

| Samples Input | Samples Output|
|---------------|---------------|
| JAIME | TOTAL = R$ 573.12 |
| 555.00 | |
| 120.80 | |
| | |
| SANTOS | TOTAL = R$ 2282.00 |
| 2000.00 | |
| 1880.00 | |
| | |
| ALBERTINA | TOTAL = R$ 22500.00 |
| 15000.00 | |
| 50000.00 | |

