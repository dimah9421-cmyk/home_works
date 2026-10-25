#include <stdio.h>
#include <vector>
#include <cstdlib>
#include <time.h>


void task_fill(std :: vector <std :: vector <double>> & m,  std::vector<double> & m2){
    m = {
        {   {9.0, 2.0, 3.0, 4.0, 2.0},
            {2.0, 9.0, 3.0, 5.0, 1.0},
            {3.0, 3.0, 8.0, 6.0, 4.0},
            {4.0, 5.0, 6.0, 8.0, 4.0},
            {2.0, 1.0, 4.0, 4.0, 7.0},}
    };
    m2 = {  32.0,
            40.0, 
            49.0, 
            52.0, 
            31.0 };
}

void rand_fill(std :: vector <std :: vector <double>> & m, std :: vector<double> & m2){
    srand(time(0));
    for (unsigned int i = 0; i < m.size(); i++){ 
        m2[i] = fabs((double)((rand() % 400) - 200) / 7.0);
        for (unsigned int j = 0; j <= i; j++){     
            double val = fabs((double)((rand() % 400) - 200) / 7.0);
            if (i == j)
                val += m.size() * 5;
            m[i][j] = val;
            m[j][i] = val;
            }
        }
    }

void printm(std :: vector <std :: vector <double>> m){
    for (unsigned int i = 0; i < m.size(); i++) {
        for (unsigned int j = 0; j < m.size(); j++) {
            printf("%9.3f ", m[i][j]);
        }
        puts("");
    }
}
