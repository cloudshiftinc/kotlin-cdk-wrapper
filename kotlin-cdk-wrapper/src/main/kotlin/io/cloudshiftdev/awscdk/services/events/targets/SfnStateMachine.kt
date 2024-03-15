@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.events.IRule
import io.cloudshiftdev.awscdk.services.events.IRuleTarget
import io.cloudshiftdev.awscdk.services.events.RuleTargetConfig
import io.cloudshiftdev.awscdk.services.events.RuleTargetInput
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.awscdk.services.stepfunctions.IStateMachine as CloudshiftdevAwscdkServicesStepfunctionsIStateMachine
import software.amazon.awscdk.services.stepfunctions.IStateMachine as AmazonAwscdkServicesStepfunctionsIStateMachine

public open class SfnStateMachine internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.events.targets.SfnStateMachine,
) : CdkObject(cdkObject), IRuleTarget {
  public override fun bind(_rule: IRule): RuleTargetConfig =
      unwrap(this).bind(_rule.let(IRule::unwrap)).let(RuleTargetConfig::wrap)

  public override fun bind(_rule: IRule, _id: String): RuleTargetConfig =
      unwrap(this).bind(_rule.let(IRule::unwrap), _id).let(RuleTargetConfig::wrap)

  public open fun machine(): CloudshiftdevAwscdkServicesStepfunctionsIStateMachine =
      unwrap(this).getMachine().let(CloudshiftdevAwscdkServicesStepfunctionsIStateMachine::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    public fun input(input: RuleTargetInput)

    public fun maxEventAge(maxEventAge: Duration)

    public fun retryAttempts(retryAttempts: Number)

    public fun role(role: IRole)
  }

  private class BuilderImpl(
    machine: AmazonAwscdkServicesStepfunctionsIStateMachine,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.SfnStateMachine.Builder =
        software.amazon.awscdk.services.events.targets.SfnStateMachine.Builder.create(machine)

    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue::unwrap))
    }

    override fun input(input: RuleTargetInput) {
      cdkBuilder.input(input.let(RuleTargetInput::unwrap))
    }

    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration::unwrap))
    }

    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.events.targets.SfnStateMachine =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(machine: CloudshiftdevAwscdkServicesStepfunctionsIStateMachine,
        block: Builder.() -> Unit = {}): SfnStateMachine {
      val builderImpl =
          BuilderImpl(CloudshiftdevAwscdkServicesStepfunctionsIStateMachine.unwrap(machine))
      return SfnStateMachine(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.SfnStateMachine):
        SfnStateMachine = SfnStateMachine(cdkObject)

    internal fun unwrap(wrapped: SfnStateMachine):
        software.amazon.awscdk.services.events.targets.SfnStateMachine = wrapped.cdkObject
  }
}
