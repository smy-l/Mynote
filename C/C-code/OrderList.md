//
//  main.c
//  顺序表
//
//  Created by smy on 2020/4/11.
//  Copyright © 2020 smy. All rights reserved.
//
#include <stdio.h>
#include <stdlib.h>

#define SIZE 5
#define LOOP_SIZE 10

typedef struct {
    int *head;       //顺序表指针变量
    int length;      //记录当前顺序表的长度
    int capacity;    //记录顺序表分配的存储容量
    
} SeqList;

/*初始化顺序表*/
SeqList initList() {
    SeqList list;
    list.head = (int *)malloc(SIZE * sizeof(int));
    
    if (!list.head) {
        printf("初始化失败！\n");
        exit(0);
    }
    
    list.length = 0;
    list.capacity = SIZE;
    return list;
}

/*显示顺序表*/
void printList(SeqList list) {
    for (int i = 0; i < list.length; i++) {
        printf("%d  ", list.head[i]);
    }
    
    printf("\n");
}

/*增*/
SeqList add(SeqList list, int elem, int pos) {
    //插入位置判断，取值范围为0～length
    if (pos > list.length  || pos < 0) {
        printf("插入位置有误\n");
        return list;
    }
    
    //重新分配内存，内存扩大一倍
    if (list.length == list.capacity) {
        int *temp = (int *)realloc(list.head, (list.capacity << 1) * sizeof(int));//内存扩大一倍
        
        if (!temp) {
            printf("内存分配失败！\n");
            return list;
        }
        
        list.head = temp;
        list.capacity <<= 1;
    }
    
    //插入位置及以后的元素依次后移一位
    for (int i = list.length - 1; i >= pos ; i--) {
        list.head[i + 1] = list.head[i];
    }
    
    list.head[pos] = elem;//元素插入空出的位置
    
    list.length++;//表长度+1
    return list;
}

/*删*/
SeqList delete(SeqList list , int pos) {
    //删除位置判断，取值范围为0～length-1
    if (pos >= list.length || pos < 0) {
        printf("删除位置有误\n");
        return list;
    }

    //将删除位置后续元素依次前移
    for (int i = pos ; i < list.length - 1 ; i++) {
        list.head[i] = list.head[i + 1];
    }
    
    list.length--;//表长度-1
    
    if(list.length <= (list.capacity >> 1)){
        int new_capacity = list.capacity >> 1;
        int *temp = realloc(list.head, new_capacity * sizeof(int));
        if(temp == NULL){
            //failed
            printf("realloc failed\n");
        }else{
            list.head = temp;
            list.capacity = new_capacity;
        }
    }


    return list;
}



int  main() {
    SeqList list = initList();
    list.head[0] = 1;
    for(int i = 0; i < LOOP_SIZE; i++){
        list = add(list,i,0);
        printList(list);
    }
    for(int i = 0; i < LOOP_SIZE; i++){
        list = delete(list, 0);
        printList(list);
    }
    free(list.head);
    list.head = NULL;
    
    return 0;
    
}
