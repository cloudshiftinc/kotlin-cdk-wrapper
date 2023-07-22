@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.events.ApiDestination
import software.amazon.awscdk.services.events.HttpMethod
import software.amazon.awscdk.services.events.IConnection
import software.constructs.Construct

@CdkDslMarker
public class ApiDestinationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: ApiDestination.Builder = ApiDestination.Builder.create(scope, id)

  /**
   * The name for the API destination.
   *
   * Default: - A unique name will be generated
   *
   * @param apiDestinationName The name for the API destination. 
   */
  public fun apiDestinationName(apiDestinationName: String) {
    cdkBuilder.apiDestinationName(apiDestinationName)
  }

  /**
   * The ARN of the connection to use for the API destination.
   *
   * @param connection The ARN of the connection to use for the API destination. 
   */
  public fun connection(connection: IConnection) {
    cdkBuilder.connection(connection)
  }

  /**
   * A description for the API destination.
   *
   * Default: - none
   *
   * @param description A description for the API destination. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The URL to the HTTP invocation endpoint for the API destination..
   *
   * @param endpoint The URL to the HTTP invocation endpoint for the API destination.. 
   */
  public fun endpoint(endpoint: String) {
    cdkBuilder.endpoint(endpoint)
  }

  /**
   * The method to use for the request to the HTTP invocation endpoint.
   *
   * Default: HttpMethod.POST
   *
   * @param httpMethod The method to use for the request to the HTTP invocation endpoint. 
   */
  public fun httpMethod(httpMethod: HttpMethod) {
    cdkBuilder.httpMethod(httpMethod)
  }

  /**
   * The maximum number of requests per second to send to the HTTP invocation endpoint.
   *
   * Default: - Not rate limited
   *
   * @param rateLimitPerSecond The maximum number of requests per second to send to the HTTP
   * invocation endpoint. 
   */
  public fun rateLimitPerSecond(rateLimitPerSecond: Number) {
    cdkBuilder.rateLimitPerSecond(rateLimitPerSecond)
  }

  public fun build(): ApiDestination = cdkBuilder.build()
}
