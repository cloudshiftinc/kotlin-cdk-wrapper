@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.signer

import kotlin.Unit
import software.amazon.awscdk.services.signer.CfnSigningProfile

public inline
    fun CfnSigningProfile.setSignatureValidityPeriod(block: CfnSigningProfileSignatureValidityPeriodPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnSigningProfileSignatureValidityPeriodPropertyDsl()
  builder.apply(block)
  return setSignatureValidityPeriod(builder.build())
}
