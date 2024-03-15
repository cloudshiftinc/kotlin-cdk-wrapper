@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import kotlin.Any
import kotlin.String
import kotlin.collections.Map

public open class FederatedPrincipal internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.FederatedPrincipal,
) : PrincipalBase(cdkObject) {
  public override fun assumeRoleAction(): String = unwrap(this).getAssumeRoleAction()

  public open fun conditions(): Map<String, Any> = unwrap(this).getConditions() ?: emptyMap()

  public override fun dedupeString(): String? = unwrap(this).dedupeString()

  public open fun federated(): String = unwrap(this).getFederated()

  public override fun policyFragment(): PrincipalPolicyFragment =
      unwrap(this).getPolicyFragment().let(PrincipalPolicyFragment::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.FederatedPrincipal):
        FederatedPrincipal = FederatedPrincipal(cdkObject)

    internal fun unwrap(wrapped: FederatedPrincipal):
        software.amazon.awscdk.services.iam.FederatedPrincipal = wrapped.cdkObject
  }
}
