# Problem 1014 - Comsumption

## Details

@Author Neilor Tonin (adapted)

@URL https://www.urionlinejudge.com.br/judge/en/problems/view/1014

@Timelimite 1

## Description

Calculate a car's average consumption being provided the total distance traveled (in Km) and the spent fuel total (in liters).

### Input

The input file contains two values: one integer value **X** representing the total distance (in Km) and the second one is a floating point number **Y**  representing the spent fuel total, with a digit after the decimal point.

### Output

Present a value that represents the average consumption of a car with 3 digits after the decimal point, followed by the message "km/l".

| Samples Input | Samples Output|
|---------------|---------------|
| 500 | 14.286 km/l |
| 35.0 | |
| | |
| 2254 | 18.119 km/l |
| 124.4 | |
| | |
| 4554 | 9.802 km/l |
| 464.6 | |

## Solution details

To solve this problem the code use a class 'BufferedReader' and 'InputStreamReader'.

Only one print line using 'System.out.printf()' to show the km/l with 'double' format and the endline

With this solution you can reach the RUNTIME = 0.060

## More inputs and outputs

| Samples Input | Samples Output|
|---------------|---------------|
| 0 | 0.000 km/l |
| 0 | |
| | |
| 100 | 1 km/l |
| 100 | |
| | |
| 1574 | 14.561 km/l |
| 108.1 | |

