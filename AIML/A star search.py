import heapq

def a_star_search(graph, start, goal, heuristic):
    queue = [(heuristic[start], 0, start, [start])]
    
    visited = set()
    
    best_cost = {start: 0}
    while queue:
        # Line 5: Pop node with lowest f-value (g + h)
        f_value, g_value, node, path = heapq.heappop(queue)
        
        # Line 6: Check if we've reached the goal
        if node == goal:
            return path, g_value  # Return path and total cost
        
        # Line 7: Skip if node already visited
        if node in visited:
            continue
        
        # Line 8: Mark current node as visited
        visited.add(node)
        
        # Line 9: Explore all neighbors with their edge costs
        for neighbor, cost in graph.get(node, []):
            # Line 10: Calculate new cost to reach neighbor
            new_g_value = g_value + cost
            
            # Line 11: Only consider if this is a better path to neighbor
            if neighbor not in best_cost or new_g_value < best_cost[neighbor]:
                # Line 12: Update best known cost to neighbor
                best_cost[neighbor] = new_g_value
                
                # Line 13: Calculate f-value (g + h)
                f_value = new_g_value + heuristic[neighbor]
                
                # Line 14: Create new path
                new_path = path + [neighbor]
                
                # Line 15: Add to priority queue
                heapq.heappush(queue, (f_value, new_g_value, neighbor, new_path))
    
    # Line 16: No path found
    return None, float('inf')

# Example with weighted graph and admissible heuristic
weighted_graph = {
    'A': [('B', 2), ('C', 3)],
    'B': [('D', 3), ('E', 1)],
    'C': [('F', 4)],
    'D': [('G', 2)],
    'E': [('G', 3)],
    'F': [('G', 1)],
    'G': []
}

# Admissible heuristic (never overestimates actual cost to goal)
heuristic = {'A': 5, 'B': 4, 'C': 3, 'D': 2, 'E': 2, 'F': 1, 'G': 0}

path, cost = a_star_search(weighted_graph, 'A', 'G', heuristic)
print(f"A* Search Result: Path = {path}, Total Cost = {cost}")
