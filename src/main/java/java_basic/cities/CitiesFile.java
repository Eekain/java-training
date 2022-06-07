package java_basic.cities;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CitiesFile {

    private Path path;
    private Header header;
    private int lineNumber = 0;

    private boolean hasNoHeader() {
        return header == Header.HAS_NO_HEADER;
    }

    private boolean lineIsNotHeader() {
        return lineNumber > 1;
    }

    public CitiesFile(Path path, Header header) {
        this.path = path;
        this.header = header;
    }

    public List<City> getCities() {

        try {
            return parseLines();

        } catch (IOException ioe) {
            throw new CitiesFileReadException("Can not read file: " + path, ioe, path);
        }

    }

    private List<City> parseLines() throws IOException {
        List<City> cities = new ArrayList<>();
        List<String> lines = Files.readAllLines(path);

        for (var line : lines) {
            lineNumber++;
            if (hasNoHeader() || lineIsNotHeader()) {
                var city = parseLine(line);
                cities.add(city);
            }


        }
        return cities;
    }

    private City parseLine(String line) {
        var parts = line.split(",");
        var name = parts[0];
        var lat = Double.parseDouble(parts[1]);
        var lon = Double.parseDouble(parts[2]);
        return new City(name, lat, lon);
    }

    public static void main(String[] args) {
        List<City> cities = new CitiesFile(Path.of("City_file.csv"), Header.HAS_HEADER).getCities();
        for (City city : cities) {
            System.out.println(city);
        }
    }
    /*
    public List<City> readCities(path){
        List<String> lines = new ArrayList<>();
        List<City> res = new ArrayList<>();
        try{
            lines = Files.readAllLines(path);

        } catch (IOException ioe){
            ioe.printStackTrace();
        }
        boolean isFirst = true;
        for(String s: lines){
            if(isFirst){
                isFirst = false;
                continue;
            }
           String[] toRes = s.split(",");
           res.add(new City(toRes[0], Double.parseDouble(toRes[1]), Double.parseDouble(toRes[2])));

        }

        return res;
    }
    */
}
