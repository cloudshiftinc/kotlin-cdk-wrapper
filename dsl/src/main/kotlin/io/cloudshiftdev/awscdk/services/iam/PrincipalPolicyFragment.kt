package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

public open class PrincipalPolicyFragment internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.PrincipalPolicyFragment,
) : CdkObject(cdkObject) {
  /**
   * The conditions under which the policy is in effect.
   *
   * See [the IAM
   * documentation](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition.html).
   * conditions that need to be applied to this policy
   */
  public open fun conditions(): Map<String, Any> = unwrap(this).getConditions() ?: emptyMap()

  /**
   * JSON of the "Principal" section in a policy statement.
   */
  public open fun principalJson(): Map<String, List<String>> = unwrap(this).getPrincipalJson() ?:
      emptyMap()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.PrincipalPolicyFragment):
        PrincipalPolicyFragment = PrincipalPolicyFragment(cdkObject)

    internal fun unwrap(wrapped: PrincipalPolicyFragment):
        software.amazon.awscdk.services.iam.PrincipalPolicyFragment = wrapped.cdkObject
  }
}
