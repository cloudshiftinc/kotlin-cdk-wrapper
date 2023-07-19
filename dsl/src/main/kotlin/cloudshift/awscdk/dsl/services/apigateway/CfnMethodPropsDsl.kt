@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnMethod
import software.amazon.awscdk.services.apigateway.CfnMethodProps

@CdkDslMarker
public class CfnMethodPropsDsl {
  private val cdkBuilder: CfnMethodProps.Builder = CfnMethodProps.builder()

  private val _authorizationScopes: MutableList<String> = mutableListOf()

  private val _methodResponses: MutableList<Any> = mutableListOf()

  public fun apiKeyRequired(apiKeyRequired: Boolean) {
    cdkBuilder.apiKeyRequired(apiKeyRequired)
  }

  public fun apiKeyRequired(apiKeyRequired: IResolvable) {
    cdkBuilder.apiKeyRequired(apiKeyRequired)
  }

  public fun authorizationScopes(vararg authorizationScopes: String) {
    _authorizationScopes.addAll(listOf(*authorizationScopes))
  }

  public fun authorizationScopes(authorizationScopes: Collection<String>) {
    _authorizationScopes.addAll(authorizationScopes)
  }

  public fun authorizationType(authorizationType: String) {
    cdkBuilder.authorizationType(authorizationType)
  }

  public fun authorizerId(authorizerId: String) {
    cdkBuilder.authorizerId(authorizerId)
  }

  public fun httpMethod(httpMethod: String) {
    cdkBuilder.httpMethod(httpMethod)
  }

  public fun integration(integration: IResolvable) {
    cdkBuilder.integration(integration)
  }

  public fun integration(integration: CfnMethod.IntegrationProperty) {
    cdkBuilder.integration(integration)
  }

  public fun methodResponses(vararg methodResponses: Any) {
    _methodResponses.addAll(listOf(*methodResponses))
  }

  public fun methodResponses(methodResponses: Collection<Any>) {
    _methodResponses.addAll(methodResponses)
  }

  public fun methodResponses(methodResponses: IResolvable) {
    cdkBuilder.methodResponses(methodResponses)
  }

  public fun operationName(operationName: String) {
    cdkBuilder.operationName(operationName)
  }

  public fun requestModels(requestModels: Map<String, String>) {
    cdkBuilder.requestModels(requestModels)
  }

  public fun requestModels(requestModels: IResolvable) {
    cdkBuilder.requestModels(requestModels)
  }

  public fun requestParameters(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.requestParameters(builder.map)
  }

  public fun requestParameters(requestParameters: Map<String, Any>) {
    cdkBuilder.requestParameters(requestParameters)
  }

  public fun requestParameters(requestParameters: IResolvable) {
    cdkBuilder.requestParameters(requestParameters)
  }

  public fun requestValidatorId(requestValidatorId: String) {
    cdkBuilder.requestValidatorId(requestValidatorId)
  }

  public fun resourceId(resourceId: String) {
    cdkBuilder.resourceId(resourceId)
  }

  public fun restApiId(restApiId: String) {
    cdkBuilder.restApiId(restApiId)
  }

  public fun build(): CfnMethodProps {
    if(_authorizationScopes.isNotEmpty()) cdkBuilder.authorizationScopes(_authorizationScopes)
    if(_methodResponses.isNotEmpty()) cdkBuilder.methodResponses(_methodResponses)
    return cdkBuilder.build()
  }
}
