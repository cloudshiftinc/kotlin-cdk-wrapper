@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events.targets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.events.IApiDestination
import software.amazon.awscdk.services.events.RuleTargetInput
import software.amazon.awscdk.services.events.targets.ApiDestination
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.sqs.IQueue

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
@CdkDslMarker
public class ApiDestinationDsl(
  apiDestination: IApiDestination,
) {
  private val cdkBuilder: ApiDestination.Builder = ApiDestination.Builder.create(apiDestination)

  private val _pathParameterValues: MutableList<String> = mutableListOf()

  /**
   * The SQS queue to be used as deadLetterQueue. Check out the [considerations for using a
   * dead-letter
   * queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
   *
   * The events not successfully delivered are automatically retried for a specified period of time,
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
  public fun deadLetterQueue(deadLetterQueue: IQueue) {
    cdkBuilder.deadLetterQueue(deadLetterQueue)
  }

  /**
   * The event to send.
   *
   * Default: - the entire EventBridge event
   *
   * @param event The event to send. 
   */
  public fun event(event: RuleTargetInput) {
    cdkBuilder.event(event)
  }

  /**
   * The role to assume before invoking the target.
   *
   * Default: - a new role will be created
   *
   * @param eventRole The role to assume before invoking the target. 
   */
  public fun eventRole(eventRole: IRole) {
    cdkBuilder.eventRole(eventRole)
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
  public fun headerParameters(headerParameters: Map<String, String>) {
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
   * @param maxEventAge The maximum age of a request that Lambda sends to a function for processing.
   * 
   */
  public fun maxEventAge(maxEventAge: Duration) {
    cdkBuilder.maxEventAge(maxEventAge)
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
  public fun pathParameterValues(vararg pathParameterValues: String) {
    _pathParameterValues.addAll(listOf(*pathParameterValues))
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
  public fun pathParameterValues(pathParameterValues: Collection<String>) {
    _pathParameterValues.addAll(pathParameterValues)
  }

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
  public fun queryStringParameters(queryStringParameters: Map<String, String>) {
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
   */
  public fun retryAttempts(retryAttempts: Number) {
    cdkBuilder.retryAttempts(retryAttempts)
  }

  public fun build(): ApiDestination {
    if(_pathParameterValues.isNotEmpty()) cdkBuilder.pathParameterValues(_pathParameterValues)
    return cdkBuilder.build()
  }
}
