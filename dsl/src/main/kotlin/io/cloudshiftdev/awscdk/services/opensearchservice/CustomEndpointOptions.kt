package io.cloudshiftdev.awscdk.services.opensearchservice

import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import io.cloudshiftdev.awscdk.services.route53.IHostedZone
import kotlin.String
import kotlin.Unit

public interface CustomEndpointOptions {
  public fun certificate(): ICertificate? = unwrap(this).getCertificate()?.let(ICertificate::wrap)

  public fun domainName(): String

  public fun hostedZone(): IHostedZone? = unwrap(this).getHostedZone()?.let(IHostedZone::wrap)

  public interface Builder {
    public fun certificate(certificate: ICertificate)

    public fun domainName(domainName: String)

    public fun hostedZone(hostedZone: IHostedZone)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.opensearchservice.CustomEndpointOptions.Builder =
        software.amazon.awscdk.services.opensearchservice.CustomEndpointOptions.builder()

    override fun certificate(certificate: ICertificate) {
      cdkBuilder.certificate(certificate.let(ICertificate::unwrap))
    }

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun hostedZone(hostedZone: IHostedZone) {
      cdkBuilder.hostedZone(hostedZone.let(IHostedZone::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.opensearchservice.CustomEndpointOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.opensearchservice.CustomEndpointOptions,
  ) : CustomEndpointOptions {
    override fun certificate(): ICertificate? =
        unwrap(this).getCertificate()?.let(ICertificate::wrap)

    override fun domainName(): String = unwrap(this).getDomainName()

    override fun hostedZone(): IHostedZone? = unwrap(this).getHostedZone()?.let(IHostedZone::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CustomEndpointOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CustomEndpointOptions):
        CustomEndpointOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomEndpointOptions):
        software.amazon.awscdk.services.opensearchservice.CustomEndpointOptions = (wrapped as
        Wrapper).cdkObject
  }
}
