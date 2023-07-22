@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPool

/**
 * The password policy type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * PasswordPolicyProperty passwordPolicyProperty = PasswordPolicyProperty.builder()
 * .minimumLength(123)
 * .requireLowercase(false)
 * .requireNumbers(false)
 * .requireSymbols(false)
 * .requireUppercase(false)
 * .temporaryPasswordValidityDays(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html)
 */
@CdkDslMarker
public class CfnUserPoolPasswordPolicyPropertyDsl {
  private val cdkBuilder: CfnUserPool.PasswordPolicyProperty.Builder =
      CfnUserPool.PasswordPolicyProperty.builder()

  /**
   * @param minimumLength The minimum length of the password in the policy that you have set.
   * This value can't be less than 6.
   */
  public fun minimumLength(minimumLength: Number) {
    cdkBuilder.minimumLength(minimumLength)
  }

  /**
   * @param requireLowercase In the password policy that you have set, refers to whether you have
   * required users to use at least one lowercase letter in their password.
   */
  public fun requireLowercase(requireLowercase: Boolean) {
    cdkBuilder.requireLowercase(requireLowercase)
  }

  /**
   * @param requireLowercase In the password policy that you have set, refers to whether you have
   * required users to use at least one lowercase letter in their password.
   */
  public fun requireLowercase(requireLowercase: IResolvable) {
    cdkBuilder.requireLowercase(requireLowercase)
  }

  /**
   * @param requireNumbers In the password policy that you have set, refers to whether you have
   * required users to use at least one number in their password.
   */
  public fun requireNumbers(requireNumbers: Boolean) {
    cdkBuilder.requireNumbers(requireNumbers)
  }

  /**
   * @param requireNumbers In the password policy that you have set, refers to whether you have
   * required users to use at least one number in their password.
   */
  public fun requireNumbers(requireNumbers: IResolvable) {
    cdkBuilder.requireNumbers(requireNumbers)
  }

  /**
   * @param requireSymbols In the password policy that you have set, refers to whether you have
   * required users to use at least one symbol in their password.
   */
  public fun requireSymbols(requireSymbols: Boolean) {
    cdkBuilder.requireSymbols(requireSymbols)
  }

  /**
   * @param requireSymbols In the password policy that you have set, refers to whether you have
   * required users to use at least one symbol in their password.
   */
  public fun requireSymbols(requireSymbols: IResolvable) {
    cdkBuilder.requireSymbols(requireSymbols)
  }

  /**
   * @param requireUppercase In the password policy that you have set, refers to whether you have
   * required users to use at least one uppercase letter in their password.
   */
  public fun requireUppercase(requireUppercase: Boolean) {
    cdkBuilder.requireUppercase(requireUppercase)
  }

  /**
   * @param requireUppercase In the password policy that you have set, refers to whether you have
   * required users to use at least one uppercase letter in their password.
   */
  public fun requireUppercase(requireUppercase: IResolvable) {
    cdkBuilder.requireUppercase(requireUppercase)
  }

  /**
   * @param temporaryPasswordValidityDays The number of days a temporary password is valid in the
   * password policy.
   * If the user doesn't sign in during this time, an administrator must reset their password.
   *
   *
   * When you set `TemporaryPasswordValidityDays` for a user pool, you can no longer set a value for
   * the legacy `UnusedAccountValidityDays` parameter in that user pool.
   */
  public fun temporaryPasswordValidityDays(temporaryPasswordValidityDays: Number) {
    cdkBuilder.temporaryPasswordValidityDays(temporaryPasswordValidityDays)
  }

  public fun build(): CfnUserPool.PasswordPolicyProperty = cdkBuilder.build()
}
