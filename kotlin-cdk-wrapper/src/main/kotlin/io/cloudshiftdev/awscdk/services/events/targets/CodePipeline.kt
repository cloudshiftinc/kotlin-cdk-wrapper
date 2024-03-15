@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.events.IRule
import io.cloudshiftdev.awscdk.services.events.IRuleTarget
import io.cloudshiftdev.awscdk.services.events.RuleTargetConfig
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.awscdk.services.codepipeline.IPipeline as CloudshiftdevAwscdkServicesCodepipelineIPipeline
import software.amazon.awscdk.services.codepipeline.IPipeline as AmazonAwscdkServicesCodepipelineIPipeline

public open class CodePipeline internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.events.targets.CodePipeline,
) : CdkObject(cdkObject), IRuleTarget {
  public override fun bind(_rule: IRule): RuleTargetConfig =
      unwrap(this).bind(_rule.let(IRule::unwrap)).let(RuleTargetConfig::wrap)

  public override fun bind(_rule: IRule, _id: String): RuleTargetConfig =
      unwrap(this).bind(_rule.let(IRule::unwrap), _id).let(RuleTargetConfig::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    public fun eventRole(eventRole: IRole)

    public fun maxEventAge(maxEventAge: Duration)

    public fun retryAttempts(retryAttempts: Number)
  }

  private class BuilderImpl(
    pipeline: AmazonAwscdkServicesCodepipelineIPipeline,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.CodePipeline.Builder =
        software.amazon.awscdk.services.events.targets.CodePipeline.Builder.create(pipeline)

    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue::unwrap))
    }

    override fun eventRole(eventRole: IRole) {
      cdkBuilder.eventRole(eventRole.let(IRole::unwrap))
    }

    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration::unwrap))
    }

    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.CodePipeline =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(pipeline: CloudshiftdevAwscdkServicesCodepipelineIPipeline,
        block: Builder.() -> Unit = {}): CodePipeline {
      val builderImpl =
          BuilderImpl(CloudshiftdevAwscdkServicesCodepipelineIPipeline.unwrap(pipeline))
      return CodePipeline(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.CodePipeline):
        CodePipeline = CodePipeline(cdkObject)

    internal fun unwrap(wrapped: CodePipeline):
        software.amazon.awscdk.services.events.targets.CodePipeline = wrapped.cdkObject
  }
}
