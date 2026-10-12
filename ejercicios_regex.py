import re

# Fecha: 2026-10-08
# Daniel Landero Arias - 23020770
# Lenguajes y Automatas 1 - Intituto Tecnologico de Veracruz
def main():
    ejercicio_1()

def ejercicio_1():
    input_valido = "100.2"
    input_invalido = "100.2.3"
    
    regex = r"^\d{0,8}(\.\d{1,2})?$"
    
    print(bool(re.fullmatch(regex, input_valido)))
    print(bool(re.fullmatch(regex, input_invalido)))

def ejercicio_2():
    input_valido = "500"
    input_invalido = "100.23"

    regex = r"^\d+$"

    print(bool(re.fullmatch(regex, input_valido)))
    print(bool(re.fullmatch(regex, input_invalido)))

def ejercicio_3():
    input_valido = "0.23"
    input_invalido = "100"

    regex = r"^\d*\.\d+$"

    print(bool(re.fullmatch(regex, input_valido)))
    print(bool(re.fullmatch(regex, input_invalido)))

def ejercicio_4():
    input_valido = "1"
    input_invalido = "abs"

    regex = r"^\d*(\.\d+)?$"

    print(bool(re.fullmatch(regex, input_valido)))
    print(bool(re.fullmatch(regex, input_invalido)))

def ejercicio_5():
    input_valido = "-3"
    input_invalido = "12AS"

    regex = r"^-?\d*(\.\d+)?$"

    print(bool(re.fullmatch(regex, input_valido)))
    print(bool(re.fullmatch(regex, input_invalido)))

def ejercicio_6():
    input_valido = "123ABC"
    input_invalido = "123Abc!"

    regex = r"^[a-zA-Z0-9]*$"

    print(bool(re.fullmatch(regex, input_valido)))
    print(bool(re.fullmatch(regex, input_invalido)))

def ejercicio_7():
    input_valido = "BDC 123"
    input_invalido = "BDC 123!"

    regex = r"^[a-zA-Z0-9 ]*$"

    print(bool(re.fullmatch(regex, input_valido)))
    print(bool(re.fullmatch(regex, input_invalido)))

def ejercicio_8():
    input_valido = "correo.valido+prueba@dominio.real.com"
    input_invalido = "estonoesuncorreo@.com"

    regex = r"^([a-z0-9_\.\+-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$"

    print(bool(re.fullmatch(regex, input_valido)))
    print(bool(re.fullmatch(regex, input_invalido)))


def ejercicio_9():
    input_valido = "ContrasenaSegura123!"
    input_invalido = "insegura"

    regex = r"(?=(.*[0-9]))(?=.*[\\!@#$%^&*()\[\]{}:;\"'<>,.?/])(?=.*[a-z])(?=.*[A-Z]).{8,}"

    print(bool(re.fullmatch(regex, input_valido)))
    print(bool(re.fullmatch(regex, input_invalido)))

def ejercicio_10():
    input_valido = "usuario_valido"
    input_invalido = "usuario invalido"

    regex = r"^[a-zA-Z0-9_-]{3,16}$"

    print(bool(re.fullmatch(regex, input_valido)))
    print(bool(re.fullmatch(regex, input_invalido)))

def ejercicio_11():
    input_valido = "hhtps://www.dominio.com"
    input_invalido = "htps://www.dominio.com"

    regex = r"https?:\/\/(www\.)?[-a-zA-Z0-9@:%._\+~#=]{2,256}\.[a-z]{2,6}\b([-a-zA-Z0-9@:%_\=.~3()?&//=]*)"

    print(bool(re.fullmatch(regex, input_valido)))
    print(bool(re.fullmatch(regex, input_invalido)))

def ejercicio_12():
    input_valido = "192.168.34.255"
    input_invalido = "192.168.34.256"

    regex = r"^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$"

    print(bool(re.fullmatch(regex, input_valido)))
    print(bool(re.fullmatch(regex, input_invalido)))

def ejercicio_13():
    input_valido = "2023-06-15"
    input_invalido = "2023/13/15"

    regex = r"^\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$"

    print(bool(re.fullmatch(regex, input_valido)))
    print(bool(re.fullmatch(regex, input_invalido)))

def ejercicio_14():
    input_valido = "12:30 PM"
    input_invalido = "25:61 AM"

    regex = r"^(0[1-9]|1[0-2]):([0-5][0-9])\s?(AM|PM)$"

    print(bool(re.fullmatch(regex, input_valido)))
    print(bool(re.fullmatch(regex, input_invalido)))

def ejercicio_15():
    input_valido = "15:00"
    input_invalido = "25:61"
    
    regex = r"^([01]?[0-9]|2[0-3]):[0-5][0-9]$"
    
    print(bool(re.fullmatch(regex, input_valido)))
    print(bool(re.fullmatch(regex, input_invalido)))