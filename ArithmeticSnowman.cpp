#include <bits/stdc++.h>

using namespace std;
int n, a[3001], cnt[100001], ans;

int main() {
// second ever C++ submission transferring from Java yayayayyaayayyayay
    scanf("%d", &n);
    for(int i=0; i<n; i++){
        scanf("%d", &a[i]); cnt[a[i]]++;
    }
    sort(a, a+n);
    for(int i=n-1; i>=0; i--){
        if(cnt[a[i]]>=3) { ans = max(ans, 3*a[i]); break; }
        for(int j=i-1; j>=0; j--){
            if(a[i] == a[j]) continue;
            int third = a[j] - (a[i] - a[j]);
            if(third >=0 && cnt[third] > 0) { ans = max(ans, 3*a[j]); break;}
        }
    }
    printf("%d\n", ans);
}
