@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * VPC origin endpoint configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * VpcOriginEndpoint vpcOriginEndpoint;
 * VpcOriginProps vpcOriginProps = VpcOriginProps.builder()
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
public interface VpcOriginProps : VpcOriginOptions {
  /**
   * The VPC origin endpoint.
   */
  public fun endpoint(): VpcOriginEndpoint

  /**
   * A builder for [VpcOriginProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param endpoint The VPC origin endpoint. 
     */
    public fun endpoint(endpoint: VpcOriginEndpoint)

    /**
     * @param httpPort The HTTP port for the CloudFront VPC origin endpoint configuration.
     */
    public fun httpPort(httpPort: Number)

    /**
     * @param httpsPort The HTTPS port of the CloudFront VPC origin endpoint configuration.
     */
    public fun httpsPort(httpsPort: Number)

    /**
     * @param originSslProtocols A list that contains allowed SSL/TLS protocols for this
     * distribution.
     */
    public fun originSslProtocols(originSslProtocols: List<OriginSslPolicy>)

    /**
     * @param originSslProtocols A list that contains allowed SSL/TLS protocols for this
     * distribution.
     */
    public fun originSslProtocols(vararg originSslProtocols: OriginSslPolicy)

    /**
     * @param protocolPolicy The origin protocol policy for the CloudFront VPC origin endpoint
     * configuration.
     */
    public fun protocolPolicy(protocolPolicy: OriginProtocolPolicy)

    /**
     * @param vpcOriginName The name of the CloudFront VPC origin endpoint configuration.
     */
    public fun vpcOriginName(vpcOriginName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.VpcOriginProps.Builder =
        software.amazon.awscdk.services.cloudfront.VpcOriginProps.builder()

    /**
     * @param endpoint The VPC origin endpoint. 
     */
    override fun endpoint(endpoint: VpcOriginEndpoint) {
      cdkBuilder.endpoint(endpoint.let(VpcOriginEndpoint.Companion::unwrap))
    }

    /**
     * @param httpPort The HTTP port for the CloudFront VPC origin endpoint configuration.
     */
    override fun httpPort(httpPort: Number) {
      cdkBuilder.httpPort(httpPort)
    }

    /**
     * @param httpsPort The HTTPS port of the CloudFront VPC origin endpoint configuration.
     */
    override fun httpsPort(httpsPort: Number) {
      cdkBuilder.httpsPort(httpsPort)
    }

    /**
     * @param originSslProtocols A list that contains allowed SSL/TLS protocols for this
     * distribution.
     */
    override fun originSslProtocols(originSslProtocols: List<OriginSslPolicy>) {
      cdkBuilder.originSslProtocols(originSslProtocols.map(OriginSslPolicy.Companion::unwrap))
    }

    /**
     * @param originSslProtocols A list that contains allowed SSL/TLS protocols for this
     * distribution.
     */
    override fun originSslProtocols(vararg originSslProtocols: OriginSslPolicy): Unit =
        originSslProtocols(originSslProtocols.toList())

    /**
     * @param protocolPolicy The origin protocol policy for the CloudFront VPC origin endpoint
     * configuration.
     */
    override fun protocolPolicy(protocolPolicy: OriginProtocolPolicy) {
      cdkBuilder.protocolPolicy(protocolPolicy.let(OriginProtocolPolicy.Companion::unwrap))
    }

    /**
     * @param vpcOriginName The name of the CloudFront VPC origin endpoint configuration.
     */
    override fun vpcOriginName(vpcOriginName: String) {
      cdkBuilder.vpcOriginName(vpcOriginName)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.VpcOriginProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.VpcOriginProps,
  ) : CdkObject(cdkObject),
      VpcOriginProps {
    /**
     * The VPC origin endpoint.
     */
    override fun endpoint(): VpcOriginEndpoint =
        unwrap(this).getEndpoint().let(VpcOriginEndpoint::wrap)

    /**
     * The HTTP port for the CloudFront VPC origin endpoint configuration.
     *
     * Default: 80
     */
    override fun httpPort(): Number? = unwrap(this).getHttpPort()

    /**
     * The HTTPS port of the CloudFront VPC origin endpoint configuration.
     *
     * Default: 443
     */
    override fun httpsPort(): Number? = unwrap(this).getHttpsPort()

    /**
     * A list that contains allowed SSL/TLS protocols for this distribution.
     *
     * Default: - TLSv1.2
     */
    override fun originSslProtocols(): List<OriginSslPolicy> =
        unwrap(this).getOriginSslProtocols()?.map(OriginSslPolicy::wrap) ?: emptyList()

    /**
     * The origin protocol policy for the CloudFront VPC origin endpoint configuration.
     *
     * Default: OriginProtocolPolicy.MATCH_VIEWER
     */
    override fun protocolPolicy(): OriginProtocolPolicy? =
        unwrap(this).getProtocolPolicy()?.let(OriginProtocolPolicy::wrap)

    /**
     * The name of the CloudFront VPC origin endpoint configuration.
     *
     * Default: - generated from the `id`
     */
    override fun vpcOriginName(): String? = unwrap(this).getVpcOriginName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VpcOriginProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.VpcOriginProps):
        VpcOriginProps = CdkObjectWrappers.wrap(cdkObject) as? VpcOriginProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpcOriginProps):
        software.amazon.awscdk.services.cloudfront.VpcOriginProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cloudfront.VpcOriginProps
  }
}
