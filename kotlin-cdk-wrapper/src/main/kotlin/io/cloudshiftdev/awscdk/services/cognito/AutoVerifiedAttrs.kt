@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

/**
 * Attributes that can be automatically verified for users in a user pool.
 *
 * Example:
 *
 * ```
 * UserPool.Builder.create(this, "myuserpool")
 * // ...
 * // ...
 * .signInAliases(SignInAliases.builder().username(true).email(true).build())
 * .autoVerify(AutoVerifiedAttrs.builder().email(true).phone(true).build())
 * .build();
 * ```
 */
public interface AutoVerifiedAttrs {
  /**
   * Whether the email address of the user should be auto verified at sign up.
   *
   * Note: If both `email` and `phone` is set, Cognito only verifies the phone number. To also
   * verify email, see here -
   * https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html
   *
   * Default: - true, if email is turned on for `signIn`. false, otherwise.
   */
  public fun email(): Boolean? = unwrap(this).getEmail()

  /**
   * Whether the phone number of the user should be auto verified at sign up.
   *
   * Default: - true, if phone is turned on for `signIn`. false, otherwise.
   */
  public fun phone(): Boolean? = unwrap(this).getPhone()

  /**
   * A builder for [AutoVerifiedAttrs]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param email Whether the email address of the user should be auto verified at sign up.
     * Note: If both `email` and `phone` is set, Cognito only verifies the phone number. To also
     * verify email, see here -
     * https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html
     */
    public fun email(email: Boolean)

    /**
     * @param phone Whether the phone number of the user should be auto verified at sign up.
     */
    public fun phone(phone: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.AutoVerifiedAttrs.Builder =
        software.amazon.awscdk.services.cognito.AutoVerifiedAttrs.builder()

    /**
     * @param email Whether the email address of the user should be auto verified at sign up.
     * Note: If both `email` and `phone` is set, Cognito only verifies the phone number. To also
     * verify email, see here -
     * https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html
     */
    override fun email(email: Boolean) {
      cdkBuilder.email(email)
    }

    /**
     * @param phone Whether the phone number of the user should be auto verified at sign up.
     */
    override fun phone(phone: Boolean) {
      cdkBuilder.phone(phone)
    }

    public fun build(): software.amazon.awscdk.services.cognito.AutoVerifiedAttrs =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.AutoVerifiedAttrs,
  ) : CdkObject(cdkObject),
      AutoVerifiedAttrs {
    /**
     * Whether the email address of the user should be auto verified at sign up.
     *
     * Note: If both `email` and `phone` is set, Cognito only verifies the phone number. To also
     * verify email, see here -
     * https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html
     *
     * Default: - true, if email is turned on for `signIn`. false, otherwise.
     */
    override fun email(): Boolean? = unwrap(this).getEmail()

    /**
     * Whether the phone number of the user should be auto verified at sign up.
     *
     * Default: - true, if phone is turned on for `signIn`. false, otherwise.
     */
    override fun phone(): Boolean? = unwrap(this).getPhone()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AutoVerifiedAttrs {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.AutoVerifiedAttrs):
        AutoVerifiedAttrs = CdkObjectWrappers.wrap(cdkObject) as? AutoVerifiedAttrs ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AutoVerifiedAttrs):
        software.amazon.awscdk.services.cognito.AutoVerifiedAttrs = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cognito.AutoVerifiedAttrs
  }
}
