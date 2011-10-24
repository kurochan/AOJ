#include <stdio.h>
#define MAX_BLOCK 100

void solve()
{
    int n,i,up=0,down=0;
    int c1,c2;
    scanf("%d",&n);
    scanf("%d",&c1);
    for(i=0;i<n-1;i++){
        scanf("%d",&c2);
        if((c1-c2)>down){
           down=c1-c2; 
        }
        if((c2-c1)>up){
            up=c2-c1;
        }
        c1=c2;
    }
    printf("%d %d\n",up,down);
}

int main()
{
    int n;
    scanf("%d",&n);
    while(n--){
        solve();
    }
    return 0;
}
