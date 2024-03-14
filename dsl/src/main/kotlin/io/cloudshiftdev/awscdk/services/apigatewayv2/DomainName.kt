package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class DomainName internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigatewayv2.DomainName,
) : Resource(cdkObject), IDomainName {
  public open fun addEndpoint(options: EndpointOptions) {
    unwrap(this).addEndpoint(options.let(EndpointOptions::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0eea7761dc222ea7b9c120dc4157ca7e7b265c36814cd6a541fc94d9535ecbe6")
  public open fun addEndpoint(options: EndpointOptions.Builder.() -> Unit): Unit =
      addEndpoint(EndpointOptions(options))

  public override fun name(): String = unwrap(this).getName()

  public override fun regionalDomainName(): String = unwrap(this).getRegionalDomainName()

  public override fun regionalHostedZoneId(): String = unwrap(this).getRegionalHostedZoneId()

  public interface Builder {
    public fun certificate(certificate: ICertificate)

    public fun certificateName(certificateName: String)

    public fun domainName(domainName: String)

    public fun endpointType(endpointType: EndpointType)

    public fun mtls(mtls: MTLSConfig)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2780e80b9beb119f553ed8d77943d149862d54b836d3fd01f019d272aa4e5f18")
    public fun mtls(mtls: MTLSConfig.Builder.() -> Unit)

    public fun ownershipCertificate(ownershipCertificate: ICertificate)

    public fun securityPolicy(securityPolicy: SecurityPolicy)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.DomainName.Builder =
        software.amazon.awscdk.services.apigatewayv2.DomainName.Builder.create(scope, id)

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

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2780e80b9beb119f553ed8d77943d149862d54b836d3fd01f019d272aa4e5f18")
    override fun mtls(mtls: MTLSConfig.Builder.() -> Unit): Unit = mtls(MTLSConfig(mtls))

    override fun ownershipCertificate(ownershipCertificate: ICertificate) {
      cdkBuilder.ownershipCertificate(ownershipCertificate.let(ICertificate::unwrap))
    }

    override fun securityPolicy(securityPolicy: SecurityPolicy) {
      cdkBuilder.securityPolicy(securityPolicy.let(SecurityPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.DomainName = cdkBuilder.build()
  }

  public companion object {
    public open fun fromDomainNameAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: DomainNameAttributes,
    ): IDomainName =
        software.amazon.awscdk.services.apigatewayv2.DomainName.fromDomainNameAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(DomainNameAttributes::unwrap)).let(IDomainName::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1c56095f22c2c0873774339a1b537e195551eeb9d2e33592f72cef7d78b8bc1b")
    public open fun fromDomainNameAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: DomainNameAttributes.Builder.() -> Unit,
    ): IDomainName = fromDomainNameAttributes(scope, id, DomainNameAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): DomainName {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return DomainName(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.DomainName):
        DomainName = DomainName(cdkObject)

    internal fun unwrap(wrapped: DomainName):
        software.amazon.awscdk.services.apigatewayv2.DomainName = wrapped.cdkObject
  }
}
