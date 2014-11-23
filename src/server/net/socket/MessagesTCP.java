package server.net.socket;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;


public class MessagesTCP {
	
	
	public MessagesTCP() {
	}

	public void sendMessage(Socket socket, String message) throws IOException {
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeBytes(message);
	}
	
	public String recieveMessage(Socket socket) throws IOException {
		BufferedReader message = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String text = message.readLine();
		return text;
	}
}
