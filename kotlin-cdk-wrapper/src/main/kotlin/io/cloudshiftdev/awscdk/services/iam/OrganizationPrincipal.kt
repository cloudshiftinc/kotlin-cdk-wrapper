@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import kotlin.String

public open class OrganizationPrincipal internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.OrganizationPrincipal,
) : PrincipalBase(cdkObject) {
  public override fun dedupeString(): String? = unwrap(this).dedupeString()

  public open fun organizationId(): String = unwrap(this).getOrganizationId()

  public override fun policyFragment(): PrincipalPolicyFragment =
      unwrap(this).getPolicyFragment().let(PrincipalPolicyFragment::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.OrganizationPrincipal):
        OrganizationPrincipal = OrganizationPrincipal(cdkObject)

    internal fun unwrap(wrapped: OrganizationPrincipal):
        software.amazon.awscdk.services.iam.OrganizationPrincipal = wrapped.cdkObject
  }
}
