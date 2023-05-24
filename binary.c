#include<stdio.h>
bs(int a[],int lb,int ub,int x);
int main(){
    int i;
    int x,y;
    int n;
    int a[100];
    printf("Enter the no of elements :- ");
    scanf("%d",&n);
    printf("Enter the values of these elements :- ");
    for(i = 0;i<n;i++)
    {
        // printf("\n%d element :- ",i+1);
        scanf("%d",&a[i]);
    }
    printf("\nEnter the number you want to search :- ");
    scanf("%d",&x);
    y = bs(a,0,n-1,x);
    printf("%d",y);
    return 0;
}
bs(int a[],int lb,int ub,int x){
    int mid = (lb+ub)/2;
    while(lb<ub){
        if(x < a[mid]){
            return bs(a,lb,mid,x);
        }
        else if(x>a[mid]){
            return bs(a,mid+1,ub,x);
        }
        else
            return mid;
    }
    return -1;
}