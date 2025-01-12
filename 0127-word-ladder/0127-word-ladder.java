class Solution {
    char[] alphabet = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g',
            'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
            'u', 'v', 'w', 'x', 'y', 'z'};
        public int ladderLength(String beginWord, String endWord, List<String> wordList) {
            if (!wordList.contains(endWord)) return 0;
            Set<String> wordSet = new HashSet<>(wordList);
            Queue<String> queue = new LinkedList<>();
            queue.add(beginWord);
            int steps = 1;
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    String curr = queue.poll();
                    if (curr.equals(endWord)) return steps;
                    StringBuilder sb = new StringBuilder(curr);
                    for (int j = 0; j < curr.length(); j++) {
                        char cache = sb.charAt(j);
                        for (char c : alphabet) {
                            sb.setCharAt(j, c);
                            String neighbor = sb.toString();
                            if (wordSet.contains(neighbor)) {
                                queue.add(neighbor);
                                wordSet.remove(neighbor);
                            }
                        }
                        sb.setCharAt(j, cache);
                    }
                }
                steps++;
            }
            return 0;
        }
}