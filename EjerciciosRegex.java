public class EjerciciosRegex {
    public static void main(String[] args) {
        EjerciciosRegex ejercicios = new EjerciciosRegex();
        ejercicios.ejercicio9();
    }

    public void ejercicio1() {
        String inputValido = "100.2";
        String inputInvalido = "100.2.3";

        String regex = "^\\d{0,8}(\\.\\d{1,2})?$";

        System.out.println(inputValido.matches(regex));
        System.out.println(inputInvalido.matches(regex));
    }

    public void ejercicio2() {
        String inputValido = "500";
        String inputInvalido = "100.23";

        String regex = "^\\d+$";

        System.out.println(inputValido.matches(regex));
        System.out.println(inputInvalido.matches(regex));
    }

    public void ejercicio3() {
        String inputValido = "0.23";
        String inputInvalido = "100";

        String regex = "^\\d*\\.\\d+$";

        System.out.println(inputValido.matches(regex));
        System.out.println(inputInvalido.matches(regex));
    }

    public void ejercicio4() {
        String inputValido = "1";
        String inputInvalido = "abs";

        String regex = "^\\d*(\\.\\d+)?$";

        System.out.println(inputValido.matches(regex));
        System.out.println(inputInvalido.matches(regex));
    }

    public void ejercicio5() {
        String inputValido = "-3";
        String inputInvalido = "12AS";

        String regex = "^-?\\d*(\\.\\d+)?$";

        System.out.println(inputValido.matches(regex));
        System.out.println(inputInvalido.matches(regex));
    }

    public void ejercicio6() {
        String inputValido = "123ABC";
        String inputInvalido = "123ABC!";

        String regex = "^[a-zA-Z0-9]*$";

        System.out.println(inputValido.matches(regex));
        System.out.println(inputInvalido.matches(regex));
    }

    public void ejercicio7() {
        String inputValido = "BCD 123";
        String inputInvalido = "BCD 123!";

        String regex = "^[a-zA-Z0-9 ]*$";

        System.out.println(inputValido.matches(regex));
        System.out.println(inputInvalido.matches(regex));
    }

    public void ejercicio8() {
        String inputValido = "correo.valido+prueba@dominio.real.com";
        String inputInvalido = "estonoesuncorreo@.com";

        String regex = "^([a-z0-9_\\.\\+-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$";

        System.out.println(inputValido.matches(regex));
        System.out.println(inputInvalido.matches(regex));
    }

    public void ejercicio9() {
        String inputValido = "Contraseña1!Fuerte";
        String inputInvalido = "contraseñasimple";

        String regex = "(?=(.*[0-9]))(?=.*[\\!@#$%^&*()\\[\\]{}\\-_+=~`|:;\"'<>,.?/])(?=.*[a-z])(?=.*[A-Z]).{8,}";

        System.out.println(inputValido.matches(regex));
        System.out.println(inputInvalido.matches(regex));
    }

    public void ejercicio10() {
        String inputValido = "usuario_valido";
        String inputInvalido = "NOMBRE DE USUARIO NO VALIDO";

        String regex = "^[a-z0-9_-]{3,16}$";

        System.out.println(inputValido.matches(regex));
        System.out.println(inputInvalido.matches(regex));
    }

    public void ejercicio11() {
        String inputValido = "https://www.dominio.com";
        String inputInvalido = "htp://dominio.com";

        String regex = "https?:\\/\\/(www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{2,256}\\.[a-z]{2,6}\\b([-a-zA-Z0-9@:%_\\+.~3()?&//=]*)";

        System.out.println(inputValido.matches(regex));
        System.out.println(inputInvalido.matches(regex));
    }

    public void ejercicio12() {
        String inputValido = "192.168.34.255";
        String inputInvalido = "1000.23.12.1";

        String regex = "^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";

        System.out.println(inputValido.matches(regex));
        System.out.println(inputInvalido.matches(regex));
    }

    public void ejercicio13() {
        String inputValido = "2023-06-15";
        String inputInvalido = "15/06/2023";

        String regex = "([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])$)";

        System.out.println(inputValido.matches(regex));
        System.out.println(inputInvalido.matches(regex));
    }

    public void ejercicio14() {
        String inputValido = "12:30 PM";
        String inputInvalido = "25:00 AM";

        String regex = "^(0[1-9]|1[0-2]):[0-5][0-9] (AM|PM)$";

        System.out.println(inputValido.matches(regex));
        System.out.println(inputInvalido.matches(regex));
    }

    public void ejercicio15() {
        String inputValido = "15:00";
        String inputInvalido = "12:30PM";

        String regex = "^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$";

        System.out.println(inputValido.matches(regex));
        System.out.println(inputInvalido.matches(regex));
    }
}
