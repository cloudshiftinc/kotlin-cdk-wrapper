@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint

/**
 * Information about the client certificate to be used for authentication.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CertificateAuthenticationRequestProperty certificateAuthenticationRequestProperty =
 * CertificateAuthenticationRequestProperty.builder()
 * .clientRootCertificateChainArn("clientRootCertificateChainArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-certificateauthenticationrequest.html)
 */
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
