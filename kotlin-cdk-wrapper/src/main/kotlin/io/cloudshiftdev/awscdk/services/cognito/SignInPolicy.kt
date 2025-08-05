@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Sign-in policy for User Pools.
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
 */
public interface SignInPolicy {
  /**
   * The types of authentication that you want to allow for users' first authentication prompt.
   *
   * Default: - Password only
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/authentication-flows-selection-sdk.html#authentication-flows-selection-choice)
   */
  public fun allowedFirstAuthFactors(): AllowedFirstAuthFactors? =
      unwrap(this).getAllowedFirstAuthFactors()?.let(AllowedFirstAuthFactors::wrap)

  /**
   * A builder for [SignInPolicy]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowedFirstAuthFactors The types of authentication that you want to allow for users'
     * first authentication prompt.
     */
    public fun allowedFirstAuthFactors(allowedFirstAuthFactors: AllowedFirstAuthFactors)

    /**
     * @param allowedFirstAuthFactors The types of authentication that you want to allow for users'
     * first authentication prompt.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("10d429c72fe007b17ab6c142791bf811e4567e125fb9bb8615c237a6bdc083a9")
    public
        fun allowedFirstAuthFactors(allowedFirstAuthFactors: AllowedFirstAuthFactors.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.SignInPolicy.Builder =
        software.amazon.awscdk.services.cognito.SignInPolicy.builder()

    /**
     * @param allowedFirstAuthFactors The types of authentication that you want to allow for users'
     * first authentication prompt.
     */
    override fun allowedFirstAuthFactors(allowedFirstAuthFactors: AllowedFirstAuthFactors) {
      cdkBuilder.allowedFirstAuthFactors(allowedFirstAuthFactors.let(AllowedFirstAuthFactors.Companion::unwrap))
    }

    /**
     * @param allowedFirstAuthFactors The types of authentication that you want to allow for users'
     * first authentication prompt.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("10d429c72fe007b17ab6c142791bf811e4567e125fb9bb8615c237a6bdc083a9")
    override
        fun allowedFirstAuthFactors(allowedFirstAuthFactors: AllowedFirstAuthFactors.Builder.() -> Unit):
        Unit = allowedFirstAuthFactors(AllowedFirstAuthFactors(allowedFirstAuthFactors))

    public fun build(): software.amazon.awscdk.services.cognito.SignInPolicy = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.SignInPolicy,
  ) : CdkObject(cdkObject),
      SignInPolicy {
    /**
     * The types of authentication that you want to allow for users' first authentication prompt.
     *
     * Default: - Password only
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/authentication-flows-selection-sdk.html#authentication-flows-selection-choice)
     */
    override fun allowedFirstAuthFactors(): AllowedFirstAuthFactors? =
        unwrap(this).getAllowedFirstAuthFactors()?.let(AllowedFirstAuthFactors::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SignInPolicy {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.SignInPolicy): SignInPolicy
        = CdkObjectWrappers.wrap(cdkObject) as? SignInPolicy ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: SignInPolicy): software.amazon.awscdk.services.cognito.SignInPolicy
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cognito.SignInPolicy
  }
}
