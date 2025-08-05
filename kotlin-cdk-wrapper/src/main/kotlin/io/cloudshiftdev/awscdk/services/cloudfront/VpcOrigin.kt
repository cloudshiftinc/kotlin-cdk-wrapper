@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A CloudFront VPC Origin configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * VpcOriginEndpoint vpcOriginEndpoint;
 * VpcOrigin vpcOrigin = VpcOrigin.Builder.create(this, "MyVpcOrigin")
 * .endpoint(vpcOriginEndpoint)
 * // the properties below are optional
 * .httpPort(123)
 * .httpsPort(123)
 * .originSslProtocols(List.of(OriginSslPolicy.SSL_V3))
 * .protocolPolicy(OriginProtocolPolicy.HTTP_ONLY)
 * .vpcOriginName("vpcOriginName")
 * .build();
 * ```
 */
public open class VpcOrigin(
  cdkObject: software.amazon.awscdk.services.cloudfront.VpcOrigin,
) : Resource(cdkObject),
    IVpcOrigin,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: VpcOriginProps,
  ) :
      this(software.amazon.awscdk.services.cloudfront.VpcOrigin(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(VpcOriginProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: VpcOriginProps.Builder.() -> Unit,
  ) : this(scope, id, VpcOriginProps(props)
  )

  /**
   * TagManager to set, remove and format tags.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The domain name of the CloudFront VPC origin endpoint configuration.
   */
  public override fun domainName(): String? = unwrap(this).getDomainName()

  /**
   * The VPC origin ARN.
   */
  public override fun vpcOriginArn(): String = unwrap(this).getVpcOriginArn()

  /**
   * The VPC origin ID.
   */
  public override fun vpcOriginId(): String = unwrap(this).getVpcOriginId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudfront.VpcOrigin].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The VPC origin endpoint.
     *
     * @param endpoint The VPC origin endpoint. 
     */
    public fun endpoint(endpoint: VpcOriginEndpoint)

    /**
     * The HTTP port for the CloudFront VPC origin endpoint configuration.
     *
     * Default: 80
     *
     * @param httpPort The HTTP port for the CloudFront VPC origin endpoint configuration. 
     */
    public fun httpPort(httpPort: Number)

    /**
     * The HTTPS port of the CloudFront VPC origin endpoint configuration.
     *
     * Default: 443
     *
     * @param httpsPort The HTTPS port of the CloudFront VPC origin endpoint configuration. 
     */
    public fun httpsPort(httpsPort: Number)

    /**
     * A list that contains allowed SSL/TLS protocols for this distribution.
     *
     * Default: - TLSv1.2
     *
     * @param originSslProtocols A list that contains allowed SSL/TLS protocols for this
     * distribution. 
     */
    public fun originSslProtocols(originSslProtocols: List<OriginSslPolicy>)

    /**
     * A list that contains allowed SSL/TLS protocols for this distribution.
     *
     * Default: - TLSv1.2
     *
     * @param originSslProtocols A list that contains allowed SSL/TLS protocols for this
     * distribution. 
     */
    public fun originSslProtocols(vararg originSslProtocols: OriginSslPolicy)

    /**
     * The origin protocol policy for the CloudFront VPC origin endpoint configuration.
     *
     * Default: OriginProtocolPolicy.MATCH_VIEWER
     *
     * @param protocolPolicy The origin protocol policy for the CloudFront VPC origin endpoint
     * configuration. 
     */
    public fun protocolPolicy(protocolPolicy: OriginProtocolPolicy)

    /**
     * The name of the CloudFront VPC origin endpoint configuration.
     *
     * Default: - generated from the `id`
     *
     * @param vpcOriginName The name of the CloudFront VPC origin endpoint configuration. 
     */
    public fun vpcOriginName(vpcOriginName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.VpcOrigin.Builder =
        software.amazon.awscdk.services.cloudfront.VpcOrigin.Builder.create(scope, id)

    /**
     * The VPC origin endpoint.
     *
     * @param endpoint The VPC origin endpoint. 
     */
    override fun endpoint(endpoint: VpcOriginEndpoint) {
      cdkBuilder.endpoint(endpoint.let(VpcOriginEndpoint.Companion::unwrap))
    }

    /**
     * The HTTP port for the CloudFront VPC origin endpoint configuration.
     *
     * Default: 80
     *
     * @param httpPort The HTTP port for the CloudFront VPC origin endpoint configuration. 
     */
    override fun httpPort(httpPort: Number) {
      cdkBuilder.httpPort(httpPort)
    }

    /**
     * The HTTPS port of the CloudFront VPC origin endpoint configuration.
     *
     * Default: 443
     *
     * @param httpsPort The HTTPS port of the CloudFront VPC origin endpoint configuration. 
     */
    override fun httpsPort(httpsPort: Number) {
      cdkBuilder.httpsPort(httpsPort)
    }

    /**
     * A list that contains allowed SSL/TLS protocols for this distribution.
     *
     * Default: - TLSv1.2
     *
     * @param originSslProtocols A list that contains allowed SSL/TLS protocols for this
     * distribution. 
     */
    override fun originSslProtocols(originSslProtocols: List<OriginSslPolicy>) {
      cdkBuilder.originSslProtocols(originSslProtocols.map(OriginSslPolicy.Companion::unwrap))
    }

    /**
     * A list that contains allowed SSL/TLS protocols for this distribution.
     *
     * Default: - TLSv1.2
     *
     * @param originSslProtocols A list that contains allowed SSL/TLS protocols for this
     * distribution. 
     */
    override fun originSslProtocols(vararg originSslProtocols: OriginSslPolicy): Unit =
        originSslProtocols(originSslProtocols.toList())

    /**
     * The origin protocol policy for the CloudFront VPC origin endpoint configuration.
     *
     * Default: OriginProtocolPolicy.MATCH_VIEWER
     *
     * @param protocolPolicy The origin protocol policy for the CloudFront VPC origin endpoint
     * configuration. 
     */
    override fun protocolPolicy(protocolPolicy: OriginProtocolPolicy) {
      cdkBuilder.protocolPolicy(protocolPolicy.let(OriginProtocolPolicy.Companion::unwrap))
    }

    /**
     * The name of the CloudFront VPC origin endpoint configuration.
     *
     * Default: - generated from the `id`
     *
     * @param vpcOriginName The name of the CloudFront VPC origin endpoint configuration. 
     */
    override fun vpcOriginName(vpcOriginName: String) {
      cdkBuilder.vpcOriginName(vpcOriginName)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.VpcOrigin = cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.cloudfront.VpcOrigin.PROPERTY_INJECTION_ID

    public fun fromVpcOriginArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      vpcOriginArn: String,
    ): IVpcOrigin =
        software.amazon.awscdk.services.cloudfront.VpcOrigin.fromVpcOriginArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, vpcOriginArn).let(IVpcOrigin::wrap)

    public fun fromVpcOriginAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: VpcOriginAttributes,
    ): IVpcOrigin =
        software.amazon.awscdk.services.cloudfront.VpcOrigin.fromVpcOriginAttributes(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, attrs.let(VpcOriginAttributes.Companion::unwrap)).let(IVpcOrigin::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("519cff5e99645f8725e0524b0273ca524d7fba2717bff04d76c9e3ae052b438c")
    public fun fromVpcOriginAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: VpcOriginAttributes.Builder.() -> Unit,
    ): IVpcOrigin = fromVpcOriginAttributes(scope, id, VpcOriginAttributes(attrs))

    public fun fromVpcOriginId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      vpcOriginId: String,
    ): IVpcOrigin =
        software.amazon.awscdk.services.cloudfront.VpcOrigin.fromVpcOriginId(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, vpcOriginId).let(IVpcOrigin::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): VpcOrigin {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return VpcOrigin(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.VpcOrigin): VpcOrigin =
        VpcOrigin(cdkObject)

    internal fun unwrap(wrapped: VpcOrigin): software.amazon.awscdk.services.cloudfront.VpcOrigin =
        wrapped.cdkObject as software.amazon.awscdk.services.cloudfront.VpcOrigin
  }
}
