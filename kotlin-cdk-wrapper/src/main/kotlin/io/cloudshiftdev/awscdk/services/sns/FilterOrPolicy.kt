@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map

/**
 * Class for building the FilterPolicy by avoiding union types.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * Function fn;
 * Topic myTopic = new Topic(this, "MyTopic");
 * // Lambda should receive only message matching the following conditions on message body:
 * // color: 'red' or 'orange'
 * myTopic.addSubscription(LambdaSubscription.Builder.create(fn)
 * .filterPolicyWithMessageBody(Map.of(
 * "background", FilterOrPolicy.policy(Map.of(
 * "color", FilterOrPolicy.filter(SubscriptionFilter.stringFilter(StringConditions.builder()
 * .allowlist(List.of("red", "orange"))
 * .build()))))))
 * .build());
 * ```
 */
public abstract class FilterOrPolicy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sns.FilterOrPolicy,
) : CdkObject(cdkObject) {
  /**
   * Check if instance is `Filter` type.
   */
  public open fun isFilter(): Boolean = unwrap(this).isFilter()

  /**
   * Check if instance is `Policy` type.
   */
  public open fun isPolicy(): Boolean = unwrap(this).isPolicy()

  /**
   * Type switch for disambiguating between subclasses.
   */
  public open fun type(): FilterOrPolicyType = unwrap(this).getType().let(FilterOrPolicyType::wrap)

  public companion object {
    public fun filter(filter: SubscriptionFilter): Filter =
        software.amazon.awscdk.services.sns.FilterOrPolicy.filter(filter.let(SubscriptionFilter::unwrap)).let(Filter::wrap)

    public fun policy(policy: Map<String, FilterOrPolicy>): Policy =
        software.amazon.awscdk.services.sns.FilterOrPolicy.policy(policy.mapValues{FilterOrPolicy.unwrap(it.value)}).let(Policy::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.FilterOrPolicy): FilterOrPolicy
        = CdkObjectWrappers.wrap(cdkObject) as FilterOrPolicy

    internal fun unwrap(wrapped: FilterOrPolicy): software.amazon.awscdk.services.sns.FilterOrPolicy
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.sns.FilterOrPolicy
  }
}
