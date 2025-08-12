import heapq

def ucs(graph,start,goal):
    queue = [(0,[start])]
    visited = set()
    while queue:
        current_cost, path=heapq.heappop(queue)
        node = path[-1]
        if node == goal:
            return path
        if node visited:
            continue
        visited.add(node)

for neighbour, weight in graph.get(node,[]):
            if neighbour not in visited:
                  new_cost = current_cost + weight
                new_path= path + [neighbour]
                heapq.heappush(queue, (new_cost, new_path))
    return None,float ('inf')


weighted_graph={
    'A': [('B', 1), ('C', 4)],
    'B': [('A', 1), ('D', 2), ('E', 5)],
    'C': [('A', 4), ('F', 3)],
    'D': [('B', 2)],
    'E': [('B', 5)],
    'F': [('C', 3)]             
}

            continue
    return None

