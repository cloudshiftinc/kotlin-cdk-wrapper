package cloudshift.awscdk.dsl.extensions.core

import cloudshift.awscdk.dsl.ArnComponentsDsl
import cloudshift.awscdk.dsl.awscdk
import cloudshift.awscdk.dsl.formatArn
import software.amazon.awscdk.CfnResource
import software.amazon.awscdk.Stack
import software.amazon.awscdk.Tags
import software.constructs.Construct
import software.constructs.IConstruct
import kotlin.reflect.KClass

public fun Construct.addTag(key: String, value: String) {
    Tags.of(this).add(key, value)
}

public fun Construct.addComment(comment: String) {
    node.children
        .filterIsInstance<CfnResource>()
        .forEach { it.addComment(comment) }
}

public fun <T : CfnResource> Construct.addPropertyOverride(clazz: KClass<T>, property: String, value: String) {
    val resource = node.children.filterIsInstance(clazz.java).first()
    resource.addPropertyOverride(property, value)
}

public fun CfnResource.addComment(comment: String) {
    addMetadata(mapOf("cloudshift:comment" to comment))
}

public fun CfnResource.addMetadata(newMetadata: Map<String, Any>) {
    if (newMetadata.isEmpty()) {
        return
    }
    var metadata = cfnOptions.metadata
    metadata = metadata?.toMutableMap() ?: mutableMapOf()
    metadata.putAll(newMetadata)
    cfnOptions.metadata = metadata.toMap()
}

public fun IConstruct.allChildren(): List<IConstruct> {
    val list = mutableListOf<IConstruct>()
    node.children.forEach {
        list.add(it)
        list.addAll(it.allChildren())
    }
    return list.sortedBy { it.node.path }
}

public fun awscdk.resourceArn(
    scope: Construct,
    block: (ArnComponentsDsl).() -> Unit
): String = Stack.of(scope).formatArn(block)

public fun awscdk.anyResource(): String = "*"

public inline fun <reified T : Construct> Construct.withSingleton(id: String, block: (String) -> T): T {
    return allChildren().filterIsInstance<T>().firstOrNull { it.node.id == id } ?: block(id)
}

public inline fun <reified T> Construct.withSingleton(predicate: (T) -> Boolean = { true }, block: () -> T): T {
    return allChildren().filterIsInstance<T>().firstOrNull(predicate) ?: block()
}
