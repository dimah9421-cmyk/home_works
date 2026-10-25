// Вариант - 19

#include <stdio.h>
#include <vector>

#include "matrix.h"

int main(){
    std :: vector<std :: vector<double>> A, l, lt;
    std :: vector<double> B, x, y;

    puts("1 - идти по заданию, 0 - считать рандомную матрицу");
    int f = 0;
    scanf("%d", &f);
    int n = 5;
    if (f == 1){
        task_fill(A, B);
        
        puts("A:");
        printm(A);

        puts("B:");
        for (unsigned int i = 0; i < B.size(); i++)
            printf("    %.2f\n", B[i]);
    }
    else if (f == 0){
        
        puts("Введите количество переменных");
        
        scanf("%d", &n);

        A.resize(n);
        B.resize(n);
        for (unsigned int i = 0; i < n; i++){
            A[i].resize(n);
        }
        
        rand_fill(A, B);

        puts("A:");
        printm(A);

        puts("B:");
        for(unsigned int i = 0; i < n; i++)
            printf("    %.2f\n", B[i]);

    }
    l.resize(n);
    lt.resize(n);
    for (unsigned int i = 0; i < n; i++){
        l[i].resize(n);
        lt[i].resize(n);
    }
    l[0][0] = sqrt(A[0][0]);

    for (unsigned int i = 0; i < n; i ++)
        l[i][0] = A[i][0] / l[0][0];
    
    for (unsigned int k = 0; k < n; k ++){
        double sum_sqrt = 0;
        for (unsigned int i = 0; i < k; i ++){
            sum_sqrt = sum_sqrt + pow(l[k][i], 2);
        }
        l[k][k] = sqrt(A[k][k] - sum_sqrt);
        for (unsigned int i = k + 1; i < n; i ++){
            double pairsum = 0; 
            for (unsigned int m = 0; m < k; m++)
                pairsum = pairsum + l[i][m] * l[k][m];
            l[i][k] = (A[i][k] - pairsum) / l[k][k];
            }
        }
    for (unsigned int i = 0; i < n; i ++)
        for (unsigned int j = 0; j < 0; j ++)
            lt[i][j] = l[j][i];
    
    puts("матрица L:");
    printm(l);
    
    puts("матрица Lt:");
    printm(lt);

    }