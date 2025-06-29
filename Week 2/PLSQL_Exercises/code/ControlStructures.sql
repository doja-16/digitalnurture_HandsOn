DECLARE
  v_num NUMBER := 10;
BEGIN
  IF v_num > 0 THEN
    DBMS_OUTPUT.PUT_LINE('Number is positive');
  ELSE
    DBMS_OUTPUT.PUT_LINE('Number is zero or negative');
  END IF;
END;
/
