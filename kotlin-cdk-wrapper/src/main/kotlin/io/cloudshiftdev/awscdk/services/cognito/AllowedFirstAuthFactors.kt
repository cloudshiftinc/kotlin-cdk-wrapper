@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

/**
 * The types of authentication that you want to allow for users' first authentication prompt.
 *
 * Example:
 *
 * ```
 * UserPool.Builder.create(this, "myuserpool")
 * .signInPolicy(SignInPolicy.builder()
 * .allowedFirstAuthFactors(AllowedFirstAuthFactors.builder().password(true).passkey(true).build())
 * .build())
 * .passkeyRelyingPartyId("auth.example.com")
 * .passkeyUserVerification(PasskeyUserVerification.REQUIRED)
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/authentication-flows-selection-sdk.html#authentication-flows-selection-choice)
 */
public interface AllowedFirstAuthFactors {
  /**
   * Whether the email message one-time password is allowed.
   *
   * Default: false
   */
  public fun emailOtp(): Boolean? = unwrap(this).getEmailOtp()

  /**
   * Whether the Passkey (WebAuthn) is allowed.
   *
   * Default: false
   */
  public fun passkey(): Boolean? = unwrap(this).getPasskey()

  /**
   * Whether the password authentication is allowed.
   *
   * This must be true.
   */
  public fun password(): Boolean

  /**
   * Whether the SMS message one-time password is allowed.
   *
   * Default: false
   */
  public fun smsOtp(): Boolean? = unwrap(this).getSmsOtp()

  /**
   * A builder for [AllowedFirstAuthFactors]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param emailOtp Whether the email message one-time password is allowed.
     */
    public fun emailOtp(emailOtp: Boolean)

    /**
     * @param passkey Whether the Passkey (WebAuthn) is allowed.
     */
    public fun passkey(passkey: Boolean)

    /**
     * @param password Whether the password authentication is allowed. 
     * This must be true.
     */
    public fun password(password: Boolean)

    /**
     * @param smsOtp Whether the SMS message one-time password is allowed.
     */
    public fun smsOtp(smsOtp: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.AllowedFirstAuthFactors.Builder
        = software.amazon.awscdk.services.cognito.AllowedFirstAuthFactors.builder()

    /**
     * @param emailOtp Whether the email message one-time password is allowed.
     */
    override fun emailOtp(emailOtp: Boolean) {
      cdkBuilder.emailOtp(emailOtp)
    }

    /**
     * @param passkey Whether the Passkey (WebAuthn) is allowed.
     */
    override fun passkey(passkey: Boolean) {
      cdkBuilder.passkey(passkey)
    }

    /**
     * @param password Whether the password authentication is allowed. 
     * This must be true.
     */
    override fun password(password: Boolean) {
      cdkBuilder.password(password)
    }

    /**
     * @param smsOtp Whether the SMS message one-time password is allowed.
     */
    override fun smsOtp(smsOtp: Boolean) {
      cdkBuilder.smsOtp(smsOtp)
    }

    public fun build(): software.amazon.awscdk.services.cognito.AllowedFirstAuthFactors =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.AllowedFirstAuthFactors,
  ) : CdkObject(cdkObject),
      AllowedFirstAuthFactors {
    /**
     * Whether the email message one-time password is allowed.
     *
     * Default: false
     */
    override fun emailOtp(): Boolean? = unwrap(this).getEmailOtp()

    /**
     * Whether the Passkey (WebAuthn) is allowed.
     *
     * Default: false
     */
    override fun passkey(): Boolean? = unwrap(this).getPasskey()

    /**
     * Whether the password authentication is allowed.
     *
     * This must be true.
     */
    override fun password(): Boolean = unwrap(this).getPassword()

    /**
     * Whether the SMS message one-time password is allowed.
     *
     * Default: false
     */
    override fun smsOtp(): Boolean? = unwrap(this).getSmsOtp()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AllowedFirstAuthFactors {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.AllowedFirstAuthFactors):
        AllowedFirstAuthFactors = CdkObjectWrappers.wrap(cdkObject) as? AllowedFirstAuthFactors ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AllowedFirstAuthFactors):
        software.amazon.awscdk.services.cognito.AllowedFirstAuthFactors = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.AllowedFirstAuthFactors
  }
}
