@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import kotlin.Any
import kotlin.String
import kotlin.collections.Map

/**
 * A principal that represents a federated identity provider as from a OpenID Connect provider.
 *
 * Example:
 *
 * ```
 * OpenIdConnectProvider provider = OpenIdConnectProvider.Builder.create(this, "MyProvider")
 * .url("https://openid/connect")
 * .clientIds(List.of("myclient1", "myclient2"))
 * .build();
 * OpenIdConnectPrincipal principal = new OpenIdConnectPrincipal(provider);
 * ```
 */
public open class OpenIdConnectPrincipal internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.OpenIdConnectPrincipal,
) : WebIdentityPrincipal(cdkObject) {
  public constructor(openIdConnectProvider: IOpenIdConnectProvider, conditions: Map<String, Any>) :
      this(software.amazon.awscdk.services.iam.OpenIdConnectPrincipal(IOpenIdConnectProvider.unwrap(openIdConnectProvider),
      conditions))

  public constructor(openIdConnectProvider: IOpenIdConnectProvider) :
      this(software.amazon.awscdk.services.iam.OpenIdConnectPrincipal(IOpenIdConnectProvider.unwrap(openIdConnectProvider)))

  /**
   * Return the policy fragment that identifies this principal in a Policy.
   */
  public override fun policyFragment(): PrincipalPolicyFragment =
      unwrap(this).getPolicyFragment().let(PrincipalPolicyFragment::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.OpenIdConnectPrincipal):
        OpenIdConnectPrincipal = OpenIdConnectPrincipal(cdkObject)

    internal fun unwrap(wrapped: OpenIdConnectPrincipal):
        software.amazon.awscdk.services.iam.OpenIdConnectPrincipal = wrapped.cdkObject
  }
}
