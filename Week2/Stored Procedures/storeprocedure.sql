CREATE OR REPLACE PROCEDURE Calculate_Grade (p_marks IN NUMBER) AS
    v_grade VARCHAR2(10);
BEGIN
    IF p_marks >= 90 THEN
        v_grade := 'A+';
    ELSIF p_marks >= 80 THEN
        v_grade := 'A';
    ELSIF p_marks >= 70 THEN
        v_grade := 'B';
    ELSIF p_marks >= 60 THEN
        v_grade := 'C';
    ELSIF p_marks >= 50 THEN
        v_grade := 'D';
    ELSE
        v_grade := 'Fail';
    END IF;

    DBMS_OUTPUT.PUT_LINE('Marks: ' || p_marks || ', Grade: ' || v_grade);
END;
/


SET SERVEROUTPUT ON;


BEGIN
    Calculate_Grade(85);
END;
/



