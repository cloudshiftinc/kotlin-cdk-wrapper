@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.collections.Map

/**
 * A principal that represents a federated identity provider as Web Identity such as Cognito,
 * Amazon, Facebook, Google, etc.
 *
 * Example:
 *
 * ```
 * WebIdentityPrincipal principal = new WebIdentityPrincipal("cognito-identity.amazonaws.com",
 * Map.of(
 * "StringEquals", Map.of("cognito-identity.amazonaws.com:aud",
 * "us-east-2:12345678-abcd-abcd-abcd-123456"),
 * "ForAnyValue:StringLike", Map.of("cognito-identity.amazonaws.com:amr", "unauthenticated")));
 * ```
 */
public open class WebIdentityPrincipal(
  cdkObject: software.amazon.awscdk.services.iam.WebIdentityPrincipal,
) : FederatedPrincipal(cdkObject) {
  public constructor(identityProvider: String) :
      this(software.amazon.awscdk.services.iam.WebIdentityPrincipal(identityProvider)
  )

  public constructor(identityProvider: String, conditions: Map<String, Any>) :
      this(software.amazon.awscdk.services.iam.WebIdentityPrincipal(identityProvider,
      conditions.mapValues{CdkObjectWrappers.unwrap(it.value)})
  )

  /**
   * Return the policy fragment that identifies this principal in a Policy.
   */
  public override fun policyFragment(): PrincipalPolicyFragment =
      unwrap(this).getPolicyFragment().let(PrincipalPolicyFragment::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.WebIdentityPrincipal):
        WebIdentityPrincipal = WebIdentityPrincipal(cdkObject)

    internal fun unwrap(wrapped: WebIdentityPrincipal):
        software.amazon.awscdk.services.iam.WebIdentityPrincipal = wrapped.cdkObject as
        software.amazon.awscdk.services.iam.WebIdentityPrincipal
  }
}
