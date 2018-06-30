# SharedPrefsUtils
A SharedPreferences wrapper to avoid Editor's interface

### Installing

Add the JitPack repository to your root build.gradle at the end of repositories:

```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
If you have any troubles with JitPack repository try changing from ```https://jitpack.io``` to ```https://www.jitpack.io```.

Include one of these lines into your module's build.gradle dependencies block. Choose the version that's suitable for you

```
dependencies {
    implementation 'com.github.AHerbel.SharedPrefsUtils:sharedprefsutils:1.0.6'
    implementation 'com.github.AHerbel.SharedPrefsUtils:sharedprefsutils-gson:1.0.6'
}
```

### Initializing

Initialize the SharedPreferences in onCreate or attachBaseContext methods of your Application class
```
public class App extends Application {

    ....
    
    @Override
    protected void attachBaseContext(Context base) {
        SharedPrefsUtils.initialize(base, "sharedPrefsName");
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

### How to use it

Simple version

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
```

Gson version.
This version extends simple version adding the Google's Gson library to allow objects been saved as json strings in SharedPreferences.

```
// Storing an object
SharedPrefsUtils.putObject("some_key", anObject);

// Getting an object
MyObject myObject = SharedPrefsUtils.getObject("some_key", MyObject.class);
```

## Contributing

Any comments/feedbacks are welcome, feel free to open an issue or email me at [augustoherbel.it@gmail.com](augustoherbel.it@gmail.com).

## Author

**Augusto Herbel** - [AHerbel](https://github.com/AHerbel)

See also the list of [contributors](https://github.com/AHerbel/SharedPrefsUtils/contributors) who participated in this project.

## License

This project is licensed under the Apache 2.0 License - see the [LICENSE.md](LICENSE.md) file for details
