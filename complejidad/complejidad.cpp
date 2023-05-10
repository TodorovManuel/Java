/*
1)
1era función => 4
2da función => 6
3ra función => 9

2)
f1- o(n)
f2- o(1)
f3- o(n)
f4- o(n)
f5- o(n)

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


*/
#include <iostream>
#include <vector>
using namespace std;


int main()
{
vector<int>v={1, 2, 3};

}

int mesetaMasLarga(vector<int>v) {
    int i = 0;
    int maxMeseta = 0;
    int meseta;
    while (i < v.size())
    {
        int j = i + 1;
        while (j < v.size() && v[i] == v[j])
        {
            j++;
        }
        meseta = j - i;
        i = j;
        if (meseta > maxMeseta)
        {
            maxMeseta = meseta;
        }
    }
    return maxMeseta;
    }