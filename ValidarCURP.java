/*
Fecha: 2026-10-08 
Daniel Landero Arias - 23020770
Lenguajes y Automatas 1 - Intituto Tecnologico de Veracruz
*/ 
public class ValidarCURP {
    public static void main(String[] args) {
        String input = "CURA051231MVZRLT00";

        String regexNombre = "[B-DF-HJ-NP-TV-Z]{1}[AEIOU]{1}[A-Z]{2}";
        String regexFecha = "\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])";
        String regexGenero = "[MH]";
        String regexEstados = "(AC|BS|BC|CC|CL|CM|CS|CH|DF|DG|GT|GR|HG|JC|MC|MN|MS|NT|NL|OC|PL|UT|UR|SP|SR|TC|TS|TL|VZ|YN|ZS|NE)";
        String regexHomoclave = "[B-DF-HJ-NP-TV-Z]{3}[A-Z0-9]\\d";

        String regexCURP = regexNombre + regexFecha + regexGenero + regexEstados + regexHomoclave;

        System.out.println(input.matches(regexCURP));
    }
}