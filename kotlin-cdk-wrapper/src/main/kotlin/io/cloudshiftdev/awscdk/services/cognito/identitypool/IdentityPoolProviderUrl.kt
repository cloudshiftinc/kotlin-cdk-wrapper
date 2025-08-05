@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito.identitypool

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.cognito.IUserPool
import io.cloudshiftdev.awscdk.services.cognito.IUserPoolClient
import kotlin.String

/**
 * Keys for Login Providers - each correspond to the client IDs of their respective federation
 * Identity Providers.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.cognito.identitypool.IdentityPoolProviderUrl;
 * IdentityPool.Builder.create(this, "myidentitypool")
 * .identityPoolName("myidentitypool")
 * .roleMappings(List.of(IdentityPoolRoleMapping.builder()
 * .providerUrl(IdentityPoolProviderUrl.custom("my-custom-provider.com"))
 * .useToken(true)
 * .build()))
 * .build();
 * ```
 */
public open class IdentityPoolProviderUrl(
  cdkObject: software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProviderUrl,
) : CdkObject(cdkObject) {
  public constructor(type: IdentityPoolProviderType, `value`: String) :
      this(software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProviderUrl(type.let(IdentityPoolProviderType.Companion::unwrap),
      `value`)
  )

  /**
   * The type of Identity Pool Provider.
   */
  public open fun type(): IdentityPoolProviderType =
      unwrap(this).getType().let(IdentityPoolProviderType::wrap)

  /**
   * The value of the Identity Pool Provider.
   */
  public open fun `value`(): String = unwrap(this).getValue()

  public companion object {
    public val AMAZON: IdentityPoolProviderUrl =
        IdentityPoolProviderUrl.wrap(software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProviderUrl.AMAZON)

    public val APPLE: IdentityPoolProviderUrl =
        IdentityPoolProviderUrl.wrap(software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProviderUrl.APPLE)

    public val FACEBOOK: IdentityPoolProviderUrl =
        IdentityPoolProviderUrl.wrap(software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProviderUrl.FACEBOOK)

    public val GOOGLE: IdentityPoolProviderUrl =
        IdentityPoolProviderUrl.wrap(software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProviderUrl.GOOGLE)

    public val TWITTER: IdentityPoolProviderUrl =
        IdentityPoolProviderUrl.wrap(software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProviderUrl.TWITTER)

    public fun custom(url: String): IdentityPoolProviderUrl =
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProviderUrl.custom(url).let(IdentityPoolProviderUrl::wrap)

    public fun openId(url: String): IdentityPoolProviderUrl =
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProviderUrl.openId(url).let(IdentityPoolProviderUrl::wrap)

    public fun saml(url: String): IdentityPoolProviderUrl =
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProviderUrl.saml(url).let(IdentityPoolProviderUrl::wrap)

    public fun userPool(userPool: IUserPool, userPoolClient: IUserPoolClient):
        IdentityPoolProviderUrl =
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProviderUrl.userPool(userPool.let(IUserPool.Companion::unwrap),
        userPoolClient.let(IUserPoolClient.Companion::unwrap)).let(IdentityPoolProviderUrl::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProviderUrl):
        IdentityPoolProviderUrl = IdentityPoolProviderUrl(cdkObject)

    internal fun unwrap(wrapped: IdentityPoolProviderUrl):
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProviderUrl =
        wrapped.cdkObject as
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProviderUrl
  }
}
