@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53recoverycontrol

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53recoverycontrol.CfnCluster

@CdkDslMarker
public class CfnClusterClusterEndpointPropertyDsl {
  private val cdkBuilder: CfnCluster.ClusterEndpointProperty.Builder =
      CfnCluster.ClusterEndpointProperty.builder()

  public fun endpoint(endpoint: String) {
    cdkBuilder.endpoint(endpoint)
  }

  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun build(): CfnCluster.ClusterEndpointProperty = cdkBuilder.build()
}
