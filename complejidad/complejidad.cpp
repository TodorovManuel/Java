/*
1)
1era función => 4
2da función => 6 o 5 pero nosotros pusimos 6
3ra función => 4 + 4*n

2)
f1- o(n)
f2- o(1)
f3- o(n)
f4- o(1)
f5- o(n+r)

3)
a- Entra a un while para recorrer un vector, luego entra al siguiente while
 y con ayuda de la variable j accede a la proxima posición del vector
 (en el caso de que sea igual
 avanza a la siguiente posición).
 Se iguala meseta a la última posición del vector, luego se iguala i a j.
 Después chequea que la meseta actual sea mayor a la meseta máxima y en caso de que sea mayor
 iguala la meseta máxima a la actual.
 Luego cuando finaliza el while retorna la meseta máxima.

b-
o(n**2)

c-

int mesetaMasLarga(vector<int> &v) {
int maxMeseta = 0;
int meseta = 0;
int i = 0;
int n = v.size();


int j = i + 1;

while (i < n && j < n && v[i] == v[j]) {
    j++;
}

meseta = j - i;

if (meseta > maxMeseta) {
    maxMeseta = meseta;
}
    i = j;
}

return maxMeseta;
}

4)
o(n)

5)
o(n)

6)
vector<int>secuence = {5, 7, 3, 2, 2 etc etc};
int contadorActual = 0;
int consecutivosMaximos = 0;

for(int i = 0; i<secuence.size(); i++) {
    if(secuence[i] % 2 == 1) {
        contadorActual++;
    } else {
        if(contadorActual >= consecutivosMaximos) {
            consecutivosMaximos=contadorActual;
            contadorActual=0;
        }
    }
}

/* Ejercicio 7 como CR7 */ 

#include <iostream>
#include <vector>
using namespace std;

vector<bool>filaDistinta(bool matriz) {
    for(int i = 0; i<matriz)
}

int main()
{
bool matriz[3][2]={true, false},
                  {true, false},
                  {false, true};

}

         