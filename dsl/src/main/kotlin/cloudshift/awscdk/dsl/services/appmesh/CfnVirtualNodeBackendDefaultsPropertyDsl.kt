@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeBackendDefaultsPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.BackendDefaultsProperty.Builder =
      CfnVirtualNode.BackendDefaultsProperty.builder()

  public fun clientPolicy(clientPolicy: IResolvable) {
    cdkBuilder.clientPolicy(clientPolicy)
  }

  public fun clientPolicy(clientPolicy: CfnVirtualNode.ClientPolicyProperty) {
    cdkBuilder.clientPolicy(clientPolicy)
  }

  public fun build(): CfnVirtualNode.BackendDefaultsProperty = cdkBuilder.build()
}
