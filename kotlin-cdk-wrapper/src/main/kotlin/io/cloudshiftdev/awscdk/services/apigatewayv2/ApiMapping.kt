@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Create a new API mapping for API Gateway API endpoint.
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
 * ApiMapping apiMapping = ApiMapping.Builder.create(this, "MyApiMapping")
 * .api(api)
 * .domainName(domainName)
 * // the properties below are optional
 * .apiMappingKey("apiMappingKey")
 * .stage(stage)
 * .build();
 * ```
 */
public open class ApiMapping(
  cdkObject: software.amazon.awscdk.services.apigatewayv2.ApiMapping,
) : Resource(cdkObject),
    IApiMapping {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ApiMappingProps,
  ) :
      this(software.amazon.awscdk.services.apigatewayv2.ApiMapping(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(ApiMappingProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ApiMappingProps.Builder.() -> Unit,
  ) : this(scope, id, ApiMappingProps(props)
  )

  /**
   * ID of the API Mapping.
   */
  public override fun apiMappingId(): String = unwrap(this).getApiMappingId()

  /**
   * API domain name.
   */
  public open fun domainName(): IDomainName = unwrap(this).getDomainName().let(IDomainName::wrap)

  /**
   * API Mapping key.
   */
  public open fun mappingKey(): String? = unwrap(this).getMappingKey()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigatewayv2.ApiMapping].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Api to which this mapping is applied.
     *
     * @param api The Api to which this mapping is applied. 
     */
    public fun api(api: IApi)

    /**
     * Api mapping key.
     *
     * The path where this stage should be mapped to on the domain
     *
     * Default: - undefined for the root path mapping.
     *
     * @param apiMappingKey Api mapping key. 
     */
    public fun apiMappingKey(apiMappingKey: String)

    /**
     * custom domain name of the mapping target.
     *
     * @param domainName custom domain name of the mapping target. 
     */
    public fun domainName(domainName: IDomainName)

    /**
     * stage for the ApiMapping resource required for WebSocket API defaults to default stage of an
     * HTTP API.
     *
     * Default: - Default stage of the passed API for HTTP API, required for WebSocket API
     *
     * @param stage stage for the ApiMapping resource required for WebSocket API defaults to default
     * stage of an HTTP API. 
     */
    public fun stage(stage: IStage)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.ApiMapping.Builder =
        software.amazon.awscdk.services.apigatewayv2.ApiMapping.Builder.create(scope, id)

    /**
     * The Api to which this mapping is applied.
     *
     * @param api The Api to which this mapping is applied. 
     */
    override fun api(api: IApi) {
      cdkBuilder.api(api.let(IApi.Companion::unwrap))
    }

    /**
     * Api mapping key.
     *
     * The path where this stage should be mapped to on the domain
     *
     * Default: - undefined for the root path mapping.
     *
     * @param apiMappingKey Api mapping key. 
     */
    override fun apiMappingKey(apiMappingKey: String) {
      cdkBuilder.apiMappingKey(apiMappingKey)
    }

    /**
     * custom domain name of the mapping target.
     *
     * @param domainName custom domain name of the mapping target. 
     */
    override fun domainName(domainName: IDomainName) {
      cdkBuilder.domainName(domainName.let(IDomainName.Companion::unwrap))
    }

    /**
     * stage for the ApiMapping resource required for WebSocket API defaults to default stage of an
     * HTTP API.
     *
     * Default: - Default stage of the passed API for HTTP API, required for WebSocket API
     *
     * @param stage stage for the ApiMapping resource required for WebSocket API defaults to default
     * stage of an HTTP API. 
     */
    override fun stage(stage: IStage) {
      cdkBuilder.stage(stage.let(IStage.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.ApiMapping = cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.apigatewayv2.ApiMapping.PROPERTY_INJECTION_ID

    public fun fromApiMappingAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ApiMappingAttributes,
    ): IApiMapping =
        software.amazon.awscdk.services.apigatewayv2.ApiMapping.fromApiMappingAttributes(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, attrs.let(ApiMappingAttributes.Companion::unwrap)).let(IApiMapping::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e1c3b60e3420232e95ceb8ceace088a2b1d3dd92bc0ca138bdaccdfa392dd6e")
    public fun fromApiMappingAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ApiMappingAttributes.Builder.() -> Unit,
    ): IApiMapping = fromApiMappingAttributes(scope, id, ApiMappingAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ApiMapping {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ApiMapping(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.ApiMapping):
        ApiMapping = ApiMapping(cdkObject)

    internal fun unwrap(wrapped: ApiMapping):
        software.amazon.awscdk.services.apigatewayv2.ApiMapping = wrapped.cdkObject as
        software.amazon.awscdk.services.apigatewayv2.ApiMapping
  }
}
