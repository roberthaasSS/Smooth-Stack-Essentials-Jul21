SELECT title, noOfCopies
FROM library.tbl_author NATURAL JOIN library.tbl_book NATURAL JOIN library.tbl_book_copies NATURAL JOIN library.tbl_library_branch
WHERE library.tbl_author.authorName = "Stephen King" AND library.tbl_library_branch.branchName = "Central"
