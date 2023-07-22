@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.acmpca.CfnCertificate

/**
 * Defines a `PolicyInformation` qualifier.
 *
 * AWS Private CA supports the [certification practice statement (CPS)
 * qualifier](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc5280#section-4.2.1.4)
 * defined in RFC 5280.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.acmpca.*;
 * QualifierProperty qualifierProperty = QualifierProperty.builder()
 * .cpsUri("cpsUri")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-qualifier.html)
 */
@CdkDslMarker
public class CfnCertificateQualifierPropertyDsl {
  private val cdkBuilder: CfnCertificate.QualifierProperty.Builder =
      CfnCertificate.QualifierProperty.builder()

  /**
   * @param cpsUri Contains a pointer to a certification practice statement (CPS) published by the
   * CA. 
   */
  public fun cpsUri(cpsUri: String) {
    cdkBuilder.cpsUri(cpsUri)
  }

  public fun build(): CfnCertificate.QualifierProperty = cdkBuilder.build()
}
