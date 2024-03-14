package io.cloudshiftdev.awscdk.services.iam

import kotlin.Any
import kotlin.String
import kotlin.collections.Map

public open class FederatedPrincipal internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.FederatedPrincipal,
) : PrincipalBase(cdkObject) {
  /**
   * When this Principal is used in an AssumeRole policy, the action to use.
   */
  public override fun assumeRoleAction(): String = unwrap(this).getAssumeRoleAction()

  /**
   * The conditions under which the policy is in effect.
   *
   * [Documentation](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition.html)
   */
  public open fun conditions(): Map<String, Any> = unwrap(this).getConditions() ?: emptyMap()

  /**
   * Return whether or not this principal is equal to the given principal.
   */
  public override fun dedupeString(): String? = unwrap(this).dedupeString()

  /**
   * federated identity provider (i.e. 'cognito-identity.amazonaws.com' for users authenticated
   * through Cognito).
   */
  public open fun federated(): String = unwrap(this).getFederated()

  /**
   * Return the policy fragment that identifies this principal in a Policy.
   */
  public override fun policyFragment(): PrincipalPolicyFragment =
      unwrap(this).getPolicyFragment().let(PrincipalPolicyFragment::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.FederatedPrincipal):
        FederatedPrincipal = FederatedPrincipal(cdkObject)

    internal fun unwrap(wrapped: FederatedPrincipal):
        software.amazon.awscdk.services.iam.FederatedPrincipal = wrapped.cdkObject
  }
}
