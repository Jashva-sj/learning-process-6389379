DECLARE
    marks NUMBER;
    grade VARCHAR2(10);
BEGIN
    FOR i IN 1..3 LOOP
        DBMS_OUTPUT.PUT_LINE('Enter marks for student ' || i || ':');
        
         IF i = 1 THEN
            marks := 95; 
        ELSIF i = 2 THEN
            marks := 72;
        ELSE
            marks := 45; 
        END IF;
        
        -- Grade Calculation using IF-ELSIF
        IF marks >= 90 THEN
            grade := 'A+';
        ELSIF marks >= 80 THEN
            grade := 'A';
        ELSIF marks >= 70 THEN
            grade := 'B';
        ELSIF marks >= 60 THEN
            grade := 'C';
        ELSIF marks >= 50 THEN
            grade := 'D';
        ELSE
            grade := 'Fail';
        END IF;
        
        DBMS_OUTPUT.PUT_LINE('Marks: ' || marks || ', Grade: ' || grade);
        DBMS_OUTPUT.PUT_LINE('---------------------------');
    END LOOP;
END;
/
