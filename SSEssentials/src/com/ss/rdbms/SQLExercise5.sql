SELECT branchName, COUNT(*)
FROM library.tbl_library_branch, library.tbl_book_loans
WHERE library.tbl_library_branch.branchId = library.tbl_book_loans.branchId
GROUP BY library.tbl_library_branch.branchName