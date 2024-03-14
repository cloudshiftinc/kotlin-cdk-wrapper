package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDomainName internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigateway.CfnDomainName,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrDistributionDomainName(): String =
      unwrap(this).getAttrDistributionDomainName()

  public open fun attrDistributionHostedZoneId(): String =
      unwrap(this).getAttrDistributionHostedZoneId()

  public open fun attrRegionalDomainName(): String = unwrap(this).getAttrRegionalDomainName()

  public open fun attrRegionalHostedZoneId(): String = unwrap(this).getAttrRegionalHostedZoneId()

  public open fun certificateArn(): String? = unwrap(this).getCertificateArn()

  public open fun certificateArn(`value`: String) {
    unwrap(this).setCertificateArn(`value`)
  }

  public open fun domainName(): String? = unwrap(this).getDomainName()

  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  public open fun endpointConfiguration(): Any? = unwrap(this).getEndpointConfiguration()

  public open fun endpointConfiguration(`value`: IResolvable) {
    unwrap(this).setEndpointConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun endpointConfiguration(`value`: EndpointConfigurationProperty) {
    unwrap(this).setEndpointConfiguration(`value`.let(EndpointConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("896c8399b94c0c0d9d1335e8895a3932831259d754bbb201b7d7ed1986da51b4")
  public open fun endpointConfiguration(`value`: EndpointConfigurationProperty.Builder.() -> Unit):
      Unit = endpointConfiguration(EndpointConfigurationProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun mutualTlsAuthentication(): Any? = unwrap(this).getMutualTlsAuthentication()

  public open fun mutualTlsAuthentication(`value`: IResolvable) {
    unwrap(this).setMutualTlsAuthentication(`value`.let(IResolvable::unwrap))
  }

  public open fun mutualTlsAuthentication(`value`: MutualTlsAuthenticationProperty) {
    unwrap(this).setMutualTlsAuthentication(`value`.let(MutualTlsAuthenticationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c14832ea5724bde84d1711c09a4b1d06c16b24a508e4f35ab4dc783664936b71")
  public open
      fun mutualTlsAuthentication(`value`: MutualTlsAuthenticationProperty.Builder.() -> Unit): Unit
      = mutualTlsAuthentication(MutualTlsAuthenticationProperty(`value`))

  public open fun ownershipVerificationCertificateArn(): String? =
      unwrap(this).getOwnershipVerificationCertificateArn()

  public open fun ownershipVerificationCertificateArn(`value`: String) {
    unwrap(this).setOwnershipVerificationCertificateArn(`value`)
  }

  public open fun regionalCertificateArn(): String? = unwrap(this).getRegionalCertificateArn()

  public open fun regionalCertificateArn(`value`: String) {
    unwrap(this).setRegionalCertificateArn(`value`)
  }

  public open fun securityPolicy(): String? = unwrap(this).getSecurityPolicy()

  public open fun securityPolicy(`value`: String) {
    unwrap(this).setSecurityPolicy(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun certificateArn(certificateArn: String)

    public fun domainName(domainName: String)

    public fun endpointConfiguration(endpointConfiguration: IResolvable)

    public fun endpointConfiguration(endpointConfiguration: EndpointConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ba0f08964b74a867e691b3526f84082d1f0fb5692be8fe83804feb0d341d2f7")
    public
        fun endpointConfiguration(endpointConfiguration: EndpointConfigurationProperty.Builder.() -> Unit)

    public fun mutualTlsAuthentication(mutualTlsAuthentication: IResolvable)

    public fun mutualTlsAuthentication(mutualTlsAuthentication: MutualTlsAuthenticationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e5e1696e2ca70133c409015c3dd14f859e386a8457c183e158ca5d866a8b48cd")
    public
        fun mutualTlsAuthentication(mutualTlsAuthentication: MutualTlsAuthenticationProperty.Builder.() -> Unit)

    public fun ownershipVerificationCertificateArn(ownershipVerificationCertificateArn: String)

    public fun regionalCertificateArn(regionalCertificateArn: String)

    public fun securityPolicy(securityPolicy: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnDomainName.Builder =
        software.amazon.awscdk.services.apigateway.CfnDomainName.Builder.create(scope, id)

    override fun certificateArn(certificateArn: String) {
      cdkBuilder.certificateArn(certificateArn)
    }

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun endpointConfiguration(endpointConfiguration: IResolvable) {
      cdkBuilder.endpointConfiguration(endpointConfiguration.let(IResolvable::unwrap))
    }

    override fun endpointConfiguration(endpointConfiguration: EndpointConfigurationProperty) {
      cdkBuilder.endpointConfiguration(endpointConfiguration.let(EndpointConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ba0f08964b74a867e691b3526f84082d1f0fb5692be8fe83804feb0d341d2f7")
    override
        fun endpointConfiguration(endpointConfiguration: EndpointConfigurationProperty.Builder.() -> Unit):
        Unit = endpointConfiguration(EndpointConfigurationProperty(endpointConfiguration))

    override fun mutualTlsAuthentication(mutualTlsAuthentication: IResolvable) {
      cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication.let(IResolvable::unwrap))
    }

    override fun mutualTlsAuthentication(mutualTlsAuthentication: MutualTlsAuthenticationProperty) {
      cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication.let(MutualTlsAuthenticationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e5e1696e2ca70133c409015c3dd14f859e386a8457c183e158ca5d866a8b48cd")
    override
        fun mutualTlsAuthentication(mutualTlsAuthentication: MutualTlsAuthenticationProperty.Builder.() -> Unit):
        Unit = mutualTlsAuthentication(MutualTlsAuthenticationProperty(mutualTlsAuthentication))

    override fun ownershipVerificationCertificateArn(ownershipVerificationCertificateArn: String) {
      cdkBuilder.ownershipVerificationCertificateArn(ownershipVerificationCertificateArn)
    }

    override fun regionalCertificateArn(regionalCertificateArn: String) {
      cdkBuilder.regionalCertificateArn(regionalCertificateArn)
    }

    override fun securityPolicy(securityPolicy: String) {
      cdkBuilder.securityPolicy(securityPolicy)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.apigateway.CfnDomainName =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDomainName {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDomainName(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnDomainName):
        CfnDomainName = CfnDomainName(cdkObject)

    internal fun unwrap(wrapped: CfnDomainName):
        software.amazon.awscdk.services.apigateway.CfnDomainName = wrapped.cdkObject
  }

  public interface MutualTlsAuthenticationProperty {
    public fun truststoreUri(): String? = unwrap(this).getTruststoreUri()

    public fun truststoreVersion(): String? = unwrap(this).getTruststoreVersion()

    public interface Builder {
      public fun truststoreUri(truststoreUri: String)

      public fun truststoreVersion(truststoreVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigateway.CfnDomainName.MutualTlsAuthenticationProperty.Builder
          =
          software.amazon.awscdk.services.apigateway.CfnDomainName.MutualTlsAuthenticationProperty.builder()

      override fun truststoreUri(truststoreUri: String) {
        cdkBuilder.truststoreUri(truststoreUri)
      }

      override fun truststoreVersion(truststoreVersion: String) {
        cdkBuilder.truststoreVersion(truststoreVersion)
      }

      public fun build():
          software.amazon.awscdk.services.apigateway.CfnDomainName.MutualTlsAuthenticationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apigateway.CfnDomainName.MutualTlsAuthenticationProperty,
    ) : MutualTlsAuthenticationProperty {
      override fun truststoreUri(): String? = unwrap(this).getTruststoreUri()

      override fun truststoreVersion(): String? = unwrap(this).getTruststoreVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MutualTlsAuthenticationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnDomainName.MutualTlsAuthenticationProperty):
          MutualTlsAuthenticationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MutualTlsAuthenticationProperty):
          software.amazon.awscdk.services.apigateway.CfnDomainName.MutualTlsAuthenticationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EndpointConfigurationProperty {
    public fun types(): List<String> = unwrap(this).getTypes() ?: emptyList()

    public interface Builder {
      public fun types(types: List<String>)

      public fun types(vararg types: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigateway.CfnDomainName.EndpointConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.apigateway.CfnDomainName.EndpointConfigurationProperty.builder()

      override fun types(types: List<String>) {
        cdkBuilder.types(types)
      }

      override fun types(vararg types: String): Unit = types(types.toList())

      public fun build():
          software.amazon.awscdk.services.apigateway.CfnDomainName.EndpointConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apigateway.CfnDomainName.EndpointConfigurationProperty,
    ) : EndpointConfigurationProperty {
      override fun types(): List<String> = unwrap(this).getTypes() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnDomainName.EndpointConfigurationProperty):
          EndpointConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointConfigurationProperty):
          software.amazon.awscdk.services.apigateway.CfnDomainName.EndpointConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
