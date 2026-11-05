Sure macha. Let's \*\*complete the entire `"AABABBA", k = 1` dry run\*\* step by step.



\### Initial



```

s = "AABABBA"

k = 1



left = 0

maxFreq = 0

maxLen = 0

```



\---



\### `right = 0` → `A`



```

Window = A

freq: A=1

maxFreq = 1



length = 1

replace = 1 - 1 = 0

```



Valid ✅



```

maxLen = 1

```



\---



\### `right = 1` → `A`



```

Window = AA

freq: A=2

maxFreq = 2



length = 2

replace = 2 - 2 = 0

```



Valid ✅



```

maxLen = 2

```



\---



\### `right = 2` → `B`



```

Window = AAB

freq: A=2, B=1

maxFreq = 2



length = 3

replace = 3 - 2 = 1

```



`1 <= k`, so valid ✅



```

maxLen = 3

```



We can change `B → A`:



```

AAA

```



\---



\### `right = 3` → `A`



```

Window = AABA

freq: A=3, B=1

maxFreq = 3



length = 4

replace = 4 - 3 = 1

```



Valid ✅



```

maxLen = 4

```



We can change `B → A`:



```

AAAA

```



\---



\### `right = 4` → `B`



Now:



```

Window = AABAB

freq: A=3, B=2

maxFreq = 3



length = 5

replace = 5 - 3 = 2

```



But:



```

k = 1

```



So:



```

2 > 1

```



❌ Invalid.



We need to shrink.



Remove `s\[left]`, which is `A`:



```

freq\[A]--

left++

```



Now:



```

Window = ABAB

freq: A=2, B=2

```



Using the current `maxFreq = 3`:



```

length = 4

replace = 4 - 3 = 1

```



Valid again ✅



```

maxLen = 4

```



\---



\### `right = 5` → `B`



Current window:



```

ABAB

```



Add `B`:



```

Window = ABABB

freq: A=2, B=3

maxFreq = 3

```



Length:



```

5

```



Replacement:



```

5 - 3 = 2

```



Again:



```

2 > 1

```



❌ Invalid.



Shrink from left.



Remove `A`:



```

freq\[A]--

left++

```



Window becomes:



```

BABB

```



Now:



```

B=3

A=1

```



Length:



```

4

```



Replacement:



```

4 - 3 = 1

```



Valid ✅



```

maxLen = 4

```



\---



\### `right = 6` → `A`



Add `A`:



```

Window = BABBA

freq: B=3, A=2

maxFreq = 3

```



Length:



```

5

```



Replacement:



```

5 - 3 = 2

```



Invalid ❌



Shrink:



Remove `B` from the left:



```

Window = ABBA

freq: B=2, A=2

left++

```



Length:



```

4

```



Using `maxFreq = 3`:



```

replace = 4 - 3 = 1

```



Valid ✅



```

maxLen = 4

```



\---



\## 🎯 Final answer



```

maxLen = 4

```



So:



```

"AABABBA"

&#x20;k = 1



Answer = 4

```



One possible valid substring is:



```

AABA

```



Change the `B` to `A`:



```

AAAA

```



Only \*\*1 replacement\*\* is needed.



\### 🔥 Remember this one formula



```

Window length = right - left + 1



Characters we KEEP = maxFreq



Characters we need to REPLACE =

Window length - maxFreq

```



If:



```

window length - maxFreq > k

```



👉 \*\*shrink using `left`\*\*



Otherwise:



👉 \*\*update `maxLen`\*\*

