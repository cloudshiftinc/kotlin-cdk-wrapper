@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivationProps

/**
 * Properties for defining a `CfnCertificateAuthorityActivation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.acmpca.*;
 * CfnCertificateAuthorityActivationProps cfnCertificateAuthorityActivationProps =
 * CfnCertificateAuthorityActivationProps.builder()
 * .certificate("certificate")
 * .certificateAuthorityArn("certificateAuthorityArn")
 * // the properties below are optional
 * .certificateChain("certificateChain")
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthorityactivation.html)
 */
@CdkDslMarker
public class CfnCertificateAuthorityActivationPropsDsl {
  private val cdkBuilder: CfnCertificateAuthorityActivationProps.Builder =
      CfnCertificateAuthorityActivationProps.builder()

  /**
   * @param certificate The Base64 PEM-encoded certificate authority certificate. 
   */
  public fun certificate(certificate: String) {
    cdkBuilder.certificate(certificate)
  }

  /**
   * @param certificateAuthorityArn The Amazon Resource Name (ARN) of your private CA. 
   */
  public fun certificateAuthorityArn(certificateAuthorityArn: String) {
    cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
  }

  /**
   * @param certificateChain The Base64 PEM-encoded certificate chain that chains up to the root CA
   * certificate that you used to sign your private CA certificate.
   */
  public fun certificateChain(certificateChain: String) {
    cdkBuilder.certificateChain(certificateChain)
  }

  /**
   * @param status Status of your private CA.
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnCertificateAuthorityActivationProps = cdkBuilder.build()
}
