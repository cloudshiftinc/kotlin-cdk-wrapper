@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appstream.CfnStack

/**
 * Describes an interface VPC endpoint (interface endpoint) that lets you create a private
 * connection between the virtual private cloud (VPC) that you specify and AppStream 2.0. When you
 * specify an interface endpoint for a stack, users of the stack can connect to AppStream 2.0 only
 * through that endpoint. When you specify an interface endpoint for an image builder, administrators
 * can connect to the image builder only through that endpoint.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appstream.*;
 * AccessEndpointProperty accessEndpointProperty = AccessEndpointProperty.builder()
 * .endpointType("endpointType")
 * .vpceId("vpceId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-accessendpoint.html)
 */
@CdkDslMarker
public class CfnStackAccessEndpointPropertyDsl {
  private val cdkBuilder: CfnStack.AccessEndpointProperty.Builder =
      CfnStack.AccessEndpointProperty.builder()

  /**
   * @param endpointType The type of interface endpoint. 
   */
  public fun endpointType(endpointType: String) {
    cdkBuilder.endpointType(endpointType)
  }

  /**
   * @param vpceId The identifier (ID) of the VPC in which the interface endpoint is used. 
   */
  public fun vpceId(vpceId: String) {
    cdkBuilder.vpceId(vpceId)
  }

  public fun build(): CfnStack.AccessEndpointProperty = cdkBuilder.build()
}
