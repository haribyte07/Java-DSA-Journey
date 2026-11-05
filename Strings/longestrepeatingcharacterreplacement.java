    int[] freq = new int[26];

    int left = 0;
    int maxFreq = 0;
    int maxLen = 0;

    for (int right = 0; right < s.length(); right++) {

        // Count the current character
        freq[s.charAt(right) - 'A']++;

        // Highest frequency character in the window
        maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

        // Characters that need to be replaced
        int replace = (right - left + 1) - maxFreq;

        // Shrink the window if replacements exceed k
        while (replace > k) {
            freq[s.charAt(left) - 'A']--;
            left++;

            replace = (right - left + 1) - maxFreq;
        }

        // Update maximum length
        maxLen = Math.max(maxLen, right - left + 1);
    }

    return maxLen;
}
}
