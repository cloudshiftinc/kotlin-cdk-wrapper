package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface AppsyncFunctionProps : BaseAppsyncFunctionProps {
  /**
   * the GraphQL Api linked to this AppSync Function.
   */
  public fun api(): IGraphqlApi

  /**
   * the data source linked to this AppSync Function.
   */
  public fun dataSource(): BaseDataSource

  /**
   * A builder for [AppsyncFunctionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param api the GraphQL Api linked to this AppSync Function. 
     */
    public fun api(api: IGraphqlApi)

    /**
     * @param code The function code.
     */
    public fun code(code: Code)

    /**
     * @param dataSource the data source linked to this AppSync Function. 
     */
    public fun dataSource(dataSource: BaseDataSource)

    /**
     * @param description the description for this AppSync Function.
     */
    public fun description(description: String)

    /**
     * @param name the name of the AppSync Function. 
     */
    public fun name(name: String)

    /**
     * @param requestMappingTemplate the request mapping template for the AppSync Function.
     */
    public fun requestMappingTemplate(requestMappingTemplate: MappingTemplate)

    /**
     * @param responseMappingTemplate the response mapping template for the AppSync Function.
     */
    public fun responseMappingTemplate(responseMappingTemplate: MappingTemplate)

    /**
     * @param runtime The functions runtime.
     */
    public fun runtime(runtime: FunctionRuntime)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.AppsyncFunctionProps.Builder =
        software.amazon.awscdk.services.appsync.AppsyncFunctionProps.builder()

    /**
     * @param api the GraphQL Api linked to this AppSync Function. 
     */
    override fun api(api: IGraphqlApi) {
      cdkBuilder.api(api.let(IGraphqlApi::unwrap))
    }

    /**
     * @param code The function code.
     */
    override fun code(code: Code) {
      cdkBuilder.code(code.let(Code::unwrap))
    }

    /**
     * @param dataSource the data source linked to this AppSync Function. 
     */
    override fun dataSource(dataSource: BaseDataSource) {
      cdkBuilder.dataSource(dataSource.let(BaseDataSource::unwrap))
    }

    /**
     * @param description the description for this AppSync Function.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name the name of the AppSync Function. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param requestMappingTemplate the request mapping template for the AppSync Function.
     */
    override fun requestMappingTemplate(requestMappingTemplate: MappingTemplate) {
      cdkBuilder.requestMappingTemplate(requestMappingTemplate.let(MappingTemplate::unwrap))
    }

    /**
     * @param responseMappingTemplate the response mapping template for the AppSync Function.
     */
    override fun responseMappingTemplate(responseMappingTemplate: MappingTemplate) {
      cdkBuilder.responseMappingTemplate(responseMappingTemplate.let(MappingTemplate::unwrap))
    }

    /**
     * @param runtime The functions runtime.
     */
    override fun runtime(runtime: FunctionRuntime) {
      cdkBuilder.runtime(runtime.let(FunctionRuntime::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.AppsyncFunctionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.AppsyncFunctionProps,
  ) : CdkObject(cdkObject), AppsyncFunctionProps {
    /**
     * the GraphQL Api linked to this AppSync Function.
     */
    override fun api(): IGraphqlApi = unwrap(this).getApi().let(IGraphqlApi::wrap)

    /**
     * The function code.
     *
     * Default: - no code is used
     */
    override fun code(): Code? = unwrap(this).getCode()?.let(Code::wrap)

    /**
     * the data source linked to this AppSync Function.
     */
    override fun dataSource(): BaseDataSource =
        unwrap(this).getDataSource().let(BaseDataSource::wrap)

    /**
     * the description for this AppSync Function.
     *
     * Default: - no description
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * the name of the AppSync Function.
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * the request mapping template for the AppSync Function.
     *
     * Default: - no request mapping template
     */
    override fun requestMappingTemplate(): MappingTemplate? =
        unwrap(this).getRequestMappingTemplate()?.let(MappingTemplate::wrap)

    /**
     * the response mapping template for the AppSync Function.
     *
     * Default: - no response mapping template
     */
    override fun responseMappingTemplate(): MappingTemplate? =
        unwrap(this).getResponseMappingTemplate()?.let(MappingTemplate::wrap)

    /**
     * The functions runtime.
     *
     * Default: - no function runtime, VTL mapping templates used
     */
    override fun runtime(): FunctionRuntime? = unwrap(this).getRuntime()?.let(FunctionRuntime::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AppsyncFunctionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AppsyncFunctionProps):
        AppsyncFunctionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AppsyncFunctionProps):
        software.amazon.awscdk.services.appsync.AppsyncFunctionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.AppsyncFunctionProps
  }
}
