package concurrencia.tema.tres;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GUIThread extends JFrame {
    private JTextField textField1;
    private JTextArea textArea1;
    private JButton operarButton;
    private JPanel MainPanel;
    //constructor
    public GUIThread(){
        setContentPane(MainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,600);
        setVisible(true);
        operarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    //llamda de hilo
//
//
                    ExecutorService executorService=null;
                    executorService= Executors.newSingleThreadExecutor();
                    executorService.execute(()-> {
                        HttpClient client = HttpClient.newHttpClient();
                        HttpRequest request = HttpRequest.newBuilder()
                            .uri(URI.create("https://fakestoreapi.com/products/5"))
                            .build();
                    CompletableFuture<HttpResponse<String>> respuesta=client.sendAsync(request, HttpResponse.BodyHandlers.ofString());
                    String res=respuesta.join().body();
                    //System.out.println(res);
                    textArea1.setText(res);
                    });
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }

    public static void main(String[] args) {
        new GUIThread();
    }
}
