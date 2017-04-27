# Spotify for Android - Reimagined and Redesigned
### *A complete rewrite of the Spotify Android application*  
<br/>
<img align="left" width="460" src="http://i.imgur.com/4req9Th.png" title="spotify" />
<br/>
About four months ago, I began working on a project — I completely reverse-engineered the Android Spotify app, decompiled it, learned everything I could about how it was programmed and structured, and completely changed everything, from the user interface and color scheme to the way the app itself functions. This has easily been the most difficult, frustrating, fascinating, and incredibly fun project I’ve ever undertaken. There were a ridiculous number of obstacles along the way that I didn’t anticipate at all; the biggest hurdle was working around the obfuscated code — constantly hunting through and piecing together thousands and thousands of randomly-named java files that start from “aaa” and go all the way to “zzz”.
<br/>
<br/>
One of the most consistently frustrating (and yet also exciting) things I had to deal with was keeping up with Spotify’s updates to the Android app, which tend to be released every 3-5 days, but at the time, felt like every other hour. Every time there was a new app update released, I’d have to first install the update on a device I had dedicated to official Spotify updates, see if anything looked immediately different, download the new APK and replace the old one in my project, then watch as a bunch of errors would pop up, because every time an update is released, all the java files get randomized again, and the files I had deciphered would be completely different.
<br/>
<br/>
<br/>
<br/>
<br/>
<img align="right" src="http://i.imgur.com/Wi3CVAi.png" title="spotify" /> It’s not perfect, and it’s definitely not the most efficient code, but considering all of the limitations I had within the app, and the fact that doing this was probably way more difficult than if I had just written an entire app myself, I’m really proud with what I was able to create, modify, and most importantly, learn. This project has taught me so, so, much, and not just about the way the Spotify app works. I’ve grown very familiar with Gradle, dex file patching, editing smali files manually, and so much more that I can’t remember off the top of my head. 
<br/>
<br/>

[connerowen.me][]

[connerowen.me]: http://connerowen.me/
