@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.apigateway.RequestValidatorOptions

@CdkDslMarker
public class RequestValidatorOptionsDsl {
  private val cdkBuilder: RequestValidatorOptions.Builder = RequestValidatorOptions.builder()

  /**
   * @param requestValidatorName The name of this request validator.
   */
  public fun requestValidatorName(requestValidatorName: String) {
    cdkBuilder.requestValidatorName(requestValidatorName)
  }

  /**
   * @param validateRequestBody Indicates whether to validate the request body according to the
   * configured schema for the targeted API and method.
   */
  public fun validateRequestBody(validateRequestBody: Boolean) {
    cdkBuilder.validateRequestBody(validateRequestBody)
  }

  /**
   * @param validateRequestParameters Indicates whether to validate request parameters.
   */
  public fun validateRequestParameters(validateRequestParameters: Boolean) {
    cdkBuilder.validateRequestParameters(validateRequestParameters)
  }

  public fun build(): RequestValidatorOptions = cdkBuilder.build()
}
