@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import kotlin.String

public open class CanonicalUserPrincipal internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.CanonicalUserPrincipal,
) : PrincipalBase(cdkObject) {
  public open fun canonicalUserId(): String = unwrap(this).getCanonicalUserId()

  public override fun dedupeString(): String? = unwrap(this).dedupeString()

  public override fun policyFragment(): PrincipalPolicyFragment =
      unwrap(this).getPolicyFragment().let(PrincipalPolicyFragment::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CanonicalUserPrincipal):
        CanonicalUserPrincipal = CanonicalUserPrincipal(cdkObject)

    internal fun unwrap(wrapped: CanonicalUserPrincipal):
        software.amazon.awscdk.services.iam.CanonicalUserPrincipal = wrapped.cdkObject
  }
}
