// Вариант - 19

#include <stdio.h>
#include <vector>

#include "matrix.h"

int main(){
    std :: vector<std :: vector<double>> A, L, L_t;
    std :: vector<double> B, X, Y;
    
    int n = 5;

    puts("1 - идти по заданию, 0 - считать рандомную матрицу");
    int f = 0;
    scanf("%d", &f);
    
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

    L.resize(n);
    L_t.resize(n);
    for (unsigned int i = 0; i < n; i++){
        L[i].resize(n);
        L_t[i].resize(n);
    }

    L[0][0] = sqrt(A[0][0]);

    for (unsigned int i = 1; i < n; i ++)
        L[i][0] = A[i][0] / L[0][0];
    
    for (unsigned int k = 1; k < n; k ++){
        double sum_sqrt = 0;
        for (unsigned int i = 0; i < k; i ++){
            sum_sqrt = sum_sqrt + pow(L[k][i], 2);
        }
        L[k][k] = sqrt(A[k][k] - sum_sqrt);
        for (unsigned int i = k + 1; i < n; i ++){
            double pairsum = 0; 
            for (unsigned int m = 0; m < k; m++)
                pairsum = pairsum + L[i][m] * L[k][m];
            L[i][k] = (A[i][k] - pairsum) / L[k][k];
            }
        }
    for (unsigned int i = 0; i < n; i ++)
        for (unsigned int j = 0; j < n; j ++)
            L_t[i][j] = L[j][i];
    
    puts("матрица L:");
    printm(L);
    
    puts("матрица Lt:");
    printm(L_t);
    
    Y.resize(n);
    Y[0] = B[0] / L[0][0];
    for (unsigned int i = 1; i < n; i++){
        Y[i] = B[i];
        for (unsigned int m = 0; m < i; m++)
            Y[i] = Y[i] - L[i][m] * Y[m];
        Y[i] = Y[i] / L[i][i];
    }
    
    X.resize(n);
    X[n - 1] = Y[n - 1]/L_t[n - 1][n - 1];
    for (int i = n - 2; i >= 0; i--){
        X[i] = Y[i];
        for (unsigned int m = i + 1; m < n; m++)
            X[i] = X[i] - L_t[i][m] * X[m];
        X[i] = X[i] / L_t[i][i];
    }

    puts("X:");
    for (unsigned int i = 0; i < n; i++)
        printf("%.2f\n", X[i]);
    }