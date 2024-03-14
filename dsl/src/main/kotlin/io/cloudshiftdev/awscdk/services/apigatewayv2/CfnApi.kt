package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
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

public open class CfnApi internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnApi,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun apiKeySelectionExpression(): String? = unwrap(this).getApiKeySelectionExpression()

  public open fun apiKeySelectionExpression(`value`: String) {
    unwrap(this).setApiKeySelectionExpression(`value`)
  }

  public open fun attrApiEndpoint(): String = unwrap(this).getAttrApiEndpoint()

  public open fun attrApiId(): String = unwrap(this).getAttrApiId()

  public open fun basePath(): String? = unwrap(this).getBasePath()

  public open fun basePath(`value`: String) {
    unwrap(this).setBasePath(`value`)
  }

  public open fun body(): Any? = unwrap(this).getBody()

  public open fun body(`value`: Any) {
    unwrap(this).setBody(`value`)
  }

  public open fun bodyS3Location(): Any? = unwrap(this).getBodyS3Location()

  public open fun bodyS3Location(`value`: IResolvable) {
    unwrap(this).setBodyS3Location(`value`.let(IResolvable::unwrap))
  }

  public open fun bodyS3Location(`value`: BodyS3LocationProperty) {
    unwrap(this).setBodyS3Location(`value`.let(BodyS3LocationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("516fd4018fecd77062130379450ecc7c7c2af21005bc60eb117136b26b528d73")
  public open fun bodyS3Location(`value`: BodyS3LocationProperty.Builder.() -> Unit): Unit =
      bodyS3Location(BodyS3LocationProperty(`value`))

  public open fun corsConfiguration(): Any? = unwrap(this).getCorsConfiguration()

  public open fun corsConfiguration(`value`: IResolvable) {
    unwrap(this).setCorsConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun corsConfiguration(`value`: CorsProperty) {
    unwrap(this).setCorsConfiguration(`value`.let(CorsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3ab639bc3144a84f8657719bf89a43f1c70dbab0f8b7845a837715446cb569e0")
  public open fun corsConfiguration(`value`: CorsProperty.Builder.() -> Unit): Unit =
      corsConfiguration(CorsProperty(`value`))

  public open fun credentialsArn(): String? = unwrap(this).getCredentialsArn()

  public open fun credentialsArn(`value`: String) {
    unwrap(this).setCredentialsArn(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun disableExecuteApiEndpoint(): Any? = unwrap(this).getDisableExecuteApiEndpoint()

  public open fun disableExecuteApiEndpoint(`value`: Boolean) {
    unwrap(this).setDisableExecuteApiEndpoint(`value`)
  }

  public open fun disableExecuteApiEndpoint(`value`: IResolvable) {
    unwrap(this).setDisableExecuteApiEndpoint(`value`.let(IResolvable::unwrap))
  }

  public open fun disableSchemaValidation(): Any? = unwrap(this).getDisableSchemaValidation()

  public open fun disableSchemaValidation(`value`: Boolean) {
    unwrap(this).setDisableSchemaValidation(`value`)
  }

  public open fun disableSchemaValidation(`value`: IResolvable) {
    unwrap(this).setDisableSchemaValidation(`value`.let(IResolvable::unwrap))
  }

  public open fun failOnWarnings(): Any? = unwrap(this).getFailOnWarnings()

  public open fun failOnWarnings(`value`: Boolean) {
    unwrap(this).setFailOnWarnings(`value`)
  }

  public open fun failOnWarnings(`value`: IResolvable) {
    unwrap(this).setFailOnWarnings(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun protocolType(): String? = unwrap(this).getProtocolType()

  public open fun protocolType(`value`: String) {
    unwrap(this).setProtocolType(`value`)
  }

  public open fun routeKey(): String? = unwrap(this).getRouteKey()

  public open fun routeKey(`value`: String) {
    unwrap(this).setRouteKey(`value`)
  }

  public open fun routeSelectionExpression(): String? = unwrap(this).getRouteSelectionExpression()

  public open fun routeSelectionExpression(`value`: String) {
    unwrap(this).setRouteSelectionExpression(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun target(): String? = unwrap(this).getTarget()

  public open fun target(`value`: String) {
    unwrap(this).setTarget(`value`)
  }

  public open fun version(): String? = unwrap(this).getVersion()

  public open fun version(`value`: String) {
    unwrap(this).setVersion(`value`)
  }

  public interface Builder {
    public fun apiKeySelectionExpression(apiKeySelectionExpression: String)

    public fun basePath(basePath: String)

    public fun body(body: Any)

    public fun bodyS3Location(bodyS3Location: IResolvable)

    public fun bodyS3Location(bodyS3Location: BodyS3LocationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a90237a320cf324f8dd5e9a6a50761ea24608581d85aecde0a7e6bc58d2a5eb")
    public fun bodyS3Location(bodyS3Location: BodyS3LocationProperty.Builder.() -> Unit)

    public fun corsConfiguration(corsConfiguration: IResolvable)

    public fun corsConfiguration(corsConfiguration: CorsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f803d77858b6f8b040301865bed6b151f6f89b883c041b1bb83acae6a32dd00")
    public fun corsConfiguration(corsConfiguration: CorsProperty.Builder.() -> Unit)

    public fun credentialsArn(credentialsArn: String)

    public fun description(description: String)

    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean)

    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: IResolvable)

    public fun disableSchemaValidation(disableSchemaValidation: Boolean)

    public fun disableSchemaValidation(disableSchemaValidation: IResolvable)

    public fun failOnWarnings(failOnWarnings: Boolean)

    public fun failOnWarnings(failOnWarnings: IResolvable)

    public fun name(name: String)

    public fun protocolType(protocolType: String)

    public fun routeKey(routeKey: String)

    public fun routeSelectionExpression(routeSelectionExpression: String)

    public fun tags(tags: Map<String, String>)

    public fun target(target: String)

    public fun version(version: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.CfnApi.Builder =
        software.amazon.awscdk.services.apigatewayv2.CfnApi.Builder.create(scope, id)

    override fun apiKeySelectionExpression(apiKeySelectionExpression: String) {
      cdkBuilder.apiKeySelectionExpression(apiKeySelectionExpression)
    }

    override fun basePath(basePath: String) {
      cdkBuilder.basePath(basePath)
    }

    override fun body(body: Any) {
      cdkBuilder.body(body)
    }

    override fun bodyS3Location(bodyS3Location: IResolvable) {
      cdkBuilder.bodyS3Location(bodyS3Location.let(IResolvable::unwrap))
    }

    override fun bodyS3Location(bodyS3Location: BodyS3LocationProperty) {
      cdkBuilder.bodyS3Location(bodyS3Location.let(BodyS3LocationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a90237a320cf324f8dd5e9a6a50761ea24608581d85aecde0a7e6bc58d2a5eb")
    override fun bodyS3Location(bodyS3Location: BodyS3LocationProperty.Builder.() -> Unit): Unit =
        bodyS3Location(BodyS3LocationProperty(bodyS3Location))

    override fun corsConfiguration(corsConfiguration: IResolvable) {
      cdkBuilder.corsConfiguration(corsConfiguration.let(IResolvable::unwrap))
    }

    override fun corsConfiguration(corsConfiguration: CorsProperty) {
      cdkBuilder.corsConfiguration(corsConfiguration.let(CorsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f803d77858b6f8b040301865bed6b151f6f89b883c041b1bb83acae6a32dd00")
    override fun corsConfiguration(corsConfiguration: CorsProperty.Builder.() -> Unit): Unit =
        corsConfiguration(CorsProperty(corsConfiguration))

    override fun credentialsArn(credentialsArn: String) {
      cdkBuilder.credentialsArn(credentialsArn)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean) {
      cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
    }

    override fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: IResolvable) {
      cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint.let(IResolvable::unwrap))
    }

    override fun disableSchemaValidation(disableSchemaValidation: Boolean) {
      cdkBuilder.disableSchemaValidation(disableSchemaValidation)
    }

    override fun disableSchemaValidation(disableSchemaValidation: IResolvable) {
      cdkBuilder.disableSchemaValidation(disableSchemaValidation.let(IResolvable::unwrap))
    }

    override fun failOnWarnings(failOnWarnings: Boolean) {
      cdkBuilder.failOnWarnings(failOnWarnings)
    }

    override fun failOnWarnings(failOnWarnings: IResolvable) {
      cdkBuilder.failOnWarnings(failOnWarnings.let(IResolvable::unwrap))
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun protocolType(protocolType: String) {
      cdkBuilder.protocolType(protocolType)
    }

    override fun routeKey(routeKey: String) {
      cdkBuilder.routeKey(routeKey)
    }

    override fun routeSelectionExpression(routeSelectionExpression: String) {
      cdkBuilder.routeSelectionExpression(routeSelectionExpression)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun target(target: String) {
      cdkBuilder.target(target)
    }

    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnApi = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApi {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApi(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnApi): CfnApi =
        CfnApi(cdkObject)

    internal fun unwrap(wrapped: CfnApi): software.amazon.awscdk.services.apigatewayv2.CfnApi =
        wrapped.cdkObject
  }

  public interface BodyS3LocationProperty {
    public fun bucket(): String? = unwrap(this).getBucket()

    public fun etag(): String? = unwrap(this).getEtag()

    public fun key(): String? = unwrap(this).getKey()

    public fun version(): String? = unwrap(this).getVersion()

    public interface Builder {
      public fun bucket(bucket: String)

      public fun etag(etag: String)

      public fun key(key: String)

      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigatewayv2.CfnApi.BodyS3LocationProperty.Builder =
          software.amazon.awscdk.services.apigatewayv2.CfnApi.BodyS3LocationProperty.builder()

      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      override fun etag(etag: String) {
        cdkBuilder.etag(etag)
      }

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnApi.BodyS3LocationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apigatewayv2.CfnApi.BodyS3LocationProperty,
    ) : BodyS3LocationProperty {
      override fun bucket(): String? = unwrap(this).getBucket()

      override fun etag(): String? = unwrap(this).getEtag()

      override fun key(): String? = unwrap(this).getKey()

      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BodyS3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnApi.BodyS3LocationProperty):
          BodyS3LocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BodyS3LocationProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnApi.BodyS3LocationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CorsProperty {
    public fun allowCredentials(): Any? = unwrap(this).getAllowCredentials()

    public fun allowHeaders(): List<String> = unwrap(this).getAllowHeaders() ?: emptyList()

    public fun allowMethods(): List<String> = unwrap(this).getAllowMethods() ?: emptyList()

    public fun allowOrigins(): List<String> = unwrap(this).getAllowOrigins() ?: emptyList()

    public fun exposeHeaders(): List<String> = unwrap(this).getExposeHeaders() ?: emptyList()

    public fun maxAge(): Number? = unwrap(this).getMaxAge()

    public interface Builder {
      public fun allowCredentials(allowCredentials: Boolean)

      public fun allowCredentials(allowCredentials: IResolvable)

      public fun allowHeaders(allowHeaders: List<String>)

      public fun allowHeaders(vararg allowHeaders: String)

      public fun allowMethods(allowMethods: List<String>)

      public fun allowMethods(vararg allowMethods: String)

      public fun allowOrigins(allowOrigins: List<String>)

      public fun allowOrigins(vararg allowOrigins: String)

      public fun exposeHeaders(exposeHeaders: List<String>)

      public fun exposeHeaders(vararg exposeHeaders: String)

      public fun maxAge(maxAge: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigatewayv2.CfnApi.CorsProperty.Builder =
          software.amazon.awscdk.services.apigatewayv2.CfnApi.CorsProperty.builder()

      override fun allowCredentials(allowCredentials: Boolean) {
        cdkBuilder.allowCredentials(allowCredentials)
      }

      override fun allowCredentials(allowCredentials: IResolvable) {
        cdkBuilder.allowCredentials(allowCredentials.let(IResolvable::unwrap))
      }

      override fun allowHeaders(allowHeaders: List<String>) {
        cdkBuilder.allowHeaders(allowHeaders)
      }

      override fun allowHeaders(vararg allowHeaders: String): Unit =
          allowHeaders(allowHeaders.toList())

      override fun allowMethods(allowMethods: List<String>) {
        cdkBuilder.allowMethods(allowMethods)
      }

      override fun allowMethods(vararg allowMethods: String): Unit =
          allowMethods(allowMethods.toList())

      override fun allowOrigins(allowOrigins: List<String>) {
        cdkBuilder.allowOrigins(allowOrigins)
      }

      override fun allowOrigins(vararg allowOrigins: String): Unit =
          allowOrigins(allowOrigins.toList())

      override fun exposeHeaders(exposeHeaders: List<String>) {
        cdkBuilder.exposeHeaders(exposeHeaders)
      }

      override fun exposeHeaders(vararg exposeHeaders: String): Unit =
          exposeHeaders(exposeHeaders.toList())

      override fun maxAge(maxAge: Number) {
        cdkBuilder.maxAge(maxAge)
      }

      public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnApi.CorsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnApi.CorsProperty,
    ) : CorsProperty {
      override fun allowCredentials(): Any? = unwrap(this).getAllowCredentials()

      override fun allowHeaders(): List<String> = unwrap(this).getAllowHeaders() ?: emptyList()

      override fun allowMethods(): List<String> = unwrap(this).getAllowMethods() ?: emptyList()

      override fun allowOrigins(): List<String> = unwrap(this).getAllowOrigins() ?: emptyList()

      override fun exposeHeaders(): List<String> = unwrap(this).getExposeHeaders() ?: emptyList()

      override fun maxAge(): Number? = unwrap(this).getMaxAge()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CorsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnApi.CorsProperty):
          CorsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CorsProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnApi.CorsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
