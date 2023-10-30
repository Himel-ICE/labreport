#include <bits/stdc++.h>
using namespace std;
const int N = 10e3;
vector<int> graph[N];
bool visited[N];
int level[N];

void BFS(int vertex)
{
    queue<int> q;
    q.push(vertex);
    visited[vertex] = true;
    while(!q.empty())
    {
        int cVertex = q.front();
        cout << cVertex << " " ;
        q.pop();
        for (int child : graph[cVertex])
        {
            if (!visited[child])
            {
                q.push(child);
                visited[child] = true;
                level[child] = level[cVertex] + 1;
            }
        }
    }
}

int main()
{
    int n, m;
    cout << "Enter number of node and edges: ";
    cin >> n >> m;
    cout << "Enter nodes: \n";
    for (int i = 1; i <= m; i++)
    {
        int v1, v2;
        cin >> v1 >> v2;
        graph[v1].push_back(v2);
        graph[v2].push_back(v1);
    }
    BFS(1);
    cout << endl;
    for (int i = 1; i <= n; i++)
        cout << "Node: " << i << " Level: " << level[i] << endl;
}

