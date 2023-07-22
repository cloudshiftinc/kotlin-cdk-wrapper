@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.acmpca.CfnCertificate

@CdkDslMarker
public class CfnCertificateEdiPartyNamePropertyDsl {
  private val cdkBuilder: CfnCertificate.EdiPartyNameProperty.Builder =
      CfnCertificate.EdiPartyNameProperty.builder()

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

  public fun build(): CfnCertificate.EdiPartyNameProperty = cdkBuilder.build()
}
