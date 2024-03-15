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

public open class EventBus internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.events.targets.EventBus,
) : CdkObject(cdkObject), IRuleTarget {
  public override fun bind(rule: IRule): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule::unwrap)).let(RuleTargetConfig::wrap)

  public override fun bind(rule: IRule, _id: String): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule::unwrap), _id).let(RuleTargetConfig::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    public fun role(role: IRole)
  }

  private class BuilderImpl(
    eventBus: AmazonAwscdkServicesEventsIEventBus,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.EventBus.Builder =
        software.amazon.awscdk.services.events.targets.EventBus.Builder.create(eventBus)

    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue::unwrap))
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
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
        = wrapped.cdkObject
  }
}
