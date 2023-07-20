@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority

@CdkDslMarker
public class CfnCertificateAuthorityEdiPartyNamePropertyDsl {
  private val cdkBuilder: CfnCertificateAuthority.EdiPartyNameProperty.Builder =
      CfnCertificateAuthority.EdiPartyNameProperty.builder()

  public fun nameAssigner(nameAssigner: String) {
    cdkBuilder.nameAssigner(nameAssigner)
  }

  public fun partyName(partyName: String) {
    cdkBuilder.partyName(partyName)
  }

  public fun build(): CfnCertificateAuthority.EdiPartyNameProperty = cdkBuilder.build()
}
