package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnResolver internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appsync.CfnResolver,
) : CfnResource(cdkObject), IInspectable {
  public open fun apiId(): String = unwrap(this).getApiId()

  public open fun apiId(`value`: String) {
    unwrap(this).setApiId(`value`)
  }

  public open fun attrFieldName(): String = unwrap(this).getAttrFieldName()

  public open fun attrResolverArn(): String = unwrap(this).getAttrResolverArn()

  public open fun attrTypeName(): String = unwrap(this).getAttrTypeName()

  public open fun cachingConfig(): Any? = unwrap(this).getCachingConfig()

  public open fun cachingConfig(`value`: IResolvable) {
    unwrap(this).setCachingConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun cachingConfig(`value`: CachingConfigProperty) {
    unwrap(this).setCachingConfig(`value`.let(CachingConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7eb54489451f3df1c67b07d9cd3755b4990477a08162b989a812126bff06aad7")
  public open fun cachingConfig(`value`: CachingConfigProperty.Builder.() -> Unit): Unit =
      cachingConfig(CachingConfigProperty(`value`))

  public open fun code(): String? = unwrap(this).getCode()

  public open fun code(`value`: String) {
    unwrap(this).setCode(`value`)
  }

  public open fun codeS3Location(): String? = unwrap(this).getCodeS3Location()

  public open fun codeS3Location(`value`: String) {
    unwrap(this).setCodeS3Location(`value`)
  }

  public open fun dataSourceName(): String? = unwrap(this).getDataSourceName()

  public open fun dataSourceName(`value`: String) {
    unwrap(this).setDataSourceName(`value`)
  }

  public open fun fieldName(): String = unwrap(this).getFieldName()

  public open fun fieldName(`value`: String) {
    unwrap(this).setFieldName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kind(): String? = unwrap(this).getKind()

  public open fun kind(`value`: String) {
    unwrap(this).setKind(`value`)
  }

  public open fun maxBatchSize(): Number? = unwrap(this).getMaxBatchSize()

  public open fun maxBatchSize(`value`: Number) {
    unwrap(this).setMaxBatchSize(`value`)
  }

  public open fun metricsConfig(): String? = unwrap(this).getMetricsConfig()

  public open fun metricsConfig(`value`: String) {
    unwrap(this).setMetricsConfig(`value`)
  }

  public open fun pipelineConfig(): Any? = unwrap(this).getPipelineConfig()

  public open fun pipelineConfig(`value`: IResolvable) {
    unwrap(this).setPipelineConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun pipelineConfig(`value`: PipelineConfigProperty) {
    unwrap(this).setPipelineConfig(`value`.let(PipelineConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("332ebf50e99b3ff78336f8be68e8bbc1b92949df4bf7fb716f255b781f130675")
  public open fun pipelineConfig(`value`: PipelineConfigProperty.Builder.() -> Unit): Unit =
      pipelineConfig(PipelineConfigProperty(`value`))

  public open fun requestMappingTemplate(): String? = unwrap(this).getRequestMappingTemplate()

  public open fun requestMappingTemplate(`value`: String) {
    unwrap(this).setRequestMappingTemplate(`value`)
  }

  public open fun requestMappingTemplateS3Location(): String? =
      unwrap(this).getRequestMappingTemplateS3Location()

  public open fun requestMappingTemplateS3Location(`value`: String) {
    unwrap(this).setRequestMappingTemplateS3Location(`value`)
  }

  public open fun responseMappingTemplate(): String? = unwrap(this).getResponseMappingTemplate()

  public open fun responseMappingTemplate(`value`: String) {
    unwrap(this).setResponseMappingTemplate(`value`)
  }

  public open fun responseMappingTemplateS3Location(): String? =
      unwrap(this).getResponseMappingTemplateS3Location()

  public open fun responseMappingTemplateS3Location(`value`: String) {
    unwrap(this).setResponseMappingTemplateS3Location(`value`)
  }

  public open fun runtime(): Any? = unwrap(this).getRuntime()

  public open fun runtime(`value`: IResolvable) {
    unwrap(this).setRuntime(`value`.let(IResolvable::unwrap))
  }

  public open fun runtime(`value`: AppSyncRuntimeProperty) {
    unwrap(this).setRuntime(`value`.let(AppSyncRuntimeProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("627f74e4a4bf4783bdaa65f7751cd0ddbebecdcf1fa58cf43bd49e1f40abd3f4")
  public open fun runtime(`value`: AppSyncRuntimeProperty.Builder.() -> Unit): Unit =
      runtime(AppSyncRuntimeProperty(`value`))

  public open fun syncConfig(): Any? = unwrap(this).getSyncConfig()

  public open fun syncConfig(`value`: IResolvable) {
    unwrap(this).setSyncConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun syncConfig(`value`: SyncConfigProperty) {
    unwrap(this).setSyncConfig(`value`.let(SyncConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("886c30fa03847637225c53f219d176ab77adfe5c25c94ba0d9919a0083d9dc9f")
  public open fun syncConfig(`value`: SyncConfigProperty.Builder.() -> Unit): Unit =
      syncConfig(SyncConfigProperty(`value`))

  public open fun typeName(): String = unwrap(this).getTypeName()

  public open fun typeName(`value`: String) {
    unwrap(this).setTypeName(`value`)
  }

  public interface Builder {
    public fun apiId(apiId: String)

    public fun cachingConfig(cachingConfig: IResolvable)

    public fun cachingConfig(cachingConfig: CachingConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("feb6883d5ebccdcb3af3fe870e56e03d1c90be563b00a40e759b4e901f8bdd66")
    public fun cachingConfig(cachingConfig: CachingConfigProperty.Builder.() -> Unit)

    public fun code(code: String)

    public fun codeS3Location(codeS3Location: String)

    public fun dataSourceName(dataSourceName: String)

    public fun fieldName(fieldName: String)

    public fun kind(kind: String)

    public fun maxBatchSize(maxBatchSize: Number)

    public fun metricsConfig(metricsConfig: String)

    public fun pipelineConfig(pipelineConfig: IResolvable)

    public fun pipelineConfig(pipelineConfig: PipelineConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cf35ea4a60ade7451477b791c4aa18cfd175c94e31d542330d3b46894db9e00")
    public fun pipelineConfig(pipelineConfig: PipelineConfigProperty.Builder.() -> Unit)

    public fun requestMappingTemplate(requestMappingTemplate: String)

    public fun requestMappingTemplateS3Location(requestMappingTemplateS3Location: String)

    public fun responseMappingTemplate(responseMappingTemplate: String)

    public fun responseMappingTemplateS3Location(responseMappingTemplateS3Location: String)

    public fun runtime(runtime: IResolvable)

    public fun runtime(runtime: AppSyncRuntimeProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("47b90c8f87bdd56a3ba452cd8e3c7a0ac8a362d4caf4e287a29b39374193ad99")
    public fun runtime(runtime: AppSyncRuntimeProperty.Builder.() -> Unit)

    public fun syncConfig(syncConfig: IResolvable)

    public fun syncConfig(syncConfig: SyncConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f308986b1408b28d91fae6da2af586686d81d70f342d1bfa39f7fb10f2bfa9ba")
    public fun syncConfig(syncConfig: SyncConfigProperty.Builder.() -> Unit)

    public fun typeName(typeName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.CfnResolver.Builder =
        software.amazon.awscdk.services.appsync.CfnResolver.Builder.create(scope, id)

    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    override fun cachingConfig(cachingConfig: IResolvable) {
      cdkBuilder.cachingConfig(cachingConfig.let(IResolvable::unwrap))
    }

    override fun cachingConfig(cachingConfig: CachingConfigProperty) {
      cdkBuilder.cachingConfig(cachingConfig.let(CachingConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("feb6883d5ebccdcb3af3fe870e56e03d1c90be563b00a40e759b4e901f8bdd66")
    override fun cachingConfig(cachingConfig: CachingConfigProperty.Builder.() -> Unit): Unit =
        cachingConfig(CachingConfigProperty(cachingConfig))

    override fun code(code: String) {
      cdkBuilder.code(code)
    }

    override fun codeS3Location(codeS3Location: String) {
      cdkBuilder.codeS3Location(codeS3Location)
    }

    override fun dataSourceName(dataSourceName: String) {
      cdkBuilder.dataSourceName(dataSourceName)
    }

    override fun fieldName(fieldName: String) {
      cdkBuilder.fieldName(fieldName)
    }

    override fun kind(kind: String) {
      cdkBuilder.kind(kind)
    }

    override fun maxBatchSize(maxBatchSize: Number) {
      cdkBuilder.maxBatchSize(maxBatchSize)
    }

    override fun metricsConfig(metricsConfig: String) {
      cdkBuilder.metricsConfig(metricsConfig)
    }

    override fun pipelineConfig(pipelineConfig: IResolvable) {
      cdkBuilder.pipelineConfig(pipelineConfig.let(IResolvable::unwrap))
    }

    override fun pipelineConfig(pipelineConfig: PipelineConfigProperty) {
      cdkBuilder.pipelineConfig(pipelineConfig.let(PipelineConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cf35ea4a60ade7451477b791c4aa18cfd175c94e31d542330d3b46894db9e00")
    override fun pipelineConfig(pipelineConfig: PipelineConfigProperty.Builder.() -> Unit): Unit =
        pipelineConfig(PipelineConfigProperty(pipelineConfig))

    override fun requestMappingTemplate(requestMappingTemplate: String) {
      cdkBuilder.requestMappingTemplate(requestMappingTemplate)
    }

    override fun requestMappingTemplateS3Location(requestMappingTemplateS3Location: String) {
      cdkBuilder.requestMappingTemplateS3Location(requestMappingTemplateS3Location)
    }

    override fun responseMappingTemplate(responseMappingTemplate: String) {
      cdkBuilder.responseMappingTemplate(responseMappingTemplate)
    }

    override fun responseMappingTemplateS3Location(responseMappingTemplateS3Location: String) {
      cdkBuilder.responseMappingTemplateS3Location(responseMappingTemplateS3Location)
    }

    override fun runtime(runtime: IResolvable) {
      cdkBuilder.runtime(runtime.let(IResolvable::unwrap))
    }

    override fun runtime(runtime: AppSyncRuntimeProperty) {
      cdkBuilder.runtime(runtime.let(AppSyncRuntimeProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("47b90c8f87bdd56a3ba452cd8e3c7a0ac8a362d4caf4e287a29b39374193ad99")
    override fun runtime(runtime: AppSyncRuntimeProperty.Builder.() -> Unit): Unit =
        runtime(AppSyncRuntimeProperty(runtime))

    override fun syncConfig(syncConfig: IResolvable) {
      cdkBuilder.syncConfig(syncConfig.let(IResolvable::unwrap))
    }

    override fun syncConfig(syncConfig: SyncConfigProperty) {
      cdkBuilder.syncConfig(syncConfig.let(SyncConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f308986b1408b28d91fae6da2af586686d81d70f342d1bfa39f7fb10f2bfa9ba")
    override fun syncConfig(syncConfig: SyncConfigProperty.Builder.() -> Unit): Unit =
        syncConfig(SyncConfigProperty(syncConfig))

    override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

    public fun build(): software.amazon.awscdk.services.appsync.CfnResolver = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResolver {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResolver(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnResolver): CfnResolver =
        CfnResolver(cdkObject)

    internal fun unwrap(wrapped: CfnResolver): software.amazon.awscdk.services.appsync.CfnResolver =
        wrapped.cdkObject
  }

  public interface SyncConfigProperty {
    public fun conflictDetection(): String

    public fun conflictHandler(): String? = unwrap(this).getConflictHandler()

    public fun lambdaConflictHandlerConfig(): Any? = unwrap(this).getLambdaConflictHandlerConfig()

    public interface Builder {
      public fun conflictDetection(conflictDetection: String)

      public fun conflictHandler(conflictHandler: String)

      public fun lambdaConflictHandlerConfig(lambdaConflictHandlerConfig: IResolvable)

      public
          fun lambdaConflictHandlerConfig(lambdaConflictHandlerConfig: LambdaConflictHandlerConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ace0a826fb44d4c814a0bfdda93f28f3ec2824e57095836c154b44683307bfa6")
      public
          fun lambdaConflictHandlerConfig(lambdaConflictHandlerConfig: LambdaConflictHandlerConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnResolver.SyncConfigProperty.Builder =
          software.amazon.awscdk.services.appsync.CfnResolver.SyncConfigProperty.builder()

      override fun conflictDetection(conflictDetection: String) {
        cdkBuilder.conflictDetection(conflictDetection)
      }

      override fun conflictHandler(conflictHandler: String) {
        cdkBuilder.conflictHandler(conflictHandler)
      }

      override fun lambdaConflictHandlerConfig(lambdaConflictHandlerConfig: IResolvable) {
        cdkBuilder.lambdaConflictHandlerConfig(lambdaConflictHandlerConfig.let(IResolvable::unwrap))
      }

      override
          fun lambdaConflictHandlerConfig(lambdaConflictHandlerConfig: LambdaConflictHandlerConfigProperty) {
        cdkBuilder.lambdaConflictHandlerConfig(lambdaConflictHandlerConfig.let(LambdaConflictHandlerConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ace0a826fb44d4c814a0bfdda93f28f3ec2824e57095836c154b44683307bfa6")
      override
          fun lambdaConflictHandlerConfig(lambdaConflictHandlerConfig: LambdaConflictHandlerConfigProperty.Builder.() -> Unit):
          Unit =
          lambdaConflictHandlerConfig(LambdaConflictHandlerConfigProperty(lambdaConflictHandlerConfig))

      public fun build(): software.amazon.awscdk.services.appsync.CfnResolver.SyncConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appsync.CfnResolver.SyncConfigProperty,
    ) : SyncConfigProperty {
      override fun conflictDetection(): String = unwrap(this).getConflictDetection()

      override fun conflictHandler(): String? = unwrap(this).getConflictHandler()

      override fun lambdaConflictHandlerConfig(): Any? =
          unwrap(this).getLambdaConflictHandlerConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SyncConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnResolver.SyncConfigProperty):
          SyncConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SyncConfigProperty):
          software.amazon.awscdk.services.appsync.CfnResolver.SyncConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PipelineConfigProperty {
    public fun functions(): List<String> = unwrap(this).getFunctions() ?: emptyList()

    public interface Builder {
      public fun functions(functions: List<String>)

      public fun functions(vararg functions: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnResolver.PipelineConfigProperty.Builder =
          software.amazon.awscdk.services.appsync.CfnResolver.PipelineConfigProperty.builder()

      override fun functions(functions: List<String>) {
        cdkBuilder.functions(functions)
      }

      override fun functions(vararg functions: String): Unit = functions(functions.toList())

      public fun build(): software.amazon.awscdk.services.appsync.CfnResolver.PipelineConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appsync.CfnResolver.PipelineConfigProperty,
    ) : PipelineConfigProperty {
      override fun functions(): List<String> = unwrap(this).getFunctions() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PipelineConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnResolver.PipelineConfigProperty):
          PipelineConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipelineConfigProperty):
          software.amazon.awscdk.services.appsync.CfnResolver.PipelineConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AppSyncRuntimeProperty {
    public fun name(): String

    public fun runtimeVersion(): String

    public interface Builder {
      public fun name(name: String)

      public fun runtimeVersion(runtimeVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnResolver.AppSyncRuntimeProperty.Builder =
          software.amazon.awscdk.services.appsync.CfnResolver.AppSyncRuntimeProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun runtimeVersion(runtimeVersion: String) {
        cdkBuilder.runtimeVersion(runtimeVersion)
      }

      public fun build(): software.amazon.awscdk.services.appsync.CfnResolver.AppSyncRuntimeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appsync.CfnResolver.AppSyncRuntimeProperty,
    ) : AppSyncRuntimeProperty {
      override fun name(): String = unwrap(this).getName()

      override fun runtimeVersion(): String = unwrap(this).getRuntimeVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AppSyncRuntimeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnResolver.AppSyncRuntimeProperty):
          AppSyncRuntimeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AppSyncRuntimeProperty):
          software.amazon.awscdk.services.appsync.CfnResolver.AppSyncRuntimeProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LambdaConflictHandlerConfigProperty {
    public fun lambdaConflictHandlerArn(): String? = unwrap(this).getLambdaConflictHandlerArn()

    public interface Builder {
      public fun lambdaConflictHandlerArn(lambdaConflictHandlerArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnResolver.LambdaConflictHandlerConfigProperty.Builder
          =
          software.amazon.awscdk.services.appsync.CfnResolver.LambdaConflictHandlerConfigProperty.builder()

      override fun lambdaConflictHandlerArn(lambdaConflictHandlerArn: String) {
        cdkBuilder.lambdaConflictHandlerArn(lambdaConflictHandlerArn)
      }

      public fun build():
          software.amazon.awscdk.services.appsync.CfnResolver.LambdaConflictHandlerConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appsync.CfnResolver.LambdaConflictHandlerConfigProperty,
    ) : LambdaConflictHandlerConfigProperty {
      override fun lambdaConflictHandlerArn(): String? = unwrap(this).getLambdaConflictHandlerArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          LambdaConflictHandlerConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnResolver.LambdaConflictHandlerConfigProperty):
          LambdaConflictHandlerConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaConflictHandlerConfigProperty):
          software.amazon.awscdk.services.appsync.CfnResolver.LambdaConflictHandlerConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CachingConfigProperty {
    public fun cachingKeys(): List<String> = unwrap(this).getCachingKeys() ?: emptyList()

    public fun ttl(): Number

    public interface Builder {
      public fun cachingKeys(cachingKeys: List<String>)

      public fun cachingKeys(vararg cachingKeys: String)

      public fun ttl(ttl: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnResolver.CachingConfigProperty.Builder =
          software.amazon.awscdk.services.appsync.CfnResolver.CachingConfigProperty.builder()

      override fun cachingKeys(cachingKeys: List<String>) {
        cdkBuilder.cachingKeys(cachingKeys)
      }

      override fun cachingKeys(vararg cachingKeys: String): Unit = cachingKeys(cachingKeys.toList())

      override fun ttl(ttl: Number) {
        cdkBuilder.ttl(ttl)
      }

      public fun build(): software.amazon.awscdk.services.appsync.CfnResolver.CachingConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appsync.CfnResolver.CachingConfigProperty,
    ) : CachingConfigProperty {
      override fun cachingKeys(): List<String> = unwrap(this).getCachingKeys() ?: emptyList()

      override fun ttl(): Number = unwrap(this).getTtl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CachingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnResolver.CachingConfigProperty):
          CachingConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CachingConfigProperty):
          software.amazon.awscdk.services.appsync.CfnResolver.CachingConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
