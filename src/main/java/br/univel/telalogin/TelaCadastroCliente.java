package br.univel.telalogin;


import java.awt.BorderLayout;

import javax.swing.JPanel;

public class TelaCadastroCliente extends MolduraAbstract {

	public TelaCadastroCliente() {
		super();
	}

	@Override
	protected void configuraMiolo() {
		super.add(new MioloCadastroCliente(), BorderLayout.CENTER);
	}

	public void setCloseAction(Object object) {
		// TODO Auto-generated method stub
		
	}

}