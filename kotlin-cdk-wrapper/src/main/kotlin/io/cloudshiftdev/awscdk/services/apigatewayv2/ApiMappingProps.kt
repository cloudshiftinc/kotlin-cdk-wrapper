@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Properties used to create the ApiMapping resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * IApi api;
 * DomainName domainName;
 * IStage stage;
 * ApiMappingProps apiMappingProps = ApiMappingProps.builder()
 * .api(api)
 * .domainName(domainName)
 * // the properties below are optional
 * .apiMappingKey("apiMappingKey")
 * .stage(stage)
 * .build();
 * ```
 */
public interface ApiMappingProps {
  /**
   * The Api to which this mapping is applied.
   */
  public fun api(): IApi

  /**
   * Api mapping key.
   *
   * The path where this stage should be mapped to on the domain
   *
   * Default: - undefined for the root path mapping.
   */
  public fun apiMappingKey(): String? = unwrap(this).getApiMappingKey()

  /**
   * custom domain name of the mapping target.
   */
  public fun domainName(): IDomainName

  /**
   * stage for the ApiMapping resource required for WebSocket API defaults to default stage of an
   * HTTP API.
   *
   * Default: - Default stage of the passed API for HTTP API, required for WebSocket API
   */
  public fun stage(): IStage? = unwrap(this).getStage()?.let(IStage::wrap)

  /**
   * A builder for [ApiMappingProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param api The Api to which this mapping is applied. 
     */
    public fun api(api: IApi)

    /**
     * @param apiMappingKey Api mapping key.
     * The path where this stage should be mapped to on the domain
     */
    public fun apiMappingKey(apiMappingKey: String)

    /**
     * @param domainName custom domain name of the mapping target. 
     */
    public fun domainName(domainName: IDomainName)

    /**
     * @param stage stage for the ApiMapping resource required for WebSocket API defaults to default
     * stage of an HTTP API.
     */
    public fun stage(stage: IStage)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.ApiMappingProps.Builder =
        software.amazon.awscdk.services.apigatewayv2.ApiMappingProps.builder()

    /**
     * @param api The Api to which this mapping is applied. 
     */
    override fun api(api: IApi) {
      cdkBuilder.api(api.let(IApi::unwrap))
    }

    /**
     * @param apiMappingKey Api mapping key.
     * The path where this stage should be mapped to on the domain
     */
    override fun apiMappingKey(apiMappingKey: String) {
      cdkBuilder.apiMappingKey(apiMappingKey)
    }

    /**
     * @param domainName custom domain name of the mapping target. 
     */
    override fun domainName(domainName: IDomainName) {
      cdkBuilder.domainName(domainName.let(IDomainName::unwrap))
    }

    /**
     * @param stage stage for the ApiMapping resource required for WebSocket API defaults to default
     * stage of an HTTP API.
     */
    override fun stage(stage: IStage) {
      cdkBuilder.stage(stage.let(IStage::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.ApiMappingProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.ApiMappingProps,
  ) : CdkObject(cdkObject), ApiMappingProps {
    /**
     * The Api to which this mapping is applied.
     */
    override fun api(): IApi = unwrap(this).getApi().let(IApi::wrap)

    /**
     * Api mapping key.
     *
     * The path where this stage should be mapped to on the domain
     *
     * Default: - undefined for the root path mapping.
     */
    override fun apiMappingKey(): String? = unwrap(this).getApiMappingKey()

    /**
     * custom domain name of the mapping target.
     */
    override fun domainName(): IDomainName = unwrap(this).getDomainName().let(IDomainName::wrap)

    /**
     * stage for the ApiMapping resource required for WebSocket API defaults to default stage of an
     * HTTP API.
     *
     * Default: - Default stage of the passed API for HTTP API, required for WebSocket API
     */
    override fun stage(): IStage? = unwrap(this).getStage()?.let(IStage::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ApiMappingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.ApiMappingProps):
        ApiMappingProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApiMappingProps):
        software.amazon.awscdk.services.apigatewayv2.ApiMappingProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.ApiMappingProps
  }
}
