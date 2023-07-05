-- 코드를 입력하세요
SELECT MEMBER_ID, MEMBER_NAME, GENDER, to_char(DATE_OF_BIRTH,'YYYY-MM-DD') as DATE_OF_BIRTH

FROM MEMBER_PROFILE 
WHERE extract(month from DATE_OF_BIRTH) = '03'
and TLNO is not null
and GENDER = 'W'
order by MEMBER_ID;