@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.events.CfnApiDestination
import software.constructs.Construct

@CdkDslMarker
public class CfnApiDestinationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnApiDestination.Builder = CfnApiDestination.Builder.create(scope, id)

  /**
   * The ARN of the connection to use for the API destination.
   *
   * The destination endpoint must support the authorization type specified for the connection.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-apidestination.html#cfn-events-apidestination-connectionarn)
   * @param connectionArn The ARN of the connection to use for the API destination. 
   */
  public fun connectionArn(connectionArn: String) {
    cdkBuilder.connectionArn(connectionArn)
  }

  /**
   * A description for the API destination to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-apidestination.html#cfn-events-apidestination-description)
   * @param description A description for the API destination to create. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The method to use for the request to the HTTP invocation endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-apidestination.html#cfn-events-apidestination-httpmethod)
   * @param httpMethod The method to use for the request to the HTTP invocation endpoint. 
   */
  public fun httpMethod(httpMethod: String) {
    cdkBuilder.httpMethod(httpMethod)
  }

  /**
   * The URL to the HTTP invocation endpoint for the API destination.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-apidestination.html#cfn-events-apidestination-invocationendpoint)
   * @param invocationEndpoint The URL to the HTTP invocation endpoint for the API destination. 
   */
  public fun invocationEndpoint(invocationEndpoint: String) {
    cdkBuilder.invocationEndpoint(invocationEndpoint)
  }

  /**
   * The maximum number of requests per second to send to the HTTP invocation endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-apidestination.html#cfn-events-apidestination-invocationratelimitpersecond)
   * @param invocationRateLimitPerSecond The maximum number of requests per second to send to the
   * HTTP invocation endpoint. 
   */
  public fun invocationRateLimitPerSecond(invocationRateLimitPerSecond: Number) {
    cdkBuilder.invocationRateLimitPerSecond(invocationRateLimitPerSecond)
  }

  /**
   * The name for the API destination to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-apidestination.html#cfn-events-apidestination-name)
   * @param name The name for the API destination to create. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnApiDestination = cdkBuilder.build()
}
