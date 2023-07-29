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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

/**
 * An object that represents an access log file.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * VirtualGatewayFileAccessLogProperty virtualGatewayFileAccessLogProperty =
 * VirtualGatewayFileAccessLogProperty.builder()
 * .path("path")
 * // the properties below are optional
 * .format(LoggingFormatProperty.builder()
 * .json(List.of(JsonFormatRefProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .text("text")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayfileaccesslog.html)
 */
@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayFileAccessLogPropertyDsl {
    private val cdkBuilder: CfnVirtualGateway.VirtualGatewayFileAccessLogProperty.Builder =
        CfnVirtualGateway.VirtualGatewayFileAccessLogProperty.builder()

    /**
     * @param format The specified format for the virtual gateway access logs. It can be either
     *   `json_format` or `text_format` .
     */
    public fun format(format: IResolvable) {
        cdkBuilder.format(format)
    }

    /**
     * @param format The specified format for the virtual gateway access logs. It can be either
     *   `json_format` or `text_format` .
     */
    public fun format(format: CfnVirtualGateway.LoggingFormatProperty) {
        cdkBuilder.format(format)
    }

    /**
     * @param path The file path to write access logs to. You can use `/dev/stdout` to send access
     *   logs to standard out and configure your Envoy container to use a log driver, such as
     *   `awslogs` , to export the access logs to a log storage service such as Amazon CloudWatch
     *   Logs. You can also specify a path in the Envoy container's file system to write the files
     *   to disk.
     */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun build(): CfnVirtualGateway.VirtualGatewayFileAccessLogProperty = cdkBuilder.build()
}
