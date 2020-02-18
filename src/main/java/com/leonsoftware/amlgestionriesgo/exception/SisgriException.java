/**
 *
 * @author LeonSoftware 2017
 */
package com.leonsoftware.amlgestionriesgo.exception;


public class SisgriException extends Exception {
	
	
	private String mensaje;
	private String codError;
	

    /**
	 * 
	 */
	private static final long serialVersionUID = 4427040729058912189L;

	/**
     * Creates a new instance of <code>SisgriException</code> without detail
     * message.
     */
    public SisgriException() {
    	
    }

    /**
     * Constructs an instance of <code>SisgriException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public SisgriException(String msg) {
        super(msg);
    }
    
    
    public SisgriException(String pMensaje, String pCodError) {
    	this.mensaje = pMensaje;
    	this.codError = pCodError;    	
    }

    
    /**
     * Metodos set y get     
     */
    
    
	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getCodError() {
		return codError;
	}

	public void setCodError(String codError) {
		this.codError = codError;
	}
    
}
