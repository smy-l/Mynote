/*
 生成不重复的随机数(0~9)
*/

#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define SIZE 10

void swap(int *a, int x, int y){
    int temp = a[x];
    a[x] = a[y];
    a[y] = temp;
}

int main() {
    int a[SIZE];
    for (int i = 0; i < SIZE; i++) {
        a[i] = i;
    }
    
    int Randnums;
    srand((int)time(NULL));
    for(int i = 0; i < SIZE - 1; i++){//例：到最后一步时，只有一个元素，不用替换，因此SIZE-1
        Randnums = i + (rand() % (SIZE - i));
        if(Randnums != i){//如果相等不用替换
            swap(a, i, Randnums);
        }
    }
    for(int j = 0; j < SIZE; j++){
        printf("%d  ",a[j]);
    }
    printf("\n");
    return 0;
}

