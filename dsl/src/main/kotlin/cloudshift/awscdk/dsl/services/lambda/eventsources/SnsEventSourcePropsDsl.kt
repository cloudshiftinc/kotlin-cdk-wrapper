@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda.eventsources

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.lambda.eventsources.SnsEventSourceProps
import software.amazon.awscdk.services.sns.FilterOrPolicy
import software.amazon.awscdk.services.sns.SubscriptionFilter
import software.amazon.awscdk.services.sqs.IQueue

/**
 * Properties forwarded to the Lambda Subscription.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.services.sns.*;
 * import software.amazon.awscdk.services.lambda.eventsources.SnsEventSource;
 * Topic topic;
 * Function fn;
 * Queue deadLetterQueue = new Queue(this, "deadLetterQueue");
 * fn.addEventSource(SnsEventSource.Builder.create(topic)
 * .filterPolicy(Map.of())
 * .deadLetterQueue(deadLetterQueue)
 * .build());
 * ```
 */
@CdkDslMarker
public class SnsEventSourcePropsDsl {
  private val cdkBuilder: SnsEventSourceProps.Builder = SnsEventSourceProps.builder()

  /**
   * @param deadLetterQueue Queue to be used as dead letter queue.
   * If not passed no dead letter queue is enabled.
   */
  public fun deadLetterQueue(deadLetterQueue: IQueue) {
    cdkBuilder.deadLetterQueue(deadLetterQueue)
  }

  /**
   * @param filterPolicy The filter policy.
   */
  public fun filterPolicy(filterPolicy: Map<String, SubscriptionFilter>) {
    cdkBuilder.filterPolicy(filterPolicy)
  }

  /**
   * @param filterPolicyWithMessageBody The filter policy that is applied on the message body.
   * To apply a filter policy to the message attributes, use `filterPolicy`. A maximum of one of
   * `filterPolicyWithMessageBody` and `filterPolicy` may be used.
   */
  public fun filterPolicyWithMessageBody(filterPolicyWithMessageBody: Map<String, FilterOrPolicy>) {
    cdkBuilder.filterPolicyWithMessageBody(filterPolicyWithMessageBody)
  }

  public fun build(): SnsEventSourceProps = cdkBuilder.build()
}
