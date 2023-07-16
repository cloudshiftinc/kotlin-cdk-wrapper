@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeVirtualServiceBackendPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.VirtualServiceBackendProperty.Builder =
      CfnVirtualNode.VirtualServiceBackendProperty.builder()

  public fun clientPolicy(clientPolicy: IResolvable) {
    cdkBuilder.clientPolicy(clientPolicy)
  }

  public fun clientPolicy(clientPolicy: CfnVirtualNode.ClientPolicyProperty) {
    cdkBuilder.clientPolicy(clientPolicy)
  }

  public fun virtualServiceName(virtualServiceName: String) {
    cdkBuilder.virtualServiceName(virtualServiceName)
  }

  public fun build(): CfnVirtualNode.VirtualServiceBackendProperty = cdkBuilder.build()
}
