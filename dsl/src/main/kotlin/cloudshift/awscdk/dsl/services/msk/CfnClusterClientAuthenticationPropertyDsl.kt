@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

@CdkDslMarker
public class CfnClusterClientAuthenticationPropertyDsl {
  private val cdkBuilder: CfnCluster.ClientAuthenticationProperty.Builder =
      CfnCluster.ClientAuthenticationProperty.builder()

  public fun sasl(sasl: IResolvable) {
    cdkBuilder.sasl(sasl)
  }

  public fun sasl(sasl: CfnCluster.SaslProperty) {
    cdkBuilder.sasl(sasl)
  }

  public fun tls(tls: IResolvable) {
    cdkBuilder.tls(tls)
  }

  public fun tls(tls: CfnCluster.TlsProperty) {
    cdkBuilder.tls(tls)
  }

  public fun unauthenticated(unauthenticated: IResolvable) {
    cdkBuilder.unauthenticated(unauthenticated)
  }

  public fun unauthenticated(unauthenticated: CfnCluster.UnauthenticatedProperty) {
    cdkBuilder.unauthenticated(unauthenticated)
  }

  public fun build(): CfnCluster.ClientAuthenticationProperty = cdkBuilder.build()
}
