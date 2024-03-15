@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Example:
 *
 * ```
 * RestApi api;
 * IDomainName domainName = DomainName.fromDomainNameAttributes(this, "DomainName",
 * DomainNameAttributes.builder()
 * .domainName("domainName")
 * .domainNameAliasHostedZoneId("domainNameAliasHostedZoneId")
 * .domainNameAliasTarget("domainNameAliasTarget")
 * .build());
 * BasePathMapping.Builder.create(this, "BasePathMapping")
 * .domainName(domainName)
 * .restApi(api)
 * .build();
 * ```
 */
public interface BasePathMappingProps : BasePathMappingOptions {
  /**
   * The DomainName to associate with this base path mapping.
   */
  public fun domainName(): IDomainName

  /**
   * The RestApi resource to target.
   */
  public fun restApi(): IRestApi

  /**
   * A builder for [BasePathMappingProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param attachToStage Whether to attach the base path mapping to a stage.
     * Use this property to create a base path mapping without attaching it to the Rest API default
     * stage.
     * This property is ignored if `stage` is provided.
     */
    public fun attachToStage(attachToStage: Boolean)

    /**
     * @param basePath The base path name that callers of the API must provide in the URL after the
     * domain name (e.g. `example.com/base-path`). If you specify this property, it can't be an empty
     * string.
     */
    public fun basePath(basePath: String)

    /**
     * @param domainName The DomainName to associate with this base path mapping. 
     */
    public fun domainName(domainName: IDomainName)

    /**
     * @param restApi The RestApi resource to target. 
     */
    public fun restApi(restApi: IRestApi)

    /**
     * @param stage The Deployment stage of API [disable-awslint:ref-via-interface].
     */
    public fun stage(stage: Stage)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.BasePathMappingProps.Builder
        = software.amazon.awscdk.services.apigateway.BasePathMappingProps.builder()

    /**
     * @param attachToStage Whether to attach the base path mapping to a stage.
     * Use this property to create a base path mapping without attaching it to the Rest API default
     * stage.
     * This property is ignored if `stage` is provided.
     */
    override fun attachToStage(attachToStage: Boolean) {
      cdkBuilder.attachToStage(attachToStage)
    }

    /**
     * @param basePath The base path name that callers of the API must provide in the URL after the
     * domain name (e.g. `example.com/base-path`). If you specify this property, it can't be an empty
     * string.
     */
    override fun basePath(basePath: String) {
      cdkBuilder.basePath(basePath)
    }

    /**
     * @param domainName The DomainName to associate with this base path mapping. 
     */
    override fun domainName(domainName: IDomainName) {
      cdkBuilder.domainName(domainName.let(IDomainName::unwrap))
    }

    /**
     * @param restApi The RestApi resource to target. 
     */
    override fun restApi(restApi: IRestApi) {
      cdkBuilder.restApi(restApi.let(IRestApi::unwrap))
    }

    /**
     * @param stage The Deployment stage of API [disable-awslint:ref-via-interface].
     */
    override fun stage(stage: Stage) {
      cdkBuilder.stage(stage.let(Stage::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.BasePathMappingProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.BasePathMappingProps,
  ) : CdkObject(cdkObject), BasePathMappingProps {
    /**
     * Whether to attach the base path mapping to a stage.
     *
     * Use this property to create a base path mapping without attaching it to the Rest API default
     * stage.
     * This property is ignored if `stage` is provided.
     *
     * Default: - true
     */
    override fun attachToStage(): Boolean? = unwrap(this).getAttachToStage()

    /**
     * The base path name that callers of the API must provide in the URL after the domain name
     * (e.g. `example.com/base-path`). If you specify this property, it can't be an empty string.
     *
     * Default: - map requests from the domain root (e.g. `example.com`). If this
     * is undefined, no additional mappings will be allowed on this domain name.
     */
    override fun basePath(): String? = unwrap(this).getBasePath()

    /**
     * The DomainName to associate with this base path mapping.
     */
    override fun domainName(): IDomainName = unwrap(this).getDomainName().let(IDomainName::wrap)

    /**
     * The RestApi resource to target.
     */
    override fun restApi(): IRestApi = unwrap(this).getRestApi().let(IRestApi::wrap)

    /**
     * The Deployment stage of API [disable-awslint:ref-via-interface].
     *
     * Default: - map to deploymentStage of restApi otherwise stage needs to pass in URL
     */
    override fun stage(): Stage? = unwrap(this).getStage()?.let(Stage::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BasePathMappingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.BasePathMappingProps):
        BasePathMappingProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BasePathMappingProps):
        software.amazon.awscdk.services.apigateway.BasePathMappingProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.BasePathMappingProps
  }
}
