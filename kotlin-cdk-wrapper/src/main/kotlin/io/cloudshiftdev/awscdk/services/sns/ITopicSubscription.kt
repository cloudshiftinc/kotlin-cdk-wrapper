@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * Topic subscription.
 */
public interface ITopicSubscription {
  /**
   * Returns a configuration used to subscribe to an SNS topic.
   *
   * @param topic topic for which subscription will be configured. 
   */
  public fun bind(topic: ITopic): TopicSubscriptionConfig

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.ITopicSubscription):
        ITopicSubscription = CdkObjectWrappers.wrap(cdkObject) as ITopicSubscription

    internal fun unwrap(wrapped: ITopicSubscription):
        software.amazon.awscdk.services.sns.ITopicSubscription = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.sns.ITopicSubscription
  }
}
