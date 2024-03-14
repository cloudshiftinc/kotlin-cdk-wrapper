package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map

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

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sns.FilterOrPolicy,
  ) : FilterOrPolicy(cdkObject)

  public companion object {
    public fun filter(filter: SubscriptionFilter): Filter =
        software.amazon.awscdk.services.sns.FilterOrPolicy.filter(filter.let(SubscriptionFilter::unwrap)).let(Filter::wrap)

    public fun policy(policy: Map<String, FilterOrPolicy>): Policy =
        software.amazon.awscdk.services.sns.FilterOrPolicy.policy(policy.mapValues{FilterOrPolicy.unwrap(it.value)}).let(Policy::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.FilterOrPolicy): FilterOrPolicy
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FilterOrPolicy): software.amazon.awscdk.services.sns.FilterOrPolicy
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.sns.FilterOrPolicy
  }
}
