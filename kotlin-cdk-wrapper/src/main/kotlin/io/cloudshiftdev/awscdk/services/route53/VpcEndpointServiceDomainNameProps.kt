@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.IVpcEndpointService
import kotlin.String
import kotlin.Unit

public interface VpcEndpointServiceDomainNameProps {
  public fun domainName(): String

  public fun endpointService(): IVpcEndpointService

  public fun publicHostedZone(): IPublicHostedZone

  @CdkDslMarker
  public interface Builder {
    public fun domainName(domainName: String)

    public fun endpointService(endpointService: IVpcEndpointService)

    public fun publicHostedZone(publicHostedZone: IPublicHostedZone)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53.VpcEndpointServiceDomainNameProps.Builder =
        software.amazon.awscdk.services.route53.VpcEndpointServiceDomainNameProps.builder()

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun endpointService(endpointService: IVpcEndpointService) {
      cdkBuilder.endpointService(endpointService.let(IVpcEndpointService::unwrap))
    }

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
    override fun domainName(): String = unwrap(this).getDomainName()

    override fun endpointService(): IVpcEndpointService =
        unwrap(this).getEndpointService().let(IVpcEndpointService::wrap)

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
        VpcEndpointServiceDomainNameProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpcEndpointServiceDomainNameProps):
        software.amazon.awscdk.services.route53.VpcEndpointServiceDomainNameProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.route53.VpcEndpointServiceDomainNameProps
  }
}
