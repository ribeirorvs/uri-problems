# Problem 1010 - Simple Calculate

## Details

@Author Neilor Tonin (adapted)

@URL https://www.urionlinejudge.com.br/judge/en/problems/view/1010

@Timelimite 1

## Description

In this problem, the task is to read a code of a product 1, the number of units of product 1, the price for one unit of product 1, the code of a product 2, the number of units of product 2 and the price for one unit of product 2. After this, calculate and show the amount to be paid.

### Input

The input file contains two lines of data. In each line there will be 3 values: two integers and a floating value with 2 digits after the decimal point.

### Output

The output file must be a message like the following example where "Valor a pagar" means **Value to Pay**. Remember the space after ":" and after "R$" symbol. The value must be presented with 2 digits after the point.

| Samples Input | Samples Output|
|---------------|---------------|
| 12 1 5.30 | VALOR A PAGAR: R$ 15.50 |
| 16 2 5.10 | |
| | |
| 13 2 15.30 | VALOR A PAGAR: R$ 51.40 |
| 161 4 5.20 | |
| | |
| 1 1 15.10 | VALOR A PAGAR: R$ 30.20 |
| 2 1 15.10 | |

## Solution details

To solve this problem the code use a class `BufferedReader` and `InputStreamReader`.

Two vector variable, `line1` and `line2`.

Only one print line using `System.out.printf()` to show the total with `double` formated and the endline

With this solution you can reach the RUNTIME = 0.064

## More inputs and outputs

| Samples Input | Samples Output|
|---------------|---------------|
| 2 10 1.30 | VALOR A PAGAR: R$ 23.00 |
| 15 2 5.00 | |
| | |
| 3 12 1.53 | VALOR A PAGAR: R$ 226.36 |
| 11 4 52.00 | |
| | |
| 01 7 3.80 | VALOR A PAGAR: R$ 42.60 |
| 222 4 4.00 | |

