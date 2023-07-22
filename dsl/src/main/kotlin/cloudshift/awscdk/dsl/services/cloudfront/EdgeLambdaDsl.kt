@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.cloudfront.EdgeLambda
import software.amazon.awscdk.services.cloudfront.LambdaEdgeEventType
import software.amazon.awscdk.services.lambda.IVersion

/**
 * Represents a Lambda function version and event type when using Lambda&#64;Edge.
 *
 * The type of the `AddBehaviorOptions.edgeLambdas` property.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * import software.amazon.awscdk.services.lambda.*;
 * Version version;
 * EdgeLambda edgeLambda = EdgeLambda.builder()
 * .eventType(LambdaEdgeEventType.ORIGIN_REQUEST)
 * .functionVersion(version)
 * // the properties below are optional
 * .includeBody(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class EdgeLambdaDsl {
  private val cdkBuilder: EdgeLambda.Builder = EdgeLambda.builder()

  /**
   * @param eventType The type of event in response to which should the function be invoked. 
   */
  public fun eventType(eventType: LambdaEdgeEventType) {
    cdkBuilder.eventType(eventType)
  }

  /**
   * @param functionVersion The version of the Lambda function that will be invoked. 
   * **Note**: it's not possible to use the '$LATEST' function version for Lambda&#64;Edge!
   */
  public fun functionVersion(functionVersion: IVersion) {
    cdkBuilder.functionVersion(functionVersion)
  }

  /**
   * @param includeBody Allows a Lambda function to have read access to the body content.
   * Only valid for "request" event types (`ORIGIN_REQUEST` or `VIEWER_REQUEST`).
   * See
   * https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/lambda-include-body-access.html
   */
  public fun includeBody(includeBody: Boolean) {
    cdkBuilder.includeBody(includeBody)
  }

  public fun build(): EdgeLambda = cdkBuilder.build()
}
