package com.example.task01;

import java.io.File;
import java.io.IOException;

public class Task01Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println(extractSoundName(new File("C:\\Users\\Deoksisss\\Desktop\\file.mp3")));
    }

    public static String extractSoundName(File file) throws IOException, InterruptedException {
        var builder = new ProcessBuilder("ffprobe", "-v", "error", "-of", "flat", "-show_format", file.getAbsolutePath());
        builder.inheritIO().start();
        return "sound name";
    }
}
