import java.net.http.HttpClient;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //fazer uma conexão HTTP e buscar os top 250 filmes
        String url = "https://imdb-api.com/en/API/Top250Movies/k_nqkr9pnl";
        URI endereco = URI.create(url);
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(endereco).GET().build(); 

        // extrair só os dados que interessam (título, poster, classificação)

        //exibir e manipular os dados
    }
}
