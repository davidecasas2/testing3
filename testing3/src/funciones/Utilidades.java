package funciones;

/**
 * Clase de utilidades con funciones varias
 * @author David Casas
 *
 */
public class Utilidades {

	/**
	 * Constante para indicar el númreo de horas semanales
	 */
	public static final int HORASJORNADA = 38;
	
	/**
	 * Devuelve la nota en formato textual dada 
	 * una nota numérica., por ejemplo, si le pasamos un 4 
	 * devuelve suspenso, un 7 notable, etc. 
	 * Si la nota no está entre 0 y 10 lanzará una ArithmeticException.
	 * @param nota double la nota en formato numérico
	 * @return String representacion textual de la nota
	 * @throws ArtihmeticException cuando la nota no está entre 0 y 10
	 */
	public String devuelveNota(double nota) {
		String descripcion = "Matrícula";
		
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
			descripcion = "Matrícula";
		}
		return descripcion;
	}
	
	/**
	 *  método que calcula el salario de un empleado.
	 *  EL salario se calcula pagando hasta HORASJORANADA (38 horas) a 
	 *  precioHoras y el resto a precioExtras si las hubiera.
	 * @param numHoras int número de horas que ha hecho el trabajador
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
	 * Método que cuenta correctamente los divisores de 
	 * un número pasado como parámetro
	 * @param num int número cuyos divisores se quieren contar
	 * @return int cuenta de los divisores del número
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
	 * Método que devuelve el elemento menor del vector
	 * 
	 * @param v int [] vector con los números
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
	 * Método de ordenacion de la burbuja
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
