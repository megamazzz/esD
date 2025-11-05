import java.io.*;
import java.net.*;

public class CalcolatriceServer {
    private static final int PORTA = 8844;
    
    public static void main(String[] args) {
        // TODO: Implementa qui il server

	try (ServerSocket serverSocket = new ServerSocket(PORTA)) {
    		System.out.println(" Server avviato sulla porta " + PORTA);
    		// Accetta connessioni...

		while (true) {
    			Socket client = serverSocket.accept();
			System.out.println(" Client: in ascolto ");
    			// Gestisci comunicazione con client

			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
     		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));	

			System.out.println("il risultato è: " + operazioni());
			
		}
		client.close();
		}

			// Esempio di parsing: "10 + 5"
			public static operazioni(){
							String[] parti = richiesta.split(" ");
			if (parti.length != 3) {
    				return "ERRORE: Formato non valido";
			}
			trasforma();

			switch (operazione) {
    			case "+": return num1 + num2;
    			case "-": return num1 - num2;
    			case "*": return num1 * num2;
    			case "/": 
        		if (num2 == 0) throw new ArithmeticException("Divisione per zero");
        			return num1 / num2;
    				default: throw new IllegalArgumentException("Operazione non supportata");
			}
			}

			private static trasforma(){
				double num1 = Double.parseDouble(parti[0]);
				String operazione = parti[1];
				double num2 = Double.parseDouble(parti[2]);
			}

	}
    }
}
