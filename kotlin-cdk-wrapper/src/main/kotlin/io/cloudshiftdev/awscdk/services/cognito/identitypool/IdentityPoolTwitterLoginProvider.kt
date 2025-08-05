@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito.identitypool

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Login Provider for identity federation using Twitter credentials.
 *
 * Example:
 *
 * ```
 * IdentityPool.Builder.create(this, "myidentitypool")
 * .identityPoolName("myidentitypool")
 * .authenticationProviders(IdentityPoolAuthenticationProviders.builder()
 * .amazon(IdentityPoolAmazonLoginProvider.builder()
 * .appId("amzn1.application.12312k3j234j13rjiwuenf")
 * .build())
 * .facebook(IdentityPoolFacebookLoginProvider.builder()
 * .appId("1234567890123")
 * .build())
 * .google(IdentityPoolGoogleLoginProvider.builder()
 * .clientId("12345678012.apps.googleusercontent.com")
 * .build())
 * .apple(IdentityPoolAppleLoginProvider.builder()
 * .servicesId("com.myappleapp.auth")
 * .build())
 * .twitter(IdentityPoolTwitterLoginProvider.builder()
 * .consumerKey("my-twitter-id")
 * .consumerSecret("my-twitter-secret")
 * .build())
 * .build())
 * .build();
 * ```
 */
public interface IdentityPoolTwitterLoginProvider {
  /**
   * Consumer key for Twitter identity federation.
   */
  public fun consumerKey(): String

  /**
   * Consumer secret for identity federation.
   */
  public fun consumerSecret(): String

  /**
   * A builder for [IdentityPoolTwitterLoginProvider]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param consumerKey Consumer key for Twitter identity federation. 
     */
    public fun consumerKey(consumerKey: String)

    /**
     * @param consumerSecret Consumer secret for identity federation. 
     */
    public fun consumerSecret(consumerSecret: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolTwitterLoginProvider.Builder
        =
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolTwitterLoginProvider.builder()

    /**
     * @param consumerKey Consumer key for Twitter identity federation. 
     */
    override fun consumerKey(consumerKey: String) {
      cdkBuilder.consumerKey(consumerKey)
    }

    /**
     * @param consumerSecret Consumer secret for identity federation. 
     */
    override fun consumerSecret(consumerSecret: String) {
      cdkBuilder.consumerSecret(consumerSecret)
    }

    public fun build():
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolTwitterLoginProvider =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.identitypool.IdentityPoolTwitterLoginProvider,
  ) : CdkObject(cdkObject),
      IdentityPoolTwitterLoginProvider {
    /**
     * Consumer key for Twitter identity federation.
     */
    override fun consumerKey(): String = unwrap(this).getConsumerKey()

    /**
     * Consumer secret for identity federation.
     */
    override fun consumerSecret(): String = unwrap(this).getConsumerSecret()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): IdentityPoolTwitterLoginProvider {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.identitypool.IdentityPoolTwitterLoginProvider):
        IdentityPoolTwitterLoginProvider = CdkObjectWrappers.wrap(cdkObject) as?
        IdentityPoolTwitterLoginProvider ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IdentityPoolTwitterLoginProvider):
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolTwitterLoginProvider =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolTwitterLoginProvider
  }
}
