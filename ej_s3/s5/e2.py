'''
Una tienda de discos de vinilo requiere que desarrolles un software para llevar su administración. El sistema consta de dos módulos:
Inventario
Ventas
El módulo de inventario debe contar con lo siguiente:
Ver toda la información de todos los discos disponibles (no vale solo imprimir la estructura de datos que los tiene, debe presentarse en consola de forma ordenada y legible)
Buscar información de un disco en específico por nombre
El módulo de ventas debe tener las siguientes funcionalidades:
Registrar una nueva venta (guardando en una estructura de datos dni y nombre del comprador y id del disco que se compró. Solo se puede comprar un disco a la vez)
Ver cantidad total de ventas
Requerimientos técnicos:
TODOS LOS INPUTS deben estar validados
Cada vez que se haga una compra, debe suceder lo siguiente: se pide el dni y el nombre del comprador, se muestran los discos disponibles, se ingresa la elección del comprador, se muestra un resumen de la compra y se actualiza la cantidad de discos comprada y la cantidad disponible
Guardar la información de las compras en la estructura de datos de su elección
Utilizar el diccionario de discos dado
El software debe contar con un menú inicial donde se pueda seleccionar qué se va a hacer. Al terminarse la operación en curso, debe volverse a dicho menú
BONO (3pts):
Si los últimos 3 números del DNI de un cliente es un número incremental, otorgarle un 20% de descuento en su compra final.
Número incremental: Se le llama “número de dígitos incrementales” a aquel número para el que cada uno de sus dígitos es menor o igual al que le sigue. Por ejemplo, 1338 es un número de dígitos incrementales; porque 1<3, 3=3 y 3<8. Por otro lado, 597 no lo es; porque 5<9 pero 9>7.
'''

vinyls = {
  '1': { 'name': 'Cuando Los Acéfalos Predominan',
        'author': 'Rawayana',
        'release_year': '2021',
        'stock': 1000,
        'sold': 0,
        'price': 10,
      },
  '2': { 'name': 'Notes on a Conditional Form',
        'author': 'The 1975',
        'release_year': '2020',
        'stock': 1200,
        'sold': 0,
        'price': 20,
      },
  '3': { 'name': 'Call Me If You Get Lost',
        'author': 'Tyler, the Creator',
        'release_year': '2021',
        'stock': 900,
        'sold': 0,
        'price': 30,
      },
  '4': { 'name': 'El Mal Querer',
        'author': 'Rosalía',
        'release_year': '2018',
        'stock': 980,
        'sold': 0,
        'price': 40,
      },
  '5': { 'name': 'The Dark Side of the Moon',
        'author': 'Pink Floyd',
        'release_year': '1973',
        'stock': 500,
        'sold': 0,
        'price': 50,
      },
}

while True: #loop para que el programa corra hasta que se quiera detener
    print("Bienvenidos a la tienda de discos. \n 1. Inventario \n 2.Ventas \n 3. salir")
    module = input("Ingrese el numero 1 si quiere ir al inventario y el numero 2 si quiere ir a ventas")
    while(module != "1" and module != "2" and module != "3"):
        module = input("Ingrese una de las opciones validas")

    if(module == "1"):
        print("Modulo de inventario. \n 1. Ver inventario \n 2. Buscar info")
        option = input("Ingrese 1 si quiere ver el inventario y 2 si quiere buscar info")
        while(option != "1" and option != "2"):
            option = input("Ingrese una de las opciones validas")
        
        if(option == "1"):
            for key, value in vinyls.items():
                print(f"\n--{key}------")
                for k, v in value.items():
                    print(f"\t{k.title()}: {v}")
                
        if(option == "2"):
            name = input("Ingrese el nombre del disco que quiere buscar")
            found = False
            for key, value in vinyls.items():
                for k, v in value.items():
                    if (k == "name" and name == v):
                        found = True
                        for k2, v2 in value.items():
                            print(f"{k2} : {v2}")

            if not found:
                print("No se consiguio mi pana sorry")
            
            
