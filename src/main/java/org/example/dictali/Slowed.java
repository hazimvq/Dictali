package org.example.dictali;

public class Slowed {
    public static void main(String[] args) throws InterruptedException {
        String[][] lines = {
                {"I know, I know", "100"},
                {"And thinking all you need is there", "80"},
                {"Building faith on love and words", "50"},
                {"Empty promises will wear", "80"},
                {"I know", "80"},
                {"I know and now", "60"},
                {"When all is done, there is noth   ing to say", "40"},
                {"And if you're done", "70"},
                {"With embarrassing me", "40"},
                {"On your own you can go ahead", "60"},
                {"Tell them", "50"},
                {"Tell them all I know now", "80"}
        };

        int[] delays = {300, 500, 400, 200, 1100, 700, 800, 100, 800, 0, 700, 0};

        for (int i = 0; i < lines.length; i++) {
            String text = lines[i][0];
            int charDelay = Integer.parseInt(lines[i][1]);

            for (char c : text.toCharArray()) {
                System.out.print(c);
                Thread.sleep(charDelay);
            }

            System.out.println();
            Thread.sleep(delays[i]);
        }
    }
}
