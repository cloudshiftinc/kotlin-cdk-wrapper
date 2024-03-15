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
import io.cloudshiftdev.awscdk.services.codebuild.IProject as CloudshiftdevAwscdkServicesCodebuildIProject
import software.amazon.awscdk.services.codebuild.IProject as AmazonAwscdkServicesCodebuildIProject

public open class CodeBuildProject internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.events.targets.CodeBuildProject,
) : CdkObject(cdkObject), IRuleTarget {
  public override fun bind(_rule: IRule): RuleTargetConfig =
      unwrap(this).bind(_rule.let(IRule::unwrap)).let(RuleTargetConfig::wrap)

  public override fun bind(_rule: IRule, _id: String): RuleTargetConfig =
      unwrap(this).bind(_rule.let(IRule::unwrap), _id).let(RuleTargetConfig::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    public fun event(event: RuleTargetInput)

    public fun eventRole(eventRole: IRole)

    public fun maxEventAge(maxEventAge: Duration)

    public fun retryAttempts(retryAttempts: Number)
  }

  private class BuilderImpl(
    project: AmazonAwscdkServicesCodebuildIProject,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.CodeBuildProject.Builder
        = software.amazon.awscdk.services.events.targets.CodeBuildProject.Builder.create(project)

    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue::unwrap))
    }

    override fun event(event: RuleTargetInput) {
      cdkBuilder.event(event.let(RuleTargetInput::unwrap))
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

    public fun build(): software.amazon.awscdk.services.events.targets.CodeBuildProject =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(project: CloudshiftdevAwscdkServicesCodebuildIProject,
        block: Builder.() -> Unit = {}): CodeBuildProject {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesCodebuildIProject.unwrap(project))
      return CodeBuildProject(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.CodeBuildProject):
        CodeBuildProject = CodeBuildProject(cdkObject)

    internal fun unwrap(wrapped: CodeBuildProject):
        software.amazon.awscdk.services.events.targets.CodeBuildProject = wrapped.cdkObject
  }
}
