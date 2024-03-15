@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class AppsyncFunction internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appsync.AppsyncFunction,
) : Resource(cdkObject), IAppsyncFunction {
  public open fun dataSource(): BaseDataSource =
      unwrap(this).getDataSource().let(BaseDataSource::wrap)

  public override fun functionArn(): String = unwrap(this).getFunctionArn()

  public override fun functionId(): String = unwrap(this).getFunctionId()

  public open fun functionName(): String = unwrap(this).getFunctionName()

  @CdkDslMarker
  public interface Builder {
    public fun api(api: IGraphqlApi)

    public fun code(code: Code)

    public fun dataSource(dataSource: BaseDataSource)

    public fun description(description: String)

    public fun name(name: String)

    public fun requestMappingTemplate(requestMappingTemplate: MappingTemplate)

    public fun responseMappingTemplate(responseMappingTemplate: MappingTemplate)

    public fun runtime(runtime: FunctionRuntime)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.AppsyncFunction.Builder =
        software.amazon.awscdk.services.appsync.AppsyncFunction.Builder.create(scope, id)

    override fun api(api: IGraphqlApi) {
      cdkBuilder.api(api.let(IGraphqlApi::unwrap))
    }

    override fun code(code: Code) {
      cdkBuilder.code(code.let(Code::unwrap))
    }

    override fun dataSource(dataSource: BaseDataSource) {
      cdkBuilder.dataSource(dataSource.let(BaseDataSource::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun requestMappingTemplate(requestMappingTemplate: MappingTemplate) {
      cdkBuilder.requestMappingTemplate(requestMappingTemplate.let(MappingTemplate::unwrap))
    }

    override fun responseMappingTemplate(responseMappingTemplate: MappingTemplate) {
      cdkBuilder.responseMappingTemplate(responseMappingTemplate.let(MappingTemplate::unwrap))
    }

    override fun runtime(runtime: FunctionRuntime) {
      cdkBuilder.runtime(runtime.let(FunctionRuntime::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.AppsyncFunction = cdkBuilder.build()
  }

  public companion object {
    public fun fromAppsyncFunctionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: AppsyncFunctionAttributes,
    ): IAppsyncFunction =
        software.amazon.awscdk.services.appsync.AppsyncFunction.fromAppsyncFunctionAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(AppsyncFunctionAttributes::unwrap)).let(IAppsyncFunction::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed7ecc1286cc2b7d138724c3b9dd94d5d96e306586089852133a6f7882c79ee2")
    public fun fromAppsyncFunctionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: AppsyncFunctionAttributes.Builder.() -> Unit,
    ): IAppsyncFunction = fromAppsyncFunctionAttributes(scope, id, AppsyncFunctionAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): AppsyncFunction {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return AppsyncFunction(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AppsyncFunction):
        AppsyncFunction = AppsyncFunction(cdkObject)

    internal fun unwrap(wrapped: AppsyncFunction):
        software.amazon.awscdk.services.appsync.AppsyncFunction = wrapped.cdkObject
  }
}
