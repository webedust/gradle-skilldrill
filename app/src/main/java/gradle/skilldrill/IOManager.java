package gradle.skilldrill;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import com.google.gson.*;

public class IOManager
{
    public Student[] readData(String file)
    {
        Gson gson = new Gson();
        try
        {
            String json = Files.readString(Paths.get("./" + file));

            return gson.fromJson(json, Student[].class);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        // Returns null if exception occurred.
        return null;
    }

    public void writeData(String file, ArrayList<Student> data)
    {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(data);

        try
        {
            FileWriter writer = new FileWriter("./" + file);
            writer.write(json);
            writer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
