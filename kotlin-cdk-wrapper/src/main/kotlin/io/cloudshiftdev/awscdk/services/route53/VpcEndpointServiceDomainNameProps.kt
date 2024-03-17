@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.IVpcEndpointService
import kotlin.String
import kotlin.Unit

/**
 * Properties to configure a VPC Endpoint Service domain name.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.route53.PublicHostedZone;
 * import io.cloudshiftdev.awscdk.services.route53.VpcEndpointServiceDomainName;
 * PublicHostedZone zone;
 * VpcEndpointService vpces;
 * VpcEndpointServiceDomainName.Builder.create(this, "EndpointDomain")
 * .endpointService(vpces)
 * .domainName("my-stuff.aws-cdk.dev")
 * .publicHostedZone(zone)
 * .build();
 * ```
 */
public interface VpcEndpointServiceDomainNameProps {
  /**
   * The domain name to use.
   *
   * This domain name must be owned by this account (registered through Route53),
   * or delegated to this account. Domain ownership will be verified by AWS before
   * private DNS can be used.
   *
   * [Documentation](https://docs.aws.amazon.com/vpc/latest/userguide/endpoint-services-dns-validation.html)
   */
  public fun domainName(): String

  /**
   * The VPC Endpoint Service to configure Private DNS for.
   */
  public fun endpointService(): IVpcEndpointService

  /**
   * The public hosted zone to use for the domain.
   */
  public fun publicHostedZone(): IPublicHostedZone

  /**
   * A builder for [VpcEndpointServiceDomainNameProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param domainName The domain name to use. 
     * This domain name must be owned by this account (registered through Route53),
     * or delegated to this account. Domain ownership will be verified by AWS before
     * private DNS can be used.
     */
    public fun domainName(domainName: String)

    /**
     * @param endpointService The VPC Endpoint Service to configure Private DNS for. 
     */
    public fun endpointService(endpointService: IVpcEndpointService)

    /**
     * @param publicHostedZone The public hosted zone to use for the domain. 
     */
    public fun publicHostedZone(publicHostedZone: IPublicHostedZone)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53.VpcEndpointServiceDomainNameProps.Builder =
        software.amazon.awscdk.services.route53.VpcEndpointServiceDomainNameProps.builder()

    /**
     * @param domainName The domain name to use. 
     * This domain name must be owned by this account (registered through Route53),
     * or delegated to this account. Domain ownership will be verified by AWS before
     * private DNS can be used.
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param endpointService The VPC Endpoint Service to configure Private DNS for. 
     */
    override fun endpointService(endpointService: IVpcEndpointService) {
      cdkBuilder.endpointService(endpointService.let(IVpcEndpointService::unwrap))
    }

    /**
     * @param publicHostedZone The public hosted zone to use for the domain. 
     */
    override fun publicHostedZone(publicHostedZone: IPublicHostedZone) {
      cdkBuilder.publicHostedZone(publicHostedZone.let(IPublicHostedZone::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.route53.VpcEndpointServiceDomainNameProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.route53.VpcEndpointServiceDomainNameProps,
  ) : CdkObject(cdkObject), VpcEndpointServiceDomainNameProps {
    /**
     * The domain name to use.
     *
     * This domain name must be owned by this account (registered through Route53),
     * or delegated to this account. Domain ownership will be verified by AWS before
     * private DNS can be used.
     *
     * [Documentation](https://docs.aws.amazon.com/vpc/latest/userguide/endpoint-services-dns-validation.html)
     */
    override fun domainName(): String = unwrap(this).getDomainName()

    /**
     * The VPC Endpoint Service to configure Private DNS for.
     */
    override fun endpointService(): IVpcEndpointService =
        unwrap(this).getEndpointService().let(IVpcEndpointService::wrap)

    /**
     * The public hosted zone to use for the domain.
     */
    override fun publicHostedZone(): IPublicHostedZone =
        unwrap(this).getPublicHostedZone().let(IPublicHostedZone::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VpcEndpointServiceDomainNameProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53.VpcEndpointServiceDomainNameProps):
        VpcEndpointServiceDomainNameProps = CdkObjectWrappers.wrap(cdkObject) as?
        VpcEndpointServiceDomainNameProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpcEndpointServiceDomainNameProps):
        software.amazon.awscdk.services.route53.VpcEndpointServiceDomainNameProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.route53.VpcEndpointServiceDomainNameProps
  }
}
