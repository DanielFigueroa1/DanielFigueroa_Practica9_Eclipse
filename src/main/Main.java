package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import com.google.gson.Gson;

import processing.core.PApplet;

public class Main extends PApplet implements OnMessageListener {

	UDPConnection udp;
	
	
	private ArrayList <Orden> orden;
	
	

	public static void main(String[] args) {
		PApplet.main("main.Main");
	}
	
	public void settings() {
		size (800,600);
	}
	
	public void setup() {
		udp = new UDPConnection();
        udp.setObserver(this);
        udp.start();
		orden = new ArrayList<Orden>();
	}
	
	public void draw() {
		background(180);
	
		for(int i=0 ; i<orden.size() ; i++) {
			Orden datosOrden = orden.get(i);
			orden.get(i).paint(60,50*i+60); //distancia entre cada orden
			
		}
	}

	@Override
	public void recibirOrden(String orden) { //porque recibe una linea json seria String orden, agrega un elemento arraylist
		// TODO Auto-generated method stub
		
		Gson gson = new Gson();
		Orden datosOrden = gson.fromJson(orden, Orden.class);

		/*orden es la variable global*/this.orden.add (new Orden(datosOrden.getImagenPedido(),datosOrden.getNumeroPedido(),datosOrden.getHoraPedido())); //orden tipo string
	}
	
}
