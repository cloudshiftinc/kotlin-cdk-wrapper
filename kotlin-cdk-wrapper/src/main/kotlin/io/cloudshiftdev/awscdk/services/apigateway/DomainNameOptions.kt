@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import kotlin.String
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

  @CdkDslMarker
  public interface Builder {
    public fun basePath(basePath: String)

    public fun certificate(certificate: ICertificate)

    public fun domainName(domainName: String)

    public fun endpointType(endpointType: EndpointType)

    public fun mtls(mtls: MTLSConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b5affdd2e592366af859f0cc2995ec6ed640e0f630eeb8e233584f013fd10e6")
    public fun mtls(mtls: MTLSConfig.Builder.() -> Unit)

    public fun securityPolicy(securityPolicy: SecurityPolicy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.DomainNameOptions.Builder =
        software.amazon.awscdk.services.apigateway.DomainNameOptions.builder()

    override fun basePath(basePath: String) {
      cdkBuilder.basePath(basePath)
    }

    override fun certificate(certificate: ICertificate) {
      cdkBuilder.certificate(certificate.let(ICertificate::unwrap))
    }

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun endpointType(endpointType: EndpointType) {
      cdkBuilder.endpointType(endpointType.let(EndpointType::unwrap))
    }

    override fun mtls(mtls: MTLSConfig) {
      cdkBuilder.mtls(mtls.let(MTLSConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b5affdd2e592366af859f0cc2995ec6ed640e0f630eeb8e233584f013fd10e6")
    override fun mtls(mtls: MTLSConfig.Builder.() -> Unit): Unit = mtls(MTLSConfig(mtls))

    override fun securityPolicy(securityPolicy: SecurityPolicy) {
      cdkBuilder.securityPolicy(securityPolicy.let(SecurityPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.DomainNameOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.DomainNameOptions,
  ) : CdkObject(cdkObject), DomainNameOptions {
    override fun basePath(): String? = unwrap(this).getBasePath()

    override fun certificate(): ICertificate = unwrap(this).getCertificate().let(ICertificate::wrap)

    override fun domainName(): String = unwrap(this).getDomainName()

    override fun endpointType(): EndpointType? =
        unwrap(this).getEndpointType()?.let(EndpointType::wrap)

    override fun mtls(): MTLSConfig? = unwrap(this).getMtls()?.let(MTLSConfig::wrap)

    override fun securityPolicy(): SecurityPolicy? =
        unwrap(this).getSecurityPolicy()?.let(SecurityPolicy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DomainNameOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.DomainNameOptions):
        DomainNameOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DomainNameOptions):
        software.amazon.awscdk.services.apigateway.DomainNameOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.DomainNameOptions
  }
}
