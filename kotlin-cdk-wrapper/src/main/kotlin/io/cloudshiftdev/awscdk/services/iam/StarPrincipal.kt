@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import kotlin.String

public open class StarPrincipal internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.StarPrincipal,
) : PrincipalBase(cdkObject) {
  public override fun dedupeString(): String? = unwrap(this).dedupeString()

  public override fun policyFragment(): PrincipalPolicyFragment =
      unwrap(this).getPolicyFragment().let(PrincipalPolicyFragment::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.StarPrincipal): StarPrincipal =
        StarPrincipal(cdkObject)

    internal fun unwrap(wrapped: StarPrincipal): software.amazon.awscdk.services.iam.StarPrincipal =
        wrapped.cdkObject
  }
}
