import java.io.*;
import java.net.URL;

public class DownloadFile implements CacheInterface{

    public DownloadFile() {
    }

    public void download(String strUrl){
        try {
        URL url = new URL(strUrl);
        InputStream in = new BufferedInputStream(url.openStream());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.out.println("Downloading starts...");
        byte[] buf = new byte[1024];
        int n = 0;
        while (-1!=(n=in.read(buf))) {
            out.write(buf, 0, n);
        }

        byte[] response = out.toByteArray();

        FileOutputStream fos = new FileOutputStream(CacheFile.getFilePath());
        fos.write(response);

        out.close();
        in.close();
        fos.close();
        System.out.println("File downloaded!");
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
