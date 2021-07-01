
package client;

        import java.io.IOException;
        import java.io.PrintWriter;
        import java.net.ServerSocket;
        import java.net.Socket;
        import java.util.Scanner;


public class Clien {
    public static void main(String[] args) throws IOException {
        final String HOST = "127.1.1.1";
        final int PORT = 4030;

        try (
                Socket socket = new Socket(HOST, PORT);
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                Scanner in = new Scanner(socket.getInputStream());
                Scanner s = new Scanner(System.in);
        ) {

                System.out.print("inter 5 number: ");
                for (int i = 1; i<6; i++){
                    int input = s.nextInt();
                    out.println(input);
                }

        }
    }
}
 class Server{
    public static void main(String[] args) throws IOException {
        final int PORT = 4030;
        ServerSocket serverSocket = new ServerSocket(PORT);


        while (true) {
            Socket clientSocket = serverSocket.accept();
            Thread t = new Thread((Runnable) serverSocket) {
                public void run() {
                    try (
                            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                            Scanner in = new Scanner(clientSocket.getInputStream());
                    ) {
                        for (int )


                    } catch (IOException e) { }

                }
            };
            t.start();
        }
    }
}