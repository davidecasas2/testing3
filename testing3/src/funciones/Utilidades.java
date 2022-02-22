package funciones;

/**
 * Clase de utilidades con funciones varias
 * @author David Casas
 *
 */
public class Utilidades {

	/**
	 * Constante para indicar el n�mreo de horas semanales
	 */
	public static final int HORASJORNADA = 38;
	
	/**
	 * Devuelve la nota en formato textual dada 
	 * una nota num�rica., por ejemplo, si le pasamos un 4 
	 * devuelve suspenso, un 7 notable, etc. 
	 * Si la nota no est� entre 0 y 10 lanzar� una ArithmeticException.
	 * @param nota double la nota en formato num�rico
	 * @return String representacion textual de la nota
	 * @throws ArtihmeticException cuando la nota no est� entre 0 y 10
	 */
	public String devuelveNota(double nota) {
		String descripcion = "Matr�cula";
		
		if (nota<0.0 || nota >10) {
			throw new ArithmeticException("La nota debe estar entre 0.0 y 10");
		} else if (nota<5.0) {
			//fsdmfndsm,f
			descripcion="Suspenso";
		} else if (nota <6.5) {
			descripcion = "Bien";
		} else if (nota<8.5) {
			descripcion ="Notable";
		} else if (nota<10) {
			descripcion ="Sobresaliente";
		} else {
			descripcion = "Matr�cula";
		}
		return descripcion;
	}
	
	/**
	 *  m�todo que calcula el salario de un empleado.
	 *  EL salario se calcula pagando hasta HORASJORANADA (38 horas) a 
	 *  precioHoras y el resto a precioExtras si las hubiera.
	 * @param numHoras int n�mero de horas que ha hecho el trabajador
	 * @param precioHoras double precio por hora de las horas normales
	 * @param precioExtras double oreicio por hora de las horas extras
	 * @return double con el total de salario semanal
	 */
	public double calculaSalario(int numHoras, double precioHoras, double precioExtras) {
		int extras=0;
		int horas=numHoras;
		if (numHoras>HORASJORNADA) {
			extras = numHoras-HORASJORNADA;
			horas = HORASJORNADA;
		}
		return horas*precioHoras+extras*precioExtras;		
	}
	
	/**
	 * M�todo que cuenta correctamente los divisores de 
	 * un n�mero pasado como par�metro
	 * @param num int n�mero cuyos divisores se quieren contar
	 * @return int cuenta de los divisores del n�mero
	 */
	public int cuentaDivisores(int num) {
		int cuenta=0;
		
		for (int i = 1; i <=num; i++) {
			if (num%i==0) {
				cuenta++;
			}
		}
		return cuenta;
	}
	
	/**
	 * M�todo que devuelve el elemento menor del vector
	 * 
	 * @param v int [] vector con los n�meros
	 * @return double el menor elemento del vector
	 */
	public double devuelveMenor(int v[]) {
		double menor=v[0];
		for (int i = 0; i < v.length; i++) {
			if (v[i] < menor) {
				menor=v[i];
			}
		}
		return menor;
	}
	
	/** 
	 * M�todo de ordenacion de la burbuja
	 * @param v vector a ordenar
	 * @return int [] vector ordenado
	 */
	public int [] burbuja(int[] v)
    {
      int auxiliar;
      int[] ordenado;
      for(int i = 1; i < v.length; i++)
      {
        for(int j = 0;j < v.length-i;j++)
        {
          if(v[j] > v[j+1])
          {
            auxiliar = v[j];
            v[j] = v[j+1];
            v[j+1] = auxiliar;
          }   
        }
      }
      ordenado = v;
      return ordenado;
    }
	/*
	 * 
	 */
}
