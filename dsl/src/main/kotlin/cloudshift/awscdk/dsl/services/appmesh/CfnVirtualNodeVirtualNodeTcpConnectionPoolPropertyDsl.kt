@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeVirtualNodeTcpConnectionPoolPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.VirtualNodeTcpConnectionPoolProperty.Builder =
      CfnVirtualNode.VirtualNodeTcpConnectionPoolProperty.builder()

  /**
   * @param maxConnections Maximum number of outbound TCP connections Envoy can establish
   * concurrently with all hosts in upstream cluster. 
   */
  public fun maxConnections(maxConnections: Number) {
    cdkBuilder.maxConnections(maxConnections)
  }

  public fun build(): CfnVirtualNode.VirtualNodeTcpConnectionPoolProperty = cdkBuilder.build()
}
