#include <stdio.h>

int solve(int a[],int next,int b,int c){
    if(next>=10){
        return 1;
    }
    if(a[next]>b){
        if(solve(a,next+1,a[next],c)){
            return 1;
        }
    }
    if(a[next]>c){
        if(solve(a,next+1,b,a[next])){
            return 1;
        }
    }
    return 0;
}

int main()
{
    int n,i;
    int a[10];
    scanf("%d",&n);
    while(n--){
        for(i=0;i<10;i++){
            scanf("%d",&a[i]);
        }
        if(solve(a,0,0,0)){
            printf("YES\n");
        }else{
            printf("NO\n");
        }
    }
    return 0;
}

