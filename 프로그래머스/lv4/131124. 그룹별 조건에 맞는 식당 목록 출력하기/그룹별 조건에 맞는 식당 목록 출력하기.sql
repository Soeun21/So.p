-- 코드를 입력하세요

SELECT M.MEMBER_NAME , R.REVIEW_TEXT, to_char(R.REVIEW_DATE,'YYYY-MM-DD') as REVIEW_DATE
        from MEMBER_PROFILE M
        join REST_REVIEW R
        on M.MEMBER_ID = R.MEMBER_ID
        where M.MEMBER_ID = 
        (
SELECT member_id 

from REST_REVIEW 
group by member_id 
order by count(member_id) desc
offset 0 rows
fetch next 1 rows only
)
        order by R.REVIEW_DATE, R.REVIEW_TEXT;