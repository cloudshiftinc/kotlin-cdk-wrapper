package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnMethod internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigateway.CfnMethod,
) : CfnResource(cdkObject), IInspectable {
  public open fun apiKeyRequired(): Any? = unwrap(this).getApiKeyRequired()

  public open fun apiKeyRequired(`value`: Boolean) {
    unwrap(this).setApiKeyRequired(`value`)
  }

  public open fun apiKeyRequired(`value`: IResolvable) {
    unwrap(this).setApiKeyRequired(`value`.let(IResolvable::unwrap))
  }

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

  public open fun httpMethod(): String = unwrap(this).getHttpMethod()

  public open fun httpMethod(`value`: String) {
    unwrap(this).setHttpMethod(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun integration(): Any? = unwrap(this).getIntegration()

  public open fun integration(`value`: IResolvable) {
    unwrap(this).setIntegration(`value`.let(IResolvable::unwrap))
  }

  public open fun integration(`value`: IntegrationProperty) {
    unwrap(this).setIntegration(`value`.let(IntegrationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("93caab136aa7119afd0bda486850265386e56e299dd24fb2bc2bff74bbffbd08")
  public open fun integration(`value`: IntegrationProperty.Builder.() -> Unit): Unit =
      integration(IntegrationProperty(`value`))

  public open fun methodResponses(): Any? = unwrap(this).getMethodResponses()

  public open fun methodResponses(`value`: IResolvable) {
    unwrap(this).setMethodResponses(`value`.let(IResolvable::unwrap))
  }

  public open fun methodResponses(__idx_ac66f0: List<Any>) {
    unwrap(this).setMethodResponses(__idx_ac66f0)
  }

  public open fun methodResponses(vararg __idx_ac66f0: Any): Unit =
      methodResponses(__idx_ac66f0.toList())

  public open fun operationName(): String? = unwrap(this).getOperationName()

  public open fun operationName(`value`: String) {
    unwrap(this).setOperationName(`value`)
  }

  public open fun requestModels(): Any? = unwrap(this).getRequestModels()

  public open fun requestModels(`value`: IResolvable) {
    unwrap(this).setRequestModels(`value`.let(IResolvable::unwrap))
  }

  public open fun requestModels(`value`: Map<String, String>) {
    unwrap(this).setRequestModels(`value`)
  }

  public open fun requestParameters(): Any? = unwrap(this).getRequestParameters()

  public open fun requestParameters(`value`: IResolvable) {
    unwrap(this).setRequestParameters(`value`.let(IResolvable::unwrap))
  }

  public open fun requestParameters(__item_ac66f0: Map<String, Any>) {
    unwrap(this).setRequestParameters(__item_ac66f0)
  }

  public open fun requestValidatorId(): String? = unwrap(this).getRequestValidatorId()

  public open fun requestValidatorId(`value`: String) {
    unwrap(this).setRequestValidatorId(`value`)
  }

  public open fun resourceId(): String = unwrap(this).getResourceId()

  public open fun resourceId(`value`: String) {
    unwrap(this).setResourceId(`value`)
  }

  public open fun restApiId(): String = unwrap(this).getRestApiId()

  public open fun restApiId(`value`: String) {
    unwrap(this).setRestApiId(`value`)
  }

  public interface Builder {
    public fun apiKeyRequired(apiKeyRequired: Boolean)

    public fun apiKeyRequired(apiKeyRequired: IResolvable)

    public fun authorizationScopes(authorizationScopes: List<String>)

    public fun authorizationScopes(vararg authorizationScopes: String)

    public fun authorizationType(authorizationType: String)

    public fun authorizerId(authorizerId: String)

    public fun httpMethod(httpMethod: String)

    public fun integration(integration: IResolvable)

    public fun integration(integration: IntegrationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f56da9b626b21a48f48534fdb62818e4eb7da26a97678b9a9f5446258bd8e74c")
    public fun integration(integration: IntegrationProperty.Builder.() -> Unit)

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnMethod.Builder =
        software.amazon.awscdk.services.apigateway.CfnMethod.Builder.create(scope, id)

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

    override fun integration(integration: IntegrationProperty) {
      cdkBuilder.integration(integration.let(IntegrationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f56da9b626b21a48f48534fdb62818e4eb7da26a97678b9a9f5446258bd8e74c")
    override fun integration(integration: IntegrationProperty.Builder.() -> Unit): Unit =
        integration(IntegrationProperty(integration))

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

    public fun build(): software.amazon.awscdk.services.apigateway.CfnMethod = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMethod {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMethod(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnMethod): CfnMethod =
        CfnMethod(cdkObject)

    internal fun unwrap(wrapped: CfnMethod): software.amazon.awscdk.services.apigateway.CfnMethod =
        wrapped.cdkObject
  }

  public interface MethodResponseProperty {
    public fun responseModels(): Any? = unwrap(this).getResponseModels()

    public fun responseParameters(): Any? = unwrap(this).getResponseParameters()

    public fun statusCode(): String

    public interface Builder {
      public fun responseModels(responseModels: IResolvable)

      public fun responseModels(responseModels: Map<String, String>)

      public fun responseParameters(responseParameters: IResolvable)

      public fun responseParameters(responseParameters: Map<String, Any>)

      public fun statusCode(statusCode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigateway.CfnMethod.MethodResponseProperty.Builder =
          software.amazon.awscdk.services.apigateway.CfnMethod.MethodResponseProperty.builder()

      override fun responseModels(responseModels: IResolvable) {
        cdkBuilder.responseModels(responseModels.let(IResolvable::unwrap))
      }

      override fun responseModels(responseModels: Map<String, String>) {
        cdkBuilder.responseModels(responseModels)
      }

      override fun responseParameters(responseParameters: IResolvable) {
        cdkBuilder.responseParameters(responseParameters.let(IResolvable::unwrap))
      }

      override fun responseParameters(responseParameters: Map<String, Any>) {
        cdkBuilder.responseParameters(responseParameters)
      }

      override fun statusCode(statusCode: String) {
        cdkBuilder.statusCode(statusCode)
      }

      public fun build():
          software.amazon.awscdk.services.apigateway.CfnMethod.MethodResponseProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apigateway.CfnMethod.MethodResponseProperty,
    ) : MethodResponseProperty {
      override fun responseModels(): Any? = unwrap(this).getResponseModels()

      override fun responseParameters(): Any? = unwrap(this).getResponseParameters()

      override fun statusCode(): String = unwrap(this).getStatusCode()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MethodResponseProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnMethod.MethodResponseProperty):
          MethodResponseProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MethodResponseProperty):
          software.amazon.awscdk.services.apigateway.CfnMethod.MethodResponseProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface IntegrationProperty {
    public fun cacheKeyParameters(): List<String> = unwrap(this).getCacheKeyParameters() ?:
        emptyList()

    public fun cacheNamespace(): String? = unwrap(this).getCacheNamespace()

    public fun connectionId(): String? = unwrap(this).getConnectionId()

    public fun connectionType(): String? = unwrap(this).getConnectionType()

    public fun contentHandling(): String? = unwrap(this).getContentHandling()

    public fun credentials(): String? = unwrap(this).getCredentials()

    public fun integrationHttpMethod(): String? = unwrap(this).getIntegrationHttpMethod()

    public fun integrationResponses(): Any? = unwrap(this).getIntegrationResponses()

    public fun passthroughBehavior(): String? = unwrap(this).getPassthroughBehavior()

    public fun requestParameters(): Any? = unwrap(this).getRequestParameters()

    public fun requestTemplates(): Any? = unwrap(this).getRequestTemplates()

    public fun timeoutInMillis(): Number? = unwrap(this).getTimeoutInMillis()

    public fun type(): String

    public fun uri(): String? = unwrap(this).getUri()

    public interface Builder {
      public fun cacheKeyParameters(cacheKeyParameters: List<String>)

      public fun cacheKeyParameters(vararg cacheKeyParameters: String)

      public fun cacheNamespace(cacheNamespace: String)

      public fun connectionId(connectionId: String)

      public fun connectionType(connectionType: String)

      public fun contentHandling(contentHandling: String)

      public fun credentials(credentials: String)

      public fun integrationHttpMethod(integrationHttpMethod: String)

      public fun integrationResponses(integrationResponses: IResolvable)

      public fun integrationResponses(integrationResponses: List<Any>)

      public fun integrationResponses(vararg integrationResponses: Any)

      public fun passthroughBehavior(passthroughBehavior: String)

      public fun requestParameters(requestParameters: IResolvable)

      public fun requestParameters(requestParameters: Map<String, String>)

      public fun requestTemplates(requestTemplates: IResolvable)

      public fun requestTemplates(requestTemplates: Map<String, String>)

      public fun timeoutInMillis(timeoutInMillis: Number)

      public fun type(type: String)

      public fun uri(uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigateway.CfnMethod.IntegrationProperty.Builder =
          software.amazon.awscdk.services.apigateway.CfnMethod.IntegrationProperty.builder()

      override fun cacheKeyParameters(cacheKeyParameters: List<String>) {
        cdkBuilder.cacheKeyParameters(cacheKeyParameters)
      }

      override fun cacheKeyParameters(vararg cacheKeyParameters: String): Unit =
          cacheKeyParameters(cacheKeyParameters.toList())

      override fun cacheNamespace(cacheNamespace: String) {
        cdkBuilder.cacheNamespace(cacheNamespace)
      }

      override fun connectionId(connectionId: String) {
        cdkBuilder.connectionId(connectionId)
      }

      override fun connectionType(connectionType: String) {
        cdkBuilder.connectionType(connectionType)
      }

      override fun contentHandling(contentHandling: String) {
        cdkBuilder.contentHandling(contentHandling)
      }

      override fun credentials(credentials: String) {
        cdkBuilder.credentials(credentials)
      }

      override fun integrationHttpMethod(integrationHttpMethod: String) {
        cdkBuilder.integrationHttpMethod(integrationHttpMethod)
      }

      override fun integrationResponses(integrationResponses: IResolvable) {
        cdkBuilder.integrationResponses(integrationResponses.let(IResolvable::unwrap))
      }

      override fun integrationResponses(integrationResponses: List<Any>) {
        cdkBuilder.integrationResponses(integrationResponses)
      }

      override fun integrationResponses(vararg integrationResponses: Any): Unit =
          integrationResponses(integrationResponses.toList())

      override fun passthroughBehavior(passthroughBehavior: String) {
        cdkBuilder.passthroughBehavior(passthroughBehavior)
      }

      override fun requestParameters(requestParameters: IResolvable) {
        cdkBuilder.requestParameters(requestParameters.let(IResolvable::unwrap))
      }

      override fun requestParameters(requestParameters: Map<String, String>) {
        cdkBuilder.requestParameters(requestParameters)
      }

      override fun requestTemplates(requestTemplates: IResolvable) {
        cdkBuilder.requestTemplates(requestTemplates.let(IResolvable::unwrap))
      }

      override fun requestTemplates(requestTemplates: Map<String, String>) {
        cdkBuilder.requestTemplates(requestTemplates)
      }

      override fun timeoutInMillis(timeoutInMillis: Number) {
        cdkBuilder.timeoutInMillis(timeoutInMillis)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      override fun uri(uri: String) {
        cdkBuilder.uri(uri)
      }

      public fun build(): software.amazon.awscdk.services.apigateway.CfnMethod.IntegrationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apigateway.CfnMethod.IntegrationProperty,
    ) : IntegrationProperty {
      override fun cacheKeyParameters(): List<String> = unwrap(this).getCacheKeyParameters() ?:
          emptyList()

      override fun cacheNamespace(): String? = unwrap(this).getCacheNamespace()

      override fun connectionId(): String? = unwrap(this).getConnectionId()

      override fun connectionType(): String? = unwrap(this).getConnectionType()

      override fun contentHandling(): String? = unwrap(this).getContentHandling()

      override fun credentials(): String? = unwrap(this).getCredentials()

      override fun integrationHttpMethod(): String? = unwrap(this).getIntegrationHttpMethod()

      override fun integrationResponses(): Any? = unwrap(this).getIntegrationResponses()

      override fun passthroughBehavior(): String? = unwrap(this).getPassthroughBehavior()

      override fun requestParameters(): Any? = unwrap(this).getRequestParameters()

      override fun requestTemplates(): Any? = unwrap(this).getRequestTemplates()

      override fun timeoutInMillis(): Number? = unwrap(this).getTimeoutInMillis()

      override fun type(): String = unwrap(this).getType()

      override fun uri(): String? = unwrap(this).getUri()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IntegrationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnMethod.IntegrationProperty):
          IntegrationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IntegrationProperty):
          software.amazon.awscdk.services.apigateway.CfnMethod.IntegrationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface IntegrationResponseProperty {
    public fun contentHandling(): String? = unwrap(this).getContentHandling()

    public fun responseParameters(): Any? = unwrap(this).getResponseParameters()

    public fun responseTemplates(): Any? = unwrap(this).getResponseTemplates()

    public fun selectionPattern(): String? = unwrap(this).getSelectionPattern()

    public fun statusCode(): String

    public interface Builder {
      public fun contentHandling(contentHandling: String)

      public fun responseParameters(responseParameters: IResolvable)

      public fun responseParameters(responseParameters: Map<String, String>)

      public fun responseTemplates(responseTemplates: IResolvable)

      public fun responseTemplates(responseTemplates: Map<String, String>)

      public fun selectionPattern(selectionPattern: String)

      public fun statusCode(statusCode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigateway.CfnMethod.IntegrationResponseProperty.Builder =
          software.amazon.awscdk.services.apigateway.CfnMethod.IntegrationResponseProperty.builder()

      override fun contentHandling(contentHandling: String) {
        cdkBuilder.contentHandling(contentHandling)
      }

      override fun responseParameters(responseParameters: IResolvable) {
        cdkBuilder.responseParameters(responseParameters.let(IResolvable::unwrap))
      }

      override fun responseParameters(responseParameters: Map<String, String>) {
        cdkBuilder.responseParameters(responseParameters)
      }

      override fun responseTemplates(responseTemplates: IResolvable) {
        cdkBuilder.responseTemplates(responseTemplates.let(IResolvable::unwrap))
      }

      override fun responseTemplates(responseTemplates: Map<String, String>) {
        cdkBuilder.responseTemplates(responseTemplates)
      }

      override fun selectionPattern(selectionPattern: String) {
        cdkBuilder.selectionPattern(selectionPattern)
      }

      override fun statusCode(statusCode: String) {
        cdkBuilder.statusCode(statusCode)
      }

      public fun build():
          software.amazon.awscdk.services.apigateway.CfnMethod.IntegrationResponseProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apigateway.CfnMethod.IntegrationResponseProperty,
    ) : IntegrationResponseProperty {
      override fun contentHandling(): String? = unwrap(this).getContentHandling()

      override fun responseParameters(): Any? = unwrap(this).getResponseParameters()

      override fun responseTemplates(): Any? = unwrap(this).getResponseTemplates()

      override fun selectionPattern(): String? = unwrap(this).getSelectionPattern()

      override fun statusCode(): String = unwrap(this).getStatusCode()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IntegrationResponseProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnMethod.IntegrationResponseProperty):
          IntegrationResponseProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IntegrationResponseProperty):
          software.amazon.awscdk.services.apigateway.CfnMethod.IntegrationResponseProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
