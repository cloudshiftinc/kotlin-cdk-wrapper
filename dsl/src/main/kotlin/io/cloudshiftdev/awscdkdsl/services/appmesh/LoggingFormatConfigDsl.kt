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
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode
import software.amazon.awscdk.services.appmesh.LoggingFormatConfig

/**
 * All Properties for Envoy Access Logging Format for mesh endpoints.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * LoggingFormatConfig loggingFormatConfig = LoggingFormatConfig.builder()
 * .formatConfig(LoggingFormatProperty.builder()
 * .json(List.of(JsonFormatRefProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .text("text")
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class LoggingFormatConfigDsl {
    private val cdkBuilder: LoggingFormatConfig.Builder = LoggingFormatConfig.builder()

    /** @param formatConfig CFN configuration for Access Logging Format. */
    public fun formatConfig(formatConfig: CfnVirtualNodeLoggingFormatPropertyDsl.() -> Unit = {}) {
        val builder = CfnVirtualNodeLoggingFormatPropertyDsl()
        builder.apply(formatConfig)
        cdkBuilder.formatConfig(builder.build())
    }

    /** @param formatConfig CFN configuration for Access Logging Format. */
    public fun formatConfig(formatConfig: CfnVirtualNode.LoggingFormatProperty) {
        cdkBuilder.formatConfig(formatConfig)
    }

    public fun build(): LoggingFormatConfig = cdkBuilder.build()
}
