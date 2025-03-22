# NOTE
If you try to run this, it will fail as I've hidden the URL in my *local.properties* (I assumed Fetch would want to keep that info hidden and not have their servers blasted by random API calls if someone else found the code). 
In order to run on your setup, change the BASE_URL variable in the *app/src/main/java/com/benny/fetch_exercise/data/remote/RetrofitClient.kt* file with the actual URL.

# Summary
I used Retrofit to handle API calls as it's what I'm most comfortable with & requires less set up than KTOR. Kotlinx Serialization was used to convert JSON to Kotlin data types. OkHttp3 logger was used to log API calls. I didn't use a DI library as the app was small.

I first started development by developing the frontend as I like to know what the app will look like before I fill it with real data, so I created sample data for this & I then createdthe Retrofit Object & API interface. I then jumped back to the frontend to create a viewmodel & the app was finished.
