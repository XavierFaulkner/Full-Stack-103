SELECT title
FROM Movie
WHERE director = 'Steven Spielberg';

SELECT DISTINCT m.year
From Movie AS m 
JOIN Rating AS r
ON m.mID = r.mID
WHERE r.stars > 3
ORDER BY m.year ASC;

SELECT m.title
From Movie AS m 
LEFT JOIN Rating AS r
ON m.mID = r.mID
WHERE r.mID IS NULL;

SELECT rev.name
From Reviewer AS rev
JOIN Rating AS rat
ON rev.rID = rat.rID
WHERE rat.ratingDate IS NULL;

SELECT rev.name, m.title, rat.stars, rat.ratingDate
FROM Rating as rat
JOIN Reviewer AS rev
ON rat.rID = rev.rID
JOIN movie AS m
ON rat.mID = m.mID
ORDER BY rev.name, m.title, rat.stars;

SELECT rev.name, m.title
FROM Reviewer AS rev, Movie AS m, (SELECT rat1.rID, rat1.mID FROM Rating AS rat1, Rating AS rat2 WHERE rat1.rID = rat2.rID AND rat1.mID = rat2.mID AND rat2.ratingDate > rat1.ratingDate AND rat2.stars > rat1.stars) AS rev2
WHERE rev.rID = rev2.rID AND m.mID = rev2.mID;

SELECT m.title, MAX(r.stars)
FROM Movie AS m
JOIN Rating AS r
ON m.mID = r.mID
GROUP BY m.mID
ORDER BY m.title;

SELECT m.title, (MAX(r.stars) - MIN(r.stars)) AS rating_spread
FROM Movie AS M
JOIN Rating AS r
ON m.mID = r.mID
GROUP BY m.mId
ORDER BY rating_spread DESC, m.title;

SELECT AVG(bef1980.avg) - AVG(aft1980.avg) AS pre_post_1980_Differrence
FROM 
(
SELECT AVG(stars) AS avg
FROM Movie as m
JOIN Rating as r
ON m.mID = r.mID
WHERE m.year < 1980
GROUP BY m.mID
) AS bef1980,
(
SELECT AVG(stars) AS avg
FROM Movie as m
JOIN Rating as r
ON m.mID = r.mID
WHERE m.year > 1980
GROUP BY m.mID
) AS aft1980;

SELECT DISTINCT rev.name
FROM Reviewer AS rev
JOIN Rating AS rat
ON rev.rID = rat.rID
JOIN Movie AS m
On rat.mID = m.mID
WHERE m.title = "Gone with the Wind";

SELECT rev.name, m.title, rat.stars
FROM Reviewer as rev
Join Rating as rat
On rev.rID = rat.rID
Join Movie as m
On rat.mID = m.mID
WHERE rev.name = m.director;

SELECT title
FROM Movie
UNION 
(SELECT name 
FROM Reviewer
ORDER BY name)
ORDER BY Title;

SELECT DISTINCT title
FROM movie as m
JOIN Rating as rat
ON m.mID = rat.mID
JOIN Reviewer as rev
ON rat.rID = rev.rID
WHERE rev.name != "Chris Jackson";

SELECT DISTINCT rev1.name, rev2.name
FROM Rating AS rat1, Rating AS rat2, Reviewer AS rev1, Reviewer AS rev2
WHERE rat1.mID = rat2.mID
AND rat1.rID = rev1.rID
AND rat2.rID = rev2.rID
AND rev1.name < rev2.name
ORDER BY rev1.name, rev2.name;

SELECT rev.name, m.title, rat.stars
FROM Movie AS m
JOIN Rating AS rat
ON rat.mID = m.mID
JOIN Reviewer AS rev
ON rev.rID = rat.rID
WHERE stars = 
(
SELECT MIN(stars)
FROM Rating
);