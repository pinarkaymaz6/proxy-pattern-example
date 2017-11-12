public class DownloadClient {
    public static void main(String[] args){

        String url ="https://www1.in.tum.de/lehrstuhl_1/images/people/Bernd%20Bruegge.jpg";
        CacheFile request = new CacheFile();
        request.download(url);

        request.download(url);
    }
}
