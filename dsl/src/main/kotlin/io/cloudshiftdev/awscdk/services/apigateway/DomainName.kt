package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class DomainName internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.DomainName,
) : Resource(cdkObject), IDomainName {
  /**
   * Maps this domain to an API endpoint.
   *
   * This uses the ApiMapping from ApiGatewayV2 which supports multi-level paths, but
   * also only supports:
   *
   * * SecurityPolicy.TLS_1_2
   * * EndpointType.REGIONAL
   *
   * @param targetStage the target API stage. 
   * @param options Options for mapping to a stage.
   */
  public open fun addApiMapping(targetStage: IStage) {
    unwrap(this).addApiMapping(targetStage.let(IStage::unwrap))
  }

  /**
   * Maps this domain to an API endpoint.
   *
   * This uses the ApiMapping from ApiGatewayV2 which supports multi-level paths, but
   * also only supports:
   *
   * * SecurityPolicy.TLS_1_2
   * * EndpointType.REGIONAL
   *
   * @param targetStage the target API stage. 
   * @param options Options for mapping to a stage.
   */
  public open fun addApiMapping(targetStage: IStage, options: ApiMappingOptions) {
    unwrap(this).addApiMapping(targetStage.let(IStage::unwrap),
        options.let(ApiMappingOptions::unwrap))
  }

  /**
   * Maps this domain to an API endpoint.
   *
   * This uses the ApiMapping from ApiGatewayV2 which supports multi-level paths, but
   * also only supports:
   *
   * * SecurityPolicy.TLS_1_2
   * * EndpointType.REGIONAL
   *
   * @param targetStage the target API stage. 
   * @param options Options for mapping to a stage.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cb1e78fd77a367fc2f160f3c04935acac6f9a43962fd601069e2e21f618ee024")
  public open fun addApiMapping(targetStage: IStage, options: ApiMappingOptions.Builder.() -> Unit):
      Unit = addApiMapping(targetStage, ApiMappingOptions(options))

  /**
   * Maps this domain to an API endpoint.
   *
   * This uses the BasePathMapping from ApiGateway v1 which does not support multi-level paths.
   *
   * If you need to create a mapping for a multi-level path use `addApiMapping` instead.
   *
   * @param targetApi That target API endpoint, requests will be mapped to the deployment stage. 
   * @param options Options for mapping to base path with or without a stage.
   */
  public open fun addBasePathMapping(targetApi: IRestApi): BasePathMapping =
      unwrap(this).addBasePathMapping(targetApi.let(IRestApi::unwrap)).let(BasePathMapping::wrap)

  /**
   * Maps this domain to an API endpoint.
   *
   * This uses the BasePathMapping from ApiGateway v1 which does not support multi-level paths.
   *
   * If you need to create a mapping for a multi-level path use `addApiMapping` instead.
   *
   * @param targetApi That target API endpoint, requests will be mapped to the deployment stage. 
   * @param options Options for mapping to base path with or without a stage.
   */
  public open fun addBasePathMapping(targetApi: IRestApi, options: BasePathMappingOptions):
      BasePathMapping = unwrap(this).addBasePathMapping(targetApi.let(IRestApi::unwrap),
      options.let(BasePathMappingOptions::unwrap)).let(BasePathMapping::wrap)

  /**
   * Maps this domain to an API endpoint.
   *
   * This uses the BasePathMapping from ApiGateway v1 which does not support multi-level paths.
   *
   * If you need to create a mapping for a multi-level path use `addApiMapping` instead.
   *
   * @param targetApi That target API endpoint, requests will be mapped to the deployment stage. 
   * @param options Options for mapping to base path with or without a stage.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("df862dae36c668828f4fb0eca4b25a8e8e9725933b141948bb65cbd874514dbd")
  public open fun addBasePathMapping(targetApi: IRestApi,
      options: BasePathMappingOptions.Builder.() -> Unit): BasePathMapping =
      addBasePathMapping(targetApi, BasePathMappingOptions(options))

  /**
   * The domain name (e.g. `example.com`).
   */
  public override fun domainName(): String = unwrap(this).getDomainName()

  /**
   * The Route53 alias target to use in order to connect a record set to this domain through an
   * alias.
   */
  public override fun domainNameAliasDomainName(): String =
      unwrap(this).getDomainNameAliasDomainName()

  /**
   * The Route53 hosted zone ID to use in order to connect a record set to this domain through an
   * alias.
   */
  public override fun domainNameAliasHostedZoneId(): String =
      unwrap(this).getDomainNameAliasHostedZoneId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.DomainName].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The base path name that callers of the API must provide in the URL after the domain name
     * (e.g. `example.com/base-path`). If you specify this property, it can't be an empty string.
     *
     * Default: - map requests from the domain root (e.g. `example.com`).
     *
     * @param basePath The base path name that callers of the API must provide in the URL after the
     * domain name (e.g. `example.com/base-path`). If you specify this property, it can't be an empty
     * string. 
     */
    public fun basePath(basePath: String)

    /**
     * The reference to an AWS-managed certificate for use by the edge-optimized endpoint for the
     * domain name.
     *
     * For "EDGE" domain names, the certificate
     * needs to be in the US East (N. Virginia) region.
     *
     * @param certificate The reference to an AWS-managed certificate for use by the edge-optimized
     * endpoint for the domain name. 
     */
    public fun certificate(certificate: ICertificate)

    /**
     * The custom domain name for your API.
     *
     * Uppercase letters are not supported.
     *
     * @param domainName The custom domain name for your API. 
     */
    public fun domainName(domainName: String)

    /**
     * The type of endpoint for this DomainName.
     *
     * Default: REGIONAL
     *
     * @param endpointType The type of endpoint for this DomainName. 
     */
    public fun endpointType(endpointType: EndpointType)

    /**
     * If specified, all requests to this domain will be mapped to the production deployment of this
     * API.
     *
     * If you wish to map this domain to multiple APIs
     * with different base paths, use `addBasePathMapping` or `addApiMapping`.
     *
     * Default: - you will have to call `addBasePathMapping` to map this domain to
     * API endpoints.
     *
     * @param mapping If specified, all requests to this domain will be mapped to the production
     * deployment of this API. 
     */
    public fun mapping(mapping: IRestApi)

    /**
     * The mutual TLS authentication configuration for a custom domain name.
     *
     * Default: - mTLS is not configured.
     *
     * @param mtls The mutual TLS authentication configuration for a custom domain name. 
     */
    public fun mtls(mtls: MTLSConfig)

    /**
     * The mutual TLS authentication configuration for a custom domain name.
     *
     * Default: - mTLS is not configured.
     *
     * @param mtls The mutual TLS authentication configuration for a custom domain name. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1efdd2c46f62bd00c654559d6be40f950f52dcfa1bb6d8fea6edff7bb17e7279")
    public fun mtls(mtls: MTLSConfig.Builder.() -> Unit)

    /**
     * The Transport Layer Security (TLS) version + cipher suite for this domain name.
     *
     * Default: SecurityPolicy.TLS_1_2
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html)
     * @param securityPolicy The Transport Layer Security (TLS) version + cipher suite for this
     * domain name. 
     */
    public fun securityPolicy(securityPolicy: SecurityPolicy)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.DomainName.Builder =
        software.amazon.awscdk.services.apigateway.DomainName.Builder.create(scope, id)

    /**
     * The base path name that callers of the API must provide in the URL after the domain name
     * (e.g. `example.com/base-path`). If you specify this property, it can't be an empty string.
     *
     * Default: - map requests from the domain root (e.g. `example.com`).
     *
     * @param basePath The base path name that callers of the API must provide in the URL after the
     * domain name (e.g. `example.com/base-path`). If you specify this property, it can't be an empty
     * string. 
     */
    override fun basePath(basePath: String) {
      cdkBuilder.basePath(basePath)
    }

    /**
     * The reference to an AWS-managed certificate for use by the edge-optimized endpoint for the
     * domain name.
     *
     * For "EDGE" domain names, the certificate
     * needs to be in the US East (N. Virginia) region.
     *
     * @param certificate The reference to an AWS-managed certificate for use by the edge-optimized
     * endpoint for the domain name. 
     */
    override fun certificate(certificate: ICertificate) {
      cdkBuilder.certificate(certificate.let(ICertificate::unwrap))
    }

    /**
     * The custom domain name for your API.
     *
     * Uppercase letters are not supported.
     *
     * @param domainName The custom domain name for your API. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * The type of endpoint for this DomainName.
     *
     * Default: REGIONAL
     *
     * @param endpointType The type of endpoint for this DomainName. 
     */
    override fun endpointType(endpointType: EndpointType) {
      cdkBuilder.endpointType(endpointType.let(EndpointType::unwrap))
    }

    /**
     * If specified, all requests to this domain will be mapped to the production deployment of this
     * API.
     *
     * If you wish to map this domain to multiple APIs
     * with different base paths, use `addBasePathMapping` or `addApiMapping`.
     *
     * Default: - you will have to call `addBasePathMapping` to map this domain to
     * API endpoints.
     *
     * @param mapping If specified, all requests to this domain will be mapped to the production
     * deployment of this API. 
     */
    override fun mapping(mapping: IRestApi) {
      cdkBuilder.mapping(mapping.let(IRestApi::unwrap))
    }

    /**
     * The mutual TLS authentication configuration for a custom domain name.
     *
     * Default: - mTLS is not configured.
     *
     * @param mtls The mutual TLS authentication configuration for a custom domain name. 
     */
    override fun mtls(mtls: MTLSConfig) {
      cdkBuilder.mtls(mtls.let(MTLSConfig::unwrap))
    }

    /**
     * The mutual TLS authentication configuration for a custom domain name.
     *
     * Default: - mTLS is not configured.
     *
     * @param mtls The mutual TLS authentication configuration for a custom domain name. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1efdd2c46f62bd00c654559d6be40f950f52dcfa1bb6d8fea6edff7bb17e7279")
    override fun mtls(mtls: MTLSConfig.Builder.() -> Unit): Unit = mtls(MTLSConfig(mtls))

    /**
     * The Transport Layer Security (TLS) version + cipher suite for this domain name.
     *
     * Default: SecurityPolicy.TLS_1_2
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html)
     * @param securityPolicy The Transport Layer Security (TLS) version + cipher suite for this
     * domain name. 
     */
    override fun securityPolicy(securityPolicy: SecurityPolicy) {
      cdkBuilder.securityPolicy(securityPolicy.let(SecurityPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.DomainName = cdkBuilder.build()
  }

  public companion object {
    public fun fromDomainNameAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: DomainNameAttributes,
    ): IDomainName =
        software.amazon.awscdk.services.apigateway.DomainName.fromDomainNameAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(DomainNameAttributes::unwrap)).let(IDomainName::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ac8f944103380ed338cd724004967851f1e6535959d9a4afb514e759be47faea")
    public fun fromDomainNameAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: DomainNameAttributes.Builder.() -> Unit,
    ): IDomainName = fromDomainNameAttributes(scope, id, DomainNameAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): DomainName {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return DomainName(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.DomainName): DomainName
        = DomainName(cdkObject)

    internal fun unwrap(wrapped: DomainName): software.amazon.awscdk.services.apigateway.DomainName
        = wrapped.cdkObject
  }
}
