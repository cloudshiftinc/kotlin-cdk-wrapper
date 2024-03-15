@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

import kotlin.String
import kotlin.collections.Map

/**
 * Policy Implementation of FilterOrPolicy.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sns.*;
 * FilterOrPolicy filterOrPolicy;
 * Policy policy = new Policy(Map.of(
 * "policyDocKey", filterOrPolicy));
 * ```
 */
public open class Policy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sns.Policy,
) : FilterOrPolicy(cdkObject) {
  public constructor(policyDoc: Map<String, FilterOrPolicy>) :
      this(software.amazon.awscdk.services.sns.Policy(policyDoc.mapValues{FilterOrPolicy.unwrap(it.value)})
  )

  /**
   * policy argument to construct.
   */
  public open fun policyDoc(): Map<String, FilterOrPolicy> =
      unwrap(this).getPolicyDoc().mapValues{FilterOrPolicy.wrap(it.value)}

  /**
   * Type used in DFS buildFilterPolicyWithMessageBody to determine json value type.
   */
  public override fun type(): FilterOrPolicyType =
      unwrap(this).getType().let(FilterOrPolicyType::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.Policy): Policy =
        Policy(cdkObject)

    internal fun unwrap(wrapped: Policy): software.amazon.awscdk.services.sns.Policy =
        wrapped.cdkObject
  }
}
