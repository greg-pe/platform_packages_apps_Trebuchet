package com.cyanogenmod.trebuchet.preference;

import android.content.Context;
import android.content.SharedPreferences;

public final class PreferencesProvider {
    public static final String PREFERENCES_KEY = "com.cyanogenmod.trebuchet_preferences";

    public static final String PREFERENCES_CHANGED = "preferences_changed";
    public static class Interface {
        public static class Homescreen {
            public static int getCellCountX(Context context, int def) {
                final SharedPreferences preferences = context.getSharedPreferences(PREFERENCES_KEY, 0);
                String[] values = preferences.getString("ui_homescreen_grid", "0|" + def).split("\\|");
                try {
                    return Integer.parseInt(values[1]);
                } catch (NumberFormatException e) {
                    return def;
                }
            }
            public static int getCellCountY(Context context, int def) {
                final SharedPreferences preferences = context.getSharedPreferences(PREFERENCES_KEY, 0);
                String[] values = preferences.getString("ui_homescreen_grid", def + "|0").split("\\|");;
                try {
                    return Integer.parseInt(values[0]);
                } catch (NumberFormatException e) {
                    return def;
                }
            }
            public static boolean getShowSearchBar(Context context) {
                final SharedPreferences preferences = context.getSharedPreferences(PREFERENCES_KEY, 0);
                return preferences.getBoolean("ui_homescreen_general_search", true);
            }
        }

        public static class Drawer {

        }

        public static class Dock {

        }

        public static class Icons {

        }
    }

    public static class General {

    }
}
