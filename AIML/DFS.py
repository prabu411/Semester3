def dfs(graph,start,goal,visited=None):
    if visited is None:
        visited=set()

    visited.add(start)
    if start == goal:
        return [start]
    
    for neighbour in graph.get(start,[]):
        if neighbour not in visited:
            path = dfs(graph, neighbour, goal, visited)
            if path is not None:
                return [start] + path
    return None

graph={'A':{'B', 'C'},
        'B':{'A', 'D', 'E'},
        'c':{'A', 'F'}
        }
print(dfs(graph,'A','F'))
# Output: ['A', 'C', 'F']