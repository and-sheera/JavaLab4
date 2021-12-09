package vsu.shirnin.collection;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Objects;

public class OpenCSVReader {
    /**
     * @param pathFile the path of the file to open
     * @param separator delimiter character in string
     * @param people people data list
     * @param subdivisions class object with a list of subdivisions
     */
    public static void read(String pathFile, String separator, ArrayList<Man> people, Subdivisions subdivisions) throws IOException {
        try (
                Reader reader = Files.newBufferedReader(Paths.get(pathFile));
                CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();
        ) {
            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {
                String str = nextRecord[0];
                String[] strCells;
                strCells = str.split(separator);
                int id = Integer.parseInt(strCells[0]);
                String name = strCells[1];
                Sex sex;
                if (Objects.equals(strCells[2], "Male")) {
                    sex = Sex.MALE;
                } else {
                    sex = Sex.FEMALE;
                }
                String bDay = strCells[3];
                String sDivision = strCells[4];
                subdivisions.add(sDivision);
                int salary = Integer.parseInt(strCells[5]);

                Man man = new Man(id, name, sex, salary, bDay, sDivision);

                people.add(man);
            }
        } catch (CsvValidationException e) {
            e.printStackTrace();
        }
    }
}
