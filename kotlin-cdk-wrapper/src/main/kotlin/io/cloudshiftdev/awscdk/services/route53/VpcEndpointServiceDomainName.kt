@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.IVpcEndpointService
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A Private DNS configuration for a VPC endpoint service.
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
public open class VpcEndpointServiceDomainName(
  cdkObject: software.amazon.awscdk.services.route53.VpcEndpointServiceDomainName,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: VpcEndpointServiceDomainNameProps,
  ) :
      this(software.amazon.awscdk.services.route53.VpcEndpointServiceDomainName(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(VpcEndpointServiceDomainNameProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: VpcEndpointServiceDomainNameProps.Builder.() -> Unit,
  ) : this(scope, id, VpcEndpointServiceDomainNameProps(props)
  )

  /**
   * The domain name associated with the private DNS configuration.
   */
  public open fun domainName(): String = unwrap(this).getDomainName()

  /**
   * The domain name associated with the private DNS configuration.
   */
  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.route53.VpcEndpointServiceDomainName].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The domain name to use.
     *
     * This domain name must be owned by this account (registered through Route53),
     * or delegated to this account. Domain ownership will be verified by AWS before
     * private DNS can be used.
     *
     * [Documentation](https://docs.aws.amazon.com/vpc/latest/userguide/endpoint-services-dns-validation.html)
     * @param domainName The domain name to use. 
     */
    public fun domainName(domainName: String)

    /**
     * The VPC Endpoint Service to configure Private DNS for.
     *
     * @param endpointService The VPC Endpoint Service to configure Private DNS for. 
     */
    public fun endpointService(endpointService: IVpcEndpointService)

    /**
     * The public hosted zone to use for the domain.
     *
     * @param publicHostedZone The public hosted zone to use for the domain. 
     */
    public fun publicHostedZone(publicHostedZone: IPublicHostedZone)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53.VpcEndpointServiceDomainName.Builder =
        software.amazon.awscdk.services.route53.VpcEndpointServiceDomainName.Builder.create(scope,
        id)

    /**
     * The domain name to use.
     *
     * This domain name must be owned by this account (registered through Route53),
     * or delegated to this account. Domain ownership will be verified by AWS before
     * private DNS can be used.
     *
     * [Documentation](https://docs.aws.amazon.com/vpc/latest/userguide/endpoint-services-dns-validation.html)
     * @param domainName The domain name to use. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * The VPC Endpoint Service to configure Private DNS for.
     *
     * @param endpointService The VPC Endpoint Service to configure Private DNS for. 
     */
    override fun endpointService(endpointService: IVpcEndpointService) {
      cdkBuilder.endpointService(endpointService.let(IVpcEndpointService.Companion::unwrap))
    }

    /**
     * The public hosted zone to use for the domain.
     *
     * @param publicHostedZone The public hosted zone to use for the domain. 
     */
    override fun publicHostedZone(publicHostedZone: IPublicHostedZone) {
      cdkBuilder.publicHostedZone(publicHostedZone.let(IPublicHostedZone.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.route53.VpcEndpointServiceDomainName =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): VpcEndpointServiceDomainName {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return VpcEndpointServiceDomainName(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53.VpcEndpointServiceDomainName):
        VpcEndpointServiceDomainName = VpcEndpointServiceDomainName(cdkObject)

    internal fun unwrap(wrapped: VpcEndpointServiceDomainName):
        software.amazon.awscdk.services.route53.VpcEndpointServiceDomainName = wrapped.cdkObject as
        software.amazon.awscdk.services.route53.VpcEndpointServiceDomainName
  }
}
