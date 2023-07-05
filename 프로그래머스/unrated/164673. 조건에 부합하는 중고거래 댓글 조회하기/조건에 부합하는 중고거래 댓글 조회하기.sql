-- 코드를 입력하세요
SELECT b.TITLE, b.BOARD_ID, r.REPLY_ID, r.WRITER_ID, r.CONTENTS,
        to_char(r.CREATED_DATE,'YYYY-MM-DD') as CREATED_DATE
        from USED_GOODS_BOARD b
        join USED_GOODS_REPLY r
            on b.BOARD_ID = r.BOARD_ID
        where extract(year from b.CREATED_DATE) = '2022'
        and  extract(month from b.CREATED_DATE) = '10'
        
        order by to_char(r.CREATED_DATE,'YYYY-MM-DD') ,b.TITLE ;