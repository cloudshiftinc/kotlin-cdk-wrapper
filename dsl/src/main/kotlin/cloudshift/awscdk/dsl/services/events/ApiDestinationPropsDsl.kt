@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.events.ApiDestinationProps
import software.amazon.awscdk.services.events.HttpMethod
import software.amazon.awscdk.services.events.IConnection

/**
 * The event API Destination properties.
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
public class ApiDestinationPropsDsl {
  private val cdkBuilder: ApiDestinationProps.Builder = ApiDestinationProps.builder()

  /**
   * @param apiDestinationName The name for the API destination.
   */
  public fun apiDestinationName(apiDestinationName: String) {
    cdkBuilder.apiDestinationName(apiDestinationName)
  }

  /**
   * @param connection The ARN of the connection to use for the API destination. 
   */
  public fun connection(connection: IConnection) {
    cdkBuilder.connection(connection)
  }

  /**
   * @param description A description for the API destination.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param endpoint The URL to the HTTP invocation endpoint for the API destination.. 
   */
  public fun endpoint(endpoint: String) {
    cdkBuilder.endpoint(endpoint)
  }

  /**
   * @param httpMethod The method to use for the request to the HTTP invocation endpoint.
   */
  public fun httpMethod(httpMethod: HttpMethod) {
    cdkBuilder.httpMethod(httpMethod)
  }

  /**
   * @param rateLimitPerSecond The maximum number of requests per second to send to the HTTP
   * invocation endpoint.
   */
  public fun rateLimitPerSecond(rateLimitPerSecond: Number) {
    cdkBuilder.rateLimitPerSecond(rateLimitPerSecond)
  }

  public fun build(): ApiDestinationProps = cdkBuilder.build()
}
