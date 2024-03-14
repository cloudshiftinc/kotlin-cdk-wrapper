package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface DomainNameOptions {
  public fun basePath(): String? = unwrap(this).getBasePath()

  public fun certificate(): ICertificate

  public fun domainName(): String

  public fun endpointType(): EndpointType? = unwrap(this).getEndpointType()?.let(EndpointType::wrap)

  public fun mtls(): MTLSConfig? = unwrap(this).getMtls()?.let(MTLSConfig::wrap)

  public fun securityPolicy(): SecurityPolicy? =
      unwrap(this).getSecurityPolicy()?.let(SecurityPolicy::wrap)

  public interface Builder {
    public fun basePath(basePath: String) {
    }

    public fun certificate(certificate: ICertificate) {
    }

    public fun domainName(domainName: String) {
    }

    public fun endpointType(endpointType: EndpointType) {
    }

    public fun mtls(mtls: MTLSConfig) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b5affdd2e592366af859f0cc2995ec6ed640e0f630eeb8e233584f013fd10e6")
    public fun mtls(mtls: MTLSConfig.Builder.() -> Unit) {
    }

    public fun securityPolicy(securityPolicy: SecurityPolicy) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.DomainNameOptions.Builder =
        software.amazon.awscdk.services.apigateway.DomainNameOptions.builder()

    public override fun basePath(basePath: String) {
      cdkBuilder.basePath(basePath)
    }

    public override fun certificate(certificate: ICertificate) {
      cdkBuilder.certificate(certificate.let(ICertificate::unwrap))
    }

    public override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    public override fun endpointType(endpointType: EndpointType) {
      cdkBuilder.endpointType(endpointType.let(EndpointType::unwrap))
    }

    public override fun mtls(mtls: MTLSConfig) {
      cdkBuilder.mtls(mtls.let(MTLSConfig::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b5affdd2e592366af859f0cc2995ec6ed640e0f630eeb8e233584f013fd10e6")
    public override fun mtls(mtls: MTLSConfig.Builder.() -> Unit): Unit = mtls(MTLSConfig(mtls))

    public override fun securityPolicy(securityPolicy: SecurityPolicy) {
      cdkBuilder.securityPolicy(securityPolicy.let(SecurityPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.DomainNameOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.DomainNameOptions,
  ) : DomainNameOptions {
    public override fun basePath(): String? = unwrap(this).getBasePath()

    public override fun certificate(): ICertificate =
        unwrap(this).getCertificate().let(ICertificate::wrap)

    public override fun domainName(): String = unwrap(this).getDomainName()

    public override fun endpointType(): EndpointType? =
        unwrap(this).getEndpointType()?.let(EndpointType::wrap)

    public override fun mtls(): MTLSConfig? = unwrap(this).getMtls()?.let(MTLSConfig::wrap)

    public override fun securityPolicy(): SecurityPolicy? =
        unwrap(this).getSecurityPolicy()?.let(SecurityPolicy::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): DomainNameOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.DomainNameOptions):
        DomainNameOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DomainNameOptions):
        software.amazon.awscdk.services.apigateway.DomainNameOptions = (wrapped as
        Wrapper).cdkObject
  }
}
