package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.CfnResource
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
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDomainName internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnDomainName,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrRegionalDomainName(): String = unwrap(this).getAttrRegionalDomainName()

  public open fun attrRegionalHostedZoneId(): String = unwrap(this).getAttrRegionalHostedZoneId()

  public open fun domainName(): String = unwrap(this).getDomainName()

  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  public open fun domainNameConfigurations(): Any? = unwrap(this).getDomainNameConfigurations()

  public open fun domainNameConfigurations(`value`: IResolvable) {
    unwrap(this).setDomainNameConfigurations(`value`.let(IResolvable::unwrap))
  }

  public open fun domainNameConfigurations(__idx_ac66f0: List<Any>) {
    unwrap(this).setDomainNameConfigurations(__idx_ac66f0)
  }

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
  @JvmName("cb0d8d5ba3c842a7d34f6e2327f39e5e77bc744fdc701a2ce9260d922a5236db")
  public open
      fun mutualTlsAuthentication(`value`: MutualTlsAuthenticationProperty.Builder.() -> Unit): Unit
      = mutualTlsAuthentication(MutualTlsAuthenticationProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public interface Builder {
    public fun domainName(domainName: String) {
    }

    public fun domainNameConfigurations(domainNameConfigurations: IResolvable) {
    }

    public fun domainNameConfigurations(domainNameConfigurations: List<Any>) {
    }

    public fun mutualTlsAuthentication(mutualTlsAuthentication: IResolvable) {
    }

    public fun mutualTlsAuthentication(mutualTlsAuthentication: MutualTlsAuthenticationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54b3f93f1f07c6288dc8128a5b41417be3e6cd17c1990fb447a874e975ae6ac0")
    public
        fun mutualTlsAuthentication(mutualTlsAuthentication: MutualTlsAuthenticationProperty.Builder.() -> Unit) {
    }

    public fun tags(tags: Map<String, String>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.CfnDomainName.Builder =
        software.amazon.awscdk.services.apigatewayv2.CfnDomainName.Builder.create(scope, id)

    public override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    public override fun domainNameConfigurations(domainNameConfigurations: IResolvable) {
      cdkBuilder.domainNameConfigurations(domainNameConfigurations.let(IResolvable::unwrap))
    }

    public override fun domainNameConfigurations(domainNameConfigurations: List<Any>) {
      cdkBuilder.domainNameConfigurations(domainNameConfigurations)
    }

    public override fun mutualTlsAuthentication(mutualTlsAuthentication: IResolvable) {
      cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication.let(IResolvable::unwrap))
    }

    public override
        fun mutualTlsAuthentication(mutualTlsAuthentication: MutualTlsAuthenticationProperty) {
      cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication.let(MutualTlsAuthenticationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54b3f93f1f07c6288dc8128a5b41417be3e6cd17c1990fb447a874e975ae6ac0")
    public override
        fun mutualTlsAuthentication(mutualTlsAuthentication: MutualTlsAuthenticationProperty.Builder.() -> Unit):
        Unit = mutualTlsAuthentication(MutualTlsAuthenticationProperty(mutualTlsAuthentication))

    public override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnDomainName =
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

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnDomainName):
        CfnDomainName = CfnDomainName(cdkObject)

    internal fun unwrap(wrapped: CfnDomainName):
        software.amazon.awscdk.services.apigatewayv2.CfnDomainName = wrapped.cdkObject
  }

  public interface DomainNameConfigurationProperty {
    public fun certificateArn(): String? = unwrap(this).getCertificateArn()

    public fun certificateName(): String? = unwrap(this).getCertificateName()

    public fun endpointType(): String? = unwrap(this).getEndpointType()

    public fun ownershipVerificationCertificateArn(): String? =
        unwrap(this).getOwnershipVerificationCertificateArn()

    public fun securityPolicy(): String? = unwrap(this).getSecurityPolicy()

    public interface Builder {
      public fun certificateArn(certificateArn: String) {
      }

      public fun certificateName(certificateName: String) {
      }

      public fun endpointType(endpointType: String) {
      }

      public fun ownershipVerificationCertificateArn(ownershipVerificationCertificateArn: String) {
      }

      public fun securityPolicy(securityPolicy: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigatewayv2.CfnDomainName.DomainNameConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.apigatewayv2.CfnDomainName.DomainNameConfigurationProperty.builder()

      public override fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
      }

      public override fun certificateName(certificateName: String) {
        cdkBuilder.certificateName(certificateName)
      }

      public override fun endpointType(endpointType: String) {
        cdkBuilder.endpointType(endpointType)
      }

      public override
          fun ownershipVerificationCertificateArn(ownershipVerificationCertificateArn: String) {
        cdkBuilder.ownershipVerificationCertificateArn(ownershipVerificationCertificateArn)
      }

      public override fun securityPolicy(securityPolicy: String) {
        cdkBuilder.securityPolicy(securityPolicy)
      }

      public fun build():
          software.amazon.awscdk.services.apigatewayv2.CfnDomainName.DomainNameConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apigatewayv2.CfnDomainName.DomainNameConfigurationProperty,
    ) : DomainNameConfigurationProperty {
      public override fun certificateArn(): String? = unwrap(this).getCertificateArn()

      public override fun certificateName(): String? = unwrap(this).getCertificateName()

      public override fun endpointType(): String? = unwrap(this).getEndpointType()

      public override fun ownershipVerificationCertificateArn(): String? =
          unwrap(this).getOwnershipVerificationCertificateArn()

      public override fun securityPolicy(): String? = unwrap(this).getSecurityPolicy()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DomainNameConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnDomainName.DomainNameConfigurationProperty):
          DomainNameConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DomainNameConfigurationProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnDomainName.DomainNameConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MutualTlsAuthenticationProperty {
    public fun truststoreUri(): String? = unwrap(this).getTruststoreUri()

    public fun truststoreVersion(): String? = unwrap(this).getTruststoreVersion()

    public interface Builder {
      public fun truststoreUri(truststoreUri: String) {
      }

      public fun truststoreVersion(truststoreVersion: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigatewayv2.CfnDomainName.MutualTlsAuthenticationProperty.Builder
          =
          software.amazon.awscdk.services.apigatewayv2.CfnDomainName.MutualTlsAuthenticationProperty.builder()

      public override fun truststoreUri(truststoreUri: String) {
        cdkBuilder.truststoreUri(truststoreUri)
      }

      public override fun truststoreVersion(truststoreVersion: String) {
        cdkBuilder.truststoreVersion(truststoreVersion)
      }

      public fun build():
          software.amazon.awscdk.services.apigatewayv2.CfnDomainName.MutualTlsAuthenticationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apigatewayv2.CfnDomainName.MutualTlsAuthenticationProperty,
    ) : MutualTlsAuthenticationProperty {
      public override fun truststoreUri(): String? = unwrap(this).getTruststoreUri()

      public override fun truststoreVersion(): String? = unwrap(this).getTruststoreVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MutualTlsAuthenticationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnDomainName.MutualTlsAuthenticationProperty):
          MutualTlsAuthenticationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MutualTlsAuthenticationProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnDomainName.MutualTlsAuthenticationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
