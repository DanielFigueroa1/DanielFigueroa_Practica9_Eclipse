package main;

import java.util.UUID;

import processing.core.PApplet;

public class Orden extends PApplet{
	
	private String imagenPedido;
	private String numeroPedido;
	private String horaPedido;
	
	
	public Orden (String imagenPedido, String numeroPedido, String horaPedido) {
		this.imagenPedido = imagenPedido;
		this.numeroPedido = numeroPedido;
		this.horaPedido = horaPedido;
	}

	public String getImagenPedido() {
		return imagenPedido;
	}

	public void setImagenPedido(String imagenPedido) {
		this.imagenPedido = imagenPedido;
	}

	public String getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(String numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public String getHoraPedido() {
		return horaPedido;
	}

	public void setHoraPedido(String horaPedido) {
		this.horaPedido = horaPedido;
	}

	public void paint(int posX,int posY) {
		// TODO Auto-generated method stub
		text ("Pedido #"+numeroPedido, posX, posY);
		text ("hora"+horaPedido,posX+30,posY+10);
		image(loadImage("./lib/"+imagenPedido+""), posX, posY);
		System.out.println("./lib/"+imagenPedido+"");
		
		
	}
	
	
}
