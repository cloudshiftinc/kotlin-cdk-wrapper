@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.VirtualService
import software.amazon.awscdk.services.appmesh.VirtualServiceProvider
import software.constructs.Construct

@CdkDslMarker
public class VirtualServiceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: VirtualService.Builder = VirtualService.Builder.create(scope, id)

  /**
   * The name of the VirtualService.
   *
   * It is recommended this follows the fully-qualified domain name format,
   * such as "my-service.default.svc.cluster.local".
   *
   * Example value: `service.domain.local`
   *
   * Default: - A name is automatically generated
   *
   * @param virtualServiceName The name of the VirtualService. 
   */
  public fun virtualServiceName(virtualServiceName: String) {
    cdkBuilder.virtualServiceName(virtualServiceName)
  }

  /**
   * The VirtualNode or VirtualRouter which the VirtualService uses as its provider.
   *
   * @param virtualServiceProvider The VirtualNode or VirtualRouter which the VirtualService uses as
   * its provider. 
   */
  public fun virtualServiceProvider(virtualServiceProvider: VirtualServiceProvider) {
    cdkBuilder.virtualServiceProvider(virtualServiceProvider)
  }

  public fun build(): VirtualService = cdkBuilder.build()
}
