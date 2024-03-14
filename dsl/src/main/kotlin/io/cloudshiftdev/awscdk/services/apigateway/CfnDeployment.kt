package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
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

public open class CfnDeployment internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigateway.CfnDeployment,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrDeploymentId(): String = unwrap(this).getAttrDeploymentId()

  public open fun deploymentCanarySettings(): Any? = unwrap(this).getDeploymentCanarySettings()

  public open fun deploymentCanarySettings(`value`: IResolvable) {
    unwrap(this).setDeploymentCanarySettings(`value`.let(IResolvable::unwrap))
  }

  public open fun deploymentCanarySettings(`value`: DeploymentCanarySettingsProperty) {
    unwrap(this).setDeploymentCanarySettings(`value`.let(DeploymentCanarySettingsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9d366cb36b5ef986853d4804c23d44ce7bb106cf9af58824eda92be6e1ce71c4")
  public open
      fun deploymentCanarySettings(`value`: DeploymentCanarySettingsProperty.Builder.() -> Unit):
      Unit = deploymentCanarySettings(DeploymentCanarySettingsProperty(`value`))

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun restApiId(): String = unwrap(this).getRestApiId()

  public open fun restApiId(`value`: String) {
    unwrap(this).setRestApiId(`value`)
  }

  public open fun stageDescription(): Any? = unwrap(this).getStageDescription()

  public open fun stageDescription(`value`: IResolvable) {
    unwrap(this).setStageDescription(`value`.let(IResolvable::unwrap))
  }

  public open fun stageDescription(`value`: StageDescriptionProperty) {
    unwrap(this).setStageDescription(`value`.let(StageDescriptionProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("018a3947152cf04cd71ae0586b87d17750430e4e6379ebe4c2ca2384c653bb3a")
  public open fun stageDescription(`value`: StageDescriptionProperty.Builder.() -> Unit): Unit =
      stageDescription(StageDescriptionProperty(`value`))

  public open fun stageName(): String? = unwrap(this).getStageName()

  public open fun stageName(`value`: String) {
    unwrap(this).setStageName(`value`)
  }

  public interface Builder {
    public fun deploymentCanarySettings(deploymentCanarySettings: IResolvable) {
    }

    public
        fun deploymentCanarySettings(deploymentCanarySettings: DeploymentCanarySettingsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21ca97cf0bfe9c1d1a8e979a091cf9b903730552a61247da8173598a65b875e7")
    public
        fun deploymentCanarySettings(deploymentCanarySettings: DeploymentCanarySettingsProperty.Builder.() -> Unit) {
    }

    public fun description(description: String) {
    }

    public fun restApiId(restApiId: String) {
    }

    public fun stageDescription(stageDescription: IResolvable) {
    }

    public fun stageDescription(stageDescription: StageDescriptionProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2e7de6599aa5bbb04a85de443363a03d57d178779fe82e4ad4710eb5076fe1fd")
    public fun stageDescription(stageDescription: StageDescriptionProperty.Builder.() -> Unit) {
    }

    public fun stageName(stageName: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnDeployment.Builder =
        software.amazon.awscdk.services.apigateway.CfnDeployment.Builder.create(scope, id)

    public override fun deploymentCanarySettings(deploymentCanarySettings: IResolvable) {
      cdkBuilder.deploymentCanarySettings(deploymentCanarySettings.let(IResolvable::unwrap))
    }

    public override
        fun deploymentCanarySettings(deploymentCanarySettings: DeploymentCanarySettingsProperty) {
      cdkBuilder.deploymentCanarySettings(deploymentCanarySettings.let(DeploymentCanarySettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21ca97cf0bfe9c1d1a8e979a091cf9b903730552a61247da8173598a65b875e7")
    public override
        fun deploymentCanarySettings(deploymentCanarySettings: DeploymentCanarySettingsProperty.Builder.() -> Unit):
        Unit = deploymentCanarySettings(DeploymentCanarySettingsProperty(deploymentCanarySettings))

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    public override fun stageDescription(stageDescription: IResolvable) {
      cdkBuilder.stageDescription(stageDescription.let(IResolvable::unwrap))
    }

    public override fun stageDescription(stageDescription: StageDescriptionProperty) {
      cdkBuilder.stageDescription(stageDescription.let(StageDescriptionProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2e7de6599aa5bbb04a85de443363a03d57d178779fe82e4ad4710eb5076fe1fd")
    public override
        fun stageDescription(stageDescription: StageDescriptionProperty.Builder.() -> Unit): Unit =
        stageDescription(StageDescriptionProperty(stageDescription))

    public override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnDeployment =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDeployment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDeployment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnDeployment):
        CfnDeployment = CfnDeployment(cdkObject)

    internal fun unwrap(wrapped: CfnDeployment):
        software.amazon.awscdk.services.apigateway.CfnDeployment = wrapped.cdkObject
  }

  public interface StageDescriptionProperty {
    public fun accessLogSetting(): Any? = unwrap(this).getAccessLogSetting()

    public fun cacheClusterEnabled(): Any? = unwrap(this).getCacheClusterEnabled()

    public fun cacheClusterSize(): String? = unwrap(this).getCacheClusterSize()

    public fun cacheDataEncrypted(): Any? = unwrap(this).getCacheDataEncrypted()

    public fun cacheTtlInSeconds(): Number? = unwrap(this).getCacheTtlInSeconds()

    public fun cachingEnabled(): Any? = unwrap(this).getCachingEnabled()

    public fun canarySetting(): Any? = unwrap(this).getCanarySetting()

    public fun clientCertificateId(): String? = unwrap(this).getClientCertificateId()

    public fun dataTraceEnabled(): Any? = unwrap(this).getDataTraceEnabled()

    public fun description(): String? = unwrap(this).getDescription()

    public fun documentationVersion(): String? = unwrap(this).getDocumentationVersion()

    public fun loggingLevel(): String? = unwrap(this).getLoggingLevel()

    public fun methodSettings(): Any? = unwrap(this).getMethodSettings()

    public fun metricsEnabled(): Any? = unwrap(this).getMetricsEnabled()

    public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    public fun throttlingBurstLimit(): Number? = unwrap(this).getThrottlingBurstLimit()

    public fun throttlingRateLimit(): Number? = unwrap(this).getThrottlingRateLimit()

    public fun tracingEnabled(): Any? = unwrap(this).getTracingEnabled()

    public fun variables(): Any? = unwrap(this).getVariables()

    public interface Builder {
      public fun accessLogSetting(accessLogSetting: IResolvable) {
      }

      public fun accessLogSetting(accessLogSetting: AccessLogSettingProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("476e53c17a3b38067a9a4f0ebc1b0b130141d08358a93bf466e1945f63cf7472")
      public fun accessLogSetting(accessLogSetting: AccessLogSettingProperty.Builder.() -> Unit) {
      }

      public fun cacheClusterEnabled(cacheClusterEnabled: Boolean) {
      }

      public fun cacheClusterEnabled(cacheClusterEnabled: IResolvable) {
      }

      public fun cacheClusterSize(cacheClusterSize: String) {
      }

      public fun cacheDataEncrypted(cacheDataEncrypted: Boolean) {
      }

      public fun cacheDataEncrypted(cacheDataEncrypted: IResolvable) {
      }

      public fun cacheTtlInSeconds(cacheTtlInSeconds: Number) {
      }

      public fun cachingEnabled(cachingEnabled: Boolean) {
      }

      public fun cachingEnabled(cachingEnabled: IResolvable) {
      }

      public fun canarySetting(canarySetting: IResolvable) {
      }

      public fun canarySetting(canarySetting: CanarySettingProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8948c21342fa6203010c93bd677f84e3fb2e90cc6c8fb095b4ad6010817b89f1")
      public fun canarySetting(canarySetting: CanarySettingProperty.Builder.() -> Unit) {
      }

      public fun clientCertificateId(clientCertificateId: String) {
      }

      public fun dataTraceEnabled(dataTraceEnabled: Boolean) {
      }

      public fun dataTraceEnabled(dataTraceEnabled: IResolvable) {
      }

      public fun description(description: String) {
      }

      public fun documentationVersion(documentationVersion: String) {
      }

      public fun loggingLevel(loggingLevel: String) {
      }

      public fun methodSettings(methodSettings: IResolvable) {
      }

      public fun methodSettings(methodSettings: List<Any>) {
      }

      public fun metricsEnabled(metricsEnabled: Boolean) {
      }

      public fun metricsEnabled(metricsEnabled: IResolvable) {
      }

      public fun tags(tags: List<CfnTag>) {
      }

      public fun throttlingBurstLimit(throttlingBurstLimit: Number) {
      }

      public fun throttlingRateLimit(throttlingRateLimit: Number) {
      }

      public fun tracingEnabled(tracingEnabled: Boolean) {
      }

      public fun tracingEnabled(tracingEnabled: IResolvable) {
      }

      public fun variables(variables: IResolvable) {
      }

      public fun variables(variables: Map<String, String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigateway.CfnDeployment.StageDescriptionProperty.Builder
          =
          software.amazon.awscdk.services.apigateway.CfnDeployment.StageDescriptionProperty.builder()

      public override fun accessLogSetting(accessLogSetting: IResolvable) {
        cdkBuilder.accessLogSetting(accessLogSetting.let(IResolvable::unwrap))
      }

      public override fun accessLogSetting(accessLogSetting: AccessLogSettingProperty) {
        cdkBuilder.accessLogSetting(accessLogSetting.let(AccessLogSettingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("476e53c17a3b38067a9a4f0ebc1b0b130141d08358a93bf466e1945f63cf7472")
      public override
          fun accessLogSetting(accessLogSetting: AccessLogSettingProperty.Builder.() -> Unit): Unit
          = accessLogSetting(AccessLogSettingProperty(accessLogSetting))

      public override fun cacheClusterEnabled(cacheClusterEnabled: Boolean) {
        cdkBuilder.cacheClusterEnabled(cacheClusterEnabled)
      }

      public override fun cacheClusterEnabled(cacheClusterEnabled: IResolvable) {
        cdkBuilder.cacheClusterEnabled(cacheClusterEnabled.let(IResolvable::unwrap))
      }

      public override fun cacheClusterSize(cacheClusterSize: String) {
        cdkBuilder.cacheClusterSize(cacheClusterSize)
      }

      public override fun cacheDataEncrypted(cacheDataEncrypted: Boolean) {
        cdkBuilder.cacheDataEncrypted(cacheDataEncrypted)
      }

      public override fun cacheDataEncrypted(cacheDataEncrypted: IResolvable) {
        cdkBuilder.cacheDataEncrypted(cacheDataEncrypted.let(IResolvable::unwrap))
      }

      public override fun cacheTtlInSeconds(cacheTtlInSeconds: Number) {
        cdkBuilder.cacheTtlInSeconds(cacheTtlInSeconds)
      }

      public override fun cachingEnabled(cachingEnabled: Boolean) {
        cdkBuilder.cachingEnabled(cachingEnabled)
      }

      public override fun cachingEnabled(cachingEnabled: IResolvable) {
        cdkBuilder.cachingEnabled(cachingEnabled.let(IResolvable::unwrap))
      }

      public override fun canarySetting(canarySetting: IResolvable) {
        cdkBuilder.canarySetting(canarySetting.let(IResolvable::unwrap))
      }

      public override fun canarySetting(canarySetting: CanarySettingProperty) {
        cdkBuilder.canarySetting(canarySetting.let(CanarySettingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8948c21342fa6203010c93bd677f84e3fb2e90cc6c8fb095b4ad6010817b89f1")
      public override fun canarySetting(canarySetting: CanarySettingProperty.Builder.() -> Unit):
          Unit = canarySetting(CanarySettingProperty(canarySetting))

      public override fun clientCertificateId(clientCertificateId: String) {
        cdkBuilder.clientCertificateId(clientCertificateId)
      }

      public override fun dataTraceEnabled(dataTraceEnabled: Boolean) {
        cdkBuilder.dataTraceEnabled(dataTraceEnabled)
      }

      public override fun dataTraceEnabled(dataTraceEnabled: IResolvable) {
        cdkBuilder.dataTraceEnabled(dataTraceEnabled.let(IResolvable::unwrap))
      }

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun documentationVersion(documentationVersion: String) {
        cdkBuilder.documentationVersion(documentationVersion)
      }

      public override fun loggingLevel(loggingLevel: String) {
        cdkBuilder.loggingLevel(loggingLevel)
      }

      public override fun methodSettings(methodSettings: IResolvable) {
        cdkBuilder.methodSettings(methodSettings.let(IResolvable::unwrap))
      }

      public override fun methodSettings(methodSettings: List<Any>) {
        cdkBuilder.methodSettings(methodSettings)
      }

      public override fun metricsEnabled(metricsEnabled: Boolean) {
        cdkBuilder.metricsEnabled(metricsEnabled)
      }

      public override fun metricsEnabled(metricsEnabled: IResolvable) {
        cdkBuilder.metricsEnabled(metricsEnabled.let(IResolvable::unwrap))
      }

      public override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag::unwrap))
      }

      public override fun throttlingBurstLimit(throttlingBurstLimit: Number) {
        cdkBuilder.throttlingBurstLimit(throttlingBurstLimit)
      }

      public override fun throttlingRateLimit(throttlingRateLimit: Number) {
        cdkBuilder.throttlingRateLimit(throttlingRateLimit)
      }

      public override fun tracingEnabled(tracingEnabled: Boolean) {
        cdkBuilder.tracingEnabled(tracingEnabled)
      }

      public override fun tracingEnabled(tracingEnabled: IResolvable) {
        cdkBuilder.tracingEnabled(tracingEnabled.let(IResolvable::unwrap))
      }

      public override fun variables(variables: IResolvable) {
        cdkBuilder.variables(variables.let(IResolvable::unwrap))
      }

      public override fun variables(variables: Map<String, String>) {
        cdkBuilder.variables(variables)
      }

      public fun build():
          software.amazon.awscdk.services.apigateway.CfnDeployment.StageDescriptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apigateway.CfnDeployment.StageDescriptionProperty,
    ) : StageDescriptionProperty {
      public override fun accessLogSetting(): Any? = unwrap(this).getAccessLogSetting()

      public override fun cacheClusterEnabled(): Any? = unwrap(this).getCacheClusterEnabled()

      public override fun cacheClusterSize(): String? = unwrap(this).getCacheClusterSize()

      public override fun cacheDataEncrypted(): Any? = unwrap(this).getCacheDataEncrypted()

      public override fun cacheTtlInSeconds(): Number? = unwrap(this).getCacheTtlInSeconds()

      public override fun cachingEnabled(): Any? = unwrap(this).getCachingEnabled()

      public override fun canarySetting(): Any? = unwrap(this).getCanarySetting()

      public override fun clientCertificateId(): String? = unwrap(this).getClientCertificateId()

      public override fun dataTraceEnabled(): Any? = unwrap(this).getDataTraceEnabled()

      public override fun description(): String? = unwrap(this).getDescription()

      public override fun documentationVersion(): String? = unwrap(this).getDocumentationVersion()

      public override fun loggingLevel(): String? = unwrap(this).getLoggingLevel()

      public override fun methodSettings(): Any? = unwrap(this).getMethodSettings()

      public override fun metricsEnabled(): Any? = unwrap(this).getMetricsEnabled()

      public override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?:
          emptyList()

      public override fun throttlingBurstLimit(): Number? = unwrap(this).getThrottlingBurstLimit()

      public override fun throttlingRateLimit(): Number? = unwrap(this).getThrottlingRateLimit()

      public override fun tracingEnabled(): Any? = unwrap(this).getTracingEnabled()

      public override fun variables(): Any? = unwrap(this).getVariables()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StageDescriptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnDeployment.StageDescriptionProperty):
          StageDescriptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StageDescriptionProperty):
          software.amazon.awscdk.services.apigateway.CfnDeployment.StageDescriptionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DeploymentCanarySettingsProperty {
    public fun percentTraffic(): Number? = unwrap(this).getPercentTraffic()

    public fun stageVariableOverrides(): Any? = unwrap(this).getStageVariableOverrides()

    public fun useStageCache(): Any? = unwrap(this).getUseStageCache()

    public interface Builder {
      public fun percentTraffic(percentTraffic: Number) {
      }

      public fun stageVariableOverrides(stageVariableOverrides: IResolvable) {
      }

      public fun stageVariableOverrides(stageVariableOverrides: Map<String, String>) {
      }

      public fun useStageCache(useStageCache: Boolean) {
      }

      public fun useStageCache(useStageCache: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigateway.CfnDeployment.DeploymentCanarySettingsProperty.Builder
          =
          software.amazon.awscdk.services.apigateway.CfnDeployment.DeploymentCanarySettingsProperty.builder()

      public override fun percentTraffic(percentTraffic: Number) {
        cdkBuilder.percentTraffic(percentTraffic)
      }

      public override fun stageVariableOverrides(stageVariableOverrides: IResolvable) {
        cdkBuilder.stageVariableOverrides(stageVariableOverrides.let(IResolvable::unwrap))
      }

      public override fun stageVariableOverrides(stageVariableOverrides: Map<String, String>) {
        cdkBuilder.stageVariableOverrides(stageVariableOverrides)
      }

      public override fun useStageCache(useStageCache: Boolean) {
        cdkBuilder.useStageCache(useStageCache)
      }

      public override fun useStageCache(useStageCache: IResolvable) {
        cdkBuilder.useStageCache(useStageCache.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.apigateway.CfnDeployment.DeploymentCanarySettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apigateway.CfnDeployment.DeploymentCanarySettingsProperty,
    ) : DeploymentCanarySettingsProperty {
      public override fun percentTraffic(): Number? = unwrap(this).getPercentTraffic()

      public override fun stageVariableOverrides(): Any? = unwrap(this).getStageVariableOverrides()

      public override fun useStageCache(): Any? = unwrap(this).getUseStageCache()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentCanarySettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnDeployment.DeploymentCanarySettingsProperty):
          DeploymentCanarySettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeploymentCanarySettingsProperty):
          software.amazon.awscdk.services.apigateway.CfnDeployment.DeploymentCanarySettingsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AccessLogSettingProperty {
    public fun destinationArn(): String? = unwrap(this).getDestinationArn()

    public fun format(): String? = unwrap(this).getFormat()

    public interface Builder {
      public fun destinationArn(destinationArn: String) {
      }

      public fun format(format: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigateway.CfnDeployment.AccessLogSettingProperty.Builder
          =
          software.amazon.awscdk.services.apigateway.CfnDeployment.AccessLogSettingProperty.builder()

      public override fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
      }

      public override fun format(format: String) {
        cdkBuilder.format(format)
      }

      public fun build():
          software.amazon.awscdk.services.apigateway.CfnDeployment.AccessLogSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apigateway.CfnDeployment.AccessLogSettingProperty,
    ) : AccessLogSettingProperty {
      public override fun destinationArn(): String? = unwrap(this).getDestinationArn()

      public override fun format(): String? = unwrap(this).getFormat()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AccessLogSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnDeployment.AccessLogSettingProperty):
          AccessLogSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessLogSettingProperty):
          software.amazon.awscdk.services.apigateway.CfnDeployment.AccessLogSettingProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MethodSettingProperty {
    public fun cacheDataEncrypted(): Any? = unwrap(this).getCacheDataEncrypted()

    public fun cacheTtlInSeconds(): Number? = unwrap(this).getCacheTtlInSeconds()

    public fun cachingEnabled(): Any? = unwrap(this).getCachingEnabled()

    public fun dataTraceEnabled(): Any? = unwrap(this).getDataTraceEnabled()

    public fun httpMethod(): String? = unwrap(this).getHttpMethod()

    public fun loggingLevel(): String? = unwrap(this).getLoggingLevel()

    public fun metricsEnabled(): Any? = unwrap(this).getMetricsEnabled()

    public fun resourcePath(): String? = unwrap(this).getResourcePath()

    public fun throttlingBurstLimit(): Number? = unwrap(this).getThrottlingBurstLimit()

    public fun throttlingRateLimit(): Number? = unwrap(this).getThrottlingRateLimit()

    public interface Builder {
      public fun cacheDataEncrypted(cacheDataEncrypted: Boolean) {
      }

      public fun cacheDataEncrypted(cacheDataEncrypted: IResolvable) {
      }

      public fun cacheTtlInSeconds(cacheTtlInSeconds: Number) {
      }

      public fun cachingEnabled(cachingEnabled: Boolean) {
      }

      public fun cachingEnabled(cachingEnabled: IResolvable) {
      }

      public fun dataTraceEnabled(dataTraceEnabled: Boolean) {
      }

      public fun dataTraceEnabled(dataTraceEnabled: IResolvable) {
      }

      public fun httpMethod(httpMethod: String) {
      }

      public fun loggingLevel(loggingLevel: String) {
      }

      public fun metricsEnabled(metricsEnabled: Boolean) {
      }

      public fun metricsEnabled(metricsEnabled: IResolvable) {
      }

      public fun resourcePath(resourcePath: String) {
      }

      public fun throttlingBurstLimit(throttlingBurstLimit: Number) {
      }

      public fun throttlingRateLimit(throttlingRateLimit: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigateway.CfnDeployment.MethodSettingProperty.Builder =
          software.amazon.awscdk.services.apigateway.CfnDeployment.MethodSettingProperty.builder()

      public override fun cacheDataEncrypted(cacheDataEncrypted: Boolean) {
        cdkBuilder.cacheDataEncrypted(cacheDataEncrypted)
      }

      public override fun cacheDataEncrypted(cacheDataEncrypted: IResolvable) {
        cdkBuilder.cacheDataEncrypted(cacheDataEncrypted.let(IResolvable::unwrap))
      }

      public override fun cacheTtlInSeconds(cacheTtlInSeconds: Number) {
        cdkBuilder.cacheTtlInSeconds(cacheTtlInSeconds)
      }

      public override fun cachingEnabled(cachingEnabled: Boolean) {
        cdkBuilder.cachingEnabled(cachingEnabled)
      }

      public override fun cachingEnabled(cachingEnabled: IResolvable) {
        cdkBuilder.cachingEnabled(cachingEnabled.let(IResolvable::unwrap))
      }

      public override fun dataTraceEnabled(dataTraceEnabled: Boolean) {
        cdkBuilder.dataTraceEnabled(dataTraceEnabled)
      }

      public override fun dataTraceEnabled(dataTraceEnabled: IResolvable) {
        cdkBuilder.dataTraceEnabled(dataTraceEnabled.let(IResolvable::unwrap))
      }

      public override fun httpMethod(httpMethod: String) {
        cdkBuilder.httpMethod(httpMethod)
      }

      public override fun loggingLevel(loggingLevel: String) {
        cdkBuilder.loggingLevel(loggingLevel)
      }

      public override fun metricsEnabled(metricsEnabled: Boolean) {
        cdkBuilder.metricsEnabled(metricsEnabled)
      }

      public override fun metricsEnabled(metricsEnabled: IResolvable) {
        cdkBuilder.metricsEnabled(metricsEnabled.let(IResolvable::unwrap))
      }

      public override fun resourcePath(resourcePath: String) {
        cdkBuilder.resourcePath(resourcePath)
      }

      public override fun throttlingBurstLimit(throttlingBurstLimit: Number) {
        cdkBuilder.throttlingBurstLimit(throttlingBurstLimit)
      }

      public override fun throttlingRateLimit(throttlingRateLimit: Number) {
        cdkBuilder.throttlingRateLimit(throttlingRateLimit)
      }

      public fun build():
          software.amazon.awscdk.services.apigateway.CfnDeployment.MethodSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apigateway.CfnDeployment.MethodSettingProperty,
    ) : MethodSettingProperty {
      public override fun cacheDataEncrypted(): Any? = unwrap(this).getCacheDataEncrypted()

      public override fun cacheTtlInSeconds(): Number? = unwrap(this).getCacheTtlInSeconds()

      public override fun cachingEnabled(): Any? = unwrap(this).getCachingEnabled()

      public override fun dataTraceEnabled(): Any? = unwrap(this).getDataTraceEnabled()

      public override fun httpMethod(): String? = unwrap(this).getHttpMethod()

      public override fun loggingLevel(): String? = unwrap(this).getLoggingLevel()

      public override fun metricsEnabled(): Any? = unwrap(this).getMetricsEnabled()

      public override fun resourcePath(): String? = unwrap(this).getResourcePath()

      public override fun throttlingBurstLimit(): Number? = unwrap(this).getThrottlingBurstLimit()

      public override fun throttlingRateLimit(): Number? = unwrap(this).getThrottlingRateLimit()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MethodSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnDeployment.MethodSettingProperty):
          MethodSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MethodSettingProperty):
          software.amazon.awscdk.services.apigateway.CfnDeployment.MethodSettingProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface CanarySettingProperty {
    public fun percentTraffic(): Number? = unwrap(this).getPercentTraffic()

    public fun stageVariableOverrides(): Any? = unwrap(this).getStageVariableOverrides()

    public fun useStageCache(): Any? = unwrap(this).getUseStageCache()

    public interface Builder {
      public fun percentTraffic(percentTraffic: Number) {
      }

      public fun stageVariableOverrides(stageVariableOverrides: IResolvable) {
      }

      public fun stageVariableOverrides(stageVariableOverrides: Map<String, String>) {
      }

      public fun useStageCache(useStageCache: Boolean) {
      }

      public fun useStageCache(useStageCache: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigateway.CfnDeployment.CanarySettingProperty.Builder =
          software.amazon.awscdk.services.apigateway.CfnDeployment.CanarySettingProperty.builder()

      public override fun percentTraffic(percentTraffic: Number) {
        cdkBuilder.percentTraffic(percentTraffic)
      }

      public override fun stageVariableOverrides(stageVariableOverrides: IResolvable) {
        cdkBuilder.stageVariableOverrides(stageVariableOverrides.let(IResolvable::unwrap))
      }

      public override fun stageVariableOverrides(stageVariableOverrides: Map<String, String>) {
        cdkBuilder.stageVariableOverrides(stageVariableOverrides)
      }

      public override fun useStageCache(useStageCache: Boolean) {
        cdkBuilder.useStageCache(useStageCache)
      }

      public override fun useStageCache(useStageCache: IResolvable) {
        cdkBuilder.useStageCache(useStageCache.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.apigateway.CfnDeployment.CanarySettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apigateway.CfnDeployment.CanarySettingProperty,
    ) : CanarySettingProperty {
      public override fun percentTraffic(): Number? = unwrap(this).getPercentTraffic()

      public override fun stageVariableOverrides(): Any? = unwrap(this).getStageVariableOverrides()

      public override fun useStageCache(): Any? = unwrap(this).getUseStageCache()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CanarySettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnDeployment.CanarySettingProperty):
          CanarySettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CanarySettingProperty):
          software.amazon.awscdk.services.apigateway.CfnDeployment.CanarySettingProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
