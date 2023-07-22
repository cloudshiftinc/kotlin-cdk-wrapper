@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

/**
 * An object that represents the access logging information for a virtual node.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * AccessLogProperty accessLogProperty = AccessLogProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-accesslog.html)
 */
@CdkDslMarker
public class CfnVirtualNodeAccessLogPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.AccessLogProperty.Builder =
      CfnVirtualNode.AccessLogProperty.builder()

  /**
   * @param file The file object to send virtual node access logs to.
   */
  public fun `file`(`file`: IResolvable) {
    cdkBuilder.`file`(`file`)
  }

  /**
   * @param file The file object to send virtual node access logs to.
   */
  public fun `file`(`file`: CfnVirtualNode.FileAccessLogProperty) {
    cdkBuilder.`file`(`file`)
  }

  public fun build(): CfnVirtualNode.AccessLogProperty = cdkBuilder.build()
}
