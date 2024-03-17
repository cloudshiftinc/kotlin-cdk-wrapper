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
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Customize the EventBridge Api Destinations Target.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.events.*;
 * import io.cloudshiftdev.awscdk.services.events.targets.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.services.sqs.*;
 * Queue queue;
 * Role role;
 * RuleTargetInput ruleTargetInput;
 * ApiDestinationProps apiDestinationProps = ApiDestinationProps.builder()
 * .deadLetterQueue(queue)
 * .event(ruleTargetInput)
 * .eventRole(role)
 * .headerParameters(Map.of(
 * "headerParametersKey", "headerParameters"))
 * .maxEventAge(Duration.minutes(30))
 * .pathParameterValues(List.of("pathParameterValues"))
 * .queryStringParameters(Map.of(
 * "queryStringParametersKey", "queryStringParameters"))
 * .retryAttempts(123)
 * .build();
 * ```
 */
public interface ApiDestinationProps : TargetBaseProps {
  /**
   * The event to send.
   *
   * Default: - the entire EventBridge event
   */
  public fun event(): RuleTargetInput? = unwrap(this).getEvent()?.let(RuleTargetInput::wrap)

  /**
   * The role to assume before invoking the target.
   *
   * Default: - a new role will be created
   */
  public fun eventRole(): IRole? = unwrap(this).getEventRole()?.let(IRole::wrap)

  /**
   * Additional headers sent to the API Destination.
   *
   * These are merged with headers specified on the Connection, with
   * the headers on the Connection taking precedence.
   *
   * You can only specify secret values on the Connection.
   *
   * Default: - none
   */
  public fun headerParameters(): Map<String, String> = unwrap(this).getHeaderParameters() ?:
      emptyMap()

  /**
   * Path parameters to insert in place of path wildcards (`*`).
   *
   * If the API destination has a wilcard in the path, these path parts
   * will be inserted in that place.
   *
   * Default: - none
   */
  public fun pathParameterValues(): List<String> = unwrap(this).getPathParameterValues() ?:
      emptyList()

  /**
   * Additional query string parameters sent to the API Destination.
   *
   * These are merged with headers specified on the Connection, with
   * the headers on the Connection taking precedence.
   *
   * You can only specify secret values on the Connection.
   *
   * Default: - none
   */
  public fun queryStringParameters(): Map<String, String> = unwrap(this).getQueryStringParameters()
      ?: emptyMap()

  /**
   * A builder for [ApiDestinationProps]
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
     * @param event The event to send.
     */
    public fun event(event: RuleTargetInput)

    /**
     * @param eventRole The role to assume before invoking the target.
     */
    public fun eventRole(eventRole: IRole)

    /**
     * @param headerParameters Additional headers sent to the API Destination.
     * These are merged with headers specified on the Connection, with
     * the headers on the Connection taking precedence.
     *
     * You can only specify secret values on the Connection.
     */
    public fun headerParameters(headerParameters: Map<String, String>)

    /**
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing.
     * Minimum value of 60.
     * Maximum value of 86400.
     */
    public fun maxEventAge(maxEventAge: Duration)

    /**
     * @param pathParameterValues Path parameters to insert in place of path wildcards (`*`).
     * If the API destination has a wilcard in the path, these path parts
     * will be inserted in that place.
     */
    public fun pathParameterValues(pathParameterValues: List<String>)

    /**
     * @param pathParameterValues Path parameters to insert in place of path wildcards (`*`).
     * If the API destination has a wilcard in the path, these path parts
     * will be inserted in that place.
     */
    public fun pathParameterValues(vararg pathParameterValues: String)

    /**
     * @param queryStringParameters Additional query string parameters sent to the API Destination.
     * These are merged with headers specified on the Connection, with
     * the headers on the Connection taking precedence.
     *
     * You can only specify secret values on the Connection.
     */
    public fun queryStringParameters(queryStringParameters: Map<String, String>)

    /**
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * Minimum value of 0.
     * Maximum value of 185.
     */
    public fun retryAttempts(retryAttempts: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.events.targets.ApiDestinationProps.Builder =
        software.amazon.awscdk.services.events.targets.ApiDestinationProps.builder()

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
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue::unwrap))
    }

    /**
     * @param event The event to send.
     */
    override fun event(event: RuleTargetInput) {
      cdkBuilder.event(event.let(RuleTargetInput::unwrap))
    }

    /**
     * @param eventRole The role to assume before invoking the target.
     */
    override fun eventRole(eventRole: IRole) {
      cdkBuilder.eventRole(eventRole.let(IRole::unwrap))
    }

    /**
     * @param headerParameters Additional headers sent to the API Destination.
     * These are merged with headers specified on the Connection, with
     * the headers on the Connection taking precedence.
     *
     * You can only specify secret values on the Connection.
     */
    override fun headerParameters(headerParameters: Map<String, String>) {
      cdkBuilder.headerParameters(headerParameters)
    }

    /**
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing.
     * Minimum value of 60.
     * Maximum value of 86400.
     */
    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration::unwrap))
    }

    /**
     * @param pathParameterValues Path parameters to insert in place of path wildcards (`*`).
     * If the API destination has a wilcard in the path, these path parts
     * will be inserted in that place.
     */
    override fun pathParameterValues(pathParameterValues: List<String>) {
      cdkBuilder.pathParameterValues(pathParameterValues)
    }

    /**
     * @param pathParameterValues Path parameters to insert in place of path wildcards (`*`).
     * If the API destination has a wilcard in the path, these path parts
     * will be inserted in that place.
     */
    override fun pathParameterValues(vararg pathParameterValues: String): Unit =
        pathParameterValues(pathParameterValues.toList())

    /**
     * @param queryStringParameters Additional query string parameters sent to the API Destination.
     * These are merged with headers specified on the Connection, with
     * the headers on the Connection taking precedence.
     *
     * You can only specify secret values on the Connection.
     */
    override fun queryStringParameters(queryStringParameters: Map<String, String>) {
      cdkBuilder.queryStringParameters(queryStringParameters)
    }

    /**
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * Minimum value of 0.
     * Maximum value of 185.
     */
    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.ApiDestinationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.targets.ApiDestinationProps,
  ) : CdkObject(cdkObject), ApiDestinationProps {
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
     * The event to send.
     *
     * Default: - the entire EventBridge event
     */
    override fun event(): RuleTargetInput? = unwrap(this).getEvent()?.let(RuleTargetInput::wrap)

    /**
     * The role to assume before invoking the target.
     *
     * Default: - a new role will be created
     */
    override fun eventRole(): IRole? = unwrap(this).getEventRole()?.let(IRole::wrap)

    /**
     * Additional headers sent to the API Destination.
     *
     * These are merged with headers specified on the Connection, with
     * the headers on the Connection taking precedence.
     *
     * You can only specify secret values on the Connection.
     *
     * Default: - none
     */
    override fun headerParameters(): Map<String, String> = unwrap(this).getHeaderParameters() ?:
        emptyMap()

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
     * Path parameters to insert in place of path wildcards (`*`).
     *
     * If the API destination has a wilcard in the path, these path parts
     * will be inserted in that place.
     *
     * Default: - none
     */
    override fun pathParameterValues(): List<String> = unwrap(this).getPathParameterValues() ?:
        emptyList()

    /**
     * Additional query string parameters sent to the API Destination.
     *
     * These are merged with headers specified on the Connection, with
     * the headers on the Connection taking precedence.
     *
     * You can only specify secret values on the Connection.
     *
     * Default: - none
     */
    override fun queryStringParameters(): Map<String, String> =
        unwrap(this).getQueryStringParameters() ?: emptyMap()

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
    public operator fun invoke(block: Builder.() -> Unit = {}): ApiDestinationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.ApiDestinationProps):
        ApiDestinationProps = CdkObjectWrappers.wrap(cdkObject) as? ApiDestinationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApiDestinationProps):
        software.amazon.awscdk.services.events.targets.ApiDestinationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.events.targets.ApiDestinationProps
  }
}
