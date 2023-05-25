#include<stdio.h>
int main(){
    int i,n,num[100],j,temp;
    printf("Enter number of elements :- ");
    scanf("%d",&n);

    printf("\nEnter numbers :- ");
    for(i = 0;i<n;i++){
        printf("\nNumber %d :- ",i+1);
        scanf("%d",&num[i]);
    }

    for(i=0;i<n;i++){
        for(j=0;j<n-1-i;j++){
            if(num[j]>num[j+1]){
                temp = num[j];
                num[j]=num[j+1];
                num[j+1] = temp;
            }
        }
    }

    printf("\nnumbers :- ");
    for(i = 0;i<n;i++){
        printf("\t%d",num[i]);
    }
    return 0;
}
