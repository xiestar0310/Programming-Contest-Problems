#include <bits/stdc++.h>
using namespace std;
struct P{int x, y;} p[102];
int N, ans=1e8;
int main(){
    scanf("%d", &N);
    for(int i=0; i<N; i++){
        scanf("%d %d", &p[i].x, &p[i].y);
        for(int j=0; j<i; j++)
            ans = min(ans, max(abs(p[i].x-p[j].x), abs(p[i].y-p[j].y)));
    }
    printf("%d\n", ans*ans);
}
