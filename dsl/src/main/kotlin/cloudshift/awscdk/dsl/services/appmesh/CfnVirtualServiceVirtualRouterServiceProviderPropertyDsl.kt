@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnVirtualService

/**
 * An object that represents a virtual node service provider.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * VirtualRouterServiceProviderProperty virtualRouterServiceProviderProperty =
 * VirtualRouterServiceProviderProperty.builder()
 * .virtualRouterName("virtualRouterName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualrouterserviceprovider.html)
 */
@CdkDslMarker
public class CfnVirtualServiceVirtualRouterServiceProviderPropertyDsl {
  private val cdkBuilder: CfnVirtualService.VirtualRouterServiceProviderProperty.Builder =
      CfnVirtualService.VirtualRouterServiceProviderProperty.builder()

  /**
   * @param virtualRouterName The name of the virtual router that is acting as a service provider. 
   */
  public fun virtualRouterName(virtualRouterName: String) {
    cdkBuilder.virtualRouterName(virtualRouterName)
  }

  public fun build(): CfnVirtualService.VirtualRouterServiceProviderProperty = cdkBuilder.build()
}
