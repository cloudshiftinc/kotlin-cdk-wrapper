package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import kotlin.String
import kotlin.Unit

public interface EndpointOptions {
  public fun certificate(): ICertificate

  public fun certificateName(): String? = unwrap(this).getCertificateName()

  public fun endpointType(): EndpointType? = unwrap(this).getEndpointType()?.let(EndpointType::wrap)

  public fun ownershipCertificate(): ICertificate? =
      unwrap(this).getOwnershipCertificate()?.let(ICertificate::wrap)

  public fun securityPolicy(): SecurityPolicy? =
      unwrap(this).getSecurityPolicy()?.let(SecurityPolicy::wrap)

  public interface Builder {
    public fun certificate(certificate: ICertificate) {
    }

    public fun certificateName(certificateName: String) {
    }

    public fun endpointType(endpointType: EndpointType) {
    }

    public fun ownershipCertificate(ownershipCertificate: ICertificate) {
    }

    public fun securityPolicy(securityPolicy: SecurityPolicy) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.EndpointOptions.Builder =
        software.amazon.awscdk.services.apigatewayv2.EndpointOptions.builder()

    public override fun certificate(certificate: ICertificate) {
      cdkBuilder.certificate(certificate.let(ICertificate::unwrap))
    }

    public override fun certificateName(certificateName: String) {
      cdkBuilder.certificateName(certificateName)
    }

    public override fun endpointType(endpointType: EndpointType) {
      cdkBuilder.endpointType(endpointType.let(EndpointType::unwrap))
    }

    public override fun ownershipCertificate(ownershipCertificate: ICertificate) {
      cdkBuilder.ownershipCertificate(ownershipCertificate.let(ICertificate::unwrap))
    }

    public override fun securityPolicy(securityPolicy: SecurityPolicy) {
      cdkBuilder.securityPolicy(securityPolicy.let(SecurityPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.EndpointOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigatewayv2.EndpointOptions,
  ) : EndpointOptions {
    public override fun certificate(): ICertificate =
        unwrap(this).getCertificate().let(ICertificate::wrap)

    public override fun certificateName(): String? = unwrap(this).getCertificateName()

    public override fun endpointType(): EndpointType? =
        unwrap(this).getEndpointType()?.let(EndpointType::wrap)

    public override fun ownershipCertificate(): ICertificate? =
        unwrap(this).getOwnershipCertificate()?.let(ICertificate::wrap)

    public override fun securityPolicy(): SecurityPolicy? =
        unwrap(this).getSecurityPolicy()?.let(SecurityPolicy::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): EndpointOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.EndpointOptions):
        EndpointOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EndpointOptions):
        software.amazon.awscdk.services.apigatewayv2.EndpointOptions = (wrapped as
        Wrapper).cdkObject
  }
}
