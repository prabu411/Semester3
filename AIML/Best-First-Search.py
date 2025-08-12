import heapq

def best_first_search(graph, start, goal, heuristic):

    # We store heuristic value first for heapq to sort by it
    queue = [(heuristic[start], start, [start])]
    
    # Line 2: Set to keep track of visited nodes
    visited = set()
    
    # Line 3: Main loop - continue while there are nodes to explore
    while queue:
        # Line 4: Pop the node with the best (lowest) heuristic value
        h_value, node, path = heapq.heappop(queue)
        
        # Line 5: Check if we've reached the goal
        if node == goal:
            return path
        
        # Line 6: Skip if node already visited
        if node in visited:
            continue
        
        # Line 7: Mark current node as visited
        visited.add(node)
        
        # Line 8: Explore all neighbors
        for neighbor in graph.get(node, []):
            # Line 9: Only consider unvisited neighbors
            if neighbor not in visited:
                # Line 10: Create new path by extending current path
                new_path = path + [neighbor]
                
                # Line 11: Add neighbor to queue with its heuristic value
                heapq.heappush(queue, (heuristic[neighbor], neighbor, new_path))
    
    # Line 12: No path found
    return None

# Example usage with heuristic values (estimated distance to goal)
graph = {
    'A': ['B', 'C'],
    'B': ['D', 'E'],
    'C': ['F'],
    'D': ['G'],
    'E': ['G'],
    'F': ['G'],
    'G': []
}

# Heuristic: estimated distance to goal 'G'
heuristic = {'A': 6, 'B': 4, 'C': 4, 'D': 2, 'E': 3, 'F': 1, 'G': 0}

print("Best-First Search Result:", best_first_search(graph, 'A', 'G', heuristic))
