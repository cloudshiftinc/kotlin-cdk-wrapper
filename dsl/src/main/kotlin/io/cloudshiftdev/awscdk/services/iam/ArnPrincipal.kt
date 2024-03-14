package io.cloudshiftdev.awscdk.services.iam

import kotlin.String

public open class ArnPrincipal internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.ArnPrincipal,
) : PrincipalBase(cdkObject) {
  /**
   * Amazon Resource Name (ARN) of the principal entity (i.e.
   * arn:aws:iam::123456789012:user/user-name).
   */
  public open fun arn(): String = unwrap(this).getArn()

  /**
   * Return whether or not this principal is equal to the given principal.
   */
  public override fun dedupeString(): String? = unwrap(this).dedupeString()

  /**
   * A convenience method for adding a condition that the principal is part of the specified AWS
   * Organization.
   *
   * @param organizationId 
   */
  public open fun inOrganization(organizationId: String): PrincipalBase =
      unwrap(this).inOrganization(organizationId).let(PrincipalBase::wrap)

  /**
   * Return the policy fragment that identifies this principal in a Policy.
   */
  public override fun policyFragment(): PrincipalPolicyFragment =
      unwrap(this).getPolicyFragment().let(PrincipalPolicyFragment::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.ArnPrincipal): ArnPrincipal =
        ArnPrincipal(cdkObject)

    internal fun unwrap(wrapped: ArnPrincipal): software.amazon.awscdk.services.iam.ArnPrincipal =
        wrapped.cdkObject
  }
}
