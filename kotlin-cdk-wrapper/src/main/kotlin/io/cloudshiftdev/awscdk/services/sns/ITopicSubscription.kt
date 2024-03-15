@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.common.CdkObject

public interface ITopicSubscription {
  public fun bind(arg0: ITopic): TopicSubscriptionConfig

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sns.ITopicSubscription,
  ) : CdkObject(cdkObject), ITopicSubscription {
    override fun bind(arg0: ITopic): TopicSubscriptionConfig =
        unwrap(this).bind(arg0.let(ITopic::unwrap)).let(TopicSubscriptionConfig::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.ITopicSubscription):
        ITopicSubscription = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ITopicSubscription):
        software.amazon.awscdk.services.sns.ITopicSubscription = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.sns.ITopicSubscription
  }
}
