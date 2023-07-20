@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint

@CdkDslMarker
public class CfnClientVpnEndpointFederatedAuthenticationRequestPropertyDsl {
  private val cdkBuilder: CfnClientVpnEndpoint.FederatedAuthenticationRequestProperty.Builder =
      CfnClientVpnEndpoint.FederatedAuthenticationRequestProperty.builder()

  public fun samlProviderArn(samlProviderArn: String) {
    cdkBuilder.samlProviderArn(samlProviderArn)
  }

  public fun selfServiceSamlProviderArn(selfServiceSamlProviderArn: String) {
    cdkBuilder.selfServiceSamlProviderArn(selfServiceSamlProviderArn)
  }

  public fun build(): CfnClientVpnEndpoint.FederatedAuthenticationRequestProperty =
      cdkBuilder.build()
}
