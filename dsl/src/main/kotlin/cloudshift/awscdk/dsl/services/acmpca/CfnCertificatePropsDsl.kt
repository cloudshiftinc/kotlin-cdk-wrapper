@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.acmpca.CfnCertificate
import software.amazon.awscdk.services.acmpca.CfnCertificateProps

@CdkDslMarker
public class CfnCertificatePropsDsl {
  private val cdkBuilder: CfnCertificateProps.Builder = CfnCertificateProps.builder()

  /**
   * @param apiPassthrough Specifies X.509 certificate information to be included in the issued
   * certificate. An `APIPassthrough` or `APICSRPassthrough` template variant must be selected, or else
   * this parameter is ignored.
   */
  public fun apiPassthrough(apiPassthrough: IResolvable) {
    cdkBuilder.apiPassthrough(apiPassthrough)
  }

  /**
   * @param apiPassthrough Specifies X.509 certificate information to be included in the issued
   * certificate. An `APIPassthrough` or `APICSRPassthrough` template variant must be selected, or else
   * this parameter is ignored.
   */
  public fun apiPassthrough(apiPassthrough: CfnCertificate.ApiPassthroughProperty) {
    cdkBuilder.apiPassthrough(apiPassthrough)
  }

  /**
   * @param certificateAuthorityArn The Amazon Resource Name (ARN) for the private CA issues the
   * certificate. 
   */
  public fun certificateAuthorityArn(certificateAuthorityArn: String) {
    cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
  }

  /**
   * @param certificateSigningRequest The certificate signing request (CSR) for the certificate. 
   */
  public fun certificateSigningRequest(certificateSigningRequest: String) {
    cdkBuilder.certificateSigningRequest(certificateSigningRequest)
  }

  /**
   * @param signingAlgorithm The name of the algorithm that will be used to sign the certificate to
   * be issued. 
   * This parameter should not be confused with the `SigningAlgorithm` parameter used to sign a CSR
   * in the `CreateCertificateAuthority` action.
   *
   *
   * The specified signing algorithm family (RSA or ECDSA) must match the algorithm family of the
   * CA's secret key.
   */
  public fun signingAlgorithm(signingAlgorithm: String) {
    cdkBuilder.signingAlgorithm(signingAlgorithm)
  }

  /**
   * @param templateArn Specifies a custom configuration template to use when issuing a certificate.
   * If this parameter is not provided, AWS Private CA defaults to the `EndEntityCertificate/V1`
   * template. For more information about AWS Private CA templates, see [Using
   * Templates](https://docs.aws.amazon.com/privateca/latest/userguide/UsingTemplates.html) .
   */
  public fun templateArn(templateArn: String) {
    cdkBuilder.templateArn(templateArn)
  }

  /**
   * @param validity The period of time during which the certificate will be valid. 
   */
  public fun validity(validity: IResolvable) {
    cdkBuilder.validity(validity)
  }

  /**
   * @param validity The period of time during which the certificate will be valid. 
   */
  public fun validity(validity: CfnCertificate.ValidityProperty) {
    cdkBuilder.validity(validity)
  }

  /**
   * @param validityNotBefore Information describing the start of the validity period of the
   * certificate.
   * This parameter sets the “Not Before" date for the certificate.
   *
   * By default, when issuing a certificate, AWS Private CA sets the "Not Before" date to the
   * issuance time minus 60 minutes. This compensates for clock inconsistencies across computer
   * systems. The `ValidityNotBefore` parameter can be used to customize the “Not Before” value.
   *
   * Unlike the `Validity` parameter, the `ValidityNotBefore` parameter is optional.
   *
   * The `ValidityNotBefore` value is expressed as an explicit date and time, using the `Validity`
   * type value `ABSOLUTE` .
   */
  public fun validityNotBefore(validityNotBefore: IResolvable) {
    cdkBuilder.validityNotBefore(validityNotBefore)
  }

  /**
   * @param validityNotBefore Information describing the start of the validity period of the
   * certificate.
   * This parameter sets the “Not Before" date for the certificate.
   *
   * By default, when issuing a certificate, AWS Private CA sets the "Not Before" date to the
   * issuance time minus 60 minutes. This compensates for clock inconsistencies across computer
   * systems. The `ValidityNotBefore` parameter can be used to customize the “Not Before” value.
   *
   * Unlike the `Validity` parameter, the `ValidityNotBefore` parameter is optional.
   *
   * The `ValidityNotBefore` value is expressed as an explicit date and time, using the `Validity`
   * type value `ABSOLUTE` .
   */
  public fun validityNotBefore(validityNotBefore: CfnCertificate.ValidityProperty) {
    cdkBuilder.validityNotBefore(validityNotBefore)
  }

  public fun build(): CfnCertificateProps = cdkBuilder.build()
}
