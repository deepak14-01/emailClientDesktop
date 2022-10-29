package com.dee.view;

public enum FontSize {
    SMALL,
    MEDIUM,
    BIG;

    public static String geCssPath(FontSize fontSize) {
        switch (fontSize) {
            case BIG:
                return "css/fontBig.css";
            case MEDIUM:
                return "css/fontMedium.css";
            case SMALL:
                return "css/fontSmall.css";
            default :
                return null;
        }
    }
}
