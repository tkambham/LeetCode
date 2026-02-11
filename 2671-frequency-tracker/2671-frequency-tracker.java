class FrequencyTracker {
    Map<Integer, Integer> numFreq;
    Map<Integer, Integer> freqCount;

    public FrequencyTracker() {
        numFreq = new HashMap<>();
        freqCount = new HashMap<>();
    }

    public void add(int number) {
        int oldFreq = numFreq.getOrDefault(number, 0);
        int newFreq = oldFreq + 1;

        numFreq.put(number, newFreq);

        if (oldFreq > 0) {
            freqCount.put(oldFreq, freqCount.get(oldFreq) - 1);
        }

        freqCount.put(newFreq, freqCount.getOrDefault(newFreq, 0) + 1);
    }

    public void deleteOne(int number) {
        if (!numFreq.containsKey(number)) return;

        int oldFreq = numFreq.get(number);
        int newFreq = oldFreq - 1;

        freqCount.put(oldFreq, freqCount.get(oldFreq) - 1);

        if (newFreq == 0) {
            numFreq.remove(number);
        } else {
            numFreq.put(number, newFreq);
            freqCount.put(newFreq, freqCount.getOrDefault(newFreq, 0) + 1);
        }
    }

    public boolean hasFrequency(int frequency) {
        return freqCount.getOrDefault(frequency, 0) > 0;
    }

}

/**
 * Your FrequencyTracker object will be instantiated and called as such:
 * FrequencyTracker obj = new FrequencyTracker();
 * obj.add(number);
 * obj.deleteOne(number);
 * boolean param_3 = obj.hasFrequency(frequency);
 */