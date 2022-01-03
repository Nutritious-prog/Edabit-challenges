package com.company;


// Create a function that returns which chapter is nearest to the page you're on.
// If two chapters are equidistant, return the chapter with the higher page number.

import static java.lang.Math.abs;

public class ClosestChapter {
    class Chapter {
        private String name;
        private int page;

        public Chapter(String name, int page) {
            this.name = name;
            this.page = page;
        }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public int getPage() { return page; }
        public void setPage(int page) { this.page = page; }
    }

    public static String nearestChapter(Chapter[] chapter, int page) {
        if(chapter.length == 0) return "Empty array";
        if(page < 0) return "Negative page";

        int smallestDistance = abs(chapter[0].getPage() - page);
        int iFlag = 0; // tracking index of chapter with smallest distance

        for(int i = 1; i < chapter.length; i++) {
            if(abs(chapter[i].getPage() - page) <= smallestDistance) {
                smallestDistance = abs(chapter[i].getPage() - page);
                iFlag = i;
            }
        }
        return chapter[iFlag].getName();
    }
    public static void main(String[] args) {

    }
}
