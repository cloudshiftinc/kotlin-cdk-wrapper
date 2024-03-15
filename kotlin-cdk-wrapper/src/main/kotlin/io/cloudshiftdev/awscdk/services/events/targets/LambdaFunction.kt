@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.events.IRule
import io.cloudshiftdev.awscdk.services.events.IRuleTarget
import io.cloudshiftdev.awscdk.services.events.RuleTargetConfig
import io.cloudshiftdev.awscdk.services.events.RuleTargetInput
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.awscdk.services.lambda.IFunction as CloudshiftdevAwscdkServicesLambdaIFunction
import software.amazon.awscdk.services.lambda.IFunction as AmazonAwscdkServicesLambdaIFunction

public open class LambdaFunction internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.events.targets.LambdaFunction,
) : CdkObject(cdkObject), IRuleTarget {
  public override fun bind(rule: IRule): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule::unwrap)).let(RuleTargetConfig::wrap)

  public override fun bind(rule: IRule, _id: String): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule::unwrap), _id).let(RuleTargetConfig::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    public fun event(event: RuleTargetInput)

    public fun maxEventAge(maxEventAge: Duration)

    public fun retryAttempts(retryAttempts: Number)
  }

  private class BuilderImpl(
    handler: AmazonAwscdkServicesLambdaIFunction,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.LambdaFunction.Builder =
        software.amazon.awscdk.services.events.targets.LambdaFunction.Builder.create(handler)

    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue::unwrap))
    }

    override fun event(event: RuleTargetInput) {
      cdkBuilder.event(event.let(RuleTargetInput::unwrap))
    }

    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration::unwrap))
    }

    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.LambdaFunction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(handler: CloudshiftdevAwscdkServicesLambdaIFunction,
        block: Builder.() -> Unit = {}): LambdaFunction {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesLambdaIFunction.unwrap(handler))
      return LambdaFunction(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.LambdaFunction):
        LambdaFunction = LambdaFunction(cdkObject)

    internal fun unwrap(wrapped: LambdaFunction):
        software.amazon.awscdk.services.events.targets.LambdaFunction = wrapped.cdkObject
  }
}
