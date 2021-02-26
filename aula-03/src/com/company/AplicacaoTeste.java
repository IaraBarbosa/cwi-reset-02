package com.company;

import com.company.domain.Editora;
import com.company.domain.Filme;
import com.company.enumerador.Genero;
import com.company.heranca.Diretor;

public class AplicacaoTeste {
    public static void main(String[] args) {

        //teste editora
       Editora editora1 = new Editora("Marvel", "EUA");
       System.out.println(editora1.getNome());
       Editora editora2 = new Editora("DC Comics", "EUA");
       System.out.println(editora2.getNome());

       //teste filme
       Diretor diretor = new Diretor("Joss Whedon", 40, 5, Genero.MASCULINO);

       Filme filme1 = new Filme("Vingadores", "Melhor filme",143, 2012,3 ,
               diretor);
       filme1.reproduzir();

       Filme filme2 = new Filme("Vingadores", "Melhor filme",143, 2012, 6,
                diretor);
       filme2.reproduzir();
    }
}