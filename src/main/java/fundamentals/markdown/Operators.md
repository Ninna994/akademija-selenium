# Operators

Operators are classified based on the functionality they provide.
Some of them are: 

1. **Arithmetic Operators**
   1. Used for arithmetic operations on primitive data types
   2. `*, /, %, +, -`
2. **Unary Operators**
   1. Need only one operand. Used to increment, decrement or negate a value
   2. `-, +, ++, --, !` (logical not, used to invert boolean)
3. **Assignment Operators**
   1. Used to assign value to variable. Value given on the right-hand side of the operator is assigned to the variable on the left.
   2. format: ```variable = value;```
   3. CAn be combined with other operators to build a shorter version of the statement - _Compound statements_
      1. `+=, -=, *=, /=, %=`
      2. for example a = a + 5; is the same as a += 5;
4. **Relational Operators**
   1. These operators are used to check for relations like equality, greater than, and less than. 
   2. They return _boolean results_ after the comparison and are extensively used in looping statements as well as conditional if-else statements
   3. general format: ```variable relation_operator value```
   4. `==, !=, <, >, <=, >=`
5. **Logical Operators**
   1. These operators are used to perform “logical AND” and “logical OR” operations, i.e., a function similar to AND gate and OR gate in digital electronics.
   2. One thing to keep in mind is the second condition is not evaluated if the first one is false
   3. && - Logical AND - true when both are true
   4. || - Logical OR - true when any is true
   5. ! - Logical NOT - returns true when condition is false, and vice-versa
6. **Ternary Operators**
   1. Ternary operator is a shorthand version of the if-else statement. It has three operands and hence the name ternary.
   2. general format ```condition ? if true : if false```
   3. The above statement means that if the condition evaluates to true, then execute the statements after the ‘?’ else execute the statements after the ‘:’.
   4. 
7. **Instance of Operator**
8. **Bitwise Operators**
   1. `&, ^, |`
   2. The bitwise & operator always checks both conditions whether first condition is true or false.
9. **Shift Operators**
   1. `<<` - shift left - is used to shift all of the bits in a value to the left side of a specified number of times.
   4. `>>` - is used to move the value of the left operand to right by the number of bits specified by the right operand.

