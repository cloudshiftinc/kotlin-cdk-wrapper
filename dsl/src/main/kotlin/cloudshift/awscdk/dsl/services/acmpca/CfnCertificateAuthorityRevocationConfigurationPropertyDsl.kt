@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority

@CdkDslMarker
public class CfnCertificateAuthorityRevocationConfigurationPropertyDsl {
  private val cdkBuilder: CfnCertificateAuthority.RevocationConfigurationProperty.Builder =
      CfnCertificateAuthority.RevocationConfigurationProperty.builder()

  /**
   * @param crlConfiguration Configuration of the certificate revocation list (CRL), if any,
   * maintained by your private CA.
   */
  public fun crlConfiguration(crlConfiguration: IResolvable) {
    cdkBuilder.crlConfiguration(crlConfiguration)
  }

  /**
   * @param crlConfiguration Configuration of the certificate revocation list (CRL), if any,
   * maintained by your private CA.
   */
  public fun crlConfiguration(crlConfiguration: CfnCertificateAuthority.CrlConfigurationProperty) {
    cdkBuilder.crlConfiguration(crlConfiguration)
  }

  /**
   * @param ocspConfiguration Configuration of Online Certificate Status Protocol (OCSP) support, if
   * any, maintained by your private CA.
   */
  public fun ocspConfiguration(ocspConfiguration: IResolvable) {
    cdkBuilder.ocspConfiguration(ocspConfiguration)
  }

  /**
   * @param ocspConfiguration Configuration of Online Certificate Status Protocol (OCSP) support, if
   * any, maintained by your private CA.
   */
  public
      fun ocspConfiguration(ocspConfiguration: CfnCertificateAuthority.OcspConfigurationProperty) {
    cdkBuilder.ocspConfiguration(ocspConfiguration)
  }

  public fun build(): CfnCertificateAuthority.RevocationConfigurationProperty = cdkBuilder.build()
}
