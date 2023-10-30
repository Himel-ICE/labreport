#include <bits/stdc++.h>
using namespace std;
const int N = 10e3;
#define n 4
int TSP(int graph[][n], int s)
{
    vector<int> vertex;
    for (int i = 0; i < n; i++)
    {
        if (i != s) vertex.push_back(i);
    }
    int min_cost = N;
    while (next_permutation(vertex.begin(), vertex.end()))
    {
        int current_cost = 0;
        int j = s;
        for (int i = 0; i < vertex.size(); i++)
        {
            current_cost += graph[j][vertex[i]];
            j = vertex[i];
        }
        current_cost += graph[j][s];
        min_cost = min(min_cost, current_cost);
        return min_cost;
    }
}
int main()
{
   int graph[][n] = {{0, 10, 15, 20}, {10, 0, 35, 25}, {15, 35, 0, 30}, {20, 25, 30, 0}};
   cout << TSP(graph, 0) << endl;
}
