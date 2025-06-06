@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.events.RuleTargetInput
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Number
import kotlin.Unit

/**
 * Customize the CodeBuild Event Target.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.codebuild.*;
 * import io.cloudshiftdev.awscdk.services.codecommit.*;
 * Repository repo = Repository.Builder.create(this, "MyRepo")
 * .repositoryName("aws-cdk-codebuild-events")
 * .build();
 * Project project = Project.Builder.create(this, "MyProject")
 * .source(Source.codeCommit(CodeCommitSourceProps.builder().repository(repo).build()))
 * .build();
 * Queue deadLetterQueue = new Queue(this, "DeadLetterQueue");
 * // trigger a build when a commit is pushed to the repo
 * Rule onCommitRule = repo.onCommit("OnCommit", OnCommitOptions.builder()
 * .target(CodeBuildProject.Builder.create(project)
 * .deadLetterQueue(deadLetterQueue)
 * .build())
 * .branches(List.of("master"))
 * .build());
 * ```
 */
public interface CodeBuildProjectProps : TargetBaseProps {
  /**
   * The event to send to CodeBuild.
   *
   * This will be the payload for the StartBuild API.
   *
   * Default: - the entire EventBridge event
   */
  public fun event(): RuleTargetInput? = unwrap(this).getEvent()?.let(RuleTargetInput::wrap)

  /**
   * The role to assume before invoking the target (i.e., the codebuild) when the given rule is
   * triggered.
   *
   * Default: - a new role will be created
   */
  public fun eventRole(): IRole? = unwrap(this).getEventRole()?.let(IRole::wrap)

  /**
   * A builder for [CodeBuildProjectProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. Check out the
     * [considerations for using a dead-letter
     * queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     * The events not successfully delivered are automatically retried for a specified period of
     * time,
     * depending on the retry policy of the target.
     * If an event is not delivered before all retry attempts are exhausted, it will be sent to the
     * dead letter queue.
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    /**
     * @param event The event to send to CodeBuild.
     * This will be the payload for the StartBuild API.
     */
    public fun event(event: RuleTargetInput)

    /**
     * @param eventRole The role to assume before invoking the target (i.e., the codebuild) when the
     * given rule is triggered.
     */
    public fun eventRole(eventRole: IRole)

    /**
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing.
     * Minimum value of 60.
     * Maximum value of 86400.
     */
    public fun maxEventAge(maxEventAge: Duration)

    /**
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * Minimum value of 0.
     * Maximum value of 185.
     */
    public fun retryAttempts(retryAttempts: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.events.targets.CodeBuildProjectProps.Builder =
        software.amazon.awscdk.services.events.targets.CodeBuildProjectProps.builder()

    /**
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. Check out the
     * [considerations for using a dead-letter
     * queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     * The events not successfully delivered are automatically retried for a specified period of
     * time,
     * depending on the retry policy of the target.
     * If an event is not delivered before all retry attempts are exhausted, it will be sent to the
     * dead letter queue.
     */
    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue.Companion::unwrap))
    }

    /**
     * @param event The event to send to CodeBuild.
     * This will be the payload for the StartBuild API.
     */
    override fun event(event: RuleTargetInput) {
      cdkBuilder.event(event.let(RuleTargetInput.Companion::unwrap))
    }

    /**
     * @param eventRole The role to assume before invoking the target (i.e., the codebuild) when the
     * given rule is triggered.
     */
    override fun eventRole(eventRole: IRole) {
      cdkBuilder.eventRole(eventRole.let(IRole.Companion::unwrap))
    }

    /**
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing.
     * Minimum value of 60.
     * Maximum value of 86400.
     */
    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration.Companion::unwrap))
    }

    /**
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * Minimum value of 0.
     * Maximum value of 185.
     */
    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.CodeBuildProjectProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.events.targets.CodeBuildProjectProps,
  ) : CdkObject(cdkObject),
      CodeBuildProjectProps {
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
     */
    override fun deadLetterQueue(): IQueue? = unwrap(this).getDeadLetterQueue()?.let(IQueue::wrap)

    /**
     * The event to send to CodeBuild.
     *
     * This will be the payload for the StartBuild API.
     *
     * Default: - the entire EventBridge event
     */
    override fun event(): RuleTargetInput? = unwrap(this).getEvent()?.let(RuleTargetInput::wrap)

    /**
     * The role to assume before invoking the target (i.e., the codebuild) when the given rule is
     * triggered.
     *
     * Default: - a new role will be created
     */
    override fun eventRole(): IRole? = unwrap(this).getEventRole()?.let(IRole::wrap)

    /**
     * The maximum age of a request that Lambda sends to a function for processing.
     *
     * Minimum value of 60.
     * Maximum value of 86400.
     *
     * Default: Duration.hours(24)
     */
    override fun maxEventAge(): Duration? = unwrap(this).getMaxEventAge()?.let(Duration::wrap)

    /**
     * The maximum number of times to retry when the function returns an error.
     *
     * Minimum value of 0.
     * Maximum value of 185.
     *
     * Default: 185
     */
    override fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CodeBuildProjectProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.CodeBuildProjectProps):
        CodeBuildProjectProps = CdkObjectWrappers.wrap(cdkObject) as? CodeBuildProjectProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CodeBuildProjectProps):
        software.amazon.awscdk.services.events.targets.CodeBuildProjectProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.events.targets.CodeBuildProjectProps
  }
}
