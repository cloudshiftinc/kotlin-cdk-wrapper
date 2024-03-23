@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

/**
 * The different ways in which users of this pool can sign up or sign in.
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
public interface SignInAliases {
  /**
   * Whether a user is allowed to sign up or sign in with an email address.
   *
   * Default: false
   */
  public fun email(): Boolean? = unwrap(this).getEmail()

  /**
   * Whether a user is allowed to sign up or sign in with a phone number.
   *
   * Default: false
   */
  public fun phone(): Boolean? = unwrap(this).getPhone()

  /**
   * Whether a user is allowed to sign in with a secondary username, that can be set and modified
   * after sign up.
   *
   * Can only be used in conjunction with `USERNAME`.
   *
   * Default: false
   */
  public fun preferredUsername(): Boolean? = unwrap(this).getPreferredUsername()

  /**
   * Whether user is allowed to sign up or sign in with a username.
   *
   * Default: true
   */
  public fun username(): Boolean? = unwrap(this).getUsername()

  /**
   * A builder for [SignInAliases]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param email Whether a user is allowed to sign up or sign in with an email address.
     */
    public fun email(email: Boolean)

    /**
     * @param phone Whether a user is allowed to sign up or sign in with a phone number.
     */
    public fun phone(phone: Boolean)

    /**
     * @param preferredUsername Whether a user is allowed to sign in with a secondary username, that
     * can be set and modified after sign up.
     * Can only be used in conjunction with `USERNAME`.
     */
    public fun preferredUsername(preferredUsername: Boolean)

    /**
     * @param username Whether user is allowed to sign up or sign in with a username.
     */
    public fun username(username: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.SignInAliases.Builder =
        software.amazon.awscdk.services.cognito.SignInAliases.builder()

    /**
     * @param email Whether a user is allowed to sign up or sign in with an email address.
     */
    override fun email(email: Boolean) {
      cdkBuilder.email(email)
    }

    /**
     * @param phone Whether a user is allowed to sign up or sign in with a phone number.
     */
    override fun phone(phone: Boolean) {
      cdkBuilder.phone(phone)
    }

    /**
     * @param preferredUsername Whether a user is allowed to sign in with a secondary username, that
     * can be set and modified after sign up.
     * Can only be used in conjunction with `USERNAME`.
     */
    override fun preferredUsername(preferredUsername: Boolean) {
      cdkBuilder.preferredUsername(preferredUsername)
    }

    /**
     * @param username Whether user is allowed to sign up or sign in with a username.
     */
    override fun username(username: Boolean) {
      cdkBuilder.username(username)
    }

    public fun build(): software.amazon.awscdk.services.cognito.SignInAliases = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.SignInAliases,
  ) : CdkObject(cdkObject), SignInAliases {
    /**
     * Whether a user is allowed to sign up or sign in with an email address.
     *
     * Default: false
     */
    override fun email(): Boolean? = unwrap(this).getEmail()

    /**
     * Whether a user is allowed to sign up or sign in with a phone number.
     *
     * Default: false
     */
    override fun phone(): Boolean? = unwrap(this).getPhone()

    /**
     * Whether a user is allowed to sign in with a secondary username, that can be set and modified
     * after sign up.
     *
     * Can only be used in conjunction with `USERNAME`.
     *
     * Default: false
     */
    override fun preferredUsername(): Boolean? = unwrap(this).getPreferredUsername()

    /**
     * Whether user is allowed to sign up or sign in with a username.
     *
     * Default: true
     */
    override fun username(): Boolean? = unwrap(this).getUsername()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SignInAliases {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.SignInAliases):
        SignInAliases = CdkObjectWrappers.wrap(cdkObject) as? SignInAliases ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: SignInAliases):
        software.amazon.awscdk.services.cognito.SignInAliases = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.SignInAliases
  }
}
