package io.cloudshiftdev.awscdkdsl.common

@CdkDslMarker
public class MapBuilder {
    public val map: MutableMap<String, Any> = mutableMapOf()

    public infix fun String.to(other: String) {
        map[this] = other
    }

    public infix fun String.to(other: Collection<String>) {
        map[this] = other
    }

    public inline operator fun String.invoke(block: MapBuilder.() -> Unit) {
        val builder = MapBuilder()
        builder.apply(block)
        map[this] = builder.map
    }
}
