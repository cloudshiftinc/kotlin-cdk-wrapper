@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.signer

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.signer.CfnSigningProfile

@CdkDslMarker
public class CfnSigningProfileSignatureValidityPeriodPropertyDsl {
  private val cdkBuilder: CfnSigningProfile.SignatureValidityPeriodProperty.Builder =
      CfnSigningProfile.SignatureValidityPeriodProperty.builder()

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnSigningProfile.SignatureValidityPeriodProperty = cdkBuilder.build()
}
