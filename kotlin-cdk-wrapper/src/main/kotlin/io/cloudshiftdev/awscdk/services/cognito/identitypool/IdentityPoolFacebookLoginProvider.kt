@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito.identitypool

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Login Provider for identity federation using Facebook credentials.
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
public interface IdentityPoolFacebookLoginProvider {
  /**
   * App ID for Facebook identity federation.
   */
  public fun appId(): String

  /**
   * A builder for [IdentityPoolFacebookLoginProvider]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param appId App ID for Facebook identity federation. 
     */
    public fun appId(appId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolFacebookLoginProvider.Builder
        =
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolFacebookLoginProvider.builder()

    /**
     * @param appId App ID for Facebook identity federation. 
     */
    override fun appId(appId: String) {
      cdkBuilder.appId(appId)
    }

    public fun build():
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolFacebookLoginProvider =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.identitypool.IdentityPoolFacebookLoginProvider,
  ) : CdkObject(cdkObject),
      IdentityPoolFacebookLoginProvider {
    /**
     * App ID for Facebook identity federation.
     */
    override fun appId(): String = unwrap(this).getAppId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): IdentityPoolFacebookLoginProvider {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.identitypool.IdentityPoolFacebookLoginProvider):
        IdentityPoolFacebookLoginProvider = CdkObjectWrappers.wrap(cdkObject) as?
        IdentityPoolFacebookLoginProvider ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IdentityPoolFacebookLoginProvider):
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolFacebookLoginProvider =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolFacebookLoginProvider
  }
}
