@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRouteResponse internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse,
) : CfnResource(cdkObject), IInspectable {
  public open fun apiId(): String = unwrap(this).getApiId()

  public open fun apiId(`value`: String) {
    unwrap(this).setApiId(`value`)
  }

  public open fun attrRouteResponseId(): String = unwrap(this).getAttrRouteResponseId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun modelSelectionExpression(): String? = unwrap(this).getModelSelectionExpression()

  public open fun modelSelectionExpression(`value`: String) {
    unwrap(this).setModelSelectionExpression(`value`)
  }

  public open fun responseModels(): Any? = unwrap(this).getResponseModels()

  public open fun responseModels(`value`: Any) {
    unwrap(this).setResponseModels(`value`)
  }

  public open fun responseParameters(): Any? = unwrap(this).getResponseParameters()

  public open fun responseParameters(`value`: IResolvable) {
    unwrap(this).setResponseParameters(`value`.let(IResolvable::unwrap))
  }

  public open fun responseParameters(__item_ac66f0: Map<String, Any>) {
    unwrap(this).setResponseParameters(__item_ac66f0)
  }

  public open fun routeId(): String = unwrap(this).getRouteId()

  public open fun routeId(`value`: String) {
    unwrap(this).setRouteId(`value`)
  }

  public open fun routeResponseKey(): String = unwrap(this).getRouteResponseKey()

  public open fun routeResponseKey(`value`: String) {
    unwrap(this).setRouteResponseKey(`value`)
  }

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse.Builder =
        software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRouteResponse {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRouteResponse(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse):
        CfnRouteResponse = CfnRouteResponse(cdkObject)

    internal fun unwrap(wrapped: CfnRouteResponse):
        software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse = wrapped.cdkObject
  }

  public interface ParameterConstraintsProperty {
    public fun required(): Any

    @CdkDslMarker
    public interface Builder {
      public fun required(required: Boolean)

      public fun required(required: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse.ParameterConstraintsProperty.Builder
          =
          software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse.ParameterConstraintsProperty.builder()

      override fun required(required: Boolean) {
        cdkBuilder.required(required)
      }

      override fun required(required: IResolvable) {
        cdkBuilder.required(required.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse.ParameterConstraintsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse.ParameterConstraintsProperty,
    ) : CdkObject(cdkObject), ParameterConstraintsProperty {
      override fun required(): Any = unwrap(this).getRequired()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ParameterConstraintsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse.ParameterConstraintsProperty):
          ParameterConstraintsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParameterConstraintsProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse.ParameterConstraintsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse.ParameterConstraintsProperty
    }
  }
}
