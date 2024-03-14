package io.cloudshiftdev.awscdk.services.sns

import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map

public abstract class FilterOrPolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.sns.FilterOrPolicy,
) {
  public open fun isFilter(): Boolean = unwrap(this).isFilter()

  public open fun isPolicy(): Boolean = unwrap(this).isPolicy()

  public open fun type(): FilterOrPolicyType = unwrap(this).getType().let(FilterOrPolicyType::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.sns.FilterOrPolicy,
  ) : FilterOrPolicy(cdkObject)

  public companion object {
    public open fun filter(filter: SubscriptionFilter): Filter =
        software.amazon.awscdk.services.sns.FilterOrPolicy.filter(filter.let(SubscriptionFilter::unwrap)).let(Filter::wrap)

    public open fun policy(policy: Map<String, FilterOrPolicy>): Policy =
        software.amazon.awscdk.services.sns.FilterOrPolicy.policy(policy.mapValues{FilterOrPolicy.unwrap(it.value)}).let(Policy::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.FilterOrPolicy): FilterOrPolicy
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FilterOrPolicy): software.amazon.awscdk.services.sns.FilterOrPolicy
        = (wrapped as Wrapper).cdkObject
  }
}
