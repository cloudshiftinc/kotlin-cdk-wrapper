@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.refactorspaces

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.refactorspaces.CfnApplication

/**
 * A wrapper object holding the Amazon API Gateway endpoint input.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.refactorspaces.*;
 * ApiGatewayProxyInputProperty apiGatewayProxyInputProperty =
 * ApiGatewayProxyInputProperty.builder()
 * .endpointType("endpointType")
 * .stageName("stageName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-refactorspaces-application-apigatewayproxyinput.html)
 */
@CdkDslMarker
public class CfnApplicationApiGatewayProxyInputPropertyDsl {
  private val cdkBuilder: CfnApplication.ApiGatewayProxyInputProperty.Builder =
      CfnApplication.ApiGatewayProxyInputProperty.builder()

  /**
   * @param endpointType The type of endpoint to use for the API Gateway proxy.
   * If no value is specified in the request, the value is set to `REGIONAL` by default.
   *
   * If the value is set to `PRIVATE` in the request, this creates a private API endpoint that is
   * isolated from the public internet. The private endpoint can only be accessed by using Amazon
   * Virtual Private Cloud ( Amazon VPC ) interface endpoints for the Amazon API Gateway that has been
   * granted access. For more information about creating a private connection with Refactor Spaces and
   * interface endpoint ( AWS PrivateLink ) availability, see [Access Refactor Spaces using an
   * interface endpoint ( AWS PrivateLink
   * )](https://docs.aws.amazon.com/migrationhub-refactor-spaces/latest/userguide/vpc-interface-endpoints.html)
   * .
   */
  public fun endpointType(endpointType: String) {
    cdkBuilder.endpointType(endpointType)
  }

  /**
   * @param stageName The name of the API Gateway stage.
   * The name defaults to `prod` .
   */
  public fun stageName(stageName: String) {
    cdkBuilder.stageName(stageName)
  }

  public fun build(): CfnApplication.ApiGatewayProxyInputProperty = cdkBuilder.build()
}
