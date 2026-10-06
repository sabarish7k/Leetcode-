921. Minimum Add to Make Parentheses Valid

Difficulty: Medium
Language: Java
Approach: Stack

Problem

Given a string containing only ( and ), find the minimum number of parentheses that need to be added to make the string valid.

Approach

I used a Stack to keep track of unmatched parentheses.

When I find (, I push it into the stack because it may need a matching ).
When I find ):
If there is an unmatched ( in the stack, I remove it because they form a valid pair.
Otherwise, this ) does not have a matching (, so it needs an additional (.
At the end, any remaining parentheses in the stack are unmatched and need corresponding parentheses to make the string valid.

The variable count keeps track of the total number of parentheses that need to be added.

Example
Input
"())"
Output
1
Explanation

The string can be made valid by adding one (:

(()) 
Complexity
Time: O(n)
Space: O(n)

where n is the length of the string.

Key Idea

The main idea is to match every ( with a ) whenever possible.
Any unmatched parenthesis at the end represents one parenthesis that must be added.
