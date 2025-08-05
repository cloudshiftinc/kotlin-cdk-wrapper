@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.scheduler.targets

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.scheduler.ScheduleTargetInput
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for a Universal Target.
 *
 * Example:
 *
 * ```
 * Schedule.Builder.create(this, "Schedule")
 * .schedule(ScheduleExpression.cron(CronOptionsWithTimezone.builder()
 * .minute("0")
 * .hour("0")
 * .build()))
 * .target(Universal.Builder.create()
 * .service("rds")
 * .action("stopDBCluster")
 * .input(ScheduleTargetInput.fromObject(Map.of(
 * "DbClusterIdentifier", "my-db")))
 * .build())
 * .build();
 * ```
 */
public interface UniversalTargetProps : ScheduleTargetBaseProps {
  /**
   * The API action to call. Must be camelCase.
   *
   * You cannot use read-only API actions such as common GET operations.
   *
   * [Documentation](https://docs.aws.amazon.com/scheduler/latest/UserGuide/managing-targets-universal.html#unsupported-api-actions)
   */
  public fun action(): String

  /**
   * The IAM policy statements needed to invoke the target. These statements are attached to the
   * Scheduler's role.
   *
   * Note that the default may not be the correct actions as not all AWS services follows the same
   * IAM action pattern, or there may be more actions needed to invoke the target.
   *
   * Default: - Policy with `service:action` action only.
   */
  public fun policyStatements(): List<PolicyStatement> =
      unwrap(this).getPolicyStatements()?.map(PolicyStatement::wrap) ?: emptyList()

  /**
   * The AWS service to call.
   *
   * This must be in lowercase.
   */
  public fun service(): String

  /**
   * A builder for [UniversalTargetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param action The API action to call. Must be camelCase. 
     * You cannot use read-only API actions such as common GET operations.
     */
    public fun action(action: String)

    /**
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue.
     * The events not successfully delivered are automatically retried for a specified period of
     * time,
     * depending on the retry policy of the target.
     * If an event is not delivered before all retry attempts are exhausted, it will be sent to the
     * dead letter queue.
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    /**
     * @param input Input passed to the target.
     */
    public fun input(input: ScheduleTargetInput)

    /**
     * @param maxEventAge The maximum age of a request that Scheduler sends to a target for
     * processing.
     * Minimum value of 60.
     * Maximum value of 86400.
     */
    public fun maxEventAge(maxEventAge: Duration)

    /**
     * @param policyStatements The IAM policy statements needed to invoke the target. These
     * statements are attached to the Scheduler's role.
     * Note that the default may not be the correct actions as not all AWS services follows the same
     * IAM action pattern, or there may be more actions needed to invoke the target.
     */
    public fun policyStatements(policyStatements: List<PolicyStatement>)

    /**
     * @param policyStatements The IAM policy statements needed to invoke the target. These
     * statements are attached to the Scheduler's role.
     * Note that the default may not be the correct actions as not all AWS services follows the same
     * IAM action pattern, or there may be more actions needed to invoke the target.
     */
    public fun policyStatements(vararg policyStatements: PolicyStatement)

    /**
     * @param retryAttempts The maximum number of times to retry when the target returns an error.
     * Minimum value of 0.
     * Maximum value of 185.
     */
    public fun retryAttempts(retryAttempts: Number)

    /**
     * @param role An execution role is an IAM role that EventBridge Scheduler assumes in order to
     * interact with other AWS services on your behalf.
     * If none provided templates target will automatically create an IAM role with all the minimum
     * necessary
     * permissions to interact with the templated target. If you wish you may specify your own IAM
     * role, then the templated targets
     * will grant minimal required permissions.
     */
    public fun role(role: IRole)

