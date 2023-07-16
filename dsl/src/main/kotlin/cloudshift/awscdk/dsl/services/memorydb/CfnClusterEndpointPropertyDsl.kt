@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.memorydb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.memorydb.CfnCluster

@CdkDslMarker
public class CfnClusterEndpointPropertyDsl {
  private val cdkBuilder: CfnCluster.EndpointProperty.Builder =
      CfnCluster.EndpointProperty.builder()

  public fun address(address: String) {
    cdkBuilder.address(address)
  }

  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun build(): CfnCluster.EndpointProperty = cdkBuilder.build()
}
