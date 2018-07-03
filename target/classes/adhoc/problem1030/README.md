# Problem 1030 - Flavious Josephus Legend

## Details

@Author Neilor Tonin

@URL https://www.urionlinejudge.com.br/judge/en/problems/view/1030

@Timelimite 1

## Description

The Josephus' problem is known because of the Flavius Josephus' legend, a Jewish historian living in the 1st century. According to Josephus' account of the siege of Yodfat, he and his 40 comrade soldiers were trapped in a cave, the exit of which one was blocked by Romans. They chose suicide over capture and decided that they would form a circle and start killing themselves skipping three in three. Josephus says that, by luck or maybe by the hand of God, he remained the last and gave up to the Romans.”

![Flavious Josephus](https://urionlinejudge.r.worldssl.net/gallery/images/problems/UOJ_1030_a.jpg)

### Input

 There are ***NC*** (1 ≤ ***NC*** ≤ 30 ) test cases. In each input test case there will be a pair of positive integer numbers ***n*** (1 ≤ ***n*** ≤ 10000 ) and ***k*** (1 ≤ ***k*** ≤ 1000). The number ***n*** represents the quantity of people in the circle, numbered from 1 to ***n***. The number ***k*** represents the size of step between two men in the circle.

Follow an example with 5 men and step 2: In this example the remaining element is 3.

![Sequence: 5 men and step 2](https://urionlinejudge.r.worldssl.net/gallery/images/problems/UOJ_1030_b.jpg)

The data must be read from standard input. 

### Output

For each test case we will have an output line, presenting in the following format: _Case ***n***: ***m***_ always with a space before ***n*** and ***m***.

| Samples Input | Samples Output|
|---------------|---------------|
| 3  | Case 1: 3 |
| | |
| 5 2 | Case 2: 1 |
| | |
| 6 3 | Case 3: 25 |
| | |
| 1234 | 233 | |
| | |

## Solution details

Tho solve this problem the code use class `Scanner`.

Five variables.

Only one print line using `System.out.println()`to show the result and the endline

With this solution you can reach the RUMTIME = 0.928

## More inputs and outputs

| Samples Input | Samples Output|
|---------------|---------------|
| 5  | Case 1: 2 |
| | |
| 2 1 | Case 2: 7 |
| | |
| 7 2 | Case 3: 5 |
| | |
| 15 3 | Case 4: 2 |
| | |
| 17 7 | Case 5: 11 |
| | |
| 17 5 | |
| | |
