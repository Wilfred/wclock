# R8/ProGuard rules for the release build.
#
# The defaults in proguard-android-optimize.txt, plus the rules that AndroidX and
# Compose ship inside their own AARs, cover everything this app currently needs.
# Add app-specific keep rules here as the app grows (for example, when
# reflection or serialization is introduced).
#
# To keep line numbers usable in crash reports, uncomment the following and
# retrace stack traces with the mapping.txt produced by the release build:
#-keepattributes SourceFile,LineNumberTable
#-renamesourcefileattribute SourceFile
