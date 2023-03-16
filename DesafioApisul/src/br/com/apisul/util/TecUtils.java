package br.com.apisul.util;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import br.com.apisul.entity.Tecnopuc;

public class TecUtils {

	public List<Tecnopuc> consumindoJson() throws IOException {

		//System.out.println(System.getProperty("user.dir"));
		String filePath = "C:\\Users\\Lucas Santana\\Desktop\\desafio-\\ProvaAdmissionalApisul\\DesafioApisul\\src\\input.json";
		String fileContents = ReadFile.readFile(filePath);

		Gson gson = new Gson();
		Type userListType = new TypeToken<ArrayList<Tecnopuc>>() {
		}.getType();

		ArrayList<Tecnopuc> tecArray = gson.fromJson(fileContents, userListType);

		List<Tecnopuc> lista = new ArrayList<Tecnopuc>();

		for (Tecnopuc predio : tecArray) {
			Tecnopuc novo = new Tecnopuc();
			novo.setAndar(predio.getAndar());
			novo.setElevador(predio.getElevador());
			novo.setTurno(predio.getTurno());
			lista.add(novo);
		}

		return lista;
	}

}
