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
import kotlin.String
import kotlin.Unit

/**
 * Customize the AppSync GraphQL API target.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * GraphqlApi api = GraphqlApi.Builder.create(this, "api")
 * .name("api")
 * .definition(Definition.fromFile("schema.graphql"))
 * .authorizationConfig(AuthorizationConfig.builder()
 * .defaultAuthorization(AuthorizationMode.builder().authorizationType(AuthorizationType.IAM).build())
 * .build())
 * .build();
 * Rule rule = Rule.Builder.create(this, "Rule")
 * .schedule(Schedule.rate(Duration.hours(1)))
 * .build();
 * rule.addTarget(AppSync.Builder.create(api)
 * .graphQLOperation("mutation Publish($message: String!){ publish(message: $message) { message }
 * }")
 * .variables(RuleTargetInput.fromObject(Map.of(
 * "message", "hello world")))
 * .build());
 * ```
 */
public interface AppSyncGraphQLApiProps : TargetBaseProps {
  /**
   * The role to assume before invoking the target (i.e., the pipeline) when the given rule is
   * triggered.
   *
   * Default: - a new role with permissions to access mutations will be created
   */
  public fun eventRole(): IRole? = unwrap(this).getEventRole()?.let(IRole::wrap)

  /**
   * The GraphQL operation;
   *
   * that is, the query, mutation, or subscription
   * to be parsed and executed by the GraphQL service.
   */
  public fun graphQLOperation(): String

  /**
   * The variables that are include in the GraphQL operation.
   *
   * Default: - The entire event is used
   */
  public fun variables(): RuleTargetInput? = unwrap(this).getVariables()?.let(RuleTargetInput::wrap)

  /**
   * A builder for [AppSyncGraphQLApiProps]
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
     * @param eventRole The role to assume before invoking the target (i.e., the pipeline) when the
     * given rule is triggered.
     */
    public fun eventRole(eventRole: IRole)

    /**
     * @param graphQlOperation The GraphQL operation;. 
     * that is, the query, mutation, or subscription
     * to be parsed and executed by the GraphQL service.
     */
    public fun graphQlOperation(graphQlOperation: String)

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

    /**
     * @param variables The variables that are include in the GraphQL operation.
     */
    public fun variables(variables: RuleTargetInput)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.events.targets.AppSyncGraphQLApiProps.Builder =
        software.amazon.awscdk.services.events.targets.AppSyncGraphQLApiProps.builder()

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
     * @param eventRole The role to assume before invoking the target (i.e., the pipeline) when the
     * given rule is triggered.
     */
    override fun eventRole(eventRole: IRole) {
      cdkBuilder.eventRole(eventRole.let(IRole.Companion::unwrap))
    }

    /**
     * @param graphQlOperation The GraphQL operation;. 
     * that is, the query, mutation, or subscription
     * to be parsed and executed by the GraphQL service.
     */
    override fun graphQlOperation(graphQlOperation: String) {
      cdkBuilder.graphQlOperation(graphQlOperation)
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

    /**
     * @param variables The variables that are include in the GraphQL operation.
     */
    override fun variables(variables: RuleTargetInput) {
      cdkBuilder.variables(variables.let(RuleTargetInput.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.events.targets.AppSyncGraphQLApiProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.events.targets.AppSyncGraphQLApiProps,
  ) : CdkObject(cdkObject),
      AppSyncGraphQLApiProps {
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
     * The role to assume before invoking the target (i.e., the pipeline) when the given rule is
     * triggered.
     *
     * Default: - a new role with permissions to access mutations will be created
     */
    override fun eventRole(): IRole? = unwrap(this).getEventRole()?.let(IRole::wrap)

    /**
     * The GraphQL operation;
     *
     * that is, the query, mutation, or subscription
     * to be parsed and executed by the GraphQL service.
     */
    override fun graphQLOperation(): String = unwrap(this).getGraphQLOperation()

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

    /**
     * The variables that are include in the GraphQL operation.
     *
     * Default: - The entire event is used
     */
    override fun variables(): RuleTargetInput? =
        unwrap(this).getVariables()?.let(RuleTargetInput::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AppSyncGraphQLApiProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.AppSyncGraphQLApiProps):
        AppSyncGraphQLApiProps = CdkObjectWrappers.wrap(cdkObject) as? AppSyncGraphQLApiProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AppSyncGraphQLApiProps):
        software.amazon.awscdk.services.events.targets.AppSyncGraphQLApiProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.events.targets.AppSyncGraphQLApiProps
  }
}
