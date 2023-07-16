@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

@CdkDslMarker
public class CfnClusterVpcConnectivityClientAuthenticationPropertyDsl {
  private val cdkBuilder: CfnCluster.VpcConnectivityClientAuthenticationProperty.Builder =
      CfnCluster.VpcConnectivityClientAuthenticationProperty.builder()

  public fun sasl(sasl: IResolvable) {
    cdkBuilder.sasl(sasl)
  }

  public fun sasl(sasl: CfnCluster.VpcConnectivitySaslProperty) {
    cdkBuilder.sasl(sasl)
  }

  public fun tls(tls: IResolvable) {
    cdkBuilder.tls(tls)
  }

  public fun tls(tls: CfnCluster.VpcConnectivityTlsProperty) {
    cdkBuilder.tls(tls)
  }

  public fun build(): CfnCluster.VpcConnectivityClientAuthenticationProperty = cdkBuilder.build()
}
