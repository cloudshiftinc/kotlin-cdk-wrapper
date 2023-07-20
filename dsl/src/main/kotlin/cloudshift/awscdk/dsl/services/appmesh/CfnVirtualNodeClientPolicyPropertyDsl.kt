@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeClientPolicyPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.ClientPolicyProperty.Builder =
      CfnVirtualNode.ClientPolicyProperty.builder()

  public fun tls(tls: IResolvable) {
    cdkBuilder.tls(tls)
  }

  public fun tls(tls: CfnVirtualNode.ClientPolicyTlsProperty) {
    cdkBuilder.tls(tls)
  }

  public fun build(): CfnVirtualNode.ClientPolicyProperty = cdkBuilder.build()
}
