-- 코드를 입력하세요
SELECT P.PRODUCT_CODE, sum(P.price * O.SALES_AMOUNT) as SALES
from PRODUCT P
join  OFFLINE_SALE O
on P.PRODUCT_ID = O.PRODUCT_ID
group by P.PRODUCT_CODE
order by  sum(P.price * O.SALES_AMOUNT)desc, P.PRODUCT_CODE;