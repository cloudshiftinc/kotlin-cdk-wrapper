package io.cloudshiftdev.awscdk.ext.core

import io.cloudshiftdev.awscdk.Arn
import io.cloudshiftdev.awscdk.ArnComponents
import io.cloudshiftdev.awscdk.ArnFormat
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.Tags
import io.cloudshiftdev.constructs.Construct
import io.cloudshiftdev.constructs.IConstruct
import kotlin.reflect.KClass

public fun Construct.addTag(key: String, value: String) {
    Tags.of(this).add(key, value)
}

public fun Construct.addComment(comment: String) {
    node().children().filterIsInstance<CfnResource>().forEach { it.addComment(comment) }
}

public fun <T : CfnResource> Construct.addPropertyOverride(
    clazz: KClass<T>,
    property: String,
    value: String
) {
    val resource = node().children().filterIsInstance(clazz.java).first()
    resource.addPropertyOverride(property, value)
}

public fun CfnResource.addComment(comment: String) {
    addMetadata(mapOf("cloudshift:comment" to comment))
}

public fun CfnResource.addMetadata(newMetadata: Map<String, Any>) {
    if (newMetadata.isEmpty()) {
        return
    }
    var metadata = cfnOptions().metadata()
    metadata = metadata?.toMutableMap() ?: mutableMapOf()
    metadata.putAll(newMetadata)
    cfnOptions().metadata(metadata.toMap())
}

public fun IConstruct.allChildren(): List<IConstruct> {
    val list = mutableListOf<IConstruct>()
    node().children().forEach {
        list.add(it)
        list.addAll(it.allChildren())
    }
    return list.sortedBy { it.node().path() }
}

@JvmName("constructArn")
public fun IConstruct.arn(block: (ArnComponents.Builder).() -> Unit): String = arn(this, block)

public fun arn(scope: IConstruct, block: (ArnComponents.Builder).() -> Unit): String {
    return Arn.format(ArnComponents(block), Stack.of(scope))
}

public fun String.toArnComponents(
    format: ArnFormat = ArnFormat.SLASH_RESOURCE_NAME
): ArnComponents = Arn.split(this, format)

public inline fun <reified T : Construct> Construct.withSingleton(
    id: String,
    block: (String) -> T
): T {
    return allChildren().filterIsInstance<T>().firstOrNull { it.node().id() == id } ?: block(id)
}

public inline fun <reified T> Construct.withSingleton(
    predicate: (T) -> Boolean = { true },
    block: () -> T
): T {
    return allChildren().filterIsInstance<T>().firstOrNull(predicate) ?: block()
}
