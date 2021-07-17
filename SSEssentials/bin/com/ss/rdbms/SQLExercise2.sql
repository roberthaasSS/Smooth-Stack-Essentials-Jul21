SELECT noOfCopies, branchName
FROM library.tbl_book NATURAL JOIN library.tbl_book_copies NATURAL JOIN library.tbl_library_branch
WHERE title='The Lost Tribe' 