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
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRoute internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnRoute,
) : CfnResource(cdkObject), IInspectable {
  public open fun apiId(): String = unwrap(this).getApiId()

  public open fun apiId(`value`: String) {
    unwrap(this).setApiId(`value`)
  }

  public open fun apiKeyRequired(): Any? = unwrap(this).getApiKeyRequired()

  public open fun apiKeyRequired(`value`: Boolean) {
    unwrap(this).setApiKeyRequired(`value`)
  }

  public open fun apiKeyRequired(`value`: IResolvable) {
    unwrap(this).setApiKeyRequired(`value`.let(IResolvable::unwrap))
  }

  public open fun attrRouteId(): String = unwrap(this).getAttrRouteId()

  public open fun authorizationScopes(): List<String> = unwrap(this).getAuthorizationScopes() ?:
      emptyList()

  public open fun authorizationScopes(`value`: List<String>) {
    unwrap(this).setAuthorizationScopes(`value`)
  }

  public open fun authorizationScopes(vararg `value`: String): Unit =
      authorizationScopes(`value`.toList())

  public open fun authorizationType(): String? = unwrap(this).getAuthorizationType()

  public open fun authorizationType(`value`: String) {
    unwrap(this).setAuthorizationType(`value`)
  }

  public open fun authorizerId(): String? = unwrap(this).getAuthorizerId()

  public open fun authorizerId(`value`: String) {
    unwrap(this).setAuthorizerId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun modelSelectionExpression(): String? = unwrap(this).getModelSelectionExpression()

  public open fun modelSelectionExpression(`value`: String) {
    unwrap(this).setModelSelectionExpression(`value`)
  }

  public open fun operationName(): String? = unwrap(this).getOperationName()

  public open fun operationName(`value`: String) {
    unwrap(this).setOperationName(`value`)
  }

  public open fun requestModels(): Any? = unwrap(this).getRequestModels()

  public open fun requestModels(`value`: Any) {
    unwrap(this).setRequestModels(`value`)
  }

  public open fun requestParameters(): Any? = unwrap(this).getRequestParameters()

  public open fun requestParameters(`value`: Any) {
    unwrap(this).setRequestParameters(`value`)
  }

  public open fun routeKey(): String = unwrap(this).getRouteKey()

  public open fun routeKey(`value`: String) {
    unwrap(this).setRouteKey(`value`)
  }

  public open fun routeResponseSelectionExpression(): String? =
      unwrap(this).getRouteResponseSelectionExpression()

  public open fun routeResponseSelectionExpression(`value`: String) {
    unwrap(this).setRouteResponseSelectionExpression(`value`)
  }

  public open fun target(): String? = unwrap(this).getTarget()

  public open fun target(`value`: String) {
    unwrap(this).setTarget(`value`)
  }

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.CfnRoute.Builder =
        software.amazon.awscdk.services.apigatewayv2.CfnRoute.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnRoute = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.apigatewayv2.CfnRoute.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRoute {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRoute(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnRoute): CfnRoute =
        CfnRoute(cdkObject)

    internal fun unwrap(wrapped: CfnRoute): software.amazon.awscdk.services.apigatewayv2.CfnRoute =
        wrapped.cdkObject
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
          software.amazon.awscdk.services.apigatewayv2.CfnRoute.ParameterConstraintsProperty.Builder
          =
          software.amazon.awscdk.services.apigatewayv2.CfnRoute.ParameterConstraintsProperty.builder()

      override fun required(required: Boolean) {
        cdkBuilder.required(required)
      }

      override fun required(required: IResolvable) {
        cdkBuilder.required(required.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.apigatewayv2.CfnRoute.ParameterConstraintsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apigatewayv2.CfnRoute.ParameterConstraintsProperty,
    ) : CdkObject(cdkObject), ParameterConstraintsProperty {
      override fun required(): Any = unwrap(this).getRequired()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ParameterConstraintsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnRoute.ParameterConstraintsProperty):
          ParameterConstraintsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParameterConstraintsProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnRoute.ParameterConstraintsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apigatewayv2.CfnRoute.ParameterConstraintsProperty
    }
  }
}
