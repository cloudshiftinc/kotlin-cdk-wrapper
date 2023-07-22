@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivation
import software.constructs.Construct

@CdkDslMarker
public class CfnCertificateAuthorityActivationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnCertificateAuthorityActivation.Builder =
      CfnCertificateAuthorityActivation.Builder.create(scope, id)

  /**
   * The Base64 PEM-encoded certificate authority certificate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthorityactivation.html#cfn-acmpca-certificateauthorityactivation-certificate)
   * @param certificate The Base64 PEM-encoded certificate authority certificate. 
   */
  public fun certificate(certificate: String) {
    cdkBuilder.certificate(certificate)
  }

  /**
   * The Amazon Resource Name (ARN) of your private CA.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthorityactivation.html#cfn-acmpca-certificateauthorityactivation-certificateauthorityarn)
   * @param certificateAuthorityArn The Amazon Resource Name (ARN) of your private CA. 
   */
  public fun certificateAuthorityArn(certificateAuthorityArn: String) {
    cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
  }

  /**
   * The Base64 PEM-encoded certificate chain that chains up to the root CA certificate that you
   * used to sign your private CA certificate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthorityactivation.html#cfn-acmpca-certificateauthorityactivation-certificatechain)
   * @param certificateChain The Base64 PEM-encoded certificate chain that chains up to the root CA
   * certificate that you used to sign your private CA certificate. 
   */
  public fun certificateChain(certificateChain: String) {
    cdkBuilder.certificateChain(certificateChain)
  }

  /**
   * Status of your private CA.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthorityactivation.html#cfn-acmpca-certificateauthorityactivation-status)
   * @param status Status of your private CA. 
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnCertificateAuthorityActivation = cdkBuilder.build()
}