    /**
     * @param service The AWS service to call. 
     * This must be in lowercase.
     */
    public fun service(service: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.scheduler.targets.UniversalTargetProps.Builder =
        software.amazon.awscdk.services.scheduler.targets.UniversalTargetProps.builder()

    /**
     * @param action The API action to call. Must be camelCase. 
     * You cannot use read-only API actions such as common GET operations.
     */
    override fun action(action: String) {
      cdkBuilder.action(action)
    }

    /**
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue.
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
     * @param input Input passed to the target.
     */
    override fun input(input: ScheduleTargetInput) {
      cdkBuilder.input(input.let(ScheduleTargetInput.Companion::unwrap))
    }

    /**
     * @param maxEventAge The maximum age of a request that Scheduler sends to a target for
     * processing.
     * Minimum value of 60.
     * Maximum value of 86400.
     */
    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration.Companion::unwrap))
    }

    /**
     * @param policyStatements The IAM policy statements needed to invoke the target. These
     * statements are attached to the Scheduler's role.
     * Note that the default may not be the correct actions as not all AWS services follows the same
     * IAM action pattern, or there may be more actions needed to invoke the target.
     */
    override fun policyStatements(policyStatements: List<PolicyStatement>) {
      cdkBuilder.policyStatements(policyStatements.map(PolicyStatement.Companion::unwrap))
    }

    /**
     * @param policyStatements The IAM policy statements needed to invoke the target. These
     * statements are attached to the Scheduler's role.
     * Note that the default may not be the correct actions as not all AWS services follows the same
     * IAM action pattern, or there may be more actions needed to invoke the target.
     */
    override fun policyStatements(vararg policyStatements: PolicyStatement): Unit =
        policyStatements(policyStatements.toList())

    /**
     * @param retryAttempts The maximum number of times to retry when the target returns an error.
     * Minimum value of 0.
     * Maximum value of 185.
     */
    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    /**
     * @param role An execution role is an IAM role that EventBridge Scheduler assumes in order to
     * interact with other AWS services on your behalf.
     * If none provided templates target will automatically create an IAM role with all the minimum
     * necessary
     * permissions to interact with the templated target. If you wish you may specify your own IAM
     * role, then the templated targets
     * will grant minimal required permissions.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * @param service The AWS service to call. 
     * This must be in lowercase.
     */
    override fun service(service: String) {
      cdkBuilder.service(service)
    }

    public fun build(): software.amazon.awscdk.services.scheduler.targets.UniversalTargetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.scheduler.targets.UniversalTargetProps,
  ) : CdkObject(cdkObject),
      UniversalTargetProps {
    /**
     * The API action to call. Must be camelCase.
     *
     * You cannot use read-only API actions such as common GET operations.
     *
     * [Documentation](https://docs.aws.amazon.com/scheduler/latest/UserGuide/managing-targets-universal.html#unsupported-api-actions)
     */
    override fun action(): String = unwrap(this).getAction()

    /**
     * The SQS queue to be used as deadLetterQueue.
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
     * Input passed to the target.
     *
     * Default: - no input.
     */
    override fun input(): ScheduleTargetInput? =
        unwrap(this).getInput()?.let(ScheduleTargetInput::wrap)

    /**
     * The maximum age of a request that Scheduler sends to a target for processing.
     *
     * Minimum value of 60.
     * Maximum value of 86400.
     *
     * Default: Duration.hours(24)
     */
    override fun maxEventAge(): Duration? = unwrap(this).getMaxEventAge()?.let(Duration::wrap)

    /**
     * The IAM policy statements needed to invoke the target. These statements are attached to the
     * Scheduler's role.
     *
     * Note that the default may not be the correct actions as not all AWS services follows the same
     * IAM action pattern, or there may be more actions needed to invoke the target.
     *
     * Default: - Policy with `service:action` action only.
     */
    override fun policyStatements(): List<PolicyStatement> =
        unwrap(this).getPolicyStatements()?.map(PolicyStatement::wrap) ?: emptyList()

    /**
     * The maximum number of times to retry when the target returns an error.
     *
     * Minimum value of 0.
     * Maximum value of 185.
     *
     * Default: 185
     */
    override fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

    /**
     * An execution role is an IAM role that EventBridge Scheduler assumes in order to interact with
     * other AWS services on your behalf.
     *
     * If none provided templates target will automatically create an IAM role with all the minimum
     * necessary
     * permissions to interact with the templated target. If you wish you may specify your own IAM
     * role, then the templated targets
     * will grant minimal required permissions.
     *
     * Default: - created by target
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * The AWS service to call.
     *
     * This must be in lowercase.
     */
    override fun service(): String = unwrap(this).getService()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UniversalTargetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.targets.UniversalTargetProps):
        UniversalTargetProps = CdkObjectWrappers.wrap(cdkObject) as? UniversalTargetProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: UniversalTargetProps):
        software.amazon.awscdk.services.scheduler.targets.UniversalTargetProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.scheduler.targets.UniversalTargetProps
  }
}
