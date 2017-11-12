import java.io.File;
public class CacheFile implements CacheInterface {
    private DownloadFile downloadImpl = new DownloadFile();
    public static final String tmpPath = "/tmp";
    public static final String fileName = "downloaded.jpg";
    public void download(String url) {
        System.out.println("\nChecking if file exists...");
        if(!exists(getFilePath())){
            downloadImpl.download(url);
        }else{
            System.out.println("File already exists!");
        }
    }
    private boolean exists(String filePath){
        return new File(filePath).isFile();
    }

    public static String getFilePath(){
        return tmpPath + File.separator + fileName;
    }
}
