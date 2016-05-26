package com.huaban.analysis.jieba;

public class SegToken {
    public String word;
    public String pos;

    public int startOffset;

    public int endOffset;

    public SegToken(String word, int startOffset, int endOffset) {
        this.word = word;
        this.startOffset = startOffset;
        this.endOffset = endOffset;
    }

    public SegToken(String word, String pos, int startOffset, int endOffset) {
        this.word = word;
        this.pos = pos;
        this.startOffset = startOffset;
        this.endOffset = endOffset;
    }

    @Override
    public String toString() {
        if (pos != null) {
            return "[" + word + ", " + pos + "," + startOffset + ", " + endOffset + "]";
        } else {
            return "[" + word + "," + startOffset + ", " + endOffset + "]";
        }
    }

}
