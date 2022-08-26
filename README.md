## Pixabay App
- Android  application written with kotlin programming language.
- Consumes  Pixabay API to fetch and display a list of images.
<br>

Minimum API level supported is: 23

<br>
- Build System: [Gradle](https://gradle.org)

## Table of Contents
-  [Prerequisite](#prerequisite)
-  [Architecture](#architecture)
-  [TechStack](#techstack)
-  [Screenshots](#screenshots)
<br>

## Prerequisite
- To run these application you need 
* Android Studio.
<br>

## Architecture
- These application is build using MVVM architecture to allow separation of concerns.
<img src="assets/architecture.png">
<br>

## TechStack
 * [Kotlin](https://developer.android.com/kotlin) - Cross-platform, statically type, general purpose programming language with type inference.
 * [Hilt](https://developer.android.com/training/dependency-injection/hilt-android) - Dependency injection library for android.
 * [NavigationComponets](https://developer.android.com/guide/navigation/navigation-getting-started) - Provide easy navigation with Hilt fragment injection.
 * [Retrofit](https://square.github.io/retrofit/) - A Type-safe HTTP client for android and java used to consume REST APIs.
 * [Gson](https://github.com/google/gson) - Used to convert Json to java and kotlin objects.
 * [Glide](https://github.com/bumptech/glide) - Image loader library for android.
 * [Room Database](https://developer.android.com/training/data-storage/room) -  Provides abstraction layer over SQLite.
 * [LiveData](https://developer.android.com/topic/libraries/architecture/livedata)A lifecycle-aware data holder with the observer pattern.
 * [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - Used to store and manage UI related data in a lifecycle concious way.
 * [ViewBinding](https://developer.android.com/topic/libraries/view-binding) - Jetpack libary allowing type safe binding of views.
 * [Data Binding](https://developer.android.com/topic/libraries/data-binding) Allows you to bind UI components in your layouts to data sources in your app 
 * [Timber](https://github.com/JakeWharton/timber) - Android Logger with a small and extensible API.
 * [Glide](https://github.com/bumptech/glide) - Image loading framework for android that wraps media decoding, memory and disk caching.
 * [Flow API] - In coroutines, a flow is a type that can emit multiple values sequentially, as opposed to suspend functions that return only a single value.
 * [MockWebServer] - A mock web server is a program that mocks the behavior of an actual Retrofit API  but doesn’t make calls over the internet.It is used to Test Retrofit
 * [JUnit] - JUnit is a simple framework to write test the logic of program like Room database  , ViewModel and Repository.
 * [Espresso] - write small and reliable Android UI tests. 
<br>

