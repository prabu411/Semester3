def depth_limited_search(graph, start,goal,limit):

def dls_recursive(node,goal,limit,visited,path):
    path.append(node)
    if node==goal:
        return path.copy()
    if limit <= 0:
        path.pop()
        return None
    
    visited.add(node)
    for neighbour in graph.get(node,[]):
        if neighbour not in visited:
            result = dls_recursive(neighbour, goal, limit - 1, visited, path)
            if result is not None:
                return result
            
    visited.remove(node)
    path.pop()
    return None

return dls_recursive(start, goal, limit, set(), [])

