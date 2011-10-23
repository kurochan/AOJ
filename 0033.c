#include <stdio.h>

int solve(int a[],int next,int b,int c){
    int buf;
    int flag=0;
    if(next>=10){
        return 1;
    }
    if(a[next]>b){
        buf=b;
        b=a[next];
        if(solve(a,next+1,b,c)){
            flag=1;
        }
        b=buf;
    }
    if(a[next]>c){
        c=a[next];
        if(solve(a,next+1,b,c)){
            flag=1;
        }
    }
    return flag;
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

