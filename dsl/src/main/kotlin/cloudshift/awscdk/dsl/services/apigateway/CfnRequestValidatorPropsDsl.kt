@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnRequestValidatorProps

@CdkDslMarker
public class CfnRequestValidatorPropsDsl {
  private val cdkBuilder: CfnRequestValidatorProps.Builder = CfnRequestValidatorProps.builder()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun restApiId(restApiId: String) {
    cdkBuilder.restApiId(restApiId)
  }

  public fun validateRequestBody(validateRequestBody: Boolean) {
    cdkBuilder.validateRequestBody(validateRequestBody)
  }

  public fun validateRequestBody(validateRequestBody: IResolvable) {
    cdkBuilder.validateRequestBody(validateRequestBody)
  }

  public fun validateRequestParameters(validateRequestParameters: Boolean) {
    cdkBuilder.validateRequestParameters(validateRequestParameters)
  }

  public fun validateRequestParameters(validateRequestParameters: IResolvable) {
    cdkBuilder.validateRequestParameters(validateRequestParameters)
  }

  public fun build(): CfnRequestValidatorProps = cdkBuilder.build()
}
