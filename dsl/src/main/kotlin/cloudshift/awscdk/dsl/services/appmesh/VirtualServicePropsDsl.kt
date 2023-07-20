@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.VirtualServiceProps
import software.amazon.awscdk.services.appmesh.VirtualServiceProvider

@CdkDslMarker
public class VirtualServicePropsDsl {
  private val cdkBuilder: VirtualServiceProps.Builder = VirtualServiceProps.builder()

  public fun virtualServiceName(virtualServiceName: String) {
    cdkBuilder.virtualServiceName(virtualServiceName)
  }

  public fun virtualServiceProvider(virtualServiceProvider: VirtualServiceProvider) {
    cdkBuilder.virtualServiceProvider(virtualServiceProvider)
  }

  public fun build(): VirtualServiceProps = cdkBuilder.build()
}
