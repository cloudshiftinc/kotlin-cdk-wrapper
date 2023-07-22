@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.VirtualServiceProps
import software.amazon.awscdk.services.appmesh.VirtualServiceProvider

@CdkDslMarker
public class VirtualServicePropsDsl {
  private val cdkBuilder: VirtualServiceProps.Builder = VirtualServiceProps.builder()

  /**
   * @param virtualServiceName The name of the VirtualService.
   * It is recommended this follows the fully-qualified domain name format,
   * such as "my-service.default.svc.cluster.local".
   *
   * Example value: `service.domain.local`
   */
  public fun virtualServiceName(virtualServiceName: String) {
    cdkBuilder.virtualServiceName(virtualServiceName)
  }

  /**
   * @param virtualServiceProvider The VirtualNode or VirtualRouter which the VirtualService uses as
   * its provider. 
   */
  public fun virtualServiceProvider(virtualServiceProvider: VirtualServiceProvider) {
    cdkBuilder.virtualServiceProvider(virtualServiceProvider)
  }

  public fun build(): VirtualServiceProps = cdkBuilder.build()
}
