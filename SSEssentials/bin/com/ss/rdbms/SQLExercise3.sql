SELECT name
FROM library.tbl_borrower 
WHERE NOT EXISTS ( SELECT * FROM library.tbl_book_loans WHERE library.tbl_borrower.cardNo = library.tbl_book_loans.cardNo)