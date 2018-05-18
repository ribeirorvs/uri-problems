# Problem 1026 - To Carry or no to Carry

## Details

@Author Monirul Hasan Tomal,

@URL https://www.urionlinejudge.com.br/judge/en/problems/view/1026

@Timelimite 2

## Description

6+9=15 seems okay. But how come 4+6=2?

![(AB)+((A!B)+(!AB)](https://urionlinejudge.r.worldssl.net/gallery/images/problems/UOJ_1026.png)

Look at, Mofiz worked hard throughout his Digital Logic course, but when he was asked to implement a 32 bit adder for the laboratory exam, he did some mistake in the design part. After scavenging the design for half an hour, he found his flaw!! He was doing bitwise addition but his carry bit always had zero output. Thus,

4  = 00000000 00000000 00000000 00000100
+6 = 00000000 00000000 00000000 00000110
----------------------------------------
2  = 00000000 00000000 00000000 00000010

It’s a good thing that he finally found his mistake, but it was too late. Considering his effort throughout the course, the instructor gave him one more chance. Mofiz had to write an efficient program that would take 2 unsigned 32 bit decimal numbers as input, and produce an unsigned 32 bit decimal number as the output adding in the same way as his circuit does.

### Input

In each input line there will be a pair of integer separated by a single space. Input ends at EOF.

### Output

For each input line, the program must provide an output's line: the value after adding the two numbers in the "Mofiz way".

| Samples Input | Samples Output|
|---------------|---------------|
| 4 6 | 2 |
| | |
| 6 9 | 15 |
| | |

## Solution details

To solve this problem the code use a class 'Scanner'.

Two variables, 'x' and 'y'.

Only one print line using 'System.out.println()' to show the result and the endline

With this solution you can reach the RUNTIME = 0.836

> This code is from [URI Online Judge Solution](https://urisolve.blogspot.com.br/2016/04/uri-online-judge-solution-1026-in-c-c.html)

## More inputs and outputs

| Samples Input | Samples Output|
|---------------|---------------|
| 4 4 | 0 |
| | |
| 3 5 | 6 |
| | |
| 10 20 | 20|
| | |
