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
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

/**
 * An object that represents the logging information for a virtual node.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * LoggingProperty loggingProperty = LoggingProperty.builder()
 * .accessLog(AccessLogProperty.builder()
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
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-logging.html)
 */
@CdkDslMarker
public class CfnVirtualNodeLoggingPropertyDsl {
    private val cdkBuilder: CfnVirtualNode.LoggingProperty.Builder =
        CfnVirtualNode.LoggingProperty.builder()

    /** @param accessLog The access log configuration for a virtual node. */
    public fun accessLog(accessLog: IResolvable) {
        cdkBuilder.accessLog(accessLog)
    }

    /** @param accessLog The access log configuration for a virtual node. */
    public fun accessLog(accessLog: CfnVirtualNode.AccessLogProperty) {
        cdkBuilder.accessLog(accessLog)
    }

    public fun build(): CfnVirtualNode.LoggingProperty = cdkBuilder.build()
}
