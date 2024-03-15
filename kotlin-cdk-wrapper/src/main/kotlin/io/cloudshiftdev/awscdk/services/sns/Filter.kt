@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

/**
 * Filter implementation of FilterOrPolicy.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sns.*;
 * SubscriptionFilter subscriptionFilter;
 * Filter filter = new Filter(subscriptionFilter);
 * ```
 */
public open class Filter internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sns.Filter,
) : FilterOrPolicy(cdkObject) {
  public constructor(filterDoc: SubscriptionFilter) :
      this(software.amazon.awscdk.services.sns.Filter(filterDoc.let(SubscriptionFilter::unwrap))
  )

  /**
   * filter argument to construct.
   */
  public open fun filterDoc(): SubscriptionFilter =
      unwrap(this).getFilterDoc().let(SubscriptionFilter::wrap)

  /**
   * Type used in DFS buildFilterPolicyWithMessageBody to determine json value type.
   */
  public override fun type(): FilterOrPolicyType =
      unwrap(this).getType().let(FilterOrPolicyType::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.Filter): Filter =
        Filter(cdkObject)

    internal fun unwrap(wrapped: Filter): software.amazon.awscdk.services.sns.Filter =
        wrapped.cdkObject
  }
}
