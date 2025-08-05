@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito.identitypool

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Login Provider for identity federation using Amazon credentials.
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
public interface IdentityPoolAmazonLoginProvider {
  /**
   * App ID for Amazon identity federation.
   */
  public fun appId(): String

  /**
   * A builder for [IdentityPoolAmazonLoginProvider]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param appId App ID for Amazon identity federation. 
     */
    public fun appId(appId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolAmazonLoginProvider.Builder
        =
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolAmazonLoginProvider.builder()

    /**
     * @param appId App ID for Amazon identity federation. 
     */
    override fun appId(appId: String) {
      cdkBuilder.appId(appId)
    }

    public fun build():
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolAmazonLoginProvider =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.identitypool.IdentityPoolAmazonLoginProvider,
  ) : CdkObject(cdkObject),
      IdentityPoolAmazonLoginProvider {
    /**
     * App ID for Amazon identity federation.
     */
    override fun appId(): String = unwrap(this).getAppId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): IdentityPoolAmazonLoginProvider {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.identitypool.IdentityPoolAmazonLoginProvider):
        IdentityPoolAmazonLoginProvider = CdkObjectWrappers.wrap(cdkObject) as?
        IdentityPoolAmazonLoginProvider ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IdentityPoolAmazonLoginProvider):
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolAmazonLoginProvider =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolAmazonLoginProvider
  }
}
