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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

/**
 * An object that represents logging information.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * VirtualGatewayLoggingProperty virtualGatewayLoggingProperty =
 * VirtualGatewayLoggingProperty.builder()
 * .accessLog(VirtualGatewayAccessLogProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylogging.html)
 */
@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayLoggingPropertyDsl {
    private val cdkBuilder: CfnVirtualGateway.VirtualGatewayLoggingProperty.Builder =
        CfnVirtualGateway.VirtualGatewayLoggingProperty.builder()

    /** @param accessLog The access log configuration. */
    public fun accessLog(accessLog: IResolvable) {
        cdkBuilder.accessLog(accessLog)
    }

    /** @param accessLog The access log configuration. */
    public fun accessLog(accessLog: CfnVirtualGateway.VirtualGatewayAccessLogProperty) {
        cdkBuilder.accessLog(accessLog)
    }

    public fun build(): CfnVirtualGateway.VirtualGatewayLoggingProperty = cdkBuilder.build()
}
