#include <bits/stdc++.h>
using namespace std;
const int N = 10e3;
vector<int> graph[N];
bool visited[N];

void DFS(int vertex)
{
    visited[vertex] = true;
    cout << vertex << " ";
    for (int child : graph[vertex])
    {
        if (visited[child]) continue;
        DFS(child);
    }
}

int main()
{
    int n, m;
    cout << "Enter number of node and edges: ";
    cin >> n >> m;
    for (int i = 1; i <= m; i++)
    {
        int v1, v2;
        cin >> v1 >> v2;
        graph[v1].push_back(v2);
        graph[v2].push_back(v1);
    }
    DFS(1);
    cout << endl;
}
