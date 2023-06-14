import java.io.FileReader;
import java.io.IOException;

public class JSONHandler {
    String sourceFileName;

    JSONHandler(String fileName) {
        this.sourceFileName = fileName;
    }

    public String[][] parseJSON() {
        String rawContent = this._readJSONFile();
        return this._parseJSONContent(rawContent);
    }

    private String _readJSONFile() {
        StringBuilder builder = new StringBuilder();

        try (FileReader reader = new FileReader(this.sourceFileName)) {
            int c;

            while ( (c = reader.read()) != -1) {
                if (
                        (char)c == '['
                        | (char)c == ']'
                        | (char)c == ' '
                        | (char)c == '\n'
                        | (char)c == '\t'
                ) {
                    continue;
                }

                builder.append((char)c);
            }
        }
        catch (IOException ex) {
            System.out.println("APP couldn't open file: " + this.sourceFileName);
        }

        return builder.toString();
    }

    private String[] _removeJSONArtefacts(String content) {
        String[] elms = content.split("}");

        for (int i = 0; i < elms.length; i++) {
            if (elms[i].startsWith("{")) {
                elms[i] = elms[i].substring(1);
            } else if (elms[i].startsWith(",{")) {
                elms[i] = elms[i].substring(2);
            }
        }

        return elms;
    }

    private String[][] _parseJSONContent(String content) {
        String[] contentObjects = this._removeJSONArtefacts(content);

        int payloadArrSize = contentObjects[0].split(",").length;
        String[][] elmsPayload;
        elmsPayload = new String[contentObjects.length][payloadArrSize];

        for (int i = 0; i < contentObjects.length; i++) {
            String[] payload = contentObjects[i].split(",");
            for (int j = 0; j < payload.length; j++) {
                elmsPayload[i][j] = payload[j].split(":")[1].replace("\"", "");
            }
        }

        return elmsPayload;
    }
}