SELECT title, noOfCopies
FROM library.tbl_book
INNER JOIN library.tbl_author ON library.tbl_book.authId = library.tbl_author.authorId
INNER JOIN library.tbl_book_copies ON library.tbl_book.bookId = library.tbl_book_copies.bookId
INNER JOIN library.tbl_library_branch ON library.tbl_book_copies.branchId = library.tbl_library_branch.branchId
WHERE library.tbl_author.authorName = 'Stephen King' AND library.tbl_library_branch.branchName = 'Central'