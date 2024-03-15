@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface DomainNameProps : EndpointOptions {
  public fun domainName(): String

  public fun mtls(): MTLSConfig? = unwrap(this).getMtls()?.let(MTLSConfig::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun certificate(certificate: ICertificate)

    public fun certificateName(certificateName: String)

    public fun domainName(domainName: String)

    public fun endpointType(endpointType: EndpointType)

    public fun mtls(mtls: MTLSConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b9e45500d6f1a844597f4387a50a77a702e843a8bc7886abd4928ee4bb9e494e")
    public fun mtls(mtls: MTLSConfig.Builder.() -> Unit)

    public fun ownershipCertificate(ownershipCertificate: ICertificate)

    public fun securityPolicy(securityPolicy: SecurityPolicy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.DomainNameProps.Builder =
        software.amazon.awscdk.services.apigatewayv2.DomainNameProps.builder()

    override fun certificate(certificate: ICertificate) {
      cdkBuilder.certificate(certificate.let(ICertificate::unwrap))
    }

    override fun certificateName(certificateName: String) {
      cdkBuilder.certificateName(certificateName)
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
    @JvmName("b9e45500d6f1a844597f4387a50a77a702e843a8bc7886abd4928ee4bb9e494e")
    override fun mtls(mtls: MTLSConfig.Builder.() -> Unit): Unit = mtls(MTLSConfig(mtls))

    override fun ownershipCertificate(ownershipCertificate: ICertificate) {
      cdkBuilder.ownershipCertificate(ownershipCertificate.let(ICertificate::unwrap))
    }

    override fun securityPolicy(securityPolicy: SecurityPolicy) {
      cdkBuilder.securityPolicy(securityPolicy.let(SecurityPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.DomainNameProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.DomainNameProps,
  ) : CdkObject(cdkObject), DomainNameProps {
    override fun certificate(): ICertificate = unwrap(this).getCertificate().let(ICertificate::wrap)

    override fun certificateName(): String? = unwrap(this).getCertificateName()

    override fun domainName(): String = unwrap(this).getDomainName()

    override fun endpointType(): EndpointType? =
        unwrap(this).getEndpointType()?.let(EndpointType::wrap)

    override fun mtls(): MTLSConfig? = unwrap(this).getMtls()?.let(MTLSConfig::wrap)

    override fun ownershipCertificate(): ICertificate? =
        unwrap(this).getOwnershipCertificate()?.let(ICertificate::wrap)

    override fun securityPolicy(): SecurityPolicy? =
        unwrap(this).getSecurityPolicy()?.let(SecurityPolicy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DomainNameProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.DomainNameProps):
        DomainNameProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DomainNameProps):
        software.amazon.awscdk.services.apigatewayv2.DomainNameProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.DomainNameProps
  }
}
