@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cognito.PasswordPolicy

@CdkDslMarker
public class PasswordPolicyDsl {
  private val cdkBuilder: PasswordPolicy.Builder = PasswordPolicy.builder()

  public fun minLength(minLength: Number) {
    cdkBuilder.minLength(minLength)
  }

  public fun requireDigits(requireDigits: Boolean) {
    cdkBuilder.requireDigits(requireDigits)
  }

  public fun requireLowercase(requireLowercase: Boolean) {
    cdkBuilder.requireLowercase(requireLowercase)
  }

  public fun requireSymbols(requireSymbols: Boolean) {
    cdkBuilder.requireSymbols(requireSymbols)
  }

  public fun requireUppercase(requireUppercase: Boolean) {
    cdkBuilder.requireUppercase(requireUppercase)
  }

  public fun tempPasswordValidity(tempPasswordValidity: Duration) {
    cdkBuilder.tempPasswordValidity(tempPasswordValidity)
  }

  public fun build(): PasswordPolicy = cdkBuilder.build()
}
