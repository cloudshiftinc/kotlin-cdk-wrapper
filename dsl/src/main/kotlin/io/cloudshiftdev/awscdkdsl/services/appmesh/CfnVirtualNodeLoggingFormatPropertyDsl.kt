@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.appmesh

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

/**
 * An object that represents the format for the logs.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * LoggingFormatProperty loggingFormatProperty = LoggingFormatProperty.builder()
 * .json(List.of(JsonFormatRefProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .text("text")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-loggingformat.html)
 */
@CdkDslMarker
public class CfnVirtualNodeLoggingFormatPropertyDsl {
    private val cdkBuilder: CfnVirtualNode.LoggingFormatProperty.Builder =
        CfnVirtualNode.LoggingFormatProperty.builder()

    private val _json: MutableList<Any> = mutableListOf()

    /** @param json The logging format for JSON. */
    public fun json(vararg json: Any) {
        _json.addAll(listOf(*json))
    }

    /** @param json The logging format for JSON. */
    public fun json(json: Collection<Any>) {
        _json.addAll(json)
    }

    /** @param json The logging format for JSON. */
    public fun json(json: IResolvable) {
        cdkBuilder.json(json)
    }

    /** @param text The logging format for text. */
    public fun text(text: String) {
        cdkBuilder.text(text)
    }

    public fun build(): CfnVirtualNode.LoggingFormatProperty {
        if (_json.isNotEmpty()) cdkBuilder.json(_json)
        return cdkBuilder.build()
    }
}
