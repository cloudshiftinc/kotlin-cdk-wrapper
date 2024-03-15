@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sam

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApi internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sam.CfnApi,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun accessLogSetting(): Any? = unwrap(this).getAccessLogSetting()

  public open fun accessLogSetting(`value`: IResolvable) {
    unwrap(this).setAccessLogSetting(`value`.let(IResolvable::unwrap))
  }

  public open fun accessLogSetting(`value`: AccessLogSettingProperty) {
    unwrap(this).setAccessLogSetting(`value`.let(AccessLogSettingProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("393ac7ed605f5b0adcf1325abafdd4d5af2be3009a8999b8cc1982a1f4f3d2e3")
  public open fun accessLogSetting(`value`: AccessLogSettingProperty.Builder.() -> Unit): Unit =
      accessLogSetting(AccessLogSettingProperty(`value`))

  public open fun alwaysDeploy(): Any? = unwrap(this).getAlwaysDeploy()

  public open fun alwaysDeploy(`value`: Boolean) {
    unwrap(this).setAlwaysDeploy(`value`)
  }

  public open fun alwaysDeploy(`value`: IResolvable) {
    unwrap(this).setAlwaysDeploy(`value`.let(IResolvable::unwrap))
  }

  public open fun auth(): Any? = unwrap(this).getAuth()

  public open fun auth(`value`: IResolvable) {
    unwrap(this).setAuth(`value`.let(IResolvable::unwrap))
  }

  public open fun auth(`value`: AuthProperty) {
    unwrap(this).setAuth(`value`.let(AuthProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1dc420ab76676290edde7e6b024b33cf581b9a78c14bf721ff0ffa5e12fa34a6")
  public open fun auth(`value`: AuthProperty.Builder.() -> Unit): Unit = auth(AuthProperty(`value`))

  public open fun binaryMediaTypes(): List<String> = unwrap(this).getBinaryMediaTypes() ?:
      emptyList()

  public open fun binaryMediaTypes(`value`: List<String>) {
    unwrap(this).setBinaryMediaTypes(`value`)
  }

  public open fun binaryMediaTypes(vararg `value`: String): Unit =
      binaryMediaTypes(`value`.toList())

  public open fun cacheClusterEnabled(): Any? = unwrap(this).getCacheClusterEnabled()

  public open fun cacheClusterEnabled(`value`: Boolean) {
    unwrap(this).setCacheClusterEnabled(`value`)
  }

  public open fun cacheClusterEnabled(`value`: IResolvable) {
    unwrap(this).setCacheClusterEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun cacheClusterSize(): String? = unwrap(this).getCacheClusterSize()

  public open fun cacheClusterSize(`value`: String) {
    unwrap(this).setCacheClusterSize(`value`)
  }

  public open fun canarySetting(): Any? = unwrap(this).getCanarySetting()

  public open fun canarySetting(`value`: IResolvable) {
    unwrap(this).setCanarySetting(`value`.let(IResolvable::unwrap))
  }

  public open fun canarySetting(`value`: CanarySettingProperty) {
    unwrap(this).setCanarySetting(`value`.let(CanarySettingProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dcc89d226972d19e6b2820534716ef8854b7108a624d9c32dd9e5889a076af01")
  public open fun canarySetting(`value`: CanarySettingProperty.Builder.() -> Unit): Unit =
      canarySetting(CanarySettingProperty(`value`))

  public open fun cors(): Any? = unwrap(this).getCors()

  public open fun cors(`value`: String) {
    unwrap(this).setCors(`value`)
  }

  public open fun cors(`value`: IResolvable) {
    unwrap(this).setCors(`value`.let(IResolvable::unwrap))
  }

  public open fun cors(`value`: CorsConfigurationProperty) {
    unwrap(this).setCors(`value`.let(CorsConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a72f8858bced5e6f72696c4f4b9aa7ca0401f4bff1636487eb9c0f1e922f14bf")
  public open fun cors(`value`: CorsConfigurationProperty.Builder.() -> Unit): Unit =
      cors(CorsConfigurationProperty(`value`))

  public open fun definitionBody(): Any? = unwrap(this).getDefinitionBody()

  public open fun definitionBody(`value`: Any) {
    unwrap(this).setDefinitionBody(`value`)
  }

  public open fun definitionUri(): Any? = unwrap(this).getDefinitionUri()

  public open fun definitionUri(`value`: String) {
    unwrap(this).setDefinitionUri(`value`)
  }

  public open fun definitionUri(`value`: IResolvable) {
    unwrap(this).setDefinitionUri(`value`.let(IResolvable::unwrap))
  }

  public open fun definitionUri(`value`: S3LocationProperty) {
    unwrap(this).setDefinitionUri(`value`.let(S3LocationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6d859ebe21ecc4a00edb60e88a3b9504d6fd13c60939b66b7b4a6d08afda1499")
  public open fun definitionUri(`value`: S3LocationProperty.Builder.() -> Unit): Unit =
      definitionUri(S3LocationProperty(`value`))

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

  public open fun domain(): Any? = unwrap(this).getDomain()

  public open fun domain(`value`: IResolvable) {
    unwrap(this).setDomain(`value`.let(IResolvable::unwrap))
  }

  public open fun domain(`value`: DomainConfigurationProperty) {
    unwrap(this).setDomain(`value`.let(DomainConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ff802c8511228905f18f6659c460de0209f4bd3e53750312a5d4ed9bcd2c84be")
  public open fun domain(`value`: DomainConfigurationProperty.Builder.() -> Unit): Unit =
      domain(DomainConfigurationProperty(`value`))

  public open fun endpointConfiguration(): Any? = unwrap(this).getEndpointConfiguration()

  public open fun endpointConfiguration(`value`: String) {
    unwrap(this).setEndpointConfiguration(`value`)
  }

  public open fun endpointConfiguration(`value`: IResolvable) {
    unwrap(this).setEndpointConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun endpointConfiguration(`value`: EndpointConfigurationProperty) {
    unwrap(this).setEndpointConfiguration(`value`.let(EndpointConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d179a75be1c67ae8fdf071f7912a5a1e0f6eaf53593ed2c991ae331c588cdb1f")
  public open fun endpointConfiguration(`value`: EndpointConfigurationProperty.Builder.() -> Unit):
      Unit = endpointConfiguration(EndpointConfigurationProperty(`value`))

  public open fun gatewayResponses(): Any? = unwrap(this).getGatewayResponses()

  public open fun gatewayResponses(`value`: Any) {
    unwrap(this).setGatewayResponses(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun methodSettings(): Any? = unwrap(this).getMethodSettings()

  public open fun methodSettings(`this`: List<Any>) {
    unwrap(this).setMethodSettings(`this`)
  }

  public open fun methodSettings(vararg `this`: Any): Unit = methodSettings(`this`.toList())

  public open fun methodSettings(`value`: IResolvable) {
    unwrap(this).setMethodSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun minimumCompressionSize(): Number? = unwrap(this).getMinimumCompressionSize()

  public open fun minimumCompressionSize(`value`: Number) {
    unwrap(this).setMinimumCompressionSize(`value`)
  }

  public open fun models(): Any? = unwrap(this).getModels()

  public open fun models(`value`: Any) {
    unwrap(this).setModels(`value`)
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun openApiVersion(): String? = unwrap(this).getOpenApiVersion()

  public open fun openApiVersion(`value`: String) {
    unwrap(this).setOpenApiVersion(`value`)
  }

  public open fun stageName(): String = unwrap(this).getStageName()

  public open fun stageName(`value`: String) {
    unwrap(this).setStageName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun tracingEnabled(): Any? = unwrap(this).getTracingEnabled()

  public open fun tracingEnabled(`value`: Boolean) {
    unwrap(this).setTracingEnabled(`value`)
  }

  public open fun tracingEnabled(`value`: IResolvable) {
    unwrap(this).setTracingEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun variables(): Any? = unwrap(this).getVariables()

  public open fun variables(`value`: IResolvable) {
    unwrap(this).setVariables(`value`.let(IResolvable::unwrap))
  }

  public open fun variables(`value`: Map<String, String>) {
    unwrap(this).setVariables(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun accessLogSetting(accessLogSetting: IResolvable)

    public fun accessLogSetting(accessLogSetting: AccessLogSettingProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52612223022ccec38c43ac9351255974902491f312d6918c11a9d290055c901b")
    public fun accessLogSetting(accessLogSetting: AccessLogSettingProperty.Builder.() -> Unit)

    public fun alwaysDeploy(alwaysDeploy: Boolean)

    public fun alwaysDeploy(alwaysDeploy: IResolvable)

    public fun auth(auth: IResolvable)

    public fun auth(auth: AuthProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eef102474deb1afafa7bee8b60a1d1ad656642b6349a1841fb68f20c5918da3e")
    public fun auth(auth: AuthProperty.Builder.() -> Unit)

    public fun binaryMediaTypes(binaryMediaTypes: List<String>)

    public fun binaryMediaTypes(vararg binaryMediaTypes: String)

    public fun cacheClusterEnabled(cacheClusterEnabled: Boolean)

    public fun cacheClusterEnabled(cacheClusterEnabled: IResolvable)

    public fun cacheClusterSize(cacheClusterSize: String)

    public fun canarySetting(canarySetting: IResolvable)

    public fun canarySetting(canarySetting: CanarySettingProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ea7c193c37e4b13a08f908abfe2bc585e2a53618931c5217f48e1f86e4d2ce0")
    public fun canarySetting(canarySetting: CanarySettingProperty.Builder.() -> Unit)

    public fun cors(cors: String)

    public fun cors(cors: IResolvable)

    public fun cors(cors: CorsConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("adfa41b475eaeb69fcd439a3668ae3587644aa8146e89bc4c2a5edc5337a9d56")
    public fun cors(cors: CorsConfigurationProperty.Builder.() -> Unit)

    public fun definitionBody(definitionBody: Any)

    public fun definitionUri(definitionUri: String)

    public fun definitionUri(definitionUri: IResolvable)

    public fun definitionUri(definitionUri: S3LocationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d135ac60277de4e793e9bef2b07c66a1b1ccf161cbff05385a2407b8313fe1c0")
    public fun definitionUri(definitionUri: S3LocationProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean)

    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: IResolvable)

    public fun domain(domain: IResolvable)

    public fun domain(domain: DomainConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6bbb0fd7a23bff928152920158240788d0ff1c57ea6e8ff72e277dc17f16d9ea")
    public fun domain(domain: DomainConfigurationProperty.Builder.() -> Unit)

    public fun endpointConfiguration(endpointConfiguration: String)

    public fun endpointConfiguration(endpointConfiguration: IResolvable)

    public fun endpointConfiguration(endpointConfiguration: EndpointConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("12dcc1a5089b655c37ec371ca5d7f786183e6a392afbf6c16de09b90f15afdb6")
    public
        fun endpointConfiguration(endpointConfiguration: EndpointConfigurationProperty.Builder.() -> Unit)

    public fun gatewayResponses(gatewayResponses: Any)

    public fun methodSettings(methodSettings: List<Any>)

    public fun methodSettings(vararg methodSettings: Any)

    public fun methodSettings(methodSettings: IResolvable)

    public fun minimumCompressionSize(minimumCompressionSize: Number)

    public fun models(models: Any)

    public fun name(name: String)

    public fun openApiVersion(openApiVersion: String)

    public fun stageName(stageName: String)

    public fun tags(tags: Map<String, String>)

    public fun tracingEnabled(tracingEnabled: Boolean)

    public fun tracingEnabled(tracingEnabled: IResolvable)

    public fun variables(variables: IResolvable)

    public fun variables(variables: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sam.CfnApi.Builder =
        software.amazon.awscdk.services.sam.CfnApi.Builder.create(scope, id)

    override fun accessLogSetting(accessLogSetting: IResolvable) {
      cdkBuilder.accessLogSetting(accessLogSetting.let(IResolvable::unwrap))
    }

    override fun accessLogSetting(accessLogSetting: AccessLogSettingProperty) {
      cdkBuilder.accessLogSetting(accessLogSetting.let(AccessLogSettingProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52612223022ccec38c43ac9351255974902491f312d6918c11a9d290055c901b")
    override fun accessLogSetting(accessLogSetting: AccessLogSettingProperty.Builder.() -> Unit):
        Unit = accessLogSetting(AccessLogSettingProperty(accessLogSetting))

    override fun alwaysDeploy(alwaysDeploy: Boolean) {
      cdkBuilder.alwaysDeploy(alwaysDeploy)
    }

    override fun alwaysDeploy(alwaysDeploy: IResolvable) {
      cdkBuilder.alwaysDeploy(alwaysDeploy.let(IResolvable::unwrap))
    }

    override fun auth(auth: IResolvable) {
      cdkBuilder.auth(auth.let(IResolvable::unwrap))
    }

    override fun auth(auth: AuthProperty) {
      cdkBuilder.auth(auth.let(AuthProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eef102474deb1afafa7bee8b60a1d1ad656642b6349a1841fb68f20c5918da3e")
    override fun auth(auth: AuthProperty.Builder.() -> Unit): Unit = auth(AuthProperty(auth))

    override fun binaryMediaTypes(binaryMediaTypes: List<String>) {
      cdkBuilder.binaryMediaTypes(binaryMediaTypes)
    }

    override fun binaryMediaTypes(vararg binaryMediaTypes: String): Unit =
        binaryMediaTypes(binaryMediaTypes.toList())

    override fun cacheClusterEnabled(cacheClusterEnabled: Boolean) {
      cdkBuilder.cacheClusterEnabled(cacheClusterEnabled)
    }

    override fun cacheClusterEnabled(cacheClusterEnabled: IResolvable) {
      cdkBuilder.cacheClusterEnabled(cacheClusterEnabled.let(IResolvable::unwrap))
    }

    override fun cacheClusterSize(cacheClusterSize: String) {
      cdkBuilder.cacheClusterSize(cacheClusterSize)
    }

    override fun canarySetting(canarySetting: IResolvable) {
      cdkBuilder.canarySetting(canarySetting.let(IResolvable::unwrap))
    }

    override fun canarySetting(canarySetting: CanarySettingProperty) {
      cdkBuilder.canarySetting(canarySetting.let(CanarySettingProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ea7c193c37e4b13a08f908abfe2bc585e2a53618931c5217f48e1f86e4d2ce0")
    override fun canarySetting(canarySetting: CanarySettingProperty.Builder.() -> Unit): Unit =
        canarySetting(CanarySettingProperty(canarySetting))

    override fun cors(cors: String) {
      cdkBuilder.cors(cors)
    }

    override fun cors(cors: IResolvable) {
      cdkBuilder.cors(cors.let(IResolvable::unwrap))
    }

    override fun cors(cors: CorsConfigurationProperty) {
      cdkBuilder.cors(cors.let(CorsConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("adfa41b475eaeb69fcd439a3668ae3587644aa8146e89bc4c2a5edc5337a9d56")
    override fun cors(cors: CorsConfigurationProperty.Builder.() -> Unit): Unit =
        cors(CorsConfigurationProperty(cors))

    override fun definitionBody(definitionBody: Any) {
      cdkBuilder.definitionBody(definitionBody)
    }

    override fun definitionUri(definitionUri: String) {
      cdkBuilder.definitionUri(definitionUri)
    }

    override fun definitionUri(definitionUri: IResolvable) {
      cdkBuilder.definitionUri(definitionUri.let(IResolvable::unwrap))
    }

    override fun definitionUri(definitionUri: S3LocationProperty) {
      cdkBuilder.definitionUri(definitionUri.let(S3LocationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d135ac60277de4e793e9bef2b07c66a1b1ccf161cbff05385a2407b8313fe1c0")
    override fun definitionUri(definitionUri: S3LocationProperty.Builder.() -> Unit): Unit =
        definitionUri(S3LocationProperty(definitionUri))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean) {
      cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
    }

    override fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: IResolvable) {
      cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint.let(IResolvable::unwrap))
    }

    override fun domain(domain: IResolvable) {
      cdkBuilder.domain(domain.let(IResolvable::unwrap))
    }

    override fun domain(domain: DomainConfigurationProperty) {
      cdkBuilder.domain(domain.let(DomainConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6bbb0fd7a23bff928152920158240788d0ff1c57ea6e8ff72e277dc17f16d9ea")
    override fun domain(domain: DomainConfigurationProperty.Builder.() -> Unit): Unit =
        domain(DomainConfigurationProperty(domain))

    override fun endpointConfiguration(endpointConfiguration: String) {
      cdkBuilder.endpointConfiguration(endpointConfiguration)
    }

    override fun endpointConfiguration(endpointConfiguration: IResolvable) {
      cdkBuilder.endpointConfiguration(endpointConfiguration.let(IResolvable::unwrap))
    }

    override fun endpointConfiguration(endpointConfiguration: EndpointConfigurationProperty) {
      cdkBuilder.endpointConfiguration(endpointConfiguration.let(EndpointConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("12dcc1a5089b655c37ec371ca5d7f786183e6a392afbf6c16de09b90f15afdb6")
    override
        fun endpointConfiguration(endpointConfiguration: EndpointConfigurationProperty.Builder.() -> Unit):
        Unit = endpointConfiguration(EndpointConfigurationProperty(endpointConfiguration))

    override fun gatewayResponses(gatewayResponses: Any) {
      cdkBuilder.gatewayResponses(gatewayResponses)
    }

    override fun methodSettings(methodSettings: List<Any>) {
      cdkBuilder.methodSettings(methodSettings)
    }

    override fun methodSettings(vararg methodSettings: Any): Unit =
        methodSettings(methodSettings.toList())

    override fun methodSettings(methodSettings: IResolvable) {
      cdkBuilder.methodSettings(methodSettings.let(IResolvable::unwrap))
    }

    override fun minimumCompressionSize(minimumCompressionSize: Number) {
      cdkBuilder.minimumCompressionSize(minimumCompressionSize)
    }

    override fun models(models: Any) {
      cdkBuilder.models(models)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun openApiVersion(openApiVersion: String) {
      cdkBuilder.openApiVersion(openApiVersion)
    }

    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun tracingEnabled(tracingEnabled: Boolean) {
      cdkBuilder.tracingEnabled(tracingEnabled)
    }

    override fun tracingEnabled(tracingEnabled: IResolvable) {
      cdkBuilder.tracingEnabled(tracingEnabled.let(IResolvable::unwrap))
    }

    override fun variables(variables: IResolvable) {
      cdkBuilder.variables(variables.let(IResolvable::unwrap))
    }

    override fun variables(variables: Map<String, String>) {
      cdkBuilder.variables(variables)
    }

    public fun build(): software.amazon.awscdk.services.sam.CfnApi = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sam.CfnApi.CFN_RESOURCE_TYPE_NAME

    public val REQUIRED_TRANSFORM: String =
        software.amazon.awscdk.services.sam.CfnApi.REQUIRED_TRANSFORM

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApi {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApi(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnApi): CfnApi =
        CfnApi(cdkObject)

    internal fun unwrap(wrapped: CfnApi): software.amazon.awscdk.services.sam.CfnApi =
        wrapped.cdkObject
  }

  public interface AccessLogSettingProperty {
    public fun destinationArn(): String? = unwrap(this).getDestinationArn()

    public fun format(): String? = unwrap(this).getFormat()

    @CdkDslMarker
    public interface Builder {
      public fun destinationArn(destinationArn: String)

      public fun format(format: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnApi.AccessLogSettingProperty.Builder =
          software.amazon.awscdk.services.sam.CfnApi.AccessLogSettingProperty.builder()

      override fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
      }

      override fun format(format: String) {
        cdkBuilder.format(format)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnApi.AccessLogSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnApi.AccessLogSettingProperty,
    ) : CdkObject(cdkObject), AccessLogSettingProperty {
      override fun destinationArn(): String? = unwrap(this).getDestinationArn()

      override fun format(): String? = unwrap(this).getFormat()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AccessLogSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnApi.AccessLogSettingProperty):
          AccessLogSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessLogSettingProperty):
          software.amazon.awscdk.services.sam.CfnApi.AccessLogSettingProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnApi.AccessLogSettingProperty
    }
  }

  public interface Route53ConfigurationProperty {
    public fun distributedDomainName(): String? = unwrap(this).getDistributedDomainName()

    public fun evaluateTargetHealth(): Any? = unwrap(this).getEvaluateTargetHealth()

    public fun hostedZoneId(): String? = unwrap(this).getHostedZoneId()

    public fun hostedZoneName(): String? = unwrap(this).getHostedZoneName()

    public fun ipV6(): Any? = unwrap(this).getIpV6()

    @CdkDslMarker
    public interface Builder {
      public fun distributedDomainName(distributedDomainName: String)

      public fun evaluateTargetHealth(evaluateTargetHealth: Boolean)

      public fun evaluateTargetHealth(evaluateTargetHealth: IResolvable)

      public fun hostedZoneId(hostedZoneId: String)

      public fun hostedZoneName(hostedZoneName: String)

      public fun ipV6(ipV6: Boolean)

      public fun ipV6(ipV6: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnApi.Route53ConfigurationProperty.Builder =
          software.amazon.awscdk.services.sam.CfnApi.Route53ConfigurationProperty.builder()

      override fun distributedDomainName(distributedDomainName: String) {
        cdkBuilder.distributedDomainName(distributedDomainName)
      }

      override fun evaluateTargetHealth(evaluateTargetHealth: Boolean) {
        cdkBuilder.evaluateTargetHealth(evaluateTargetHealth)
      }

      override fun evaluateTargetHealth(evaluateTargetHealth: IResolvable) {
        cdkBuilder.evaluateTargetHealth(evaluateTargetHealth.let(IResolvable::unwrap))
      }

      override fun hostedZoneId(hostedZoneId: String) {
        cdkBuilder.hostedZoneId(hostedZoneId)
      }

      override fun hostedZoneName(hostedZoneName: String) {
        cdkBuilder.hostedZoneName(hostedZoneName)
      }

      override fun ipV6(ipV6: Boolean) {
        cdkBuilder.ipV6(ipV6)
      }

      override fun ipV6(ipV6: IResolvable) {
        cdkBuilder.ipV6(ipV6.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnApi.Route53ConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnApi.Route53ConfigurationProperty,
    ) : CdkObject(cdkObject), Route53ConfigurationProperty {
      override fun distributedDomainName(): String? = unwrap(this).getDistributedDomainName()

      override fun evaluateTargetHealth(): Any? = unwrap(this).getEvaluateTargetHealth()

      override fun hostedZoneId(): String? = unwrap(this).getHostedZoneId()

      override fun hostedZoneName(): String? = unwrap(this).getHostedZoneName()

      override fun ipV6(): Any? = unwrap(this).getIpV6()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): Route53ConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnApi.Route53ConfigurationProperty):
          Route53ConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Route53ConfigurationProperty):
          software.amazon.awscdk.services.sam.CfnApi.Route53ConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnApi.Route53ConfigurationProperty
    }
  }

  public interface MutualTlsAuthenticationProperty {
    public fun truststoreUri(): String? = unwrap(this).getTruststoreUri()

    public fun truststoreVersion(): String? = unwrap(this).getTruststoreVersion()

    @CdkDslMarker
    public interface Builder {
      public fun truststoreUri(truststoreUri: String)

      public fun truststoreVersion(truststoreVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnApi.MutualTlsAuthenticationProperty.Builder =
          software.amazon.awscdk.services.sam.CfnApi.MutualTlsAuthenticationProperty.builder()

      override fun truststoreUri(truststoreUri: String) {
        cdkBuilder.truststoreUri(truststoreUri)
      }

      override fun truststoreVersion(truststoreVersion: String) {
        cdkBuilder.truststoreVersion(truststoreVersion)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnApi.MutualTlsAuthenticationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnApi.MutualTlsAuthenticationProperty,
    ) : CdkObject(cdkObject), MutualTlsAuthenticationProperty {
      override fun truststoreUri(): String? = unwrap(this).getTruststoreUri()

      override fun truststoreVersion(): String? = unwrap(this).getTruststoreVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MutualTlsAuthenticationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnApi.MutualTlsAuthenticationProperty):
          MutualTlsAuthenticationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MutualTlsAuthenticationProperty):
          software.amazon.awscdk.services.sam.CfnApi.MutualTlsAuthenticationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnApi.MutualTlsAuthenticationProperty
    }
  }

  public interface DomainConfigurationProperty {
    public fun basePath(): List<String> = unwrap(this).getBasePath() ?: emptyList()

    public fun certificateArn(): String

    public fun domainName(): String

    public fun endpointConfiguration(): String? = unwrap(this).getEndpointConfiguration()

    public fun mutualTlsAuthentication(): Any? = unwrap(this).getMutualTlsAuthentication()

    public fun ownershipVerificationCertificateArn(): String? =
        unwrap(this).getOwnershipVerificationCertificateArn()

    public fun route53(): Any? = unwrap(this).getRoute53()

    public fun securityPolicy(): String? = unwrap(this).getSecurityPolicy()

    @CdkDslMarker
    public interface Builder {
      public fun basePath(basePath: List<String>)

      public fun basePath(vararg basePath: String)

      public fun certificateArn(certificateArn: String)

      public fun domainName(domainName: String)

      public fun endpointConfiguration(endpointConfiguration: String)

      public fun mutualTlsAuthentication(mutualTlsAuthentication: IResolvable)

      public fun mutualTlsAuthentication(mutualTlsAuthentication: MutualTlsAuthenticationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e98b91cdf6bf8e8932ae29581c539462801dd64c0b8669126f2ce3a0bec6ab56")
      public
          fun mutualTlsAuthentication(mutualTlsAuthentication: MutualTlsAuthenticationProperty.Builder.() -> Unit)

      public fun ownershipVerificationCertificateArn(ownershipVerificationCertificateArn: String)

      public fun route53(route53: IResolvable)

      public fun route53(route53: Route53ConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bdc6e2cd94fa58960127282245e89433069839b2a24d3a6fdcbea9fb73d6295f")
      public fun route53(route53: Route53ConfigurationProperty.Builder.() -> Unit)

      public fun securityPolicy(securityPolicy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnApi.DomainConfigurationProperty.Builder =
          software.amazon.awscdk.services.sam.CfnApi.DomainConfigurationProperty.builder()

      override fun basePath(basePath: List<String>) {
        cdkBuilder.basePath(basePath)
      }

      override fun basePath(vararg basePath: String): Unit = basePath(basePath.toList())

      override fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
      }

      override fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
      }

      override fun endpointConfiguration(endpointConfiguration: String) {
        cdkBuilder.endpointConfiguration(endpointConfiguration)
      }

      override fun mutualTlsAuthentication(mutualTlsAuthentication: IResolvable) {
        cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication.let(IResolvable::unwrap))
      }

      override
          fun mutualTlsAuthentication(mutualTlsAuthentication: MutualTlsAuthenticationProperty) {
        cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication.let(MutualTlsAuthenticationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e98b91cdf6bf8e8932ae29581c539462801dd64c0b8669126f2ce3a0bec6ab56")
      override
          fun mutualTlsAuthentication(mutualTlsAuthentication: MutualTlsAuthenticationProperty.Builder.() -> Unit):
          Unit = mutualTlsAuthentication(MutualTlsAuthenticationProperty(mutualTlsAuthentication))

      override
          fun ownershipVerificationCertificateArn(ownershipVerificationCertificateArn: String) {
        cdkBuilder.ownershipVerificationCertificateArn(ownershipVerificationCertificateArn)
      }

      override fun route53(route53: IResolvable) {
        cdkBuilder.route53(route53.let(IResolvable::unwrap))
      }

      override fun route53(route53: Route53ConfigurationProperty) {
        cdkBuilder.route53(route53.let(Route53ConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bdc6e2cd94fa58960127282245e89433069839b2a24d3a6fdcbea9fb73d6295f")
      override fun route53(route53: Route53ConfigurationProperty.Builder.() -> Unit): Unit =
          route53(Route53ConfigurationProperty(route53))

      override fun securityPolicy(securityPolicy: String) {
        cdkBuilder.securityPolicy(securityPolicy)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnApi.DomainConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnApi.DomainConfigurationProperty,
    ) : CdkObject(cdkObject), DomainConfigurationProperty {
      override fun basePath(): List<String> = unwrap(this).getBasePath() ?: emptyList()

      override fun certificateArn(): String = unwrap(this).getCertificateArn()

      override fun domainName(): String = unwrap(this).getDomainName()

      override fun endpointConfiguration(): String? = unwrap(this).getEndpointConfiguration()

      override fun mutualTlsAuthentication(): Any? = unwrap(this).getMutualTlsAuthentication()

      override fun ownershipVerificationCertificateArn(): String? =
          unwrap(this).getOwnershipVerificationCertificateArn()

      override fun route53(): Any? = unwrap(this).getRoute53()

      override fun securityPolicy(): String? = unwrap(this).getSecurityPolicy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DomainConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnApi.DomainConfigurationProperty):
          DomainConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DomainConfigurationProperty):
          software.amazon.awscdk.services.sam.CfnApi.DomainConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnApi.DomainConfigurationProperty
    }
  }

  public interface S3LocationProperty {
    public fun bucket(): String

    public fun key(): String

    public fun version(): Number

    @CdkDslMarker
    public interface Builder {
      public fun bucket(bucket: String)

      public fun key(key: String)

      public fun version(version: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.sam.CfnApi.S3LocationProperty.Builder
          = software.amazon.awscdk.services.sam.CfnApi.S3LocationProperty.builder()

      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun version(version: Number) {
        cdkBuilder.version(version)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnApi.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnApi.S3LocationProperty,
    ) : CdkObject(cdkObject), S3LocationProperty {
      override fun bucket(): String = unwrap(this).getBucket()

      override fun key(): String = unwrap(this).getKey()

      override fun version(): Number = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnApi.S3LocationProperty):
          S3LocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.sam.CfnApi.S3LocationProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.sam.CfnApi.S3LocationProperty
    }
  }

  public interface AuthProperty {
    public fun addDefaultAuthorizerToCorsPreflight(): Any? =
        unwrap(this).getAddDefaultAuthorizerToCorsPreflight()

    public fun authorizers(): Any? = unwrap(this).getAuthorizers()

    public fun defaultAuthorizer(): String? = unwrap(this).getDefaultAuthorizer()

    @CdkDslMarker
    public interface Builder {
      public fun addDefaultAuthorizerToCorsPreflight(addDefaultAuthorizerToCorsPreflight: Boolean)

      public
          fun addDefaultAuthorizerToCorsPreflight(addDefaultAuthorizerToCorsPreflight: IResolvable)

      public fun authorizers(authorizers: Any)

      public fun defaultAuthorizer(defaultAuthorizer: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.sam.CfnApi.AuthProperty.Builder =
          software.amazon.awscdk.services.sam.CfnApi.AuthProperty.builder()

      override
          fun addDefaultAuthorizerToCorsPreflight(addDefaultAuthorizerToCorsPreflight: Boolean) {
        cdkBuilder.addDefaultAuthorizerToCorsPreflight(addDefaultAuthorizerToCorsPreflight)
      }

      override
          fun addDefaultAuthorizerToCorsPreflight(addDefaultAuthorizerToCorsPreflight: IResolvable) {
        cdkBuilder.addDefaultAuthorizerToCorsPreflight(addDefaultAuthorizerToCorsPreflight.let(IResolvable::unwrap))
      }

      override fun authorizers(authorizers: Any) {
        cdkBuilder.authorizers(authorizers)
      }

      override fun defaultAuthorizer(defaultAuthorizer: String) {
        cdkBuilder.defaultAuthorizer(defaultAuthorizer)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnApi.AuthProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnApi.AuthProperty,
    ) : CdkObject(cdkObject), AuthProperty {
      override fun addDefaultAuthorizerToCorsPreflight(): Any? =
          unwrap(this).getAddDefaultAuthorizerToCorsPreflight()

      override fun authorizers(): Any? = unwrap(this).getAuthorizers()

      override fun defaultAuthorizer(): String? = unwrap(this).getDefaultAuthorizer()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AuthProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnApi.AuthProperty):
          AuthProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthProperty):
          software.amazon.awscdk.services.sam.CfnApi.AuthProperty = (wrapped as CdkObject).cdkObject
          as software.amazon.awscdk.services.sam.CfnApi.AuthProperty
    }
  }

  public interface EndpointConfigurationProperty {
    public fun type(): String? = unwrap(this).getType()

    public fun vpcEndpointIds(): List<String> = unwrap(this).getVpcEndpointIds() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun type(type: String)

      public fun vpcEndpointIds(vpcEndpointIds: List<String>)

      public fun vpcEndpointIds(vararg vpcEndpointIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnApi.EndpointConfigurationProperty.Builder =
          software.amazon.awscdk.services.sam.CfnApi.EndpointConfigurationProperty.builder()

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      override fun vpcEndpointIds(vpcEndpointIds: List<String>) {
        cdkBuilder.vpcEndpointIds(vpcEndpointIds)
      }

      override fun vpcEndpointIds(vararg vpcEndpointIds: String): Unit =
          vpcEndpointIds(vpcEndpointIds.toList())

      public fun build(): software.amazon.awscdk.services.sam.CfnApi.EndpointConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnApi.EndpointConfigurationProperty,
    ) : CdkObject(cdkObject), EndpointConfigurationProperty {
      override fun type(): String? = unwrap(this).getType()

      override fun vpcEndpointIds(): List<String> = unwrap(this).getVpcEndpointIds() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnApi.EndpointConfigurationProperty):
          EndpointConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointConfigurationProperty):
          software.amazon.awscdk.services.sam.CfnApi.EndpointConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnApi.EndpointConfigurationProperty
    }
  }

  public interface CanarySettingProperty {
    public fun deploymentId(): String? = unwrap(this).getDeploymentId()

    public fun percentTraffic(): Number? = unwrap(this).getPercentTraffic()

    public fun stageVariableOverrides(): Any? = unwrap(this).getStageVariableOverrides()

    public fun useStageCache(): Any? = unwrap(this).getUseStageCache()

    @CdkDslMarker
    public interface Builder {
      public fun deploymentId(deploymentId: String)

      public fun percentTraffic(percentTraffic: Number)

      public fun stageVariableOverrides(stageVariableOverrides: IResolvable)

      public fun stageVariableOverrides(stageVariableOverrides: Map<String, String>)

      public fun useStageCache(useStageCache: Boolean)

      public fun useStageCache(useStageCache: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnApi.CanarySettingProperty.Builder =
          software.amazon.awscdk.services.sam.CfnApi.CanarySettingProperty.builder()

      override fun deploymentId(deploymentId: String) {
        cdkBuilder.deploymentId(deploymentId)
      }

      override fun percentTraffic(percentTraffic: Number) {
        cdkBuilder.percentTraffic(percentTraffic)
      }

      override fun stageVariableOverrides(stageVariableOverrides: IResolvable) {
        cdkBuilder.stageVariableOverrides(stageVariableOverrides.let(IResolvable::unwrap))
      }

      override fun stageVariableOverrides(stageVariableOverrides: Map<String, String>) {
        cdkBuilder.stageVariableOverrides(stageVariableOverrides)
      }

      override fun useStageCache(useStageCache: Boolean) {
        cdkBuilder.useStageCache(useStageCache)
      }

      override fun useStageCache(useStageCache: IResolvable) {
        cdkBuilder.useStageCache(useStageCache.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnApi.CanarySettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnApi.CanarySettingProperty,
    ) : CdkObject(cdkObject), CanarySettingProperty {
      override fun deploymentId(): String? = unwrap(this).getDeploymentId()

      override fun percentTraffic(): Number? = unwrap(this).getPercentTraffic()

      override fun stageVariableOverrides(): Any? = unwrap(this).getStageVariableOverrides()

      override fun useStageCache(): Any? = unwrap(this).getUseStageCache()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CanarySettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnApi.CanarySettingProperty):
          CanarySettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CanarySettingProperty):
          software.amazon.awscdk.services.sam.CfnApi.CanarySettingProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.sam.CfnApi.CanarySettingProperty
    }
  }

  public interface CorsConfigurationProperty {
    public fun allowCredentials(): Any? = unwrap(this).getAllowCredentials()

    public fun allowHeaders(): String? = unwrap(this).getAllowHeaders()

    public fun allowMethods(): String? = unwrap(this).getAllowMethods()

    public fun allowOrigin(): String

    public fun maxAge(): String? = unwrap(this).getMaxAge()

    @CdkDslMarker
    public interface Builder {
      public fun allowCredentials(allowCredentials: Boolean)

      public fun allowCredentials(allowCredentials: IResolvable)

      public fun allowHeaders(allowHeaders: String)

      public fun allowMethods(allowMethods: String)

      public fun allowOrigin(allowOrigin: String)

      public fun maxAge(maxAge: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnApi.CorsConfigurationProperty.Builder =
          software.amazon.awscdk.services.sam.CfnApi.CorsConfigurationProperty.builder()

      override fun allowCredentials(allowCredentials: Boolean) {
        cdkBuilder.allowCredentials(allowCredentials)
      }

      override fun allowCredentials(allowCredentials: IResolvable) {
        cdkBuilder.allowCredentials(allowCredentials.let(IResolvable::unwrap))
      }

      override fun allowHeaders(allowHeaders: String) {
        cdkBuilder.allowHeaders(allowHeaders)
      }

      override fun allowMethods(allowMethods: String) {
        cdkBuilder.allowMethods(allowMethods)
      }

      override fun allowOrigin(allowOrigin: String) {
        cdkBuilder.allowOrigin(allowOrigin)
      }

      override fun maxAge(maxAge: String) {
        cdkBuilder.maxAge(maxAge)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnApi.CorsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnApi.CorsConfigurationProperty,
    ) : CdkObject(cdkObject), CorsConfigurationProperty {
      override fun allowCredentials(): Any? = unwrap(this).getAllowCredentials()

      override fun allowHeaders(): String? = unwrap(this).getAllowHeaders()

      override fun allowMethods(): String? = unwrap(this).getAllowMethods()

      override fun allowOrigin(): String = unwrap(this).getAllowOrigin()

      override fun maxAge(): String? = unwrap(this).getMaxAge()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CorsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnApi.CorsConfigurationProperty):
          CorsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CorsConfigurationProperty):
          software.amazon.awscdk.services.sam.CfnApi.CorsConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnApi.CorsConfigurationProperty
    }
  }
}
