package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class AppsyncFunction internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appsync.AppsyncFunction,
) : Resource(cdkObject), IAppsyncFunction {
  /**
   * the data source of this AppSync Function.
   */
  public open fun dataSource(): BaseDataSource =
      unwrap(this).getDataSource().let(BaseDataSource::wrap)

  /**
   * the ARN of the AppSync function.
   */
  public override fun functionArn(): String = unwrap(this).getFunctionArn()

  /**
   * the ID of the AppSync function.
   */
  public override fun functionId(): String = unwrap(this).getFunctionId()

  /**
   * the name of this AppSync Function.
   */
  public open fun functionName(): String = unwrap(this).getFunctionName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appsync.AppsyncFunction].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * the GraphQL Api linked to this AppSync Function.
     *
     * @param api the GraphQL Api linked to this AppSync Function. 
     */
    public fun api(api: IGraphqlApi)

    /**
     * The function code.
     *
     * Default: - no code is used
     *
     * @param code The function code. 
     */
    public fun code(code: Code)

    /**
     * the data source linked to this AppSync Function.
     *
     * @param dataSource the data source linked to this AppSync Function. 
     */
    public fun dataSource(dataSource: BaseDataSource)

    /**
     * the description for this AppSync Function.
     *
     * Default: - no description
     *
     * @param description the description for this AppSync Function. 
     */
    public fun description(description: String)

    /**
     * the name of the AppSync Function.
     *
     * @param name the name of the AppSync Function. 
     */
    public fun name(name: String)

    /**
     * the request mapping template for the AppSync Function.
     *
     * Default: - no request mapping template
     *
     * @param requestMappingTemplate the request mapping template for the AppSync Function. 
     */
    public fun requestMappingTemplate(requestMappingTemplate: MappingTemplate)

    /**
     * the response mapping template for the AppSync Function.
     *
     * Default: - no response mapping template
     *
     * @param responseMappingTemplate the response mapping template for the AppSync Function. 
     */
    public fun responseMappingTemplate(responseMappingTemplate: MappingTemplate)

    /**
     * The functions runtime.
     *
     * Default: - no function runtime, VTL mapping templates used
     *
     * @param runtime The functions runtime. 
     */
    public fun runtime(runtime: FunctionRuntime)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.AppsyncFunction.Builder =
        software.amazon.awscdk.services.appsync.AppsyncFunction.Builder.create(scope, id)

    /**
     * the GraphQL Api linked to this AppSync Function.
     *
     * @param api the GraphQL Api linked to this AppSync Function. 
     */
    override fun api(api: IGraphqlApi) {
      cdkBuilder.api(api.let(IGraphqlApi::unwrap))
    }

    /**
     * The function code.
     *
     * Default: - no code is used
     *
     * @param code The function code. 
     */
    override fun code(code: Code) {
      cdkBuilder.code(code.let(Code::unwrap))
    }

    /**
     * the data source linked to this AppSync Function.
     *
     * @param dataSource the data source linked to this AppSync Function. 
     */
    override fun dataSource(dataSource: BaseDataSource) {
      cdkBuilder.dataSource(dataSource.let(BaseDataSource::unwrap))
    }

    /**
     * the description for this AppSync Function.
     *
     * Default: - no description
     *
     * @param description the description for this AppSync Function. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * the name of the AppSync Function.
     *
     * @param name the name of the AppSync Function. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * the request mapping template for the AppSync Function.
     *
     * Default: - no request mapping template
     *
     * @param requestMappingTemplate the request mapping template for the AppSync Function. 
     */
    override fun requestMappingTemplate(requestMappingTemplate: MappingTemplate) {
      cdkBuilder.requestMappingTemplate(requestMappingTemplate.let(MappingTemplate::unwrap))
    }

    /**
     * the response mapping template for the AppSync Function.
     *
     * Default: - no response mapping template
     *
     * @param responseMappingTemplate the response mapping template for the AppSync Function. 
     */
    override fun responseMappingTemplate(responseMappingTemplate: MappingTemplate) {
      cdkBuilder.responseMappingTemplate(responseMappingTemplate.let(MappingTemplate::unwrap))
    }

    /**
     * The functions runtime.
     *
     * Default: - no function runtime, VTL mapping templates used
     *
     * @param runtime The functions runtime. 
     */
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

    @Suppress("INAPPLICABLE_JVM_NAME")
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
