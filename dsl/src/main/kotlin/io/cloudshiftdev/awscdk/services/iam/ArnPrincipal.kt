package io.cloudshiftdev.awscdk.services.iam

import kotlin.String

public open class ArnPrincipal internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iam.ArnPrincipal,
) : PrincipalBase(cdkObject) {
  public open fun arn(): String = unwrap(this).getArn()

  public override fun dedupeString(): String? = unwrap(this).dedupeString()

  public open fun inOrganization(organizationId: String): PrincipalBase =
      unwrap(this).inOrganization(organizationId).let(PrincipalBase::wrap)

  public override fun policyFragment(): PrincipalPolicyFragment =
      unwrap(this).getPolicyFragment().let(PrincipalPolicyFragment::wrap)

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.ArnPrincipal): ArnPrincipal =
        ArnPrincipal(cdkObject)

    internal fun unwrap(wrapped: ArnPrincipal): software.amazon.awscdk.services.iam.ArnPrincipal =
        wrapped.cdkObject
  }
}
