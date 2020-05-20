import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;

public class test01 {
    String srcPath = "E:\\计嵌2班-Spark-数据清洗-数据仓库\\大数据实训\\任务\\zpsjj";
    String charset = "utf-8";
        try (CSVReader csvReader = new CSVReaderBuilder(new BufferedReader(new InputStreamReader(new FileInputStream(new File(srcPath)), charset))).build()) {
        Iterator<String[]> iterator = csvReader.iterator();
        while (iterator.hasNext()) {
            Arrays.stream(iterator.next()).forEach(System.out::print);
            System.out.println();
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}