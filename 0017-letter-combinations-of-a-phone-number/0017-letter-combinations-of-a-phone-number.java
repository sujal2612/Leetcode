class Solution {

    public List<String> letterCombinations(String digits) {

        List<String> res = new ArrayList<>();

        if (digits.length() == 0) {
            return res;
        }

        String[] map = {"", "", "abc", "def", "ghi","jkl", "mno", "pqrs", "tuv", "wxyz"};

        res.add("");

        for (char digit : digits.toCharArray()) {

            List<String> temp = new ArrayList<>();

            String letters = map[digit - '0'];

            for (String s : res) {

                for (char ch : letters.toCharArray()) {

                    temp.add(s + ch);
                }
            }

            res = temp;
        }

        return res;
    }
}