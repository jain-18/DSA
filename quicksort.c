#include<stdio.h>
int Quick(int num[],int lb,int ub);
int main(){
    int i,n,num[100],j,temp;
    printf("Enter number of elements :- ");
    scanf("%d",&n);

    printf("\nEnter numbers :- ");
    for(i = 0;i<n;i++){
        printf("\nNumber %d :- ",i+1);
        scanf("%d",&num[i]);
    }
    Quicksort(num,0,n-1);
    printf("\nnumbers :- ");
    for(i = 0;i<n;i++){
        printf("\t%d",num[i]);
    }
}
int Quick(int num[],int lb,int ub){
    int pivot = num[lb];
    int start = lb;
    int end = ub;
    int temp;

    while(start<end)
    {
    while(num[start]<= pivot){
        start++;
    }
    while(num[end]>pivot){
        end--;
    }if(start<end){
        temp = num[end];
        num[end] = num[start];
        num[start] = temp;
    }
    }
    temp = num[end];
    num[end] = num[lb];
    num[lb] = temp;
    return end;  
}
void Quicksort(int num[],int lb,int ub){
    if(lb<ub){
        int loc = Quick(num,lb,ub);
        Quicksort(num,lb,loc-1);
        Quicksort(num,loc+1,ub);
    }
}