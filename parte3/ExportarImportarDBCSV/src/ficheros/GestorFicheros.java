package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GestorFicheros {
	
	protected FileWriter fw;
	protected PrintWriter pw;
	protected File f;
	protected FileReader fr;
	protected BufferedReader br;
	protected String linea;
	protected String totalLineas;
	
	public GestorFicheros() {
		this.fw=null;
		this.pw=null;
		this.f=null;
		this.fr=null;
		this.br=null;
		this.linea="";
		this.totalLineas="";
	}
	
	public FileReader getFr() {
		return fr;
	}

	public void setFr(FileReader fr) {
		this.fr = fr;
	}

	public BufferedReader getBr() {
		return br;
	}

	public void setBr(BufferedReader br) {
		this.br = br;
	}

	public FileWriter getFw() {
		return fw;
	}

	public void setFw(FileWriter fw) {
		this.fw = fw;
	}

	public PrintWriter getPw() {
		return pw;
	}

	public void setPw(PrintWriter pw) {
		this.pw = pw;
	}

	public File getF() {
		return f;
	}

	public void setF(File f) {
		this.f = f;
	}

	public String escribirFichero(String nombreFichero, String contenido) {
		f = new File(nombreFichero);
		try {
			fw=new FileWriter(f);
			pw=new PrintWriter(fw);
			
			pw.println(contenido);
			
			pw.close();
			fw.close();
			
			return "El fichero se ha creado correctamente";
		
		} catch (IOException e) {
			
			
			return "Error al escribir en el fichero";
		}
		
	}
	
	public String leerFichero(String nombreFichero) {
		
		int contador=0;
		String salida ="";
		f = new File (nombreFichero);
		if(f.exists()) {
			//Existe el fichero
			try {
				fr = new FileReader (f);
				br = new BufferedReader(fr);
				
				while(linea!=null) {
					linea = br.readLine();
					if (contador >0) {
						if(linea != null) {
						totalLineas = totalLineas + linea + "\n";
					}
					}
					contador++;
				}
				br.close();
				fr.close();
				
				return totalLineas;
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			br = new BufferedReader (fr);
			
		} return salida;
	}

	public String getLinea() {
		return linea;
	}

	public void setLinea(String linea) {
		this.linea = linea;
	}

	public String getTotalLineas() {
		return totalLineas;
	}

	public void setTotalLineas(String totalLineas) {
		this.totalLineas = totalLineas;
	}
}
