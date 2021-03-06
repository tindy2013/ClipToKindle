package com.example.cliptokindle.text;

import java.io.Serializable;

//link html object
public class Text implements Serializable {
    private String text;

    public Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String toHtml() {
        return "<div><a href=\"" + text + "\" target=\"_blank\"><b>" + text + "</b></a>" + "</div><br><br><br>\n";
    }
}
