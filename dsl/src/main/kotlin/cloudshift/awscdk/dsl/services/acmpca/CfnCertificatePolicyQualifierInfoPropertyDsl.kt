@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.acmpca.CfnCertificate

/**
 * Modifies the `CertPolicyId` of a `PolicyInformation` object with a qualifier.
 *
 * AWS Private CA supports the certification practice statement (CPS) qualifier.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.acmpca.*;
 * PolicyQualifierInfoProperty policyQualifierInfoProperty = PolicyQualifierInfoProperty.builder()
 * .policyQualifierId("policyQualifierId")
 * .qualifier(QualifierProperty.builder()
 * .cpsUri("cpsUri")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-policyqualifierinfo.html)
 */
@CdkDslMarker
public class CfnCertificatePolicyQualifierInfoPropertyDsl {
  private val cdkBuilder: CfnCertificate.PolicyQualifierInfoProperty.Builder =
      CfnCertificate.PolicyQualifierInfoProperty.builder()

  /**
   * @param policyQualifierId Identifies the qualifier modifying a `CertPolicyId` . 
   */
  public fun policyQualifierId(policyQualifierId: String) {
    cdkBuilder.policyQualifierId(policyQualifierId)
  }

  /**
   * @param qualifier Defines the qualifier type. 
   * AWS Private CA supports the use of a URI for a CPS qualifier in this field.
   */
  public fun qualifier(qualifier: IResolvable) {
    cdkBuilder.qualifier(qualifier)
  }

  /**
   * @param qualifier Defines the qualifier type. 
   * AWS Private CA supports the use of a URI for a CPS qualifier in this field.
   */
  public fun qualifier(qualifier: CfnCertificate.QualifierProperty) {
    cdkBuilder.qualifier(qualifier)
  }

  public fun build(): CfnCertificate.PolicyQualifierInfoProperty = cdkBuilder.build()
}
