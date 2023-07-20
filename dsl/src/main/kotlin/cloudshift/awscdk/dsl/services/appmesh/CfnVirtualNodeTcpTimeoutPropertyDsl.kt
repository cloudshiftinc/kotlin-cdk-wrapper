@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeTcpTimeoutPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.TcpTimeoutProperty.Builder =
      CfnVirtualNode.TcpTimeoutProperty.builder()

  public fun idle(idle: IResolvable) {
    cdkBuilder.idle(idle)
  }

  public fun idle(idle: CfnVirtualNode.DurationProperty) {
    cdkBuilder.idle(idle)
  }

  public fun build(): CfnVirtualNode.TcpTimeoutProperty = cdkBuilder.build()
}
