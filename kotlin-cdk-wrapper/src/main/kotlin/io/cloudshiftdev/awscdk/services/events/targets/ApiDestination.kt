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
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.awscdk.services.events.IApiDestination as CloudshiftdevAwscdkServicesEventsIApiDestination
import software.amazon.awscdk.services.events.IApiDestination as AmazonAwscdkServicesEventsIApiDestination

/**
 * Use an API Destination rule target.
 *
 * Example:
 *
 * ```
 * Connection connection = Connection.Builder.create(this, "Connection")
 * .authorization(Authorization.apiKey("x-api-key", SecretValue.secretsManager("ApiSecretName")))
 * .description("Connection with API Key x-api-key")
 * .build();
 * ApiDestination destination = ApiDestination.Builder.create(this, "Destination")
 * .connection(connection)
 * .endpoint("https://example.com")
 * .description("Calling example.com with API key x-api-key")
 * .build();
 * Rule rule = Rule.Builder.create(this, "Rule")
 * .schedule(Schedule.rate(Duration.minutes(1)))
 * .targets(List.of(new ApiDestination(destination)))
 * .build();
 * ```
 */
public open class ApiDestination internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.events.targets.ApiDestination,
) : CdkObject(cdkObject), IRuleTarget {
  /**
   * Returns a RuleTarget that can be used to trigger API destinations from an EventBridge event.
   *
   * @param _rule 
   * @param _id
   */
  public override fun bind(rule: IRule): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule::unwrap)).let(RuleTargetConfig::wrap)

  /**
   * Returns a RuleTarget that can be used to trigger API destinations from an EventBridge event.
   *
   * @param _rule 
   * @param _id
   */
  public override fun bind(rule: IRule, id: String): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule::unwrap), id).let(RuleTargetConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.events.targets.ApiDestination].
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
     * The event to send.
     *
     * Default: - the entire EventBridge event
     *
     * @param event The event to send. 
     */
    public fun event(event: RuleTargetInput)

    /**
     * The role to assume before invoking the target.
     *
     * Default: - a new role will be created
     *
     * @param eventRole The role to assume before invoking the target. 
     */
    public fun eventRole(eventRole: IRole)

    /**
     * Additional headers sent to the API Destination.
     *
     * These are merged with headers specified on the Connection, with
     * the headers on the Connection taking precedence.
     *
     * You can only specify secret values on the Connection.
     *
     * Default: - none
     *
     * @param headerParameters Additional headers sent to the API Destination. 
     */
    public fun headerParameters(headerParameters: Map<String, String>)

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
     * Path parameters to insert in place of path wildcards (`*`).
     *
     * If the API destination has a wilcard in the path, these path parts
     * will be inserted in that place.
     *
     * Default: - none
     *
     * @param pathParameterValues Path parameters to insert in place of path wildcards (`*`). 
     */
    public fun pathParameterValues(pathParameterValues: List<String>)

    /**
     * Path parameters to insert in place of path wildcards (`*`).
     *
     * If the API destination has a wilcard in the path, these path parts
     * will be inserted in that place.
     *
     * Default: - none
     *
     * @param pathParameterValues Path parameters to insert in place of path wildcards (`*`). 
     */
    public fun pathParameterValues(vararg pathParameterValues: String)

    /**
     * Additional query string parameters sent to the API Destination.
     *
     * These are merged with headers specified on the Connection, with
     * the headers on the Connection taking precedence.
     *
     * You can only specify secret values on the Connection.
     *
     * Default: - none
     *
     * @param queryStringParameters Additional query string parameters sent to the API Destination. 
     */
    public fun queryStringParameters(queryStringParameters: Map<String, String>)

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
    apiDestination: AmazonAwscdkServicesEventsIApiDestination,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.ApiDestination.Builder =
        software.amazon.awscdk.services.events.targets.ApiDestination.Builder.create(apiDestination)

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
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue::unwrap))
    }

    /**
     * The event to send.
     *
     * Default: - the entire EventBridge event
     *
     * @param event The event to send. 
     */
    override fun event(event: RuleTargetInput) {
      cdkBuilder.event(event.let(RuleTargetInput::unwrap))
    }

    /**
     * The role to assume before invoking the target.
     *
     * Default: - a new role will be created
     *
     * @param eventRole The role to assume before invoking the target. 
     */
    override fun eventRole(eventRole: IRole) {
      cdkBuilder.eventRole(eventRole.let(IRole::unwrap))
    }

    /**
     * Additional headers sent to the API Destination.
     *
     * These are merged with headers specified on the Connection, with
     * the headers on the Connection taking precedence.
     *
     * You can only specify secret values on the Connection.
     *
     * Default: - none
     *
     * @param headerParameters Additional headers sent to the API Destination. 
     */
    override fun headerParameters(headerParameters: Map<String, String>) {
      cdkBuilder.headerParameters(headerParameters)
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
      cdkBuilder.maxEventAge(maxEventAge.let(Duration::unwrap))
    }

    /**
     * Path parameters to insert in place of path wildcards (`*`).
     *
     * If the API destination has a wilcard in the path, these path parts
     * will be inserted in that place.
     *
     * Default: - none
     *
     * @param pathParameterValues Path parameters to insert in place of path wildcards (`*`). 
     */
    override fun pathParameterValues(pathParameterValues: List<String>) {
      cdkBuilder.pathParameterValues(pathParameterValues)
    }

    /**
     * Path parameters to insert in place of path wildcards (`*`).
     *
     * If the API destination has a wilcard in the path, these path parts
     * will be inserted in that place.
     *
     * Default: - none
     *
     * @param pathParameterValues Path parameters to insert in place of path wildcards (`*`). 
     */
    override fun pathParameterValues(vararg pathParameterValues: String): Unit =
        pathParameterValues(pathParameterValues.toList())

    /**
     * Additional query string parameters sent to the API Destination.
     *
     * These are merged with headers specified on the Connection, with
     * the headers on the Connection taking precedence.
     *
     * You can only specify secret values on the Connection.
     *
     * Default: - none
     *
     * @param queryStringParameters Additional query string parameters sent to the API Destination. 
     */
    override fun queryStringParameters(queryStringParameters: Map<String, String>) {
      cdkBuilder.queryStringParameters(queryStringParameters)
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

    public fun build(): software.amazon.awscdk.services.events.targets.ApiDestination =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(apiDestination: CloudshiftdevAwscdkServicesEventsIApiDestination,
        block: Builder.() -> Unit = {}): ApiDestination {
      val builderImpl =
          BuilderImpl(CloudshiftdevAwscdkServicesEventsIApiDestination.unwrap(apiDestination))
      return ApiDestination(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.ApiDestination):
        ApiDestination = ApiDestination(cdkObject)

    internal fun unwrap(wrapped: ApiDestination):
        software.amazon.awscdk.services.events.targets.ApiDestination = wrapped.cdkObject
  }
}
