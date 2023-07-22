@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.acmpca.CfnCertificate

/**
 * Defines a custom ASN.1 X.400 `GeneralName` using an object identifier (OID) and value. The OID
 * must satisfy the regular expression shown below. For more information, see NIST's definition of
 * [Object Identifier
 * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.acmpca.*;
 * OtherNameProperty otherNameProperty = OtherNameProperty.builder()
 * .typeId("typeId")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-othername.html)
 */
@CdkDslMarker
public class CfnCertificateOtherNamePropertyDsl {
  private val cdkBuilder: CfnCertificate.OtherNameProperty.Builder =
      CfnCertificate.OtherNameProperty.builder()

  /**
   * @param typeId Specifies an OID. 
   */
  public fun typeId(typeId: String) {
    cdkBuilder.typeId(typeId)
  }

  /**
   * @param value Specifies an OID value. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnCertificate.OtherNameProperty = cdkBuilder.build()
}
