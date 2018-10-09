# TvMaze
The aim of this app is to replicate the high level functionality of www.tvmaze.com and showcase an android app out of it. The TvMaze shows the tv shows which are scheduled to air on the current day starting at prime time.

This repository aims to help Android Devs with the integration of MVVM design pattern using Android Architecture Components.
It tries to give a solid implementation of `LiveData` and `ViewModel` and how those complex concepts can be integrated using Dagger 2 with dagger Android support. That said, no need to create `Subcomponent` to inject `Activity` or `Fragment`. 

## MVVM using Android Architecture Components
The codebase tries to follow Uncle Bob Clean Code Architechture with SOLID principles.
Read my article on medium:
[Migration from MVP to MVVM using Android Architecture Components](https://medium.com/@kumarashwini/migration-from-mvp-to-mvvm-using-android-architecture-components-4bc058a1f73c)

## Pagination using Paging Library 
The Shows screen displays the list of shows fetched from TvMaze API using `PagingLibray` of Android Architecture Components. It also handles the retry if any network error occurred.
Read my article on medium:
[Pagination using Paging Library with RxJava and Dagger](https://medium.com/@kumarashwini/pagination-using-paging-library-with-rxjava-and-dagger-d9d05dbd8eac)

## Room Persistence Library
The Favourites screen displayes the list of shows marked favourites from the Home screen. The user can add/remove from the favorites as and when required. The implementation of the favorites is done using `Room`  Persistence Library with RxJava and Dagger. 
Read my article on medium:
[Room with RxJava and Dagger](https://medium.com/@kumarashwini/room-with-rxjava-and-dagger-2722f4420651)

## Static Code Analysis
It also has Static Code Analysis tools integrated. Want to know more. Read my article on medium:
[Static Code Analysis for Android Using FindBugs, PMD and CheckStyle](https://blog.mindorks.com/static-code-analysis-for-android-using-findbugs-pmd-and-checkstyle-3a2861834c6a)

Sample Screenshots:

![Home](http://i.imgur.com/6YvBFTb.png)                       ![Favourite Shows](http://i.imgur.com/7dxorJc.png) 


![Shows](http://i.imgur.com/aEPrcdg.png) 
