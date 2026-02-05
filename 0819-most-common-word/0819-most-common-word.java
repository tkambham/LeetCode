class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>();
        for (String b : banned) {
            bannedSet.add(b.toLowerCase());
        }
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]", " ");
        Map<String, Integer> count = new HashMap<>();
        String[] words = paragraph.split("\\s+");

        for (String word : words) {
            if (word.length() == 0 || bannedSet.contains(word)) {
                continue;
            }
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
        String result = "";
        int max = 0;

        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                result = entry.getKey();
            }
        }

        return result;
    }
}