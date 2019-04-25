package string.problems;


public class DetermineLargestWord {

    static int LongestWordLength(String str)
    {
        int n = str.length();
        int res = 0, curr_len = 0;
        for (int i = 0; i < n; i++)
        {

            if (str.charAt(i) != ' ')
                curr_len++;

                // If end of word is found
            else
            {
                res = Math.max(res, curr_len);
                curr_len = 0;
            }
        }

        return Math.max(res, curr_len);
    }

    public static void main(String[] args)
    {
        String s = "Human brain is a biological learning machine";
        System.out.println(LongestWordLength(s));
    }
}

