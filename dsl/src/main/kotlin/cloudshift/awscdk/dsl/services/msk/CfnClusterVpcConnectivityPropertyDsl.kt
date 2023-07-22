@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

@CdkDslMarker
public class CfnClusterVpcConnectivityPropertyDsl {
  private val cdkBuilder: CfnCluster.VpcConnectivityProperty.Builder =
      CfnCluster.VpcConnectivityProperty.builder()

  /**
   * @param clientAuthentication VPC connection control settings for brokers.
   */
  public fun clientAuthentication(clientAuthentication: IResolvable) {
    cdkBuilder.clientAuthentication(clientAuthentication)
  }

  /**
   * @param clientAuthentication VPC connection control settings for brokers.
   */
  public
      fun clientAuthentication(clientAuthentication: CfnCluster.VpcConnectivityClientAuthenticationProperty) {
    cdkBuilder.clientAuthentication(clientAuthentication)
  }

  public fun build(): CfnCluster.VpcConnectivityProperty = cdkBuilder.build()
}
