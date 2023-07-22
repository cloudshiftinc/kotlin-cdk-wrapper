@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.redshift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.redshift.CfnCluster

@CdkDslMarker
public class CfnClusterEndpointPropertyDsl {
  private val cdkBuilder: CfnCluster.EndpointProperty.Builder =
      CfnCluster.EndpointProperty.builder()

  /**
   * @param address The DNS address of the cluster.
   * This property is read only.
   */
  public fun address(address: String) {
    cdkBuilder.address(address)
  }

  /**
   * @param port The port that the database engine is listening on.
   * This property is read only.
   */
  public fun port(port: String) {
    cdkBuilder.port(port)
  }

  public fun build(): CfnCluster.EndpointProperty = cdkBuilder.build()
}
