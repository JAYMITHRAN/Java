class Friday {
    public static void main(String[] args) {
        String s = "Pokemon I Choose You";
        int len = s.length();

        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);

            if (ch == ' ') continue;

            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (s.charAt(k) == ch) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (alreadyCounted) continue;

            int count = 0;
            for (int j = 0; j < len; j++) {
                if (s.charAt(j) == ch) {
                    count++;
                }
            }

            System.out.println(ch + " Occurred " + count + " Times.");
        }
    }
}
