package com.dee.view;

public enum ColorTheme {
    LIGHT,
    SOLARIS,
    DARK;

    public static String geCssPath(ColorTheme colorTheme) {
        switch (colorTheme) {
            case LIGHT:
                return "css/themeLight.css";
            case DARK:
                return "css/themeDark.css";
            case SOLARIS :
                return "css/themeSolaris.css";
            default:
                return null;
        }
    }
}
