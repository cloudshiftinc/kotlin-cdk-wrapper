@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.rds.CfnDBCluster

@CdkDslMarker
public class CfnDBClusterReadEndpointPropertyDsl {
  private val cdkBuilder: CfnDBCluster.ReadEndpointProperty.Builder =
      CfnDBCluster.ReadEndpointProperty.builder()

  /**
   * @param address The host address of the reader endpoint.
   */
  public fun address(address: String) {
    cdkBuilder.address(address)
  }

  public fun build(): CfnDBCluster.ReadEndpointProperty = cdkBuilder.build()
}
