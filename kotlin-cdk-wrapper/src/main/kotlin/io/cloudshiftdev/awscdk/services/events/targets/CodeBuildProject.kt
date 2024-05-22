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

/**
 * Start a CodeBuild build when an Amazon EventBridge rule is triggered.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.sns.*;
 * import io.cloudshiftdev.awscdk.services.events.targets.*;
 * Repository repo;
 * PipelineProject project;
 * Topic myTopic;
 * // starts a CodeBuild project when a commit is pushed to the "main" branch of the repo
 * repo.onCommit("CommitToMain", OnCommitOptions.builder()
 * .target(new CodeBuildProject(project))
 * .branches(List.of("main"))
 * .build());
 * // publishes a message to an Amazon SNS topic when a comment is made on a pull request
 * Rule rule = repo.onCommentOnPullRequest("CommentOnPullRequest", OnEventOptions.builder()
 * .target(new SnsTopic(myTopic))
 * .build());
 * ```
 */
public open class CodeBuildProject(
  cdkObject: software.amazon.awscdk.services.events.targets.CodeBuildProject,
) : CdkObject(cdkObject), IRuleTarget {
  public constructor(project: CloudshiftdevAwscdkServicesCodebuildIProject) :
      this(software.amazon.awscdk.services.events.targets.CodeBuildProject(project.let(CloudshiftdevAwscdkServicesCodebuildIProject.Companion::unwrap))
  )

  public constructor(project: CloudshiftdevAwscdkServicesCodebuildIProject,
      props: CodeBuildProjectProps) :
      this(software.amazon.awscdk.services.events.targets.CodeBuildProject(project.let(CloudshiftdevAwscdkServicesCodebuildIProject.Companion::unwrap),
      props.let(CodeBuildProjectProps.Companion::unwrap))
  )

  public constructor(project: CloudshiftdevAwscdkServicesCodebuildIProject,
      props: CodeBuildProjectProps.Builder.() -> Unit) : this(project, CodeBuildProjectProps(props)
  )

  /**
   * Allows using build projects as event rule targets.
   *
   * @param _rule 
   * @param _id
   */
  public override fun bind(rule: IRule): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule.Companion::unwrap)).let(RuleTargetConfig::wrap)

  /**
   * Allows using build projects as event rule targets.
   *
   * @param _rule 
   * @param _id
   */
  public override fun bind(rule: IRule, id: String): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule.Companion::unwrap), id).let(RuleTargetConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.events.targets.CodeBuildProject].
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
     * The event to send to CodeBuild.
     *
     * This will be the payload for the StartBuild API.
     *
     * Default: - the entire EventBridge event
     *
     * @param event The event to send to CodeBuild. 
     */
    public fun event(event: RuleTargetInput)

    /**
     * The role to assume before invoking the target (i.e., the codebuild) when the given rule is
     * triggered.
     *
     * Default: - a new role will be created
     *
     * @param eventRole The role to assume before invoking the target (i.e., the codebuild) when the
     * given rule is triggered. 
     */
    public fun eventRole(eventRole: IRole)

    /**
     * The maximum age of a request that Lambda sends to a function for processing.
     *
     * Minimum value of 60.
     * Maximum value of 86400.
     *
     * Default: Duration.hours(24)
     *
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing. 
     */
    public fun maxEventAge(maxEventAge: Duration)

    /**
     * The maximum number of times to retry when the function returns an error.
     *
     * Minimum value of 0.
     * Maximum value of 185.
     *
     * Default: 185
     *
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * 
     */
    public fun retryAttempts(retryAttempts: Number)
  }

  private class BuilderImpl(
    project: AmazonAwscdkServicesCodebuildIProject,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.CodeBuildProject.Builder
        = software.amazon.awscdk.services.events.targets.CodeBuildProject.Builder.create(project)

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
     * The event to send to CodeBuild.
     *
     * This will be the payload for the StartBuild API.
     *
     * Default: - the entire EventBridge event
     *
     * @param event The event to send to CodeBuild. 
     */
    override fun event(event: RuleTargetInput) {
      cdkBuilder.event(event.let(RuleTargetInput.Companion::unwrap))
    }

    /**
     * The role to assume before invoking the target (i.e., the codebuild) when the given rule is
     * triggered.
     *
     * Default: - a new role will be created
     *
     * @param eventRole The role to assume before invoking the target (i.e., the codebuild) when the
     * given rule is triggered. 
     */
    override fun eventRole(eventRole: IRole) {
      cdkBuilder.eventRole(eventRole.let(IRole.Companion::unwrap))
    }

    /**
     * The maximum age of a request that Lambda sends to a function for processing.
     *
     * Minimum value of 60.
     * Maximum value of 86400.
     *
     * Default: Duration.hours(24)
     *
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing. 
     */
    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration.Companion::unwrap))
    }

    /**
     * The maximum number of times to retry when the function returns an error.
     *
     * Minimum value of 0.
     * Maximum value of 185.
     *
     * Default: 185
     *
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * 
     */
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
        software.amazon.awscdk.services.events.targets.CodeBuildProject = wrapped.cdkObject as
        software.amazon.awscdk.services.events.targets.CodeBuildProject
  }
}
