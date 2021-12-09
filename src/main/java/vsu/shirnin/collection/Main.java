package vsu.shirnin.collection;

import java.io.*;
import java.net.URISyntaxException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws URISyntaxException, IOException {
        Subdivisions subdivisions = new Subdivisions();

        String pathFile = "src/main/resources/foreign_names.csv";
        String separator = ";";

        ArrayList<Man> people = new ArrayList<Man>();

        OpenCSVReader.read(pathFile, separator, people, subdivisions);

        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).ManToString());
        }
    }
}
