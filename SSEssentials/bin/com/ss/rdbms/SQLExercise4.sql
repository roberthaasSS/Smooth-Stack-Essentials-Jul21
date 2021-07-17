SELECT title, name, address
FROM library.tbl_book, library.tbl_borrower, library.tbl_library_branch, library.tbl_book_loans
WHERE branchName = "Sharpstown" AND dueDate = CURDATE() AND library.tbl_borrower.cardNo = library.tbl_book_loans.cardNo AND
library.tbl_book_loans.branchId = library.tbl_library_branch.branchId AND library.tbl_book.bookId = library.tbl_book_loans.bookId