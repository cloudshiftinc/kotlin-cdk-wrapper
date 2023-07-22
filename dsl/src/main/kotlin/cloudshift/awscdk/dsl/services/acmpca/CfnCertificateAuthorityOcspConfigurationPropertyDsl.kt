@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority

/**
 * Contains information to enable and configure Online Certificate Status Protocol (OCSP) for
 * validating certificate revocation status.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.acmpca.*;
 * OcspConfigurationProperty ocspConfigurationProperty = OcspConfigurationProperty.builder()
 * .enabled(false)
 * .ocspCustomCname("ocspCustomCname")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-ocspconfiguration.html)
 */
@CdkDslMarker
public class CfnCertificateAuthorityOcspConfigurationPropertyDsl {
  private val cdkBuilder: CfnCertificateAuthority.OcspConfigurationProperty.Builder =
      CfnCertificateAuthority.OcspConfigurationProperty.builder()

  /**
   * @param enabled Flag enabling use of the Online Certificate Status Protocol (OCSP) for
   * validating certificate revocation status.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Flag enabling use of the Online Certificate Status Protocol (OCSP) for
   * validating certificate revocation status.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param ocspCustomCname By default, AWS Private CA injects an Amazon domain into certificates
   * being validated by the Online Certificate Status Protocol (OCSP).
   * A customer can alternatively use this object to define a CNAME specifying a customized OCSP
   * domain.
   *
   *
   * The content of a Canonical Name (CNAME) record must conform to
   * [RFC2396](https://docs.aws.amazon.com/https://www.ietf.org/rfc/rfc2396.txt) restrictions on the
   * use of special characters in URIs. Additionally, the value of the CNAME must not include a
   * protocol prefix such as "http://" or "https://".
   */
  public fun ocspCustomCname(ocspCustomCname: String) {
    cdkBuilder.ocspCustomCname(ocspCustomCname)
  }

  public fun build(): CfnCertificateAuthority.OcspConfigurationProperty = cdkBuilder.build()
}
