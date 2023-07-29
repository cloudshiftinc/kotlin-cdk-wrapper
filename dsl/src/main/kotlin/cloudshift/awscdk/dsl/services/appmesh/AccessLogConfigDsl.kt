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

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.AccessLogConfig
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

/**
 * All Properties for Envoy Access logs for mesh endpoints.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * AccessLogConfig accessLogConfig = AccessLogConfig.builder()
 * .virtualGatewayAccessLog(VirtualGatewayAccessLogProperty.builder()
 * .file(VirtualGatewayFileAccessLogProperty.builder()
 * .path("path")
 * // the properties below are optional
 * .format(LoggingFormatProperty.builder()
 * .json(List.of(JsonFormatRefProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .text("text")
 * .build())
 * .build())
 * .build())
 * .virtualNodeAccessLog(AccessLogProperty.builder()
 * .file(FileAccessLogProperty.builder()
 * .path("path")
 * // the properties below are optional
 * .format(LoggingFormatProperty.builder()
 * .json(List.of(JsonFormatRefProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .text("text")
 * .build())
 * .build())
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class AccessLogConfigDsl {
    private val cdkBuilder: AccessLogConfig.Builder = AccessLogConfig.builder()

    /** @param virtualGatewayAccessLog VirtualGateway CFN configuration for Access Logging. */
    public fun virtualGatewayAccessLog(
        virtualGatewayAccessLog: CfnVirtualGatewayVirtualGatewayAccessLogPropertyDsl.() -> Unit = {}
    ) {
        val builder = CfnVirtualGatewayVirtualGatewayAccessLogPropertyDsl()
        builder.apply(virtualGatewayAccessLog)
        cdkBuilder.virtualGatewayAccessLog(builder.build())
    }

    /** @param virtualGatewayAccessLog VirtualGateway CFN configuration for Access Logging. */
    public fun virtualGatewayAccessLog(
        virtualGatewayAccessLog: CfnVirtualGateway.VirtualGatewayAccessLogProperty
    ) {
        cdkBuilder.virtualGatewayAccessLog(virtualGatewayAccessLog)
    }

    /** @param virtualNodeAccessLog VirtualNode CFN configuration for Access Logging. */
    public fun virtualNodeAccessLog(
        virtualNodeAccessLog: CfnVirtualNodeAccessLogPropertyDsl.() -> Unit = {}
    ) {
        val builder = CfnVirtualNodeAccessLogPropertyDsl()
        builder.apply(virtualNodeAccessLog)
        cdkBuilder.virtualNodeAccessLog(builder.build())
    }

    /** @param virtualNodeAccessLog VirtualNode CFN configuration for Access Logging. */
    public fun virtualNodeAccessLog(virtualNodeAccessLog: CfnVirtualNode.AccessLogProperty) {
        cdkBuilder.virtualNodeAccessLog(virtualNodeAccessLog)
    }

    public fun build(): AccessLogConfig = cdkBuilder.build()
}
