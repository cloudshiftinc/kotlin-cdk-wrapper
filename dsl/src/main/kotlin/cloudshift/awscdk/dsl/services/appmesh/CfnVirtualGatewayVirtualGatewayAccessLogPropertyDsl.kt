@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

/**
 * The access log configuration for a virtual gateway.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * VirtualGatewayAccessLogProperty virtualGatewayAccessLogProperty =
 * VirtualGatewayAccessLogProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayaccesslog.html)
 */
@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayAccessLogPropertyDsl {
  private val cdkBuilder: CfnVirtualGateway.VirtualGatewayAccessLogProperty.Builder =
      CfnVirtualGateway.VirtualGatewayAccessLogProperty.builder()

  /**
   * @param file The file object to send virtual gateway access logs to.
   */
  public fun `file`(`file`: IResolvable) {
    cdkBuilder.`file`(`file`)
  }

  /**
   * @param file The file object to send virtual gateway access logs to.
   */
  public fun `file`(`file`: CfnVirtualGateway.VirtualGatewayFileAccessLogProperty) {
    cdkBuilder.`file`(`file`)
  }

  public fun build(): CfnVirtualGateway.VirtualGatewayAccessLogProperty = cdkBuilder.build()
}
