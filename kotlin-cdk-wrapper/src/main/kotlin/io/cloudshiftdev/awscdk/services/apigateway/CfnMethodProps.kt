@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnMethodProps {
  public fun apiKeyRequired(): Any? = unwrap(this).getApiKeyRequired()

  public fun authorizationScopes(): List<String> = unwrap(this).getAuthorizationScopes() ?:
      emptyList()

  public fun authorizationType(): String? = unwrap(this).getAuthorizationType()

  public fun authorizerId(): String? = unwrap(this).getAuthorizerId()

  public fun httpMethod(): String

  public fun integration(): Any? = unwrap(this).getIntegration()

  public fun methodResponses(): Any? = unwrap(this).getMethodResponses()

  public fun operationName(): String? = unwrap(this).getOperationName()

  public fun requestModels(): Any? = unwrap(this).getRequestModels()

  public fun requestParameters(): Any? = unwrap(this).getRequestParameters()

  public fun requestValidatorId(): String? = unwrap(this).getRequestValidatorId()

  public fun resourceId(): String

  public fun restApiId(): String

  @CdkDslMarker
  public interface Builder {
    public fun apiKeyRequired(apiKeyRequired: Boolean)

    public fun apiKeyRequired(apiKeyRequired: IResolvable)

    public fun authorizationScopes(authorizationScopes: List<String>)

    public fun authorizationScopes(vararg authorizationScopes: String)

    public fun authorizationType(authorizationType: String)

    public fun authorizerId(authorizerId: String)

    public fun httpMethod(httpMethod: String)

    public fun integration(integration: IResolvable)

    public fun integration(integration: CfnMethod.IntegrationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c5245da4b9509ece1c494ecdde37d0f9eb6a968e5af4555e3b2f071e19e58d2f")
    public fun integration(integration: CfnMethod.IntegrationProperty.Builder.() -> Unit)

    public fun methodResponses(methodResponses: IResolvable)

    public fun methodResponses(methodResponses: List<Any>)

    public fun methodResponses(vararg methodResponses: Any)

    public fun operationName(operationName: String)

    public fun requestModels(requestModels: IResolvable)

    public fun requestModels(requestModels: Map<String, String>)

    public fun requestParameters(requestParameters: IResolvable)

    public fun requestParameters(requestParameters: Map<String, Any>)

    public fun requestValidatorId(requestValidatorId: String)

    public fun resourceId(resourceId: String)

    public fun restApiId(restApiId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnMethodProps.Builder =
        software.amazon.awscdk.services.apigateway.CfnMethodProps.builder()

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

    override fun httpMethod(httpMethod: String) {
      cdkBuilder.httpMethod(httpMethod)
    }

    override fun integration(integration: IResolvable) {
      cdkBuilder.integration(integration.let(IResolvable::unwrap))
    }

    override fun integration(integration: CfnMethod.IntegrationProperty) {
      cdkBuilder.integration(integration.let(CfnMethod.IntegrationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c5245da4b9509ece1c494ecdde37d0f9eb6a968e5af4555e3b2f071e19e58d2f")
    override fun integration(integration: CfnMethod.IntegrationProperty.Builder.() -> Unit): Unit =
        integration(CfnMethod.IntegrationProperty(integration))

    override fun methodResponses(methodResponses: IResolvable) {
      cdkBuilder.methodResponses(methodResponses.let(IResolvable::unwrap))
    }

    override fun methodResponses(methodResponses: List<Any>) {
      cdkBuilder.methodResponses(methodResponses)
    }

    override fun methodResponses(vararg methodResponses: Any): Unit =
        methodResponses(methodResponses.toList())

    override fun operationName(operationName: String) {
      cdkBuilder.operationName(operationName)
    }

    override fun requestModels(requestModels: IResolvable) {
      cdkBuilder.requestModels(requestModels.let(IResolvable::unwrap))
    }

    override fun requestModels(requestModels: Map<String, String>) {
      cdkBuilder.requestModels(requestModels)
    }

    override fun requestParameters(requestParameters: IResolvable) {
      cdkBuilder.requestParameters(requestParameters.let(IResolvable::unwrap))
    }

    override fun requestParameters(requestParameters: Map<String, Any>) {
      cdkBuilder.requestParameters(requestParameters)
    }

    override fun requestValidatorId(requestValidatorId: String) {
      cdkBuilder.requestValidatorId(requestValidatorId)
    }

    override fun resourceId(resourceId: String) {
      cdkBuilder.resourceId(resourceId)
    }

    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnMethodProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.CfnMethodProps,
  ) : CdkObject(cdkObject), CfnMethodProps {
    override fun apiKeyRequired(): Any? = unwrap(this).getApiKeyRequired()

    override fun authorizationScopes(): List<String> = unwrap(this).getAuthorizationScopes() ?:
        emptyList()

    override fun authorizationType(): String? = unwrap(this).getAuthorizationType()

    override fun authorizerId(): String? = unwrap(this).getAuthorizerId()

    override fun httpMethod(): String = unwrap(this).getHttpMethod()

    override fun integration(): Any? = unwrap(this).getIntegration()

    override fun methodResponses(): Any? = unwrap(this).getMethodResponses()

    override fun operationName(): String? = unwrap(this).getOperationName()

    override fun requestModels(): Any? = unwrap(this).getRequestModels()

    override fun requestParameters(): Any? = unwrap(this).getRequestParameters()

    override fun requestValidatorId(): String? = unwrap(this).getRequestValidatorId()

    override fun resourceId(): String = unwrap(this).getResourceId()

    override fun restApiId(): String = unwrap(this).getRestApiId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMethodProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnMethodProps):
        CfnMethodProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMethodProps):
        software.amazon.awscdk.services.apigateway.CfnMethodProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigateway.CfnMethodProps
  }
}
