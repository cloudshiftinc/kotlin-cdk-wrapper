@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.dms.CfnCertificateProps

@CdkDslMarker
public class CfnCertificatePropsDsl {
  private val cdkBuilder: CfnCertificateProps.Builder = CfnCertificateProps.builder()

  /**
   * @param certificateIdentifier A customer-assigned name for the certificate.
   * Identifiers must begin with a letter and must contain only ASCII letters, digits, and hyphens.
   * They can't end with a hyphen or contain two consecutive hyphens.
   */
  public fun certificateIdentifier(certificateIdentifier: String) {
    cdkBuilder.certificateIdentifier(certificateIdentifier)
  }

  /**
   * @param certificatePem The contents of a `.pem` file, which contains an X.509 certificate.
   */
  public fun certificatePem(certificatePem: String) {
    cdkBuilder.certificatePem(certificatePem)
  }

  /**
   * @param certificateWallet The location of an imported Oracle Wallet certificate for use with
   * SSL.
   * An example is: `filebase64("${path.root}/rds-ca-2019-root.sso")`
   */
  public fun certificateWallet(certificateWallet: String) {
    cdkBuilder.certificateWallet(certificateWallet)
  }

  public fun build(): CfnCertificateProps = cdkBuilder.build()
}
