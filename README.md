# ThreeWordsNews
0. setting.gradle (project)
```
buildscript {
    ext{  // replaced from ext.kotlin_version = '1.3.41' 
        kotlin_version = '1.3.41'
        lifecycle_version = '2.2.0'

        glide_version = '4.11.0'
        retrofit_version = '2.8.1'
        jsoup_version = '1.13.1'
        rxandroid_version = '2.1.1'
        rxkotlin_version = '2.4.0'
        coroutines_version = '1.3.7'
        ankoVersion = '0.10.2'
        koinVersion = '1.0.2'
        okHttpVersion = '3.8.1'

        circleimageview_version = '3.1.0'
        recyclerview_version = '1.1.0'
        swiperefreshlayout_version = '1.0.0'
    }
    ...
}
```   

1. setting.gradle (app)   
```
apply plugin: 'kotlin-kapt'
...
android {
    
    .....
    
    dataBinding{
        enabled = true
    }
}
```

2. XML structures     
    Link Here : [RSS News](https://news.google.com/rss?hl=en-US&amp;gl=US&amp;ceid=US:en, "RSS News Feed")
```
<rss>
    <channel>
        <item>
            <link>
            <guid>
            <pubDate>
            <source url="url">publisher</source>
            ...
        </item> 
        
        <item>
            ...
        <item>
            ...
    </channel>
</rss>
```   

3. additional information
```
var mainContent: String = "",
var charset: Charset = Charset.defaultCharset(),  // default = utf8
var image: String = "",
var keywords: Array<String> = arrayOf("", "", "")
```
