package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
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

public open class CfnStage internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigateway.CfnStage,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun accessLogSetting(): Any? = unwrap(this).getAccessLogSetting()

  public open fun accessLogSetting(`value`: IResolvable) {
    unwrap(this).setAccessLogSetting(`value`.let(IResolvable::unwrap))
  }

  public open fun accessLogSetting(`value`: AccessLogSettingProperty) {
    unwrap(this).setAccessLogSetting(`value`.let(AccessLogSettingProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ce1037cb26f0e51a3df786c5fb2204f60c7fc0afdbf60508353b227787d06463")
  public open fun accessLogSetting(`value`: AccessLogSettingProperty.Builder.() -> Unit): Unit =
      accessLogSetting(AccessLogSettingProperty(`value`))

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

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f48e2f580c488dba0542c33ecdc280e4ae29d39f5bc48d3b11576d7d0c24333f")
  public open fun canarySetting(`value`: CanarySettingProperty.Builder.() -> Unit): Unit =
      canarySetting(CanarySettingProperty(`value`))

  public open fun clientCertificateId(): String? = unwrap(this).getClientCertificateId()

  public open fun clientCertificateId(`value`: String) {
    unwrap(this).setClientCertificateId(`value`)
  }

  public open fun deploymentId(): String? = unwrap(this).getDeploymentId()

  public open fun deploymentId(`value`: String) {
    unwrap(this).setDeploymentId(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun documentationVersion(): String? = unwrap(this).getDocumentationVersion()

  public open fun documentationVersion(`value`: String) {
    unwrap(this).setDocumentationVersion(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun methodSettings(): Any? = unwrap(this).getMethodSettings()

  public open fun methodSettings(`value`: IResolvable) {
    unwrap(this).setMethodSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun methodSettings(__idx_ac66f0: List<Any>) {
    unwrap(this).setMethodSettings(__idx_ac66f0)
  }

  public open fun restApiId(): String = unwrap(this).getRestApiId()

  public open fun restApiId(`value`: String) {
    unwrap(this).setRestApiId(`value`)
  }

  public open fun stageName(): String? = unwrap(this).getStageName()

  public open fun stageName(`value`: String) {
    unwrap(this).setStageName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
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

  public interface Builder {
    public fun accessLogSetting(accessLogSetting: IResolvable)

    public fun accessLogSetting(accessLogSetting: AccessLogSettingProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c182d978b7dedff90250af9aee40214a2b3d278d82215d67287cc7f5e7af711")
    public fun accessLogSetting(accessLogSetting: AccessLogSettingProperty.Builder.() -> Unit)

    public fun cacheClusterEnabled(cacheClusterEnabled: Boolean)

    public fun cacheClusterEnabled(cacheClusterEnabled: IResolvable)

    public fun cacheClusterSize(cacheClusterSize: String)

    public fun canarySetting(canarySetting: IResolvable)

    public fun canarySetting(canarySetting: CanarySettingProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b9415e9637474bf6490ccdf6676e055c9226e8ac346c5ac03361e54c4398ab16")
    public fun canarySetting(canarySetting: CanarySettingProperty.Builder.() -> Unit)

    public fun clientCertificateId(clientCertificateId: String)

    public fun deploymentId(deploymentId: String)

    public fun description(description: String)

    public fun documentationVersion(documentationVersion: String)

    public fun methodSettings(methodSettings: IResolvable)

    public fun methodSettings(methodSettings: List<Any>)

    public fun restApiId(restApiId: String)

    public fun stageName(stageName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tracingEnabled(tracingEnabled: Boolean)

    public fun tracingEnabled(tracingEnabled: IResolvable)

    public fun variables(variables: IResolvable)

    public fun variables(variables: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnStage.Builder =
        software.amazon.awscdk.services.apigateway.CfnStage.Builder.create(scope, id)

    override fun accessLogSetting(accessLogSetting: IResolvable) {
      cdkBuilder.accessLogSetting(accessLogSetting.let(IResolvable::unwrap))
    }

    override fun accessLogSetting(accessLogSetting: AccessLogSettingProperty) {
      cdkBuilder.accessLogSetting(accessLogSetting.let(AccessLogSettingProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c182d978b7dedff90250af9aee40214a2b3d278d82215d67287cc7f5e7af711")
    override fun accessLogSetting(accessLogSetting: AccessLogSettingProperty.Builder.() -> Unit):
        Unit = accessLogSetting(AccessLogSettingProperty(accessLogSetting))

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

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b9415e9637474bf6490ccdf6676e055c9226e8ac346c5ac03361e54c4398ab16")
    override fun canarySetting(canarySetting: CanarySettingProperty.Builder.() -> Unit): Unit =
        canarySetting(CanarySettingProperty(canarySetting))

    override fun clientCertificateId(clientCertificateId: String) {
      cdkBuilder.clientCertificateId(clientCertificateId)
    }

    override fun deploymentId(deploymentId: String) {
      cdkBuilder.deploymentId(deploymentId)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun documentationVersion(documentationVersion: String) {
      cdkBuilder.documentationVersion(documentationVersion)
    }

    override fun methodSettings(methodSettings: IResolvable) {
      cdkBuilder.methodSettings(methodSettings.let(IResolvable::unwrap))
    }

    override fun methodSettings(methodSettings: List<Any>) {
      cdkBuilder.methodSettings(methodSettings)
    }

    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
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

    public fun build(): software.amazon.awscdk.services.apigateway.CfnStage = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStage {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStage(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnStage): CfnStage =
        CfnStage(cdkObject)

    internal fun unwrap(wrapped: CfnStage): software.amazon.awscdk.services.apigateway.CfnStage =
        wrapped.cdkObject
  }

  public interface AccessLogSettingProperty {
    public fun destinationArn(): String? = unwrap(this).getDestinationArn()

    public fun format(): String? = unwrap(this).getFormat()

    public interface Builder {
      public fun destinationArn(destinationArn: String)

      public fun format(format: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigateway.CfnStage.AccessLogSettingProperty.Builder =
          software.amazon.awscdk.services.apigateway.CfnStage.AccessLogSettingProperty.builder()

      override fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
      }

      override fun format(format: String) {
        cdkBuilder.format(format)
      }

      public fun build():
          software.amazon.awscdk.services.apigateway.CfnStage.AccessLogSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apigateway.CfnStage.AccessLogSettingProperty,
    ) : AccessLogSettingProperty {
      override fun destinationArn(): String? = unwrap(this).getDestinationArn()

      override fun format(): String? = unwrap(this).getFormat()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AccessLogSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnStage.AccessLogSettingProperty):
          AccessLogSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessLogSettingProperty):
          software.amazon.awscdk.services.apigateway.CfnStage.AccessLogSettingProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CanarySettingProperty {
    public fun deploymentId(): String? = unwrap(this).getDeploymentId()

    public fun percentTraffic(): Number? = unwrap(this).getPercentTraffic()

    public fun stageVariableOverrides(): Any? = unwrap(this).getStageVariableOverrides()

    public fun useStageCache(): Any? = unwrap(this).getUseStageCache()

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
          software.amazon.awscdk.services.apigateway.CfnStage.CanarySettingProperty.Builder =
          software.amazon.awscdk.services.apigateway.CfnStage.CanarySettingProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.apigateway.CfnStage.CanarySettingProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apigateway.CfnStage.CanarySettingProperty,
    ) : CanarySettingProperty {
      override fun deploymentId(): String? = unwrap(this).getDeploymentId()

      override fun percentTraffic(): Number? = unwrap(this).getPercentTraffic()

      override fun stageVariableOverrides(): Any? = unwrap(this).getStageVariableOverrides()

      override fun useStageCache(): Any? = unwrap(this).getUseStageCache()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CanarySettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnStage.CanarySettingProperty):
          CanarySettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CanarySettingProperty):
          software.amazon.awscdk.services.apigateway.CfnStage.CanarySettingProperty = (wrapped as
          Wrapper).cdkObject
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
      public fun cacheDataEncrypted(cacheDataEncrypted: Boolean)

      public fun cacheDataEncrypted(cacheDataEncrypted: IResolvable)

      public fun cacheTtlInSeconds(cacheTtlInSeconds: Number)

      public fun cachingEnabled(cachingEnabled: Boolean)

      public fun cachingEnabled(cachingEnabled: IResolvable)

      public fun dataTraceEnabled(dataTraceEnabled: Boolean)

      public fun dataTraceEnabled(dataTraceEnabled: IResolvable)

      public fun httpMethod(httpMethod: String)

      public fun loggingLevel(loggingLevel: String)

      public fun metricsEnabled(metricsEnabled: Boolean)

      public fun metricsEnabled(metricsEnabled: IResolvable)

      public fun resourcePath(resourcePath: String)

      public fun throttlingBurstLimit(throttlingBurstLimit: Number)

      public fun throttlingRateLimit(throttlingRateLimit: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigateway.CfnStage.MethodSettingProperty.Builder =
          software.amazon.awscdk.services.apigateway.CfnStage.MethodSettingProperty.builder()

      override fun cacheDataEncrypted(cacheDataEncrypted: Boolean) {
        cdkBuilder.cacheDataEncrypted(cacheDataEncrypted)
      }

      override fun cacheDataEncrypted(cacheDataEncrypted: IResolvable) {
        cdkBuilder.cacheDataEncrypted(cacheDataEncrypted.let(IResolvable::unwrap))
      }

      override fun cacheTtlInSeconds(cacheTtlInSeconds: Number) {
        cdkBuilder.cacheTtlInSeconds(cacheTtlInSeconds)
      }

      override fun cachingEnabled(cachingEnabled: Boolean) {
        cdkBuilder.cachingEnabled(cachingEnabled)
      }

      override fun cachingEnabled(cachingEnabled: IResolvable) {
        cdkBuilder.cachingEnabled(cachingEnabled.let(IResolvable::unwrap))
      }

      override fun dataTraceEnabled(dataTraceEnabled: Boolean) {
        cdkBuilder.dataTraceEnabled(dataTraceEnabled)
      }

      override fun dataTraceEnabled(dataTraceEnabled: IResolvable) {
        cdkBuilder.dataTraceEnabled(dataTraceEnabled.let(IResolvable::unwrap))
      }

      override fun httpMethod(httpMethod: String) {
        cdkBuilder.httpMethod(httpMethod)
      }

      override fun loggingLevel(loggingLevel: String) {
        cdkBuilder.loggingLevel(loggingLevel)
      }

      override fun metricsEnabled(metricsEnabled: Boolean) {
        cdkBuilder.metricsEnabled(metricsEnabled)
      }

      override fun metricsEnabled(metricsEnabled: IResolvable) {
        cdkBuilder.metricsEnabled(metricsEnabled.let(IResolvable::unwrap))
      }

      override fun resourcePath(resourcePath: String) {
        cdkBuilder.resourcePath(resourcePath)
      }

      override fun throttlingBurstLimit(throttlingBurstLimit: Number) {
        cdkBuilder.throttlingBurstLimit(throttlingBurstLimit)
      }

      override fun throttlingRateLimit(throttlingRateLimit: Number) {
        cdkBuilder.throttlingRateLimit(throttlingRateLimit)
      }

      public fun build(): software.amazon.awscdk.services.apigateway.CfnStage.MethodSettingProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apigateway.CfnStage.MethodSettingProperty,
    ) : MethodSettingProperty {
      override fun cacheDataEncrypted(): Any? = unwrap(this).getCacheDataEncrypted()

      override fun cacheTtlInSeconds(): Number? = unwrap(this).getCacheTtlInSeconds()

      override fun cachingEnabled(): Any? = unwrap(this).getCachingEnabled()

      override fun dataTraceEnabled(): Any? = unwrap(this).getDataTraceEnabled()

      override fun httpMethod(): String? = unwrap(this).getHttpMethod()

      override fun loggingLevel(): String? = unwrap(this).getLoggingLevel()

      override fun metricsEnabled(): Any? = unwrap(this).getMetricsEnabled()

      override fun resourcePath(): String? = unwrap(this).getResourcePath()

      override fun throttlingBurstLimit(): Number? = unwrap(this).getThrottlingBurstLimit()

      override fun throttlingRateLimit(): Number? = unwrap(this).getThrottlingRateLimit()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MethodSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnStage.MethodSettingProperty):
          MethodSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MethodSettingProperty):
          software.amazon.awscdk.services.apigateway.CfnStage.MethodSettingProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
