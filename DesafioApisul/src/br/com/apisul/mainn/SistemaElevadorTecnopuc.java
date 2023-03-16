package br.com.apisul.mainn;

import java.io.IOException;
import java.util.List;

import br.com.apisul.interfacesImpl.IElevadorImpl;
import br.com.apisul.util.ReadFile;

public class SistemaElevadorTecnopuc {

	public static void main(String[] args) throws IOException {

		// A: O elevador que utiliza com mais frequência (A, B, C, D ou E);
		IElevadorImpl a = new IElevadorImpl();
		List<Character> elevador = a.elevadorMaisFrequentado();
		a.calculateMode(elevador);

		// B: O andar ao qual se dirigia (0 a 15);
		IElevadorImpl b = new IElevadorImpl();
		List<Integer> andar = b.andarMenosUtilizado();
		b.calculateModeInteiro(andar, true);

		// C: O período que utilizava o elevador – M: Matutino; V: Vespertino; N:
		// Noturno.
		IElevadorImpl c = new IElevadorImpl();
		List<Character> periodo = c.periodoMaiorFluxoElevadorMaisFrequentado();
		c.calculateMode(periodo);

		System.out.println(" ----------------- Parte 2 ----------------- ");

		// A: Qual é o andar menos utilizado pelos usuários;
		IElevadorImpl d = new IElevadorImpl();
		List<Integer> andarMin = d.andarMenosUtilizado();
		b.calculateModeInteiro(andarMin, false);

	}

}
