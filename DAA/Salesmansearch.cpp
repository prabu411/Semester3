//Travelling salesman problem using brute fource approach
#include<iostream>
#include<vector>
#include<algorithm>
#include<climits>
using namespace std;

int tsp(const vector<vector<int>>& graph, int start) {
    int n = graph.size();
    vector<int> cities;
    for (int i = 0; i < n; i++) {
        if (i != start)
            cities.push_back(i);
    }
    int min_path = INT_MAX;
    do {
        int current_path = 0;
        int k = start;
        for (int i = 0; i < n - 1; i++) {
            current_path += graph[k][cities[i]];
            k = cities[i];
        }
        current_path += graph[k][start];
        min_path = min(min_path, current_path);
    } while (next_permutation(cities.begin(), cities.end()));
    return min_path;
}


int main() {
    vector<vector<int>> graph = {
        {0, 10, 15, 20},
        {10, 0, 35, 25},
        {15, 35, 0, 30},
        {20, 25, 30, 0}
    };
    int start_city = 0;
    int cost = tsp(graph, start_city);
    cout << "Minimum cost: " << cost << endl;
    return 0;
}