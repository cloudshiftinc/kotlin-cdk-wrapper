@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sam

import io.cloudshiftdev.awscdk.IResolvable
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

public interface CfnApiProps {
  public fun accessLogSetting(): Any? = unwrap(this).getAccessLogSetting()

  public fun alwaysDeploy(): Any? = unwrap(this).getAlwaysDeploy()

  public fun auth(): Any? = unwrap(this).getAuth()

  public fun binaryMediaTypes(): List<String> = unwrap(this).getBinaryMediaTypes() ?: emptyList()

  public fun cacheClusterEnabled(): Any? = unwrap(this).getCacheClusterEnabled()

  public fun cacheClusterSize(): String? = unwrap(this).getCacheClusterSize()

  public fun canarySetting(): Any? = unwrap(this).getCanarySetting()

  public fun cors(): Any? = unwrap(this).getCors()

  public fun definitionBody(): Any? = unwrap(this).getDefinitionBody()

  public fun definitionUri(): Any? = unwrap(this).getDefinitionUri()

  public fun description(): String? = unwrap(this).getDescription()

  public fun disableExecuteApiEndpoint(): Any? = unwrap(this).getDisableExecuteApiEndpoint()

  public fun domain(): Any? = unwrap(this).getDomain()

  public fun endpointConfiguration(): Any? = unwrap(this).getEndpointConfiguration()

  public fun gatewayResponses(): Any? = unwrap(this).getGatewayResponses()

  public fun methodSettings(): Any? = unwrap(this).getMethodSettings()

  public fun minimumCompressionSize(): Number? = unwrap(this).getMinimumCompressionSize()

  public fun models(): Any? = unwrap(this).getModels()

  public fun name(): String? = unwrap(this).getName()

  public fun openApiVersion(): String? = unwrap(this).getOpenApiVersion()

  public fun stageName(): String

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun tracingEnabled(): Any? = unwrap(this).getTracingEnabled()

  public fun variables(): Any? = unwrap(this).getVariables()

  @CdkDslMarker
  public interface Builder {
    public fun accessLogSetting(accessLogSetting: IResolvable)

