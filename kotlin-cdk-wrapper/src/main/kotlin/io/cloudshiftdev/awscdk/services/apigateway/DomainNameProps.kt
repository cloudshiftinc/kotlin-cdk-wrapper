@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface DomainNameProps : DomainNameOptions {
  public fun mapping(): IRestApi? = unwrap(this).getMapping()?.let(IRestApi::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun basePath(basePath: String)

    public fun certificate(certificate: ICertificate)

    public fun domainName(domainName: String)

    public fun endpointType(endpointType: EndpointType)

    public fun mapping(mapping: IRestApi)

    public fun mtls(mtls: MTLSConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("34ee6d37573f7a8663e05ba9c26dba0add485babfbdbda97037ce9e82318e0a1")
    public fun mtls(mtls: MTLSConfig.Builder.() -> Unit)

    public fun securityPolicy(securityPolicy: SecurityPolicy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.DomainNameProps.Builder =
        software.amazon.awscdk.services.apigateway.DomainNameProps.builder()

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

    override fun mapping(mapping: IRestApi) {
      cdkBuilder.mapping(mapping.let(IRestApi::unwrap))
    }

    override fun mtls(mtls: MTLSConfig) {
      cdkBuilder.mtls(mtls.let(MTLSConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("34ee6d37573f7a8663e05ba9c26dba0add485babfbdbda97037ce9e82318e0a1")
    override fun mtls(mtls: MTLSConfig.Builder.() -> Unit): Unit = mtls(MTLSConfig(mtls))

    override fun securityPolicy(securityPolicy: SecurityPolicy) {
      cdkBuilder.securityPolicy(securityPolicy.let(SecurityPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.DomainNameProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.DomainNameProps,
  ) : CdkObject(cdkObject), DomainNameProps {
    override fun basePath(): String? = unwrap(this).getBasePath()

    override fun certificate(): ICertificate = unwrap(this).getCertificate().let(ICertificate::wrap)

    override fun domainName(): String = unwrap(this).getDomainName()

    override fun endpointType(): EndpointType? =
        unwrap(this).getEndpointType()?.let(EndpointType::wrap)

    override fun mapping(): IRestApi? = unwrap(this).getMapping()?.let(IRestApi::wrap)

    override fun mtls(): MTLSConfig? = unwrap(this).getMtls()?.let(MTLSConfig::wrap)

    override fun securityPolicy(): SecurityPolicy? =
        unwrap(this).getSecurityPolicy()?.let(SecurityPolicy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DomainNameProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.DomainNameProps):
        DomainNameProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DomainNameProps):
        software.amazon.awscdk.services.apigateway.DomainNameProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.DomainNameProps
  }
}
