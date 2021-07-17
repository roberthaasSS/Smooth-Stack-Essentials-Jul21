SELECT name, address, COUNT(*)
FROM library.tbl_borrower, library.tbl_book_loans
WHERE library.tbl_borrower.cardNo = library.tbl_book_loans.cardNo
GROUP BY library.tbl_borrower.cardNo
HAVING COUNT(*) > 5