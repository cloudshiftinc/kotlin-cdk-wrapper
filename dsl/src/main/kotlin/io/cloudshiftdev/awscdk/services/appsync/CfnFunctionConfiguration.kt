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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnFunctionConfiguration internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appsync.CfnFunctionConfiguration,
) : CfnResource(cdkObject), IInspectable {
  public open fun apiId(): String = unwrap(this).getApiId()

  public open fun apiId(`value`: String) {
    unwrap(this).setApiId(`value`)
  }

  public open fun attrDataSourceName(): String = unwrap(this).getAttrDataSourceName()

  public open fun attrFunctionArn(): String = unwrap(this).getAttrFunctionArn()

  public open fun attrFunctionId(): String = unwrap(this).getAttrFunctionId()

  public open fun attrName(): String = unwrap(this).getAttrName()

  public open fun code(): String? = unwrap(this).getCode()

  public open fun code(`value`: String) {
    unwrap(this).setCode(`value`)
  }

  public open fun codeS3Location(): String? = unwrap(this).getCodeS3Location()

  public open fun codeS3Location(`value`: String) {
    unwrap(this).setCodeS3Location(`value`)
  }

  public open fun dataSourceName(): String = unwrap(this).getDataSourceName()

  public open fun dataSourceName(`value`: String) {
    unwrap(this).setDataSourceName(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun functionVersion(): String? = unwrap(this).getFunctionVersion()

  public open fun functionVersion(`value`: String) {
    unwrap(this).setFunctionVersion(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun maxBatchSize(): Number? = unwrap(this).getMaxBatchSize()

  public open fun maxBatchSize(`value`: Number) {
    unwrap(this).setMaxBatchSize(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

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
  @JvmName("9a1d6a3831ca779af71957c41f9ca96de88cf0d67960548f4622ea6f8e51e2bf")
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
  @JvmName("6950e8658e31216bb8003ba03abe0db09da789cf35131cffc391cfb0036676b8")
  public open fun syncConfig(`value`: SyncConfigProperty.Builder.() -> Unit): Unit =
      syncConfig(SyncConfigProperty(`value`))

  public interface Builder {
    public fun apiId(apiId: String)

    public fun code(code: String)

    public fun codeS3Location(codeS3Location: String)

    public fun dataSourceName(dataSourceName: String)

    public fun description(description: String)

    public fun functionVersion(functionVersion: String)

    public fun maxBatchSize(maxBatchSize: Number)

    public fun name(name: String)

    public fun requestMappingTemplate(requestMappingTemplate: String)

    public fun requestMappingTemplateS3Location(requestMappingTemplateS3Location: String)

    public fun responseMappingTemplate(responseMappingTemplate: String)

    public fun responseMappingTemplateS3Location(responseMappingTemplateS3Location: String)

    public fun runtime(runtime: IResolvable)

    public fun runtime(runtime: AppSyncRuntimeProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aee9cb0c2eac2e09640b5ced407af5454fe685886a2105445fdb2d8de57a1d82")
    public fun runtime(runtime: AppSyncRuntimeProperty.Builder.() -> Unit)

    public fun syncConfig(syncConfig: IResolvable)

    public fun syncConfig(syncConfig: SyncConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3450b107b4f5a5b21242e26c0a0af06c4f469169b4ef550e40f90630e7386c4d")
    public fun syncConfig(syncConfig: SyncConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.Builder
        = software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.Builder.create(scope, id)

    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    override fun code(code: String) {
      cdkBuilder.code(code)
    }

    override fun codeS3Location(codeS3Location: String) {
      cdkBuilder.codeS3Location(codeS3Location)
    }

    override fun dataSourceName(dataSourceName: String) {
      cdkBuilder.dataSourceName(dataSourceName)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun functionVersion(functionVersion: String) {
      cdkBuilder.functionVersion(functionVersion)
    }

    override fun maxBatchSize(maxBatchSize: Number) {
      cdkBuilder.maxBatchSize(maxBatchSize)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

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
    @JvmName("aee9cb0c2eac2e09640b5ced407af5454fe685886a2105445fdb2d8de57a1d82")
    override fun runtime(runtime: AppSyncRuntimeProperty.Builder.() -> Unit): Unit =
        runtime(AppSyncRuntimeProperty(runtime))

    override fun syncConfig(syncConfig: IResolvable) {
      cdkBuilder.syncConfig(syncConfig.let(IResolvable::unwrap))
    }

    override fun syncConfig(syncConfig: SyncConfigProperty) {
      cdkBuilder.syncConfig(syncConfig.let(SyncConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3450b107b4f5a5b21242e26c0a0af06c4f469169b4ef550e40f90630e7386c4d")
    override fun syncConfig(syncConfig: SyncConfigProperty.Builder.() -> Unit): Unit =
        syncConfig(SyncConfigProperty(syncConfig))

    public fun build(): software.amazon.awscdk.services.appsync.CfnFunctionConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFunctionConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFunctionConfiguration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnFunctionConfiguration):
        CfnFunctionConfiguration = CfnFunctionConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnFunctionConfiguration):
        software.amazon.awscdk.services.appsync.CfnFunctionConfiguration = wrapped.cdkObject
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
      @JvmName("47ad2842ecf8112948437414f67c14c27c4b47f5312b81cf98b245cd5a28ebc2")
      public
          fun lambdaConflictHandlerConfig(lambdaConflictHandlerConfig: LambdaConflictHandlerConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.SyncConfigProperty.Builder
          =
          software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.SyncConfigProperty.builder()

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
      @JvmName("47ad2842ecf8112948437414f67c14c27c4b47f5312b81cf98b245cd5a28ebc2")
      override
          fun lambdaConflictHandlerConfig(lambdaConflictHandlerConfig: LambdaConflictHandlerConfigProperty.Builder.() -> Unit):
          Unit =
          lambdaConflictHandlerConfig(LambdaConflictHandlerConfigProperty(lambdaConflictHandlerConfig))

      public fun build():
          software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.SyncConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.SyncConfigProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.SyncConfigProperty):
          SyncConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SyncConfigProperty):
          software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.SyncConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface LambdaConflictHandlerConfigProperty {
    public fun lambdaConflictHandlerArn(): String? = unwrap(this).getLambdaConflictHandlerArn()

    public interface Builder {
      public fun lambdaConflictHandlerArn(lambdaConflictHandlerArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.LambdaConflictHandlerConfigProperty.Builder
          =
          software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.LambdaConflictHandlerConfigProperty.builder()

      override fun lambdaConflictHandlerArn(lambdaConflictHandlerArn: String) {
        cdkBuilder.lambdaConflictHandlerArn(lambdaConflictHandlerArn)
      }

      public fun build():
          software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.LambdaConflictHandlerConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.LambdaConflictHandlerConfigProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.LambdaConflictHandlerConfigProperty):
          LambdaConflictHandlerConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaConflictHandlerConfigProperty):
          software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.LambdaConflictHandlerConfigProperty
          = (wrapped as Wrapper).cdkObject
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
          software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.AppSyncRuntimeProperty.Builder
          =
          software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.AppSyncRuntimeProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun runtimeVersion(runtimeVersion: String) {
        cdkBuilder.runtimeVersion(runtimeVersion)
      }

      public fun build():
          software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.AppSyncRuntimeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.AppSyncRuntimeProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.AppSyncRuntimeProperty):
          AppSyncRuntimeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AppSyncRuntimeProperty):
          software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.AppSyncRuntimeProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
