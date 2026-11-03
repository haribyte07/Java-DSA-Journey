Exactly macha — \*\*the array is used to count how many times each character appears\*\*.



why we creating the array



Think of:



```

int\[]freq=newint\[26];

```



as \*\*26 boxes\*\*, one for each lowercase letter:



```

index:   0  1  2  3  4  5  ... 25

letter:  a  b  c  d  e  f  ... z

count:   0  0  0  0  0  0  ... 0

```



For example, `s1 = "eat"`:



```

freq\[s1.charAt(i)-'a']++;

```



After processing `"eat"`:



```

a → 1

e → 1

t → 1

```



So internally:



```

freq\[0] = 1   // a

freq\[4] = 1   // e

freq\[19] = 1  // t

```



Then for `s2 = "tea"` we do `--`:



```

t → 0

e → 0

a → 0

```



If \*\*all 26 boxes become 0\*\*, both strings had exactly the same characters → \*\*Anagram\*\* ✅



\### Why not just compare the strings?



Because:



```

"eat" != "tea"

```



but they are anagrams.



So the array lets us \*\*ignore the order and compare character frequencies\*\*.



\*\*Main idea to remember:\*\*



> `freq\[]` = a character counting box. 📦

> 



This frequency-array technique is very common in string DSA problems.



Okay macha 😄 let's forget the complicated explanation. \*\*Just imagine 26 boxes.\*\*



We have:



```

int\[]freq=newint\[26];

```



For now, only focus on \*\*`t`\*\*.



\### Step 1: Where is `t`?



```

a b c d e f g h i j k l m n o p q r s t

0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19

```



So:



```

't'-'a'

```



gives:



```

19

```



Therefore:



```

freq\[19]

```



means:



> \*\*The box where we keep the count of `t`.\*\*

> 



\### Step 2: What does `-` mean?



Suppose:



```

freq\[19] = 1

```



Then:



```

freq\[19]--;

```



means:



```

freq\[19] = 1 - 1

freq\[19] = 0

```



That's all! 😄



\### Why are we decreasing it?



Take:



```

s1 = "eat"

s2 = "tea"

```



When we process `"eat"`:



```

t → +1

```



So:



```

t count = 1

```



Then when we process `"tea"`:



```

t → -1

```



So:



```

1 - 1 = 0

```



That means:



> \*\*One `t` from the first string was matched by one `t` in the second string.\*\* ✅

> 



So remember only this:



```

freq\[19]--;

```



= \*\*"t count-a 1 decrease pannu."\*\* 😎



freq\[19] = 1 how u say this



Ahh yes macha 😄 \*\*this is the important part.\*\* Let's see exactly how `freq\[19]` becomes `1`.



Take:



```

Strings1="eat";int\[]freq=newint\[26];

```



Initially \*\*every box contains 0\*\*:



```

freq\[0]  = 0   // a

freq\[1]  = 0   // b

...

freq\[19] = 0   // t

```



Now this loop runs:



```

for (inti=0;i<s1.length();i++) {freq\[s1.charAt(i)-'a']++;

}

```



\### When `i = 2`



In `"eat"`:



```

index:  0   1   2

&#x20;      'e' 'a' 't'

```



So:



```

s1.charAt(2)

```



gives:



```

't'

```



Then:



```

't'-'a'

```



gives:



```

19

```



Therefore this:



```

freq\[s1.charAt(2)-'a']++;

```



becomes:



```

freq\[19]++;

```



Initially:



```

freq\[19] = 0

```



`++` means \*\*add 1\*\*:



```

freq\[19] = 0 + 1

```



Therefore:



```

freq\[19] = 1

```



\### 🔥 In one line



```

"eat"

&#x20; ↓

't'

&#x20; ↓

't' - 'a' = 19

&#x20; ↓

freq\[19]++

&#x20; ↓

0 + 1

&#x20; ↓

freq\[19] = 1



Time: O(n)

Space: O(1)



```





