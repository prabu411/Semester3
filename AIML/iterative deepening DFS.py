def iterative_deepening_dfs(graph, start, goal, max_depth=10):
    # Line 1: Try increasing depth limits
    for depth in range(max_depth + 1):
        print(f"Searching at depth limit: {depth}")
        
        # Line 2: Call depth-limited search with current limit
        result = depth_limited_search(graph, start, goal, depth)
        
        # Line 3: Return if solution found at this depth
        if result:
            return result, depth
    
    # Line 4: No solution found within max_depth
    return None, -1

def depth_limited_search_for_iddfs(graph, start, goal, limit):
    # Line 5: Recursive helper function
    def dls_helper(node, goal, limit, path, visited):
        # Line 6: Add current node to path
        path.append(node)
        
        # Line 7: Goal check
        if node == goal:
            return path.copy()
        
        # Line 8: Depth limit check
        if limit <= 0:
            path.pop()
            return None
        
        # Line 9: Mark as visited
        visited.add(node)
        
        # Line 10: Explore neighbors
        for neighbor in graph.get(node, []):
            if neighbor not in visited:
                # Line 11: Recursive exploration
                result = dls_helper(neighbor, goal, limit - 1, path, visited)
                if result:
                    return result
        
        # Line 12: Backtrack
        visited.remove(node)
        path.pop()
        return None
    
    # Line 13: Start DLS with current limit
    return dls_helper(start, goal, limit, [], set())

# Example usage
graph = {'A': ['B', 'C'], 'B': ['D', 'E'], 'C': ['F'], 'D': [], 'E': [], 'F': []}
path, depth_found = iterative_deepening_dfs(graph, 'A', 'E', 5)
print(f"IDDFS Result: Path = {path}, Found at depth = {depth_found}")
