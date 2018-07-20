import java.io.*;


public class Main {
	private static BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter stdErr = new PrintWriter(System.err, true);

	public static void main(String[] args) {
		Integer accion;
		Attachment lanzaGranadas2 = new Attachment("Lanza Granadas2", 4, 4, 100);
		Rifle m16 = new Rifle("M16", 30, 30, 35, lanzaGranadas2);
		while(true) {
			try {
				System.out.print("Selecciona la operacion que deseas realizar:\n\t1: Disparar\n\t2: Consultar Munición\n\t3: Recargar\n\t4: Disparar lanzagranadas\n\t0: Salir\tSeleccion: ");
				accion = Integer.parseInt(read.readLine());
				if (accion <= 4 && accion >= 0) {
					switch (accion) {
						case 1:
						m16.shoot();
						break;
						case 2:
						m16.howManyAmmo();
						break;
						case 3:
						m16.reload();
						break;
						case 4:
						m16.attachmentShoot();
						break;
						default:
						break;
					}    
				} else {
					System.out.println("Seleccion invalida\n");
				}
				Runtime.getRuntime().exec("clear");
			}
			catch (IOException ioe)
			{
				stdErr.println("\n" + ioe.toString() + "\n");
			}
			catch (NumberFormatException nfe)
			{
				stdErr.println("Se espera un valor numerico" + nfe.toString() + "\n");
			}
			catch (ArithmeticException are)
			{
				stdErr.println("\n" + are.toString() + "\n");
			}
			catch (StringIndexOutOfBoundsException obe)
			{
				stdErr.println("\n" + obe.toString() + "\n");
			}
		}
	}
}