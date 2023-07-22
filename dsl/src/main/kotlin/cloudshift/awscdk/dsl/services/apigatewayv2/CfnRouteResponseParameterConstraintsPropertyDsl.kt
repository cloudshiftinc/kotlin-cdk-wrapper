@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse

/**
 * Specifies whether the parameter is required.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * ParameterConstraintsProperty parameterConstraintsProperty =
 * ParameterConstraintsProperty.builder()
 * .required(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-routeresponse-parameterconstraints.html)
 */
@CdkDslMarker
public class CfnRouteResponseParameterConstraintsPropertyDsl {
  private val cdkBuilder: CfnRouteResponse.ParameterConstraintsProperty.Builder =
      CfnRouteResponse.ParameterConstraintsProperty.builder()

  /**
   * @param required Specifies whether the parameter is required. 
   */
  public fun required(required: Boolean) {
    cdkBuilder.required(required)
  }

  /**
   * @param required Specifies whether the parameter is required. 
   */
  public fun required(required: IResolvable) {
    cdkBuilder.required(required)
  }

  public fun build(): CfnRouteResponse.ParameterConstraintsProperty = cdkBuilder.build()
}
