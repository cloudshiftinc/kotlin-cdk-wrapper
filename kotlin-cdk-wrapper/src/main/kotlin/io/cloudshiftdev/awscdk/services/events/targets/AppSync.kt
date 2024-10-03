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
import io.cloudshiftdev.awscdk.services.appsync.IGraphqlApi as CloudshiftdevAwscdkServicesAppsyncIGraphqlApi
import software.amazon.awscdk.services.appsync.IGraphqlApi as AmazonAwscdkServicesAppsyncIGraphqlApi

/**
 * Use an AppSync GraphQL API as a target for Amazon EventBridge rules.
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
public open class AppSync(
  cdkObject: software.amazon.awscdk.services.events.targets.AppSync,
) : CdkObject(cdkObject),
    IRuleTarget {
  public constructor(appsyncApi: CloudshiftdevAwscdkServicesAppsyncIGraphqlApi,
      props: AppSyncGraphQLApiProps) :
      this(software.amazon.awscdk.services.events.targets.AppSync(appsyncApi.let(CloudshiftdevAwscdkServicesAppsyncIGraphqlApi.Companion::unwrap),
      props.let(AppSyncGraphQLApiProps.Companion::unwrap))
  )

  public constructor(appsyncApi: CloudshiftdevAwscdkServicesAppsyncIGraphqlApi,
      props: AppSyncGraphQLApiProps.Builder.() -> Unit) : this(appsyncApi,
      AppSyncGraphQLApiProps(props)
  )

  /**
   * Returns a RuleTarget that can be used to trigger this AppSync GraphQL API as a result from an
   * EventBridge event.
   *
   * @param rule 
   * @param _id
   */
  public override fun bind(rule: IRule): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule.Companion::unwrap)).let(RuleTargetConfig::wrap)

  /**
   * Returns a RuleTarget that can be used to trigger this AppSync GraphQL API as a result from an
   * EventBridge event.
   *
   * @param rule 
   * @param _id
   */
  public override fun bind(rule: IRule, id: String): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule.Companion::unwrap), id).let(RuleTargetConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.events.targets.AppSync].
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
     * The role to assume before invoking the target (i.e., the pipeline) when the given rule is
     * triggered.
     *
     * Default: - a new role with permissions to access mutations will be created
     *
     * @param eventRole The role to assume before invoking the target (i.e., the pipeline) when the
     * given rule is triggered. 
     */
    public fun eventRole(eventRole: IRole)

    /**
     * The GraphQL operation;
     *
     * that is, the query, mutation, or subscription
     * to be parsed and executed by the GraphQL service.
     *
     * @param graphQlOperation The GraphQL operation;. 
     */
    public fun graphQlOperation(graphQlOperation: String)

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

    /**
     * The variables that are include in the GraphQL operation.
     *
     * Default: - The entire event is used
     *
     * @param variables The variables that are include in the GraphQL operation. 
     */
    public fun variables(variables: RuleTargetInput)
  }

  private class BuilderImpl(
    appsyncApi: AmazonAwscdkServicesAppsyncIGraphqlApi,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.AppSync.Builder =
        software.amazon.awscdk.services.events.targets.AppSync.Builder.create(appsyncApi)

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
     * The role to assume before invoking the target (i.e., the pipeline) when the given rule is
     * triggered.
     *
     * Default: - a new role with permissions to access mutations will be created
     *
     * @param eventRole The role to assume before invoking the target (i.e., the pipeline) when the
     * given rule is triggered. 
     */
    override fun eventRole(eventRole: IRole) {
      cdkBuilder.eventRole(eventRole.let(IRole.Companion::unwrap))
    }

    /**
     * The GraphQL operation;
     *
     * that is, the query, mutation, or subscription
     * to be parsed and executed by the GraphQL service.
     *
     * @param graphQlOperation The GraphQL operation;. 
     */
    override fun graphQlOperation(graphQlOperation: String) {
      cdkBuilder.graphQlOperation(graphQlOperation)
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

    /**
     * The variables that are include in the GraphQL operation.
     *
     * Default: - The entire event is used
     *
     * @param variables The variables that are include in the GraphQL operation. 
     */
    override fun variables(variables: RuleTargetInput) {
      cdkBuilder.variables(variables.let(RuleTargetInput.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.events.targets.AppSync = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(appsyncApi: CloudshiftdevAwscdkServicesAppsyncIGraphqlApi,
        block: Builder.() -> Unit = {}): AppSync {
      val builderImpl =
          BuilderImpl(CloudshiftdevAwscdkServicesAppsyncIGraphqlApi.unwrap(appsyncApi))
      return AppSync(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.AppSync): AppSync =
        AppSync(cdkObject)

    internal fun unwrap(wrapped: AppSync): software.amazon.awscdk.services.events.targets.AppSync =
        wrapped.cdkObject as software.amazon.awscdk.services.events.targets.AppSync
  }
}
