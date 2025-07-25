package querypotter.config;

import java.io.*;
import java.util.*;

public class ConfigLoader {
    public static Config configLode() {
        Map<String, String> configMap = new HashMap<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/java/querypotter/config/config.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty() || line.startsWith("#")) continue;

                String[] item = line.split(":");
                if (item.length == 2) {
                    configMap.put(item[0], item[1].trim());
                }
            }
            return new Config( //Config 클래스 생성자의 매개변수들
                    configMap.getOrDefault("database", ""),
                    configMap.getOrDefault("server-ip", ""),
                    configMap.getOrDefault("server-port", ""),
                    configMap.getOrDefault("db-schema", ""),
                    configMap.getOrDefault("username", ""),
                    configMap.getOrDefault("password", "")
            );

        } catch (FileNotFoundException fe) {
            System.out.println("경로상에 config.txt 파일이 존재하지 않습니다.");
        } catch (IOException ie) {
            System.out.println("파일을 읽어오는데 실패했습니다.");
        }
        return null;
    }
}
