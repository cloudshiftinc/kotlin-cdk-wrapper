@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.memorydb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.memorydb.CfnCluster

/**
 * Represents the information required for client programs to connect to the cluster and its nodes.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.memorydb.*;
 * EndpointProperty endpointProperty = EndpointProperty.builder()
 * .address("address")
 * .port(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-memorydb-cluster-endpoint.html)
 */
@CdkDslMarker
public class CfnClusterEndpointPropertyDsl {
  private val cdkBuilder: CfnCluster.EndpointProperty.Builder =
      CfnCluster.EndpointProperty.builder()

  /**
   * @param address The DNS hostname of the node.
   */
  public fun address(address: String) {
    cdkBuilder.address(address)
  }

  /**
   * @param port The port number that the engine is listening on.
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun build(): CfnCluster.EndpointProperty = cdkBuilder.build()
}
