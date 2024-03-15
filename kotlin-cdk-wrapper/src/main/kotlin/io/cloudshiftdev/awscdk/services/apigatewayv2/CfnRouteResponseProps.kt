@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface CfnRouteResponseProps {
  public fun apiId(): String

  public fun modelSelectionExpression(): String? = unwrap(this).getModelSelectionExpression()

  public fun responseModels(): Any? = unwrap(this).getResponseModels()

  public fun responseParameters(): Any? = unwrap(this).getResponseParameters()

  public fun routeId(): String

  public fun routeResponseKey(): String

  @CdkDslMarker
  public interface Builder {
    public fun apiId(apiId: String)

    public fun modelSelectionExpression(modelSelectionExpression: String)

    public fun responseModels(responseModels: Any)

    public fun responseParameters(responseParameters: IResolvable)

    public fun responseParameters(responseParameters: Map<String, Any>)

    public fun routeId(routeId: String)

    public fun routeResponseKey(routeResponseKey: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.CfnRouteResponseProps.Builder =
        software.amazon.awscdk.services.apigatewayv2.CfnRouteResponseProps.builder()

    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    override fun modelSelectionExpression(modelSelectionExpression: String) {
      cdkBuilder.modelSelectionExpression(modelSelectionExpression)
    }

    override fun responseModels(responseModels: Any) {
      cdkBuilder.responseModels(responseModels)
    }

    override fun responseParameters(responseParameters: IResolvable) {
      cdkBuilder.responseParameters(responseParameters.let(IResolvable::unwrap))
    }

    override fun responseParameters(responseParameters: Map<String, Any>) {
      cdkBuilder.responseParameters(responseParameters)
    }

    override fun routeId(routeId: String) {
      cdkBuilder.routeId(routeId)
    }

    override fun routeResponseKey(routeResponseKey: String) {
      cdkBuilder.routeResponseKey(routeResponseKey)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnRouteResponseProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnRouteResponseProps,
  ) : CdkObject(cdkObject), CfnRouteResponseProps {
    override fun apiId(): String = unwrap(this).getApiId()

    override fun modelSelectionExpression(): String? = unwrap(this).getModelSelectionExpression()

    override fun responseModels(): Any? = unwrap(this).getResponseModels()

    override fun responseParameters(): Any? = unwrap(this).getResponseParameters()

    override fun routeId(): String = unwrap(this).getRouteId()

    override fun routeResponseKey(): String = unwrap(this).getRouteResponseKey()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRouteResponseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnRouteResponseProps):
        CfnRouteResponseProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRouteResponseProps):
        software.amazon.awscdk.services.apigatewayv2.CfnRouteResponseProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.CfnRouteResponseProps
  }
}
