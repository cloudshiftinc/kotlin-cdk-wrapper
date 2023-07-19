@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.apigateway.AuthorizationType
import software.amazon.awscdk.services.apigateway.IAuthorizer
import software.amazon.awscdk.services.apigateway.IModel
import software.amazon.awscdk.services.apigateway.IRequestValidator
import software.amazon.awscdk.services.apigateway.MethodOptions
import software.amazon.awscdk.services.apigateway.MethodResponse
import software.amazon.awscdk.services.apigateway.RequestValidatorOptions

@CdkDslMarker
public class MethodOptionsDsl {
  private val cdkBuilder: MethodOptions.Builder = MethodOptions.builder()

  private val _authorizationScopes: MutableList<String> = mutableListOf()

  private val _methodResponses: MutableList<MethodResponse> = mutableListOf()

  public fun apiKeyRequired(apiKeyRequired: Boolean) {
    cdkBuilder.apiKeyRequired(apiKeyRequired)
  }

  public fun authorizationScopes(vararg authorizationScopes: String) {
    _authorizationScopes.addAll(listOf(*authorizationScopes))
  }

  public fun authorizationScopes(authorizationScopes: Collection<String>) {
    _authorizationScopes.addAll(authorizationScopes)
  }

  public fun authorizationType(authorizationType: AuthorizationType) {
    cdkBuilder.authorizationType(authorizationType)
  }

  public fun authorizer(authorizer: IAuthorizer) {
    cdkBuilder.authorizer(authorizer)
  }

  public fun methodResponses(methodResponses: MethodResponseDsl.() -> Unit) {
    _methodResponses.add(MethodResponseDsl().apply(methodResponses).build())
  }

  public fun methodResponses(methodResponses: Collection<MethodResponse>) {
    _methodResponses.addAll(methodResponses)
  }

  public fun operationName(operationName: String) {
    cdkBuilder.operationName(operationName)
  }

  public fun requestModels(requestModels: Map<String, IModel>) {
    cdkBuilder.requestModels(requestModels)
  }

  public fun requestParameters(requestParameters: Map<String, Boolean>) {
    cdkBuilder.requestParameters(requestParameters)
  }

  public fun requestValidator(requestValidator: IRequestValidator) {
    cdkBuilder.requestValidator(requestValidator)
  }

  public fun requestValidatorOptions(block: RequestValidatorOptionsDsl.() -> Unit = {}) {
    val builder = RequestValidatorOptionsDsl()
    builder.apply(block)
    cdkBuilder.requestValidatorOptions(builder.build())
  }

  public fun requestValidatorOptions(requestValidatorOptions: RequestValidatorOptions) {
    cdkBuilder.requestValidatorOptions(requestValidatorOptions)
  }

  public fun build(): MethodOptions {
    if(_authorizationScopes.isNotEmpty()) cdkBuilder.authorizationScopes(_authorizationScopes)
    if(_methodResponses.isNotEmpty()) cdkBuilder.methodResponses(_methodResponses)
    return cdkBuilder.build()
  }
}
