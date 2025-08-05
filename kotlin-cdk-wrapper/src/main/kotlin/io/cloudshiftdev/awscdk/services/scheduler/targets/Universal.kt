@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.scheduler.targets

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.scheduler.IScheduleTarget
import io.cloudshiftdev.awscdk.services.scheduler.ScheduleTargetInput
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Use a wider set of AWS API as a target for AWS EventBridge Scheduler.
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
 *
 * [Documentation](https://docs.aws.amazon.com/scheduler/latest/UserGuide/managing-targets-universal.html)
 */
public open class Universal(
  cdkObject: software.amazon.awscdk.services.scheduler.targets.Universal,
) : ScheduleTargetBase(cdkObject),
    IScheduleTarget {
  public constructor(props: UniversalTargetProps) :
      this(software.amazon.awscdk.services.scheduler.targets.Universal(props.let(UniversalTargetProps.Companion::unwrap))
  )

  public constructor(props: UniversalTargetProps.Builder.() -> Unit) :
      this(UniversalTargetProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.scheduler.targets.Universal].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The API action to call. Must be camelCase.
     *
     * You cannot use read-only API actions such as common GET operations.
     *
     * [Documentation](https://docs.aws.amazon.com/scheduler/latest/UserGuide/managing-targets-universal.html#unsupported-api-actions)
     * @param action The API action to call. Must be camelCase. 
     */
    public fun action(action: String)

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
     *
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. 
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    /**
     * Input passed to the target.
     *
     * Default: - no input.
     *
     * @param input Input passed to the target. 
     */
    public fun input(input: ScheduleTargetInput)

    /**
     * The maximum age of a request that Scheduler sends to a target for processing.
     *
     * Minimum value of 60.
     * Maximum value of 86400.
     *
     * Default: Duration.hours(24)
     *
     * @param maxEventAge The maximum age of a request that Scheduler sends to a target for
     * processing. 
     */
    public fun maxEventAge(maxEventAge: Duration)

    /**
     * The IAM policy statements needed to invoke the target. These statements are attached to the
     * Scheduler's role.
     *
     * Note that the default may not be the correct actions as not all AWS services follows the same
     * IAM action pattern, or there may be more actions needed to invoke the target.
     *
     * Default: - Policy with `service:action` action only.
     *
     * @param policyStatements The IAM policy statements needed to invoke the target. These
     * statements are attached to the Scheduler's role. 
     */
    public fun policyStatements(policyStatements: List<PolicyStatement>)

    /**
     * The IAM policy statements needed to invoke the target. These statements are attached to the
     * Scheduler's role.
     *
     * Note that the default may not be the correct actions as not all AWS services follows the same
     * IAM action pattern, or there may be more actions needed to invoke the target.
     *
     * Default: - Policy with `service:action` action only.
     *
     * @param policyStatements The IAM policy statements needed to invoke the target. These
     * statements are attached to the Scheduler's role. 
     */
    public fun policyStatements(vararg policyStatements: PolicyStatement)

    /**
     * The maximum number of times to retry when the target returns an error.
     *
     * Minimum value of 0.
     * Maximum value of 185.
     *
     * Default: 185
     *
     * @param retryAttempts The maximum number of times to retry when the target returns an error. 
     */
    public fun retryAttempts(retryAttempts: Number)

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
     *
     * @param role An execution role is an IAM role that EventBridge Scheduler assumes in order to
     * interact with other AWS services on your behalf. 
     */
    public fun role(role: IRole)

    /**
     * The AWS service to call.
     *
     * This must be in lowercase.
     *
     * @param service The AWS service to call. 
     */
    public fun service(service: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.scheduler.targets.Universal.Builder =
        software.amazon.awscdk.services.scheduler.targets.Universal.Builder.create()

    /**
     * The API action to call. Must be camelCase.
     *
     * You cannot use read-only API actions such as common GET operations.
     *
     * [Documentation](https://docs.aws.amazon.com/scheduler/latest/UserGuide/managing-targets-universal.html#unsupported-api-actions)
     * @param action The API action to call. Must be camelCase. 
     */
    override fun action(action: String) {
      cdkBuilder.action(action)
    }

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
     *
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. 
     */
    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue.Companion::unwrap))
    }

    /**
     * Input passed to the target.
     *
     * Default: - no input.
     *
     * @param input Input passed to the target. 
     */
    override fun input(input: ScheduleTargetInput) {
      cdkBuilder.input(input.let(ScheduleTargetInput.Companion::unwrap))
    }

    /**
     * The maximum age of a request that Scheduler sends to a target for processing.
     *
     * Minimum value of 60.
     * Maximum value of 86400.
     *
     * Default: Duration.hours(24)
     *
     * @param maxEventAge The maximum age of a request that Scheduler sends to a target for
     * processing. 
     */
    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration.Companion::unwrap))
    }

    /**
     * The IAM policy statements needed to invoke the target. These statements are attached to the
     * Scheduler's role.
     *
     * Note that the default may not be the correct actions as not all AWS services follows the same
     * IAM action pattern, or there may be more actions needed to invoke the target.
     *
     * Default: - Policy with `service:action` action only.
     *
     * @param policyStatements The IAM policy statements needed to invoke the target. These
     * statements are attached to the Scheduler's role. 
     */
    override fun policyStatements(policyStatements: List<PolicyStatement>) {
      cdkBuilder.policyStatements(policyStatements.map(PolicyStatement.Companion::unwrap))
    }

    /**
     * The IAM policy statements needed to invoke the target. These statements are attached to the
     * Scheduler's role.
     *
     * Note that the default may not be the correct actions as not all AWS services follows the same
     * IAM action pattern, or there may be more actions needed to invoke the target.
     *
     * Default: - Policy with `service:action` action only.
     *
     * @param policyStatements The IAM policy statements needed to invoke the target. These
     * statements are attached to the Scheduler's role. 
     */
    override fun policyStatements(vararg policyStatements: PolicyStatement): Unit =
        policyStatements(policyStatements.toList())

    /**
     * The maximum number of times to retry when the target returns an error.
     *
     * Minimum value of 0.
     * Maximum value of 185.
     *
     * Default: 185
     *
     * @param retryAttempts The maximum number of times to retry when the target returns an error. 
     */
    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

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
     *
     * @param role An execution role is an IAM role that EventBridge Scheduler assumes in order to
     * interact with other AWS services on your behalf. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * The AWS service to call.
     *
     * This must be in lowercase.
     *
     * @param service The AWS service to call. 
     */
    override fun service(service: String) {
      cdkBuilder.service(service)
    }

    public fun build(): software.amazon.awscdk.services.scheduler.targets.Universal =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Universal {
      val builderImpl = BuilderImpl()
      return Universal(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.targets.Universal):
        Universal = Universal(cdkObject)

    internal fun unwrap(wrapped: Universal):
        software.amazon.awscdk.services.scheduler.targets.Universal = wrapped.cdkObject as
        software.amazon.awscdk.services.scheduler.targets.Universal
  }
}
