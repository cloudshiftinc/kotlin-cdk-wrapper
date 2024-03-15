@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

/**
 * A collection of the fields in a PolicyStatement that can be used to identify a principal.
 *
 * This consists of the JSON used in the "Principal" field, and optionally a
 * set of "Condition"s that need to be applied to the policy.
 *
 * Generally, a principal looks like:
 *
 * ```
 * { '&lt;TYPE&gt;': ['ID', 'ID', ...] }
 * ```
 *
 * And this is also the type of the field `principalJson`.  However, there is a
 * special type of principal that is just the string '*', which is treated
 * differently by some services. To represent that principal, `principalJson`
 * should contain `{ 'LiteralString': ['*'] }`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * Object conditions;
 * PrincipalPolicyFragment principalPolicyFragment = new PrincipalPolicyFragment(Map.of(
 * "principalJsonKey", List.of("principalJson")), Map.of(
 * "conditionsKey", conditions));
 * ```
 */
public open class PrincipalPolicyFragment internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.PrincipalPolicyFragment,
) : CdkObject(cdkObject) {
  public constructor(principalJson: Map<String, List<String>>) :
      this(software.amazon.awscdk.services.iam.PrincipalPolicyFragment(principalJson)
  )

  public constructor(principalJson: Map<String, List<String>>, conditions: Map<String, Any>) :
      this(software.amazon.awscdk.services.iam.PrincipalPolicyFragment(principalJson, conditions)
  )

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
