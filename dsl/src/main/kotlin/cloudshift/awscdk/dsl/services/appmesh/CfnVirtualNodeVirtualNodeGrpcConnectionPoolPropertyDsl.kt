@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

/**
 * An object that represents a type of connection pool.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * VirtualNodeGrpcConnectionPoolProperty virtualNodeGrpcConnectionPoolProperty =
 * VirtualNodeGrpcConnectionPoolProperty.builder()
 * .maxRequests(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodegrpcconnectionpool.html)
 */
@CdkDslMarker
public class CfnVirtualNodeVirtualNodeGrpcConnectionPoolPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.VirtualNodeGrpcConnectionPoolProperty.Builder =
      CfnVirtualNode.VirtualNodeGrpcConnectionPoolProperty.builder()

  /**
   * @param maxRequests Maximum number of inflight requests Envoy can concurrently support across
   * hosts in upstream cluster. 
   */
  public fun maxRequests(maxRequests: Number) {
    cdkBuilder.maxRequests(maxRequests)
  }

  public fun build(): CfnVirtualNode.VirtualNodeGrpcConnectionPoolProperty = cdkBuilder.build()
}
