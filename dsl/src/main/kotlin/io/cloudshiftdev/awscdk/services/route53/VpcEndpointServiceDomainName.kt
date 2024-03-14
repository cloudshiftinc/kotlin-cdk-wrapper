package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.services.ec2.IVpcEndpointService
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class VpcEndpointServiceDomainName internal constructor(
  private val cdkObject: software.amazon.awscdk.services.route53.VpcEndpointServiceDomainName,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public open fun domainName(): String = unwrap(this).getDomainName()

  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  public interface Builder {
    public fun domainName(domainName: String)

    public fun endpointService(endpointService: IVpcEndpointService)

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

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun endpointService(endpointService: IVpcEndpointService) {
      cdkBuilder.endpointService(endpointService.let(IVpcEndpointService::unwrap))
    }

    override fun publicHostedZone(publicHostedZone: IPublicHostedZone) {
      cdkBuilder.publicHostedZone(publicHostedZone.let(IPublicHostedZone::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.route53.VpcEndpointServiceDomainName =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
        software.amazon.awscdk.services.route53.VpcEndpointServiceDomainName = wrapped.cdkObject
  }
}
