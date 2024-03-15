@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

public open class Filter internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sns.Filter,
) : FilterOrPolicy(cdkObject) {
  public open fun filterDoc(): SubscriptionFilter =
      unwrap(this).getFilterDoc().let(SubscriptionFilter::wrap)

  public override fun type(): FilterOrPolicyType =
      unwrap(this).getType().let(FilterOrPolicyType::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.Filter): Filter =
        Filter(cdkObject)

    internal fun unwrap(wrapped: Filter): software.amazon.awscdk.services.sns.Filter =
        wrapped.cdkObject
  }
}
