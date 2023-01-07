# VirtualMenu

Librearia para trabajar con menus de forma más sencilla.

## 💻 Implementación con maven o gradle
- Maven:
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.VirtualHit</groupId>
        <artifactId>VirtualMenu</artifactId>
        <version>v1.0.0</version>
        <scope>compile</scope>
    </dependency>
</dependencies>
```
- Gradle:
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    compile"com.github.VirtualHit:VirtualMenu:v1.0.0"
}
```

## 📋 NOTAS

- Se recomienda registrar los listeners `InventoryClickListener`, `InventoryCloseListener` y escuchar el evento `PlayerClickMenuItemEvent`.

## 👪 Autores

[Alex](https://github.com/alexcastro1919)

