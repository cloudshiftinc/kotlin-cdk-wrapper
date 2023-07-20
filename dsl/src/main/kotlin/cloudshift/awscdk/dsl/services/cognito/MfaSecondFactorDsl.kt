@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.cognito.MfaSecondFactor

@CdkDslMarker
public class MfaSecondFactorDsl {
  private val cdkBuilder: MfaSecondFactor.Builder = MfaSecondFactor.builder()

  public fun otp(otp: Boolean) {
    cdkBuilder.otp(otp)
  }

  public fun sms(sms: Boolean) {
    cdkBuilder.sms(sms)
  }

  public fun build(): MfaSecondFactor = cdkBuilder.build()
}
