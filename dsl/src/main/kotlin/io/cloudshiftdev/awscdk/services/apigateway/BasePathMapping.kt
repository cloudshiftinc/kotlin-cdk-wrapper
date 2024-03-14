package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class BasePathMapping internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.BasePathMapping,
) : Resource(cdkObject) {
  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.BasePathMapping].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Whether to attach the base path mapping to a stage.
     *
     * Use this property to create a base path mapping without attaching it to the Rest API default
     * stage.
     * This property is ignored if `stage` is provided.
     *
     * Default: - true
     *
     * @param attachToStage Whether to attach the base path mapping to a stage. 
     */
    public fun attachToStage(attachToStage: Boolean)

    /**
     * The base path name that callers of the API must provide in the URL after the domain name
     * (e.g. `example.com/base-path`). If you specify this property, it can't be an empty string.
     *
     * Default: - map requests from the domain root (e.g. `example.com`). If this
     * is undefined, no additional mappings will be allowed on this domain name.
     *
     * @param basePath The base path name that callers of the API must provide in the URL after the
     * domain name (e.g. `example.com/base-path`). If you specify this property, it can't be an empty
     * string. 
     */
    public fun basePath(basePath: String)

    /**
     * The DomainName to associate with this base path mapping.
     *
     * @param domainName The DomainName to associate with this base path mapping. 
     */
    public fun domainName(domainName: IDomainName)

    /**
     * The RestApi resource to target.
     *
     * @param restApi The RestApi resource to target. 
     */
    public fun restApi(restApi: IRestApi)

    /**
     * The Deployment stage of API [disable-awslint:ref-via-interface].
     *
     * Default: - map to deploymentStage of restApi otherwise stage needs to pass in URL
     *
     * @param stage The Deployment stage of API [disable-awslint:ref-via-interface]. 
     */
    public fun stage(stage: Stage)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.BasePathMapping.Builder =
        software.amazon.awscdk.services.apigateway.BasePathMapping.Builder.create(scope, id)

    /**
     * Whether to attach the base path mapping to a stage.
     *
     * Use this property to create a base path mapping without attaching it to the Rest API default
     * stage.
     * This property is ignored if `stage` is provided.
     *
     * Default: - true
     *
     * @param attachToStage Whether to attach the base path mapping to a stage. 
     */
    override fun attachToStage(attachToStage: Boolean) {
      cdkBuilder.attachToStage(attachToStage)
    }

    /**
     * The base path name that callers of the API must provide in the URL after the domain name
     * (e.g. `example.com/base-path`). If you specify this property, it can't be an empty string.
     *
     * Default: - map requests from the domain root (e.g. `example.com`). If this
     * is undefined, no additional mappings will be allowed on this domain name.
     *
     * @param basePath The base path name that callers of the API must provide in the URL after the
     * domain name (e.g. `example.com/base-path`). If you specify this property, it can't be an empty
     * string. 
     */
    override fun basePath(basePath: String) {
      cdkBuilder.basePath(basePath)
    }

    /**
     * The DomainName to associate with this base path mapping.
     *
     * @param domainName The DomainName to associate with this base path mapping. 
     */
    override fun domainName(domainName: IDomainName) {
      cdkBuilder.domainName(domainName.let(IDomainName::unwrap))
    }

    /**
     * The RestApi resource to target.
     *
     * @param restApi The RestApi resource to target. 
     */
    override fun restApi(restApi: IRestApi) {
      cdkBuilder.restApi(restApi.let(IRestApi::unwrap))
    }

    /**
     * The Deployment stage of API [disable-awslint:ref-via-interface].
     *
     * Default: - map to deploymentStage of restApi otherwise stage needs to pass in URL
     *
     * @param stage The Deployment stage of API [disable-awslint:ref-via-interface]. 
     */
    override fun stage(stage: Stage) {
      cdkBuilder.stage(stage.let(Stage::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.BasePathMapping =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): BasePathMapping {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return BasePathMapping(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.BasePathMapping):
        BasePathMapping = BasePathMapping(cdkObject)

    internal fun unwrap(wrapped: BasePathMapping):
        software.amazon.awscdk.services.apigateway.BasePathMapping = wrapped.cdkObject
  }
}