    public fun accessLogSetting(accessLogSetting: CfnApi.AccessLogSettingProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e43d25bcfe6b2f3a3866420f9148242d547d7bfff85d45bba0ae70146fdf448f")
    public
        fun accessLogSetting(accessLogSetting: CfnApi.AccessLogSettingProperty.Builder.() -> Unit)

    public fun alwaysDeploy(alwaysDeploy: Boolean)

    public fun alwaysDeploy(alwaysDeploy: IResolvable)

    public fun auth(auth: IResolvable)

    public fun auth(auth: CfnApi.AuthProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("791d343e71bb420f83580ab92461a383860b061751975cfdd263e066fac6010c")
    public fun auth(auth: CfnApi.AuthProperty.Builder.() -> Unit)

    public fun binaryMediaTypes(binaryMediaTypes: List<String>)

    public fun binaryMediaTypes(vararg binaryMediaTypes: String)

    public fun cacheClusterEnabled(cacheClusterEnabled: Boolean)

    public fun cacheClusterEnabled(cacheClusterEnabled: IResolvable)

    public fun cacheClusterSize(cacheClusterSize: String)

    public fun canarySetting(canarySetting: IResolvable)

    public fun canarySetting(canarySetting: CfnApi.CanarySettingProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("140a15ae764ccf3ff5638aae874cab11f551819b011286167f9d2b4113f5958b")
    public fun canarySetting(canarySetting: CfnApi.CanarySettingProperty.Builder.() -> Unit)

    public fun cors(cors: String)

    public fun cors(cors: IResolvable)

    public fun cors(cors: CfnApi.CorsConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4f93126d2f6e4efd7df536adcfc8911539c1235f6405d3fea8252d8a1ef395f2")
    public fun cors(cors: CfnApi.CorsConfigurationProperty.Builder.() -> Unit)

    public fun definitionBody(definitionBody: Any)

    public fun definitionUri(definitionUri: String)

    public fun definitionUri(definitionUri: IResolvable)

    public fun definitionUri(definitionUri: CfnApi.S3LocationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("398ae8ce55de06d3970f0fe8259e43adead2be2be77c06eb6853deb91c6361c0")
    public fun definitionUri(definitionUri: CfnApi.S3LocationProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean)

    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: IResolvable)

    public fun domain(domain: IResolvable)

    public fun domain(domain: CfnApi.DomainConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6757384fbdc509139e74ac773639aa517103f42d8100887199b01d3cdd286204")
    public fun domain(domain: CfnApi.DomainConfigurationProperty.Builder.() -> Unit)

    public fun endpointConfiguration(endpointConfiguration: String)

    public fun endpointConfiguration(endpointConfiguration: IResolvable)

    public fun endpointConfiguration(endpointConfiguration: CfnApi.EndpointConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("29732f167e6e444b3bfff11c2829d248c277df636ac1be77717fad6d10e9ad12")
    public
        fun endpointConfiguration(endpointConfiguration: CfnApi.EndpointConfigurationProperty.Builder.() -> Unit)

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

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sam.CfnApiProps.Builder =
        software.amazon.awscdk.services.sam.CfnApiProps.builder()

    override fun accessLogSetting(accessLogSetting: IResolvable) {
      cdkBuilder.accessLogSetting(accessLogSetting.let(IResolvable::unwrap))
    }

    override fun accessLogSetting(accessLogSetting: CfnApi.AccessLogSettingProperty) {
      cdkBuilder.accessLogSetting(accessLogSetting.let(CfnApi.AccessLogSettingProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e43d25bcfe6b2f3a3866420f9148242d547d7bfff85d45bba0ae70146fdf448f")
    override
        fun accessLogSetting(accessLogSetting: CfnApi.AccessLogSettingProperty.Builder.() -> Unit):
        Unit = accessLogSetting(CfnApi.AccessLogSettingProperty(accessLogSetting))

    override fun alwaysDeploy(alwaysDeploy: Boolean) {
      cdkBuilder.alwaysDeploy(alwaysDeploy)
    }

    override fun alwaysDeploy(alwaysDeploy: IResolvable) {
      cdkBuilder.alwaysDeploy(alwaysDeploy.let(IResolvable::unwrap))
    }

    override fun auth(auth: IResolvable) {
      cdkBuilder.auth(auth.let(IResolvable::unwrap))
    }

    override fun auth(auth: CfnApi.AuthProperty) {
      cdkBuilder.auth(auth.let(CfnApi.AuthProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("791d343e71bb420f83580ab92461a383860b061751975cfdd263e066fac6010c")
    override fun auth(auth: CfnApi.AuthProperty.Builder.() -> Unit): Unit =
        auth(CfnApi.AuthProperty(auth))

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

    override fun canarySetting(canarySetting: CfnApi.CanarySettingProperty) {
      cdkBuilder.canarySetting(canarySetting.let(CfnApi.CanarySettingProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("140a15ae764ccf3ff5638aae874cab11f551819b011286167f9d2b4113f5958b")
    override fun canarySetting(canarySetting: CfnApi.CanarySettingProperty.Builder.() -> Unit): Unit
        = canarySetting(CfnApi.CanarySettingProperty(canarySetting))

    override fun cors(cors: String) {
      cdkBuilder.cors(cors)
    }

    override fun cors(cors: IResolvable) {
      cdkBuilder.cors(cors.let(IResolvable::unwrap))
    }

    override fun cors(cors: CfnApi.CorsConfigurationProperty) {
      cdkBuilder.cors(cors.let(CfnApi.CorsConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4f93126d2f6e4efd7df536adcfc8911539c1235f6405d3fea8252d8a1ef395f2")
    override fun cors(cors: CfnApi.CorsConfigurationProperty.Builder.() -> Unit): Unit =
        cors(CfnApi.CorsConfigurationProperty(cors))

    override fun definitionBody(definitionBody: Any) {
      cdkBuilder.definitionBody(definitionBody)
    }

    override fun definitionUri(definitionUri: String) {
      cdkBuilder.definitionUri(definitionUri)
    }

    override fun definitionUri(definitionUri: IResolvable) {
      cdkBuilder.definitionUri(definitionUri.let(IResolvable::unwrap))
    }

    override fun definitionUri(definitionUri: CfnApi.S3LocationProperty) {
      cdkBuilder.definitionUri(definitionUri.let(CfnApi.S3LocationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("398ae8ce55de06d3970f0fe8259e43adead2be2be77c06eb6853deb91c6361c0")
    override fun definitionUri(definitionUri: CfnApi.S3LocationProperty.Builder.() -> Unit): Unit =
        definitionUri(CfnApi.S3LocationProperty(definitionUri))

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

    override fun domain(domain: CfnApi.DomainConfigurationProperty) {
      cdkBuilder.domain(domain.let(CfnApi.DomainConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6757384fbdc509139e74ac773639aa517103f42d8100887199b01d3cdd286204")
    override fun domain(domain: CfnApi.DomainConfigurationProperty.Builder.() -> Unit): Unit =
        domain(CfnApi.DomainConfigurationProperty(domain))

    override fun endpointConfiguration(endpointConfiguration: String) {
      cdkBuilder.endpointConfiguration(endpointConfiguration)
    }

    override fun endpointConfiguration(endpointConfiguration: IResolvable) {
      cdkBuilder.endpointConfiguration(endpointConfiguration.let(IResolvable::unwrap))
    }

    override
        fun endpointConfiguration(endpointConfiguration: CfnApi.EndpointConfigurationProperty) {
      cdkBuilder.endpointConfiguration(endpointConfiguration.let(CfnApi.EndpointConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("29732f167e6e444b3bfff11c2829d248c277df636ac1be77717fad6d10e9ad12")
    override
        fun endpointConfiguration(endpointConfiguration: CfnApi.EndpointConfigurationProperty.Builder.() -> Unit):
        Unit = endpointConfiguration(CfnApi.EndpointConfigurationProperty(endpointConfiguration))

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

    public fun build(): software.amazon.awscdk.services.sam.CfnApiProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sam.CfnApiProps,
  ) : CdkObject(cdkObject), CfnApiProps {
    override fun accessLogSetting(): Any? = unwrap(this).getAccessLogSetting()

    override fun alwaysDeploy(): Any? = unwrap(this).getAlwaysDeploy()

    override fun auth(): Any? = unwrap(this).getAuth()

    override fun binaryMediaTypes(): List<String> = unwrap(this).getBinaryMediaTypes() ?:
        emptyList()

    override fun cacheClusterEnabled(): Any? = unwrap(this).getCacheClusterEnabled()

    override fun cacheClusterSize(): String? = unwrap(this).getCacheClusterSize()

    override fun canarySetting(): Any? = unwrap(this).getCanarySetting()

    override fun cors(): Any? = unwrap(this).getCors()

    override fun definitionBody(): Any? = unwrap(this).getDefinitionBody()

    override fun definitionUri(): Any? = unwrap(this).getDefinitionUri()

    override fun description(): String? = unwrap(this).getDescription()

    override fun disableExecuteApiEndpoint(): Any? = unwrap(this).getDisableExecuteApiEndpoint()

    override fun domain(): Any? = unwrap(this).getDomain()

    override fun endpointConfiguration(): Any? = unwrap(this).getEndpointConfiguration()

    override fun gatewayResponses(): Any? = unwrap(this).getGatewayResponses()

    override fun methodSettings(): Any? = unwrap(this).getMethodSettings()

    override fun minimumCompressionSize(): Number? = unwrap(this).getMinimumCompressionSize()

    override fun models(): Any? = unwrap(this).getModels()

    override fun name(): String? = unwrap(this).getName()

    override fun openApiVersion(): String? = unwrap(this).getOpenApiVersion()

    override fun stageName(): String = unwrap(this).getStageName()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun tracingEnabled(): Any? = unwrap(this).getTracingEnabled()

    override fun variables(): Any? = unwrap(this).getVariables()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApiProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnApiProps): CfnApiProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApiProps): software.amazon.awscdk.services.sam.CfnApiProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.sam.CfnApiProps
  }
}
