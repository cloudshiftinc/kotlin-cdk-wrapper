@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigatewayv2.CfnIntegration

/**
 * Specifies a list of response parameters for an HTTP API.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * ResponseParameterListProperty responseParameterListProperty =
 * ResponseParameterListProperty.builder()
 * .responseParameters(List.of(ResponseParameterProperty.builder()
 * .destination("destination")
 * .source("source")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-responseparameterlist.html)
 */
@CdkDslMarker
public class CfnIntegrationResponseParameterListPropertyDsl {
  private val cdkBuilder: CfnIntegration.ResponseParameterListProperty.Builder =
      CfnIntegration.ResponseParameterListProperty.builder()

  private val _responseParameters: MutableList<Any> = mutableListOf()

  /**
   * @param responseParameters Supported only for HTTP APIs.
   * You use response parameters to transform the HTTP response from a backend integration before
   * returning the response to clients. Specify a key-value map from a selection key to response
   * parameters. The selection key must be a valid HTTP status code within the range of 200-599.
   * Response parameters are a key-value map. The key must match the pattern
   * `&lt;action&gt;:&lt;header&gt;.&lt;location&gt;` or `overwrite.statuscode` . The action can be
   * `append` , `overwrite` or `remove` . The value can be a static value, or map to response data,
   * stage variables, or context variables that are evaluated at runtime. To learn more, see
   * [Transforming API requests and
   * responses](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html)
   * .
   */
  public fun responseParameters(vararg responseParameters: Any) {
    _responseParameters.addAll(listOf(*responseParameters))
  }

  /**
   * @param responseParameters Supported only for HTTP APIs.
   * You use response parameters to transform the HTTP response from a backend integration before
   * returning the response to clients. Specify a key-value map from a selection key to response
   * parameters. The selection key must be a valid HTTP status code within the range of 200-599.
   * Response parameters are a key-value map. The key must match the pattern
   * `&lt;action&gt;:&lt;header&gt;.&lt;location&gt;` or `overwrite.statuscode` . The action can be
   * `append` , `overwrite` or `remove` . The value can be a static value, or map to response data,
   * stage variables, or context variables that are evaluated at runtime. To learn more, see
   * [Transforming API requests and
   * responses](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html)
   * .
   */
  public fun responseParameters(responseParameters: Collection<Any>) {
    _responseParameters.addAll(responseParameters)
  }

  /**
   * @param responseParameters Supported only for HTTP APIs.
   * You use response parameters to transform the HTTP response from a backend integration before
   * returning the response to clients. Specify a key-value map from a selection key to response
   * parameters. The selection key must be a valid HTTP status code within the range of 200-599.
   * Response parameters are a key-value map. The key must match the pattern
   * `&lt;action&gt;:&lt;header&gt;.&lt;location&gt;` or `overwrite.statuscode` . The action can be
   * `append` , `overwrite` or `remove` . The value can be a static value, or map to response data,
   * stage variables, or context variables that are evaluated at runtime. To learn more, see
   * [Transforming API requests and
   * responses](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html)
   * .
   */
  public fun responseParameters(responseParameters: IResolvable) {
    cdkBuilder.responseParameters(responseParameters)
  }

  public fun build(): CfnIntegration.ResponseParameterListProperty {
    if(_responseParameters.isNotEmpty()) cdkBuilder.responseParameters(_responseParameters)
    return cdkBuilder.build()
  }
}
