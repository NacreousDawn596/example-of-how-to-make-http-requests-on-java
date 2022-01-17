public class main {

    public static String request(String url) throws Exception {
    
        URL requests = new URL(url);
        
        URLConnection rq = requests.openConnection();
        
        BufferedReader in = new BufferedReader(new InputStreamReader(rq.getInputStream()));
        
        String inputLine;
        
        while ((inputLine = in.readLine()) != null){
        
            break;
            
        }
        
        return inputLine.split(":\"")[1].split("\"}")[0];
        
    }
    
    public static void main(String args[]) throws Exception {
    
        request_content = request("http://usefull-api.herokuapp.com/joke/"); // just to test ;-;
        
        System.out.println(request_content);
        
    }
    
}
