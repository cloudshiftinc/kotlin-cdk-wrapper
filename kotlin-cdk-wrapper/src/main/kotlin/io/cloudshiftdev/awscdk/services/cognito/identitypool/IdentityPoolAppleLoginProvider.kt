@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito.identitypool

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Login Provider for identity federation using Apple credentials.
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
public interface IdentityPoolAppleLoginProvider {
  /**
   * Services ID for Apple identity federation.
   */
  public fun servicesId(): String

  /**
   * A builder for [IdentityPoolAppleLoginProvider]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param servicesId Services ID for Apple identity federation. 
     */
    public fun servicesId(servicesId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolAppleLoginProvider.Builder
        =
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolAppleLoginProvider.builder()

    /**
     * @param servicesId Services ID for Apple identity federation. 
     */
    override fun servicesId(servicesId: String) {
      cdkBuilder.servicesId(servicesId)
    }

    public fun build():
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolAppleLoginProvider =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.identitypool.IdentityPoolAppleLoginProvider,
  ) : CdkObject(cdkObject),
      IdentityPoolAppleLoginProvider {
    /**
     * Services ID for Apple identity federation.
     */
    override fun servicesId(): String = unwrap(this).getServicesId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): IdentityPoolAppleLoginProvider {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.identitypool.IdentityPoolAppleLoginProvider):
        IdentityPoolAppleLoginProvider = CdkObjectWrappers.wrap(cdkObject) as?
        IdentityPoolAppleLoginProvider ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IdentityPoolAppleLoginProvider):
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolAppleLoginProvider =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolAppleLoginProvider
  }
}
