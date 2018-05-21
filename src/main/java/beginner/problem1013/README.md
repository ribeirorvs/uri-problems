# Problem 1013 - The Greatest

## Details

@Author Neilor Tonin (adapted)

@URL https://www.urionlinejudge.com.br/judge/en/problems/view/1013

@Timelimite 1

## Description

Make a program that reads 3 integer values and present the greatest one followed by the message "eh o maior". Use the following formula:

![MaiorAB = (a+b+abs(a-b))/2](https://urionlinejudge.r.worldssl.net/gallery/images/problems/UOJ_1013.png)

### Input

The input file contains 3 integer values.

### Output

Print the greatest of these three values followed by a space and the message “eh o maior”.

| Samples Input | Samples Output|
|---------------|---------------|
| 7 14 106 | 106 eh o maior |
| | |
| 217 14 6 | 217 eh o maior |
| | |

## Solution details

To solve this problem the code use a class `BufferedReader` and `InputStreamReader`.

Only one variable, `line1`.

Only one print line using `System.out.println()` to show the greatest and the endline

With this solution you can reach the RUNTIME = 0.052

## More inputs and outputs

| Samples Input | Samples Output|
|---------------|---------------|
| 0 0 0 | 0 eh o maior |
| | |
| -12 -10 -15 | -10 eh o maior |
| | |
| 0 -10 10 | 10 eh o maior |
| | |
| 112 231 447 | 447 eh o maior |
| | |
