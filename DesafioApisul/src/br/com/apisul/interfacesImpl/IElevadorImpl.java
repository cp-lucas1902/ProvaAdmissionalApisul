package br.com.apisul.interfacesImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.apisul.entity.Tecnopuc;
import br.com.apisul.interfaces.IElevadorService;
import br.com.apisul.util.TecUtils;

public class IElevadorImpl extends TecUtils implements IElevadorService {

	@Override
	public List<Integer> andarMenosUtilizado() {

		List<Integer> historicoAndar = new ArrayList<Integer>();
		TecUtils util = new TecUtils();
		try {
			List<Tecnopuc> lista = util.consumindoJson();

			for (Tecnopuc elevador : lista) {
				Tecnopuc aaa = new Tecnopuc();
				aaa.setAndar(elevador.getAndar());
				historicoAndar.add(aaa.getAndar());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return historicoAndar;
	}

	public Integer calculateModeInteiro(List<Integer> listaAndar, boolean mixMax) {

		Integer[] arr = listaAndar.toArray(new Integer[0]);

		if (listaAndar != null) {
			if (arr == null || arr.length == 0) {
				return null;
			}
			Map<Integer, Integer> frequencyMap = new HashMap<>();

			if (mixMax == true) {
				int maxFrequency = 1;
				Integer mode = arr[0];

				for (Integer c : arr) {
					int frequency = frequencyMap.getOrDefault(c, 0) + 1;
					frequencyMap.put(c, frequency);
					if (frequency > maxFrequency) {
						maxFrequency = frequency;
						mode = c;
					}
				}

				System.out.println("Questao B: O andar ao qual se dirigia mais vezes e o andar: " + mode);
				return mode;
			} else {

				for (Integer c : arr) {
					int frequency = frequencyMap.getOrDefault(c, 0) + 1;
					frequencyMap.put(c, frequency);
				}

				int leastFrequency = Integer.MAX_VALUE;
				Integer leastRepeated = null;

				for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
					if (entry.getValue() < leastFrequency) {
						leastFrequency = entry.getValue();
						leastRepeated = entry.getKey();
					}
				}

				System.out.println("Questao A-2: O andar ao qual se menos dirige e o andar: " + leastRepeated);
				return leastRepeated;
			}

		}

		return null;
	}

	@Override
	public List<Character> elevadorMaisFrequentado() {
		List<Character> historicoElevador = new ArrayList<Character>();
		TecUtils util = new TecUtils();

		try {
			List<Tecnopuc> lista = util.consumindoJson();

			for (Tecnopuc elevador : lista) {
				Tecnopuc aaa = new Tecnopuc();
				aaa.setElevador(elevador.getElevador());
				historicoElevador.add(aaa.getElevador());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return historicoElevador;
	}

	public static Character calculateMode(List<Character> listaDeChar) {

		Character[] arr = listaDeChar.toArray(new Character[0]);

		if (listaDeChar != null) {
			if (arr == null || arr.length == 0) {
				return null;
			}

			Map<Character, Integer> frequencyMap = new HashMap<>();
			int maxFrequency = 1;
			Character mode = arr[0];

			for (Character c : arr) {
				int frequency = frequencyMap.getOrDefault(c, 0) + 1;
				frequencyMap.put(c, frequency);
				if (frequency > maxFrequency) {
					maxFrequency = frequency;
					mode = c;
				}
			}

			if (mode == 'A' || mode == 'B' || mode == 'C' || mode == 'D' || mode == 'E') {
				System.out.println("Questao A: O elevador que e utiliza com mais frequencia: " + mode);
			} else {
				System.out.println("Questao C: O periodo que utilizava o elevador : " + mode);
			}

			return mode;
		}

		return null;
	}

	@Override
	public List<Character> periodoMaiorFluxoElevadorMaisFrequentado() {

		List<Character> historicoPeriodo = new ArrayList<Character>();

		try {
			TecUtils util = new TecUtils();
			List<Tecnopuc> lista = util.consumindoJson();

			for (Tecnopuc elevador : lista) {
				Tecnopuc aaa = new Tecnopuc();
				aaa.setTurno(elevador.getTurno());
				historicoPeriodo.add(aaa.getTurno());
			}

		} catch (Exception e) {
			e.getMessage();
		}

		return historicoPeriodo;
	}

	@Override
	public List<Character> elevadorMenosFrequentado() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Character> periodoMenorFluxoElevadorMenosFrequentado() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Character> periodoMaiorUtilizacaoConjuntoElevadores() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float percentualDeUsoElevadorA() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float percentualDeUsoElevadorB() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float percentualDeUsoElevadorC() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float percentualDeUsoElevadorD() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float percentualDeUsoElevadorE() {
		// TODO Auto-generated method stub
		return 0;
	}

}
