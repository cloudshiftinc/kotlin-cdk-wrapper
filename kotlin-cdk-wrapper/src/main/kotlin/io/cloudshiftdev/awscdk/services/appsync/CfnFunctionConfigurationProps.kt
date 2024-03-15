@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnFunctionConfigurationProps {
  public fun apiId(): String

  public fun code(): String? = unwrap(this).getCode()

  public fun codeS3Location(): String? = unwrap(this).getCodeS3Location()

  public fun dataSourceName(): String

  public fun description(): String? = unwrap(this).getDescription()

  public fun functionVersion(): String? = unwrap(this).getFunctionVersion()

  public fun maxBatchSize(): Number? = unwrap(this).getMaxBatchSize()

  public fun name(): String

  public fun requestMappingTemplate(): String? = unwrap(this).getRequestMappingTemplate()

  public fun requestMappingTemplateS3Location(): String? =
      unwrap(this).getRequestMappingTemplateS3Location()

  public fun responseMappingTemplate(): String? = unwrap(this).getResponseMappingTemplate()

  public fun responseMappingTemplateS3Location(): String? =
      unwrap(this).getResponseMappingTemplateS3Location()

  public fun runtime(): Any? = unwrap(this).getRuntime()

  public fun syncConfig(): Any? = unwrap(this).getSyncConfig()

  @CdkDslMarker
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

    public fun runtime(runtime: CfnFunctionConfiguration.AppSyncRuntimeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cd6b0850a1d43aff3e81e6e3b0f9ba43d82c92c6943f29c1fff4a36ec4eb1031")
    public fun runtime(runtime: CfnFunctionConfiguration.AppSyncRuntimeProperty.Builder.() -> Unit)

    public fun syncConfig(syncConfig: IResolvable)

    public fun syncConfig(syncConfig: CfnFunctionConfiguration.SyncConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aeed83ee53c56109cd9d37578a4f165b3e5d7b143c751ff5b5ba77bee42a2125")
    public
        fun syncConfig(syncConfig: CfnFunctionConfiguration.SyncConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps.Builder =
        software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps.builder()

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

    override fun runtime(runtime: CfnFunctionConfiguration.AppSyncRuntimeProperty) {
      cdkBuilder.runtime(runtime.let(CfnFunctionConfiguration.AppSyncRuntimeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cd6b0850a1d43aff3e81e6e3b0f9ba43d82c92c6943f29c1fff4a36ec4eb1031")
    override
        fun runtime(runtime: CfnFunctionConfiguration.AppSyncRuntimeProperty.Builder.() -> Unit):
        Unit = runtime(CfnFunctionConfiguration.AppSyncRuntimeProperty(runtime))

    override fun syncConfig(syncConfig: IResolvable) {
      cdkBuilder.syncConfig(syncConfig.let(IResolvable::unwrap))
    }

    override fun syncConfig(syncConfig: CfnFunctionConfiguration.SyncConfigProperty) {
      cdkBuilder.syncConfig(syncConfig.let(CfnFunctionConfiguration.SyncConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aeed83ee53c56109cd9d37578a4f165b3e5d7b143c751ff5b5ba77bee42a2125")
    override
        fun syncConfig(syncConfig: CfnFunctionConfiguration.SyncConfigProperty.Builder.() -> Unit):
        Unit = syncConfig(CfnFunctionConfiguration.SyncConfigProperty(syncConfig))

    public fun build(): software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps,
  ) : CdkObject(cdkObject), CfnFunctionConfigurationProps {
    override fun apiId(): String = unwrap(this).getApiId()

    override fun code(): String? = unwrap(this).getCode()

    override fun codeS3Location(): String? = unwrap(this).getCodeS3Location()

    override fun dataSourceName(): String = unwrap(this).getDataSourceName()

    override fun description(): String? = unwrap(this).getDescription()

    override fun functionVersion(): String? = unwrap(this).getFunctionVersion()

    override fun maxBatchSize(): Number? = unwrap(this).getMaxBatchSize()

    override fun name(): String = unwrap(this).getName()

    override fun requestMappingTemplate(): String? = unwrap(this).getRequestMappingTemplate()

    override fun requestMappingTemplateS3Location(): String? =
        unwrap(this).getRequestMappingTemplateS3Location()

    override fun responseMappingTemplate(): String? = unwrap(this).getResponseMappingTemplate()

    override fun responseMappingTemplateS3Location(): String? =
        unwrap(this).getResponseMappingTemplateS3Location()

    override fun runtime(): Any? = unwrap(this).getRuntime()

    override fun syncConfig(): Any? = unwrap(this).getSyncConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFunctionConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps):
        CfnFunctionConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFunctionConfigurationProps):
        software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps
  }
}
