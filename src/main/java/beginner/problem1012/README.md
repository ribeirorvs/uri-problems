# Problem 1012 - Area

## Details

@Author Neilor Tonin (adapted)

@URL https://www.urionlinejudge.com.br/judge/en/problems/view/1012

@Timelimite 1

## Description

Make a program that reads three floating point values: A, B and C. Then, calculate and show:
a) the area of the rectangled triangle that has base A and height C.
b) the area of the radius's circle C. (pi = 3.14159)
c) the area of the trapezium which has A and B by base, and C by height.
d) the area of the square that has side B.
e) the area of the rectangle that has sides A and B. 

### Input

The input file contains three double values with one digit after the decimal point.

### Output

The output file must contain 5 lines of data. Each line corresponds to one of the areas described above, always with a corresponding message (in Portuguese) and one space between the two points and the value. The value calculated must be presented with 3 digits after the decimal point.

| Samples Input | Samples Output|
|---------------|---------------|
| 3.0 4.0 5.2 | TRIANGULO: 7.800 |
| | CIRCULO: 84.949 |
| | TRAPEZIO: 18.200 |
| | QUADRADO: 16.000 |
| | RETANGULO: 12.000 |
| | |
| 12.7 10.4 15.2 | TRIANGULO: 96.520 |
| | CIRCULO: 725.833 |
| | TRAPEZIO: 175.560 |
| | QUADRADO: 108.160 |
| | RETANGULO: 132.080 |
| | |

## Solution details

To solve this problem the code use a class `BufferedReader` and `InputStreamReader`.

Only one print line using `System.out.printf()` to show the all areas with `double` formated and the endline

With this solution you can reach the RUNTIME = 0.040

## More inputs and outputs

| Samples Input | Samples Output|
|---------------|---------------|
| 1.1 3.7 5.0 | TRIANGULO: 2.750 |
| | CIRCULO: 78.540 |
| | TRAPEZIO: 12.000 |
| | QUADRADO: 13.690 |
| | RETANGULO: 4.070 |
| | |
| 2.9 7.1 8.8 | TRIANGULO: 12.760 |
| | CIRCULO: 243.285 |
| | TRAPEZIO: 44.000 |
| | QUADRADO: 50.410 |
| | RETANGULO: 20.590 |
| | |
| 9.2 6.4 0.0 | TRIANGULO: 0.000 |
| | CIRCULO: 0.000 |
| | TRAPEZIO: 0.000 |
| | QUADRADO: 40.960 |
| | RETANGULO: 58.880 |
| | |
