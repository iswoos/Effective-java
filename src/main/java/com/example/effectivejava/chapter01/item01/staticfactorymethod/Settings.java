package com.example.effectivejava.chapter01.item01.staticfactorymethod;

public class Settings {

    private boolean useAutoSteering;

    private boolean usdABS;

    private static final Settings settings = new Settings();

    public static Settings newInstance() {
        return settings;
    }
}

class SettingsTest {
    public static void main(String[] args) {
        // 서로 다른 인스턴스
        System.out.println(new Settings());
        System.out.println(new Settings());
        System.out.println(new Settings());
        System.out.println();

        // 모두 같은 인스턴스
        System.out.println(Settings.newInstance());
        System.out.println(Settings.newInstance());
        System.out.println(Settings.newInstance());
    }
}
