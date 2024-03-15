@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import kotlin.Any
import kotlin.String
import kotlin.collections.Map

/**
 * Principal entity that represents a federated identity provider such as Amazon Cognito, that can
 * be used to provide temporary security credentials to users who have been authenticated.
 *
 * Additional condition keys are available when the temporary security credentials are used to make
 * a request.
 * You can use these keys to write policies that limit the access of federated users.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * Object conditions;
 * FederatedPrincipal federatedPrincipal = new FederatedPrincipal("federated", Map.of(
 * "conditionsKey", conditions), "assumeRoleAction");
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_iam-condition-keys.html#condition-keys-wif)
 */
public open class FederatedPrincipal internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.FederatedPrincipal,
) : PrincipalBase(cdkObject) {
  public constructor(federated: String) :
      this(software.amazon.awscdk.services.iam.FederatedPrincipal(federated)
  )

  public constructor(federated: String, conditions: Map<String, Any>) :
      this(software.amazon.awscdk.services.iam.FederatedPrincipal(federated, conditions)
  )

  public constructor(
    federated: String,
    conditions: Map<String, Any>,
    assumeRoleAction: String,
  ) : this(software.amazon.awscdk.services.iam.FederatedPrincipal(federated, conditions,
      assumeRoleAction)
  )

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
