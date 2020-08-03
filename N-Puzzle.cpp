#include <bits/stdc++.h>
using namespace std;
char puzz[5][5]; int ans, r, c;
int main(){
    for(int i=0; i<4; i++)
        for(int j=0; j<4; j++){
            scanf(" %c", &puzz[i][j]);
            if(puzz[i][j]!='.'){
                r = (puzz[i][j]-'A')/4;
                c = (puzz[i][j]-'A')%4;
                ans += abs(i-r)+abs(j-c);
            }
        }
    printf("%d\n", ans);
}
