# AndroidInCallUI(所有源码均基于Android-marshmallow-release版本 )

#####此项目的目的是学习Android InCallUI系统源码

## module：
#### 引入即可使用
```
implementation project(':com_android_common')
implementation project(':com_android_phone_common')
implementation project(':com_android_vcard')
```
#### 需要额外引入第三方依赖
```
implementation project(':com_android_contacts_common')
implementation "com.android.support:appcompat-v7:$supportLibraryVersion"
    implementation project(':com_android_common')
    implementation project(':com_android_phone_common')
    implementation project(':com_android_vcard')
    implementation 'com.googlecode.libphonenumber:libphonenumber:8.10.14'
    implementation 'com.googlecode.libphonenumber:geocoder:2.120'
    implementation 'com.google.guava:guava:28.0-android'
    //https://developer.android.com/training/testing/set-up-project
    // Gradle automatically adds 'android.test.runner' as a dependency.
    useLibrary 'android.test.runner'
    useLibrary 'android.test.base'
    useLibrary 'android.test.mock'
implementation project(':incallui')
   implementation "com.android.support:support-v4:$supportLibraryVersion"
   implementation project(':com_android_contacts_common')
   implementation project(':com_android_phone_common')
   implementation 'com.googlecode.libphonenumber:libphonenumber:8.10.14'
   implementation 'com.googlecode.libphonenumber:geocoder:2.120'
   implementation 'com.google.guava:guava:28.0-android'
```
   
## todo
### python开发小工具：
#### [contacts_common]strings.xml内容去重
#### [telephony]strings.xml内容去重
    
## 参考自：
### System App Source Code
##### [InCallUI](https://android.googlesource.com/platform/packages/apps/InCallUI/+/marshmallow-release)
##### [Dialer](https://android.googlesource.com/platform/packages/apps/Dialer/+/refs/heads/marshmallow-release/)
### Module Source Code
##### [com.android.common](https://android.googlesource.com/platform/frameworks/ex/+/marshmallow-release/common/java/com/android/common/)
##### [com.android.phone.common](https://android.googlesource.com/platform/packages/apps/PhoneCommon/+/refs/heads/marshmallow-release)
##### [com.android.vcard](https://android.googlesource.com/platform/frameworks/opt/vcard/+/refs/heads/marshmallow-release)
##### [com.android.contacts.common](https://android.googlesource.com/platform/packages/apps/ContactsCommon/+/marshmallow-release/src/com/android/contacts)
##### [com.google.common](https://github.com/google/guava)
##### [Telephony](https://android.googlesource.com/platform/packages/services/Telephony/)
##### [com.android.common.io](https://android.googlesource.com/platform/frameworks/ex/+/refs/heads/marshmallow-release/common/java/com/android/common/io/)

##### [guaua](https://github.com/google/guava)
##### [libphonenumber](https://github.com/google/libphonenumber)

## 遇到的问题
### [Use androidx.* artifacts option is disable in Android Studio when create new project](https://stackoverflow.com/questions/56752092/use-androidx-artifacts-option-is-disable-in-android-studio-when-create-new-pro)
### [Manifest merger failed with multiple errors, see logs问题](https://blog.csdn.net/picasso_l/article/details/53085299)