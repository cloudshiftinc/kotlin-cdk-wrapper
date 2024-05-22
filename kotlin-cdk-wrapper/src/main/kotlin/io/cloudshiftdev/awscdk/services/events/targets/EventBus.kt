@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.events.IRule
import io.cloudshiftdev.awscdk.services.events.IRuleTarget
import io.cloudshiftdev.awscdk.services.events.RuleTargetConfig
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.awscdk.services.events.IEventBus as CloudshiftdevAwscdkServicesEventsIEventBus
import software.amazon.awscdk.services.events.IEventBus as AmazonAwscdkServicesEventsIEventBus

/**
 * Notify an existing Event Bus of an event.
 *
 * Example:
 *
 * ```
 * Rule rule = Rule.Builder.create(this, "Rule")
 * .schedule(Schedule.expression("rate(1 minute)"))
 * .build();
 * rule.addTarget(new EventBus(EventBus.fromEventBusArn(this, "External",
 * "arn:aws:events:eu-west-1:999999999999:event-bus/test-bus")));
 * ```
 */
public open class EventBus(
  cdkObject: software.amazon.awscdk.services.events.targets.EventBus,
) : CdkObject(cdkObject), IRuleTarget {
  public constructor(eventBus: CloudshiftdevAwscdkServicesEventsIEventBus) :
      this(software.amazon.awscdk.services.events.targets.EventBus(eventBus.let(CloudshiftdevAwscdkServicesEventsIEventBus.Companion::unwrap))
  )

  public constructor(eventBus: CloudshiftdevAwscdkServicesEventsIEventBus, props: EventBusProps) :
      this(software.amazon.awscdk.services.events.targets.EventBus(eventBus.let(CloudshiftdevAwscdkServicesEventsIEventBus.Companion::unwrap),
      props.let(EventBusProps.Companion::unwrap))
  )

  public constructor(eventBus: CloudshiftdevAwscdkServicesEventsIEventBus,
      props: EventBusProps.Builder.() -> Unit) : this(eventBus, EventBusProps(props)
  )

  /**
   * Returns the rule target specification.
   *
   * NOTE: Do not use the various `inputXxx` options. They can be set in a call to `addTarget`.
   *
   * @param rule 
   * @param _id
   */
  public override fun bind(rule: IRule): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule.Companion::unwrap)).let(RuleTargetConfig::wrap)

  /**
   * Returns the rule target specification.
   *
   * NOTE: Do not use the various `inputXxx` options. They can be set in a call to `addTarget`.
   *
   * @param rule 
   * @param _id
   */
  public override fun bind(rule: IRule, id: String): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule.Companion::unwrap), id).let(RuleTargetConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.events.targets.EventBus].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The SQS queue to be used as deadLetterQueue. Check out the [considerations for using a
     * dead-letter
     * queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     *
     * The events not successfully delivered are automatically retried for a specified period of
     * time,
     * depending on the retry policy of the target.
     * If an event is not delivered before all retry attempts are exhausted, it will be sent to the
     * dead letter queue.
     *
     * Default: - no dead-letter queue
     *
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. Check out the
     * [considerations for using a dead-letter
     * queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     * 
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    /**
     * Role to be used to publish the event.
     *
     * Default: a new role is created.
     *
     * @param role Role to be used to publish the event. 
     */
    public fun role(role: IRole)
  }

  private class BuilderImpl(
    eventBus: AmazonAwscdkServicesEventsIEventBus,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.EventBus.Builder =
        software.amazon.awscdk.services.events.targets.EventBus.Builder.create(eventBus)

    /**
     * The SQS queue to be used as deadLetterQueue. Check out the [considerations for using a
     * dead-letter
     * queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     *
     * The events not successfully delivered are automatically retried for a specified period of
     * time,
     * depending on the retry policy of the target.
     * If an event is not delivered before all retry attempts are exhausted, it will be sent to the
     * dead letter queue.
     *
     * Default: - no dead-letter queue
     *
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. Check out the
     * [considerations for using a dead-letter
     * queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     * 
     */
    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue.Companion::unwrap))
    }

    /**
     * Role to be used to publish the event.
     *
     * Default: a new role is created.
     *
     * @param role Role to be used to publish the event. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.events.targets.EventBus = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(eventBus: CloudshiftdevAwscdkServicesEventsIEventBus,
        block: Builder.() -> Unit = {}): EventBus {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesEventsIEventBus.unwrap(eventBus))
      return EventBus(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.EventBus): EventBus
        = EventBus(cdkObject)

    internal fun unwrap(wrapped: EventBus): software.amazon.awscdk.services.events.targets.EventBus
        = wrapped.cdkObject as software.amazon.awscdk.services.events.targets.EventBus
  }
}
