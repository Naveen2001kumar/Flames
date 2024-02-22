package com.love.flames.calculator;

import java.util.ArrayList;
import java.util.List;

public class calculator {
    public String calci(String name , String fame ){

                char[] c = name.replace(" ","").toLowerCase().toCharArray();
                char[] f = fame.replace(" ", "").toLowerCase().toCharArray();
                char w = cross(total(c, f));
                switch (w) {
                    case 'f' -> {
                        return name +" you are friend of a "+ fame;
                    }

                    case 'l' -> {
                        return name + " you have love with a " + fame;
                    }

                    case 'a' -> {
                        return name + " you got affection with " + fame;
                    }

                    case 'm' -> {
                        return name + " you going to marry  " + fame;
                    }

                    case 'e' -> {
                        return name + " you are a enemy  of a " + fame;
                    }

                    case 's' -> {
                        return name + " you are Siblings  of a " + fame;
                    }

                    case 'x' -> {
                        return "You entered Names Something Wrong can you re-enter the name without hesitation";
                    }

                }
                return "Ops Something Went wrong Sorry for your Inconvience We will resolve the problem";
            }


        public static char cross(int tot) {
            if(tot==0)
            {
                return 'x';
            }
            String fl = "flames";
            char[] game = fl.toCharArray();
            List<Character> li = new ArrayList<>();
            for (char w : game) {
                li.add(w);
            }
            for (int i = 0; i < 5; i++) {
                int tmp = tot;
                while (tmp > 6 - i) {
                    tmp -= 6 - i;
                }
                li.remove(tmp - 1);
            }
            return li.get(0);
        }

        public static int total(char[] c, char[] f) {
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < f.length; j++) {
                    if (c[i] == f[j]) {
                        c[i] = '0';
                        f[j] = '0';
                    }
                }
            }
            int ns = 0;
            for (char d : c) {
                if (d != '0') {
                    ns++;
                }
            }
            int fs = 0;
            for (char d : f) {
                if (d != '0') {
                    fs++;
                }
            }

            return ns+fs;
        }

    }

