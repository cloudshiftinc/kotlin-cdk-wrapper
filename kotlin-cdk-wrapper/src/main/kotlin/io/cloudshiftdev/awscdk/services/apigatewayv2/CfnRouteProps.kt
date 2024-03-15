@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnRouteProps {
  public fun apiId(): String

  public fun apiKeyRequired(): Any? = unwrap(this).getApiKeyRequired()

  public fun authorizationScopes(): List<String> = unwrap(this).getAuthorizationScopes() ?:
      emptyList()

  public fun authorizationType(): String? = unwrap(this).getAuthorizationType()

  public fun authorizerId(): String? = unwrap(this).getAuthorizerId()

  public fun modelSelectionExpression(): String? = unwrap(this).getModelSelectionExpression()

  public fun operationName(): String? = unwrap(this).getOperationName()

  public fun requestModels(): Any? = unwrap(this).getRequestModels()

  public fun requestParameters(): Any? = unwrap(this).getRequestParameters()

  public fun routeKey(): String

  public fun routeResponseSelectionExpression(): String? =
      unwrap(this).getRouteResponseSelectionExpression()

  public fun target(): String? = unwrap(this).getTarget()

  @CdkDslMarker
  public interface Builder {
    public fun apiId(apiId: String)

    public fun apiKeyRequired(apiKeyRequired: Boolean)

    public fun apiKeyRequired(apiKeyRequired: IResolvable)

    public fun authorizationScopes(authorizationScopes: List<String>)

    public fun authorizationScopes(vararg authorizationScopes: String)

    public fun authorizationType(authorizationType: String)

    public fun authorizerId(authorizerId: String)

    public fun modelSelectionExpression(modelSelectionExpression: String)

    public fun operationName(operationName: String)

    public fun requestModels(requestModels: Any)

    public fun requestParameters(requestParameters: Any)

    public fun routeKey(routeKey: String)

    public fun routeResponseSelectionExpression(routeResponseSelectionExpression: String)

    public fun target(target: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.CfnRouteProps.Builder =
        software.amazon.awscdk.services.apigatewayv2.CfnRouteProps.builder()

    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    override fun apiKeyRequired(apiKeyRequired: Boolean) {
      cdkBuilder.apiKeyRequired(apiKeyRequired)
    }

    override fun apiKeyRequired(apiKeyRequired: IResolvable) {
      cdkBuilder.apiKeyRequired(apiKeyRequired.let(IResolvable::unwrap))
    }

    override fun authorizationScopes(authorizationScopes: List<String>) {
      cdkBuilder.authorizationScopes(authorizationScopes)
    }

    override fun authorizationScopes(vararg authorizationScopes: String): Unit =
        authorizationScopes(authorizationScopes.toList())

    override fun authorizationType(authorizationType: String) {
      cdkBuilder.authorizationType(authorizationType)
    }

    override fun authorizerId(authorizerId: String) {
      cdkBuilder.authorizerId(authorizerId)
    }

    override fun modelSelectionExpression(modelSelectionExpression: String) {
      cdkBuilder.modelSelectionExpression(modelSelectionExpression)
    }

    override fun operationName(operationName: String) {
      cdkBuilder.operationName(operationName)
    }

    override fun requestModels(requestModels: Any) {
      cdkBuilder.requestModels(requestModels)
    }

    override fun requestParameters(requestParameters: Any) {
      cdkBuilder.requestParameters(requestParameters)
    }

    override fun routeKey(routeKey: String) {
      cdkBuilder.routeKey(routeKey)
    }

    override fun routeResponseSelectionExpression(routeResponseSelectionExpression: String) {
      cdkBuilder.routeResponseSelectionExpression(routeResponseSelectionExpression)
    }

    override fun target(target: String) {
      cdkBuilder.target(target)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnRouteProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnRouteProps,
  ) : CdkObject(cdkObject), CfnRouteProps {
    override fun apiId(): String = unwrap(this).getApiId()

    override fun apiKeyRequired(): Any? = unwrap(this).getApiKeyRequired()

    override fun authorizationScopes(): List<String> = unwrap(this).getAuthorizationScopes() ?:
        emptyList()

    override fun authorizationType(): String? = unwrap(this).getAuthorizationType()

    override fun authorizerId(): String? = unwrap(this).getAuthorizerId()

    override fun modelSelectionExpression(): String? = unwrap(this).getModelSelectionExpression()

    override fun operationName(): String? = unwrap(this).getOperationName()

    override fun requestModels(): Any? = unwrap(this).getRequestModels()

    override fun requestParameters(): Any? = unwrap(this).getRequestParameters()

    override fun routeKey(): String = unwrap(this).getRouteKey()

    override fun routeResponseSelectionExpression(): String? =
        unwrap(this).getRouteResponseSelectionExpression()

    override fun target(): String? = unwrap(this).getTarget()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRouteProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnRouteProps):
        CfnRouteProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRouteProps):
        software.amazon.awscdk.services.apigatewayv2.CfnRouteProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.CfnRouteProps
  }
}
