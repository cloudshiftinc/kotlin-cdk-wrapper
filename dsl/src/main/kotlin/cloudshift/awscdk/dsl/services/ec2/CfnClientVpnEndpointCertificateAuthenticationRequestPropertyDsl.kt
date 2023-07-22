@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint

@CdkDslMarker
public class CfnClientVpnEndpointCertificateAuthenticationRequestPropertyDsl {
  private val cdkBuilder: CfnClientVpnEndpoint.CertificateAuthenticationRequestProperty.Builder =
      CfnClientVpnEndpoint.CertificateAuthenticationRequestProperty.builder()

  /**
   * @param clientRootCertificateChainArn The ARN of the client certificate. 
   * The certificate must be signed by a certificate authority (CA) and it must be provisioned in
   * AWS Certificate Manager (ACM).
   */
  public fun clientRootCertificateChainArn(clientRootCertificateChainArn: String) {
    cdkBuilder.clientRootCertificateChainArn(clientRootCertificateChainArn)
  }

  public fun build(): CfnClientVpnEndpoint.CertificateAuthenticationRequestProperty =
      cdkBuilder.build()
}
