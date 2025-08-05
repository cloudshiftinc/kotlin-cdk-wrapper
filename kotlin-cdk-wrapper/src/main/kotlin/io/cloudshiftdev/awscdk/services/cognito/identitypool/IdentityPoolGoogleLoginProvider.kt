@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito.identitypool

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Login Provider for identity federation using Google credentials.
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
public interface IdentityPoolGoogleLoginProvider {
  /**
   * Client ID for Google identity federation.
   */
  public fun clientId(): String

  /**
   * A builder for [IdentityPoolGoogleLoginProvider]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param clientId Client ID for Google identity federation. 
     */
    public fun clientId(clientId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolGoogleLoginProvider.Builder
        =
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolGoogleLoginProvider.builder()

    /**
     * @param clientId Client ID for Google identity federation. 
     */
    override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    public fun build():
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolGoogleLoginProvider =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.identitypool.IdentityPoolGoogleLoginProvider,
  ) : CdkObject(cdkObject),
      IdentityPoolGoogleLoginProvider {
    /**
     * Client ID for Google identity federation.
     */
    override fun clientId(): String = unwrap(this).getClientId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): IdentityPoolGoogleLoginProvider {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.identitypool.IdentityPoolGoogleLoginProvider):
        IdentityPoolGoogleLoginProvider = CdkObjectWrappers.wrap(cdkObject) as?
        IdentityPoolGoogleLoginProvider ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IdentityPoolGoogleLoginProvider):
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolGoogleLoginProvider =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolGoogleLoginProvider
  }
}
