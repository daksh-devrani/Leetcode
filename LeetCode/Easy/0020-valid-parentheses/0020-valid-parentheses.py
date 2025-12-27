class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for i in s:
            if i in '([{':
                stack.append(i)
            else:
                if stack == []:
                    return False
                match(i):
                    case ')':
                        if stack[-1] == '(':
                            stack.pop(-1)
                            continue
                        else :
                            return False   
                    case ']':
                        if stack[-1] == '[':
                            stack.pop(-1)
                            continue
                        else :
                            return False 
                    case '}':
                        if stack[-1] == '{':
                            stack.pop(-1)
                            continue
                        else :
                            return False        
        if stack == []:
            return True
        else:
            return False                    