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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

/**
 * An object that represents an access log file.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * FileAccessLogProperty fileAccessLogProperty = FileAccessLogProperty.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-fileaccesslog.html)
 */
@CdkDslMarker
public class CfnVirtualNodeFileAccessLogPropertyDsl {
    private val cdkBuilder: CfnVirtualNode.FileAccessLogProperty.Builder =
        CfnVirtualNode.FileAccessLogProperty.builder()

    /**
     * @param format The specified format for the logs. The format is either `json_format` or
     *   `text_format` .
     */
    public fun format(format: IResolvable) {
        cdkBuilder.format(format)
    }

    /**
     * @param format The specified format for the logs. The format is either `json_format` or
     *   `text_format` .
     */
    public fun format(format: CfnVirtualNode.LoggingFormatProperty) {
        cdkBuilder.format(format)
    }

    /**
     * @param path The file path to write access logs to. You can use `/dev/stdout` to send access
     *   logs to standard out and configure your Envoy container to use a log driver, such as
     *   `awslogs` , to export the access logs to a log storage service such as Amazon CloudWatch
     *   Logs. You can also specify a path in the Envoy container's file system to write the files
     *   to disk.
     *
     * The Envoy process must have write permissions to the path that you specify here. Otherwise,
     * Envoy fails to bootstrap properly.
     */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun build(): CfnVirtualNode.FileAccessLogProperty = cdkBuilder.build()
}
