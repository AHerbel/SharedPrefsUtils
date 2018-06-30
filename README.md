# SharedPrefsUtils
A SharedPreferences wrapper to avoid Editor interface

### Installing

Include this line in your gradle dependencies block

```
Insert gradle implementation link
```

### How to use it

Initialize the SharedPreferences in onCreate or attachBaseContext methods of your Application class
```
public class App extends Application {

    ....
    
    @Override
    protected void attachBaseContext(Context base) {
        SharedPrefUtils.initialize(base, "sharedPrefsName");
    }
    
    ....

    @Override
    public void onCreate() {
        super.onCreate();
        SharedPrefsUtils.initialize(this, "sharedPrefsName");
    }

    ...
}

```

```
// Put some value
SharedPrefsUtils.putBoolean("some_key", some_value);

// Get a value
boolean value = SharedPrefsUtils.getBoolean("some_key");

// Contains
if(SharedPrefsUtils.contains("some_key")) {
  ...
}

// Remove
SharedPrefsUtils.remove("some_key");

/*** Library version with Google's Gson ***/

// Storing an object
SharedPrefsUtils.putObject("some_key", anObject);

// Getting an object
MyObject myObject = SharedPrefsUtils.getObject("some_key", MyObject.class);

```

## Contributing

Any comments and feedback are welcome, feel free to open an issue.

## Authors

* **Augusto Herbel** - *Initial work* - [AHerbel](https://github.com/AHerbel)

See also the list of [contributors](https://github.com/AHerbel/SharedPrefsUtils/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
