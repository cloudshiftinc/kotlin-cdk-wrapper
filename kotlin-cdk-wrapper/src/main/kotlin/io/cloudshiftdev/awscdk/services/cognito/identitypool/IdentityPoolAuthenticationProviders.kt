@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito.identitypool

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IOpenIdConnectProvider
import io.cloudshiftdev.awscdk.services.iam.ISamlProvider
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * External Authentication Providers for usage in Identity Pool.
 *
 * Example:
 *
 * ```
 * OpenIdConnectProvider openIdConnectProvider;
 * IdentityPool.Builder.create(this, "myidentitypool")
 * .identityPoolName("myidentitypool")
 * .authenticationProviders(IdentityPoolAuthenticationProviders.builder()
 * .google(IdentityPoolGoogleLoginProvider.builder()
 * .clientId("12345678012.apps.googleusercontent.com")
 * .build())
 * .openIdConnectProviders(List.of(openIdConnectProvider))
 * .customProvider("my-custom-provider.example.com")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/external-identity-providers.html)
 */
public interface IdentityPoolAuthenticationProviders {
  /**
   * The Amazon Authentication Provider associated with this Identity Pool.
   *
   * Default: -  No Amazon Authentication Provider used without OpenIdConnect or a User Pool
   */
  public fun amazon(): IdentityPoolAmazonLoginProvider? =
      unwrap(this).getAmazon()?.let(IdentityPoolAmazonLoginProvider::wrap)

  /**
   * The Apple Authentication Provider associated with this Identity Pool.
   *
   * Default: - No Apple Authentication Provider used without OpenIdConnect or a User Pool
   */
  public fun apple(): IdentityPoolAppleLoginProvider? =
      unwrap(this).getApple()?.let(IdentityPoolAppleLoginProvider::wrap)

  /**
   * The developer provider name to associate with this Identity Pool.
   *
   * Default: - no custom provider
   */
  public fun customProvider(): String? = unwrap(this).getCustomProvider()

  /**
   * The Facebook Authentication Provider associated with this Identity Pool.
   *
   * Default: - No Facebook Authentication Provider used without OpenIdConnect or a User Pool
   */
  public fun facebook(): IdentityPoolFacebookLoginProvider? =
      unwrap(this).getFacebook()?.let(IdentityPoolFacebookLoginProvider::wrap)

  /**
   * The Google Authentication Provider associated with this Identity Pool.
   *
   * Default: - No Google Authentication Provider used without OpenIdConnect or a User Pool
   */
  public fun google(): IdentityPoolGoogleLoginProvider? =
      unwrap(this).getGoogle()?.let(IdentityPoolGoogleLoginProvider::wrap)

  /**
   * The OpenIdConnect Provider associated with this Identity Pool.
   *
   * Default: - no OpenIdConnectProvider
   */
  public fun openIdConnectProviders(): List<IOpenIdConnectProvider> =
      unwrap(this).getOpenIdConnectProviders()?.map(IOpenIdConnectProvider::wrap) ?: emptyList()

  /**
   * The Security Assertion Markup Language provider associated with this Identity Pool.
   *
   * Default: - no SamlProvider
   */
  public fun samlProviders(): List<ISamlProvider> =
      unwrap(this).getSamlProviders()?.map(ISamlProvider::wrap) ?: emptyList()

  /**
   * The Twitter Authentication Provider associated with this Identity Pool.
   *
   * Default: - No Twitter Authentication Provider used without OpenIdConnect or a User Pool
   */
  public fun twitter(): IdentityPoolTwitterLoginProvider? =
      unwrap(this).getTwitter()?.let(IdentityPoolTwitterLoginProvider::wrap)

  /**
   * The User Pool Authentication Providers associated with this Identity Pool.
   *
   * Default: - no User Pools associated
   */
  public fun userPools(): List<IUserPoolAuthenticationProvider> =
      unwrap(this).getUserPools()?.map(IUserPoolAuthenticationProvider::wrap) ?: emptyList()

  /**
   * A builder for [IdentityPoolAuthenticationProviders]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param amazon The Amazon Authentication Provider associated with this Identity Pool.
     */
    public fun amazon(amazon: IdentityPoolAmazonLoginProvider)

    /**
     * @param amazon The Amazon Authentication Provider associated with this Identity Pool.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("78562f5f6883d365197ec11a70317bc0b093017ce4ed6da39f7508f5bf11da42")
    public fun amazon(amazon: IdentityPoolAmazonLoginProvider.Builder.() -> Unit)

    /**
     * @param apple The Apple Authentication Provider associated with this Identity Pool.
     */
    public fun apple(apple: IdentityPoolAppleLoginProvider)

    /**
     * @param apple The Apple Authentication Provider associated with this Identity Pool.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("59837e13b41a1dfd68d04c06b35449013d076d5ba309e3686821e58e6eb9075c")
    public fun apple(apple: IdentityPoolAppleLoginProvider.Builder.() -> Unit)

    /**
     * @param customProvider The developer provider name to associate with this Identity Pool.
     */
    public fun customProvider(customProvider: String)

    /**
     * @param facebook The Facebook Authentication Provider associated with this Identity Pool.
     */
    public fun facebook(facebook: IdentityPoolFacebookLoginProvider)

    /**
     * @param facebook The Facebook Authentication Provider associated with this Identity Pool.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d6dbdf2d9f78f329e17b526938764ae2889e6da419ee6cb91e0e223fc1bfacad")
    public fun facebook(facebook: IdentityPoolFacebookLoginProvider.Builder.() -> Unit)

    /**
     * @param google The Google Authentication Provider associated with this Identity Pool.
     */
    public fun google(google: IdentityPoolGoogleLoginProvider)

    /**
     * @param google The Google Authentication Provider associated with this Identity Pool.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f512cd5f11a6e1fe63bec9fa952d7f5532cea2b78e8de089a78560d9ad455999")
    public fun google(google: IdentityPoolGoogleLoginProvider.Builder.() -> Unit)

    /**
     * @param openIdConnectProviders The OpenIdConnect Provider associated with this Identity Pool.
     */
    public fun openIdConnectProviders(openIdConnectProviders: List<IOpenIdConnectProvider>)

    /**
     * @param openIdConnectProviders The OpenIdConnect Provider associated with this Identity Pool.
     */
    public fun openIdConnectProviders(vararg openIdConnectProviders: IOpenIdConnectProvider)

    /**
     * @param samlProviders The Security Assertion Markup Language provider associated with this
     * Identity Pool.
     */
    public fun samlProviders(samlProviders: List<ISamlProvider>)

    /**
     * @param samlProviders The Security Assertion Markup Language provider associated with this
     * Identity Pool.
     */
    public fun samlProviders(vararg samlProviders: ISamlProvider)

    /**
     * @param twitter The Twitter Authentication Provider associated with this Identity Pool.
     */
    public fun twitter(twitter: IdentityPoolTwitterLoginProvider)

    /**
     * @param twitter The Twitter Authentication Provider associated with this Identity Pool.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bb500c1bf97fe9e007071b6e92ce7aad6b11b5aa3bded6c261b43cdbcb71026d")
    public fun twitter(twitter: IdentityPoolTwitterLoginProvider.Builder.() -> Unit)

    /**
     * @param userPools The User Pool Authentication Providers associated with this Identity Pool.
     */
    public fun userPools(userPools: List<IUserPoolAuthenticationProvider>)

    /**
     * @param userPools The User Pool Authentication Providers associated with this Identity Pool.
     */
    public fun userPools(vararg userPools: IUserPoolAuthenticationProvider)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolAuthenticationProviders.Builder
        =
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolAuthenticationProviders.builder()

    /**
     * @param amazon The Amazon Authentication Provider associated with this Identity Pool.
     */
    override fun amazon(amazon: IdentityPoolAmazonLoginProvider) {
      cdkBuilder.amazon(amazon.let(IdentityPoolAmazonLoginProvider.Companion::unwrap))
    }

    /**
     * @param amazon The Amazon Authentication Provider associated with this Identity Pool.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("78562f5f6883d365197ec11a70317bc0b093017ce4ed6da39f7508f5bf11da42")
    override fun amazon(amazon: IdentityPoolAmazonLoginProvider.Builder.() -> Unit): Unit =
        amazon(IdentityPoolAmazonLoginProvider(amazon))

    /**
     * @param apple The Apple Authentication Provider associated with this Identity Pool.
     */
    override fun apple(apple: IdentityPoolAppleLoginProvider) {
      cdkBuilder.apple(apple.let(IdentityPoolAppleLoginProvider.Companion::unwrap))
    }

    /**
     * @param apple The Apple Authentication Provider associated with this Identity Pool.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("59837e13b41a1dfd68d04c06b35449013d076d5ba309e3686821e58e6eb9075c")
    override fun apple(apple: IdentityPoolAppleLoginProvider.Builder.() -> Unit): Unit =
        apple(IdentityPoolAppleLoginProvider(apple))

    /**
     * @param customProvider The developer provider name to associate with this Identity Pool.
     */
    override fun customProvider(customProvider: String) {
      cdkBuilder.customProvider(customProvider)
    }

    /**
     * @param facebook The Facebook Authentication Provider associated with this Identity Pool.
     */
    override fun facebook(facebook: IdentityPoolFacebookLoginProvider) {
      cdkBuilder.facebook(facebook.let(IdentityPoolFacebookLoginProvider.Companion::unwrap))
    }

    /**
     * @param facebook The Facebook Authentication Provider associated with this Identity Pool.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d6dbdf2d9f78f329e17b526938764ae2889e6da419ee6cb91e0e223fc1bfacad")
    override fun facebook(facebook: IdentityPoolFacebookLoginProvider.Builder.() -> Unit): Unit =
        facebook(IdentityPoolFacebookLoginProvider(facebook))

    /**
     * @param google The Google Authentication Provider associated with this Identity Pool.
     */
    override fun google(google: IdentityPoolGoogleLoginProvider) {
      cdkBuilder.google(google.let(IdentityPoolGoogleLoginProvider.Companion::unwrap))
    }

    /**
     * @param google The Google Authentication Provider associated with this Identity Pool.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f512cd5f11a6e1fe63bec9fa952d7f5532cea2b78e8de089a78560d9ad455999")
    override fun google(google: IdentityPoolGoogleLoginProvider.Builder.() -> Unit): Unit =
        google(IdentityPoolGoogleLoginProvider(google))

    /**
     * @param openIdConnectProviders The OpenIdConnect Provider associated with this Identity Pool.
     */
    override fun openIdConnectProviders(openIdConnectProviders: List<IOpenIdConnectProvider>) {
      cdkBuilder.openIdConnectProviders(openIdConnectProviders.map(IOpenIdConnectProvider.Companion::unwrap))
    }

    /**
     * @param openIdConnectProviders The OpenIdConnect Provider associated with this Identity Pool.
     */
    override fun openIdConnectProviders(vararg openIdConnectProviders: IOpenIdConnectProvider): Unit
        = openIdConnectProviders(openIdConnectProviders.toList())

    /**
     * @param samlProviders The Security Assertion Markup Language provider associated with this
     * Identity Pool.
     */
    override fun samlProviders(samlProviders: List<ISamlProvider>) {
      cdkBuilder.samlProviders(samlProviders.map(ISamlProvider.Companion::unwrap))
    }

    /**
     * @param samlProviders The Security Assertion Markup Language provider associated with this
     * Identity Pool.
     */
    override fun samlProviders(vararg samlProviders: ISamlProvider): Unit =
        samlProviders(samlProviders.toList())

    /**
     * @param twitter The Twitter Authentication Provider associated with this Identity Pool.
     */
    override fun twitter(twitter: IdentityPoolTwitterLoginProvider) {
      cdkBuilder.twitter(twitter.let(IdentityPoolTwitterLoginProvider.Companion::unwrap))
    }

    /**
     * @param twitter The Twitter Authentication Provider associated with this Identity Pool.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bb500c1bf97fe9e007071b6e92ce7aad6b11b5aa3bded6c261b43cdbcb71026d")
    override fun twitter(twitter: IdentityPoolTwitterLoginProvider.Builder.() -> Unit): Unit =
        twitter(IdentityPoolTwitterLoginProvider(twitter))

    /**
     * @param userPools The User Pool Authentication Providers associated with this Identity Pool.
     */
    override fun userPools(userPools: List<IUserPoolAuthenticationProvider>) {
      cdkBuilder.userPools(userPools.map(IUserPoolAuthenticationProvider.Companion::unwrap))
    }

    /**
     * @param userPools The User Pool Authentication Providers associated with this Identity Pool.
     */
    override fun userPools(vararg userPools: IUserPoolAuthenticationProvider): Unit =
        userPools(userPools.toList())

    public fun build():
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolAuthenticationProviders =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.identitypool.IdentityPoolAuthenticationProviders,
  ) : CdkObject(cdkObject),
      IdentityPoolAuthenticationProviders {
    /**
     * The Amazon Authentication Provider associated with this Identity Pool.
     *
     * Default: -  No Amazon Authentication Provider used without OpenIdConnect or a User Pool
     */
    override fun amazon(): IdentityPoolAmazonLoginProvider? =
        unwrap(this).getAmazon()?.let(IdentityPoolAmazonLoginProvider::wrap)

    /**
     * The Apple Authentication Provider associated with this Identity Pool.
     *
     * Default: - No Apple Authentication Provider used without OpenIdConnect or a User Pool
     */
    override fun apple(): IdentityPoolAppleLoginProvider? =
        unwrap(this).getApple()?.let(IdentityPoolAppleLoginProvider::wrap)

    /**
     * The developer provider name to associate with this Identity Pool.
     *
     * Default: - no custom provider
     */
    override fun customProvider(): String? = unwrap(this).getCustomProvider()

    /**
     * The Facebook Authentication Provider associated with this Identity Pool.
     *
     * Default: - No Facebook Authentication Provider used without OpenIdConnect or a User Pool
     */
    override fun facebook(): IdentityPoolFacebookLoginProvider? =
        unwrap(this).getFacebook()?.let(IdentityPoolFacebookLoginProvider::wrap)

    /**
     * The Google Authentication Provider associated with this Identity Pool.
     *
     * Default: - No Google Authentication Provider used without OpenIdConnect or a User Pool
     */
    override fun google(): IdentityPoolGoogleLoginProvider? =
        unwrap(this).getGoogle()?.let(IdentityPoolGoogleLoginProvider::wrap)

    /**
     * The OpenIdConnect Provider associated with this Identity Pool.
     *
     * Default: - no OpenIdConnectProvider
     */
    override fun openIdConnectProviders(): List<IOpenIdConnectProvider> =
        unwrap(this).getOpenIdConnectProviders()?.map(IOpenIdConnectProvider::wrap) ?: emptyList()

    /**
     * The Security Assertion Markup Language provider associated with this Identity Pool.
     *
     * Default: - no SamlProvider
     */
    override fun samlProviders(): List<ISamlProvider> =
        unwrap(this).getSamlProviders()?.map(ISamlProvider::wrap) ?: emptyList()

    /**
     * The Twitter Authentication Provider associated with this Identity Pool.
     *
     * Default: - No Twitter Authentication Provider used without OpenIdConnect or a User Pool
     */
    override fun twitter(): IdentityPoolTwitterLoginProvider? =
        unwrap(this).getTwitter()?.let(IdentityPoolTwitterLoginProvider::wrap)

    /**
     * The User Pool Authentication Providers associated with this Identity Pool.
     *
     * Default: - no User Pools associated
     */
    override fun userPools(): List<IUserPoolAuthenticationProvider> =
        unwrap(this).getUserPools()?.map(IUserPoolAuthenticationProvider::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        IdentityPoolAuthenticationProviders {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.identitypool.IdentityPoolAuthenticationProviders):
        IdentityPoolAuthenticationProviders = CdkObjectWrappers.wrap(cdkObject) as?
        IdentityPoolAuthenticationProviders ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IdentityPoolAuthenticationProviders):
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolAuthenticationProviders =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolAuthenticationProviders
  }
}
