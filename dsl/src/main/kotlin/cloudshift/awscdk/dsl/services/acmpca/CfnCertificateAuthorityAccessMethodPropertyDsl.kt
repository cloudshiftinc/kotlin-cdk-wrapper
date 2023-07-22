@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority

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
