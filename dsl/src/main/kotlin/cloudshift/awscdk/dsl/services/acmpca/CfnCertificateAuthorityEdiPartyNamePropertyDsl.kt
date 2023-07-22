@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority

/**
 * Describes an Electronic Data Interchange (EDI) entity as described in as defined in [Subject
 * Alternative Name](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc5280) in RFC
 * 5280.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.acmpca.*;
 * EdiPartyNameProperty ediPartyNameProperty = EdiPartyNameProperty.builder()
 * .nameAssigner("nameAssigner")
 * .partyName("partyName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-edipartyname.html)
 */
@CdkDslMarker
public class CfnCertificateAuthorityEdiPartyNamePropertyDsl {
  private val cdkBuilder: CfnCertificateAuthority.EdiPartyNameProperty.Builder =
      CfnCertificateAuthority.EdiPartyNameProperty.builder()

  /**
   * @param nameAssigner Specifies the name assigner. 
   */
  public fun nameAssigner(nameAssigner: String) {
    cdkBuilder.nameAssigner(nameAssigner)
  }

  /**
   * @param partyName Specifies the party name. 
   */
  public fun partyName(partyName: String) {
    cdkBuilder.partyName(partyName)
  }

  public fun build(): CfnCertificateAuthority.EdiPartyNameProperty = cdkBuilder.build()
}
