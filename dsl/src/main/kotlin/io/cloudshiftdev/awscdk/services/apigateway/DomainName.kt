package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class DomainName internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigateway.DomainName,
) : Resource(cdkObject), IDomainName {
  public open fun addApiMapping(targetStage: IStage) {
    unwrap(this).addApiMapping(targetStage.let(IStage::unwrap))
  }

  public open fun addApiMapping(targetStage: IStage, options: ApiMappingOptions) {
    unwrap(this).addApiMapping(targetStage.let(IStage::unwrap),
        options.let(ApiMappingOptions::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cb1e78fd77a367fc2f160f3c04935acac6f9a43962fd601069e2e21f618ee024")
  public open fun addApiMapping(targetStage: IStage, options: ApiMappingOptions.Builder.() -> Unit):
      Unit = addApiMapping(targetStage, ApiMappingOptions(options))

  public open fun addBasePathMapping(targetApi: IRestApi): BasePathMapping =
      unwrap(this).addBasePathMapping(targetApi.let(IRestApi::unwrap)).let(BasePathMapping::wrap)

  public open fun addBasePathMapping(targetApi: IRestApi, options: BasePathMappingOptions):
      BasePathMapping = unwrap(this).addBasePathMapping(targetApi.let(IRestApi::unwrap),
      options.let(BasePathMappingOptions::unwrap)).let(BasePathMapping::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("df862dae36c668828f4fb0eca4b25a8e8e9725933b141948bb65cbd874514dbd")
  public open fun addBasePathMapping(targetApi: IRestApi,
      options: BasePathMappingOptions.Builder.() -> Unit): BasePathMapping =
      addBasePathMapping(targetApi, BasePathMappingOptions(options))

  public override fun domainName(): String = unwrap(this).getDomainName()

  public override fun domainNameAliasDomainName(): String =
      unwrap(this).getDomainNameAliasDomainName()

  public override fun domainNameAliasHostedZoneId(): String =
      unwrap(this).getDomainNameAliasHostedZoneId()

  public interface Builder {
    public fun basePath(basePath: String) {
    }

    public fun certificate(certificate: ICertificate) {
    }

    public fun domainName(domainName: String) {
    }

    public fun endpointType(endpointType: EndpointType) {
    }

    public fun mapping(mapping: IRestApi) {
    }

    public fun mtls(mtls: MTLSConfig) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1efdd2c46f62bd00c654559d6be40f950f52dcfa1bb6d8fea6edff7bb17e7279")
    public fun mtls(mtls: MTLSConfig.Builder.() -> Unit) {
    }

    public fun securityPolicy(securityPolicy: SecurityPolicy) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.DomainName.Builder =
        software.amazon.awscdk.services.apigateway.DomainName.Builder.create(scope, id)

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

    public override fun mapping(mapping: IRestApi) {
      cdkBuilder.mapping(mapping.let(IRestApi::unwrap))
    }

    public override fun mtls(mtls: MTLSConfig) {
      cdkBuilder.mtls(mtls.let(MTLSConfig::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1efdd2c46f62bd00c654559d6be40f950f52dcfa1bb6d8fea6edff7bb17e7279")
    public override fun mtls(mtls: MTLSConfig.Builder.() -> Unit): Unit = mtls(MTLSConfig(mtls))

    public override fun securityPolicy(securityPolicy: SecurityPolicy) {
      cdkBuilder.securityPolicy(securityPolicy.let(SecurityPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.DomainName = cdkBuilder.build()
  }

  public companion object {
    public open fun fromDomainNameAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: DomainNameAttributes,
    ): IDomainName =
        software.amazon.awscdk.services.apigateway.DomainName.fromDomainNameAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(DomainNameAttributes::unwrap)).let(IDomainName::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ac8f944103380ed338cd724004967851f1e6535959d9a4afb514e759be47faea")
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

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.DomainName): DomainName
        = DomainName(cdkObject)

    internal fun unwrap(wrapped: DomainName): software.amazon.awscdk.services.apigateway.DomainName
        = wrapped.cdkObject
  }
}
