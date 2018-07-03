# Problem 1011 - Sphere

## Details

@Author Neilor Tonin (adapted)

@URL https://www.urionlinejudge.com.br/judge/en/problems/view/1011

@Timelimite 1

## Description

Make a program that calculates and shows the volume of a sphere being provided the value of its radius (R) . The formula to calculate the volume is: (4/3) * pi * R3. Consider (assign) for pi the value 3.14159.

Tip: Use (4/3.0) or (4.0/3) in your formula, because some languages (including C++) assume that the division's result between two integers is another integer. :)

### Input

The input contains a value of floating point (double precision).

### Output

The output must be a message "VOLUME" like the following example with a space before and after the equal signal. The value must be presented with 3 digits after the decimal point.

| Samples Input | Samples Output|
|---------------|---------------|
| 3 | VOLUME = 113.097 |
| | |
| 15 | VOLUME = 14137.155 |
| | |
| 1523 | VOLUME = 14797486501.627 |

## Solution details

To solve this problem the code use a class `BufferedReader` and `InputStreamReader`.

Only one print line using `System.out.printf()` to show the volume with `double` formated and the endline

With this solution you can reach the RUNTIME = 0.060

## More inputs and outputs

| Samples Input | Samples Output|
|---------------|---------------|
| 0 | VOLUME = 0.000 |
| | |
| -1 | VOLUME = -4.189 |
| | |
| 1 | VOLUME = 4.189 |
