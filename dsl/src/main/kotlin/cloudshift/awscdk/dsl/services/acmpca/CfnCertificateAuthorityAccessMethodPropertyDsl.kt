@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority

/**
 * Describes the type and format of extension access.
 *
 * Only one of `CustomObjectIdentifier` or `AccessMethodType` may be provided. Providing both
 * results in `InvalidArgsException` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.acmpca.*;
 * AccessMethodProperty accessMethodProperty = AccessMethodProperty.builder()
 * .accessMethodType("accessMethodType")
 * .customObjectIdentifier("customObjectIdentifier")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-accessmethod.html)
 */
@CdkDslMarker
public class CfnCertificateAuthorityAccessMethodPropertyDsl {
  private val cdkBuilder: CfnCertificateAuthority.AccessMethodProperty.Builder =
      CfnCertificateAuthority.AccessMethodProperty.builder()

  /**
   * @param accessMethodType Specifies the `AccessMethod` .
   */
  public fun accessMethodType(accessMethodType: String) {
    cdkBuilder.accessMethodType(accessMethodType)
  }

  /**
   * @param customObjectIdentifier An object identifier (OID) specifying the `AccessMethod` .
   * The OID must satisfy the regular expression shown below. For more information, see NIST's
   * definition of [Object Identifier
   * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
   */
  public fun customObjectIdentifier(customObjectIdentifier: String) {
    cdkBuilder.customObjectIdentifier(customObjectIdentifier)
  }

  public fun build(): CfnCertificateAuthority.AccessMethodProperty = cdkBuilder.build()
}
