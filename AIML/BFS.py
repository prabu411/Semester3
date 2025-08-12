from collections import deque

def bfs(graph,start,goal):
    queue=deque([[start]])
    visited=set()
    while queue:
        path=queue.popleft()
        node=path[-1]
        if node==goal:
            return path
        if node not in visited:
            for neighbor in graph.get(node,[]):
                new_path=list(path)
                new_path.append(neighbour)
                queue.append(new_path)
            visited.add(node)
    return None

graph={'A':{'B', 'C'},
        'B':{'A', 'D', 'E'},
        'C':{'A', 'F'}
        }

print(bfs(graph,'A','F'))  

