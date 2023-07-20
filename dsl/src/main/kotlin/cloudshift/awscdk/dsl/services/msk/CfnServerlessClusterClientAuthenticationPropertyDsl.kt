@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnServerlessCluster

@CdkDslMarker
public class CfnServerlessClusterClientAuthenticationPropertyDsl {
  private val cdkBuilder: CfnServerlessCluster.ClientAuthenticationProperty.Builder =
      CfnServerlessCluster.ClientAuthenticationProperty.builder()

  public fun sasl(sasl: IResolvable) {
    cdkBuilder.sasl(sasl)
  }

  public fun sasl(sasl: CfnServerlessCluster.SaslProperty) {
    cdkBuilder.sasl(sasl)
  }

  public fun build(): CfnServerlessCluster.ClientAuthenticationProperty = cdkBuilder.build()
}
