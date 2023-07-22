@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnRequestValidator
import software.constructs.Construct

@CdkDslMarker
public class CfnRequestValidatorDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnRequestValidator.Builder = CfnRequestValidator.Builder.create(scope,
      id)

  /**
   * The name of this RequestValidator.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-name)
   * @param name The name of this RequestValidator. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The string identifier of the associated RestApi.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-restapiid)
   * @param restApiId The string identifier of the associated RestApi. 
   */
  public fun restApiId(restApiId: String) {
    cdkBuilder.restApiId(restApiId)
  }

  /**
   * A Boolean flag to indicate whether to validate a request body according to the configured Model
   * schema.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-validaterequestbody)
   * @param validateRequestBody A Boolean flag to indicate whether to validate a request body
   * according to the configured Model schema. 
   */
  public fun validateRequestBody(validateRequestBody: Boolean) {
    cdkBuilder.validateRequestBody(validateRequestBody)
  }

  /**
   * A Boolean flag to indicate whether to validate a request body according to the configured Model
   * schema.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-validaterequestbody)
   * @param validateRequestBody A Boolean flag to indicate whether to validate a request body
   * according to the configured Model schema. 
   */
  public fun validateRequestBody(validateRequestBody: IResolvable) {
    cdkBuilder.validateRequestBody(validateRequestBody)
  }

  /**
   * A Boolean flag to indicate whether to validate request parameters ( `true` ) or not ( `false`
   * ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-validaterequestparameters)
   * @param validateRequestParameters A Boolean flag to indicate whether to validate request
   * parameters ( `true` ) or not ( `false` ). 
   */
  public fun validateRequestParameters(validateRequestParameters: Boolean) {
    cdkBuilder.validateRequestParameters(validateRequestParameters)
  }

  /**
   * A Boolean flag to indicate whether to validate request parameters ( `true` ) or not ( `false`
   * ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-validaterequestparameters)
   * @param validateRequestParameters A Boolean flag to indicate whether to validate request
   * parameters ( `true` ) or not ( `false` ). 
   */
  public fun validateRequestParameters(validateRequestParameters: IResolvable) {
    cdkBuilder.validateRequestParameters(validateRequestParameters)
  }

  public fun build(): CfnRequestValidator = cdkBuilder.build()
}
