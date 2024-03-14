package io.cloudshiftdev.awscdk.services.vpclattice

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

public open class CfnService internal constructor(
  private val cdkObject: software.amazon.awscdk.services.vpclattice.CfnService,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrDnsEntryDomainName(): String = unwrap(this).getAttrDnsEntryDomainName()

  public open fun attrDnsEntryHostedZoneId(): String = unwrap(this).getAttrDnsEntryHostedZoneId()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrLastUpdatedAt(): String = unwrap(this).getAttrLastUpdatedAt()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun authType(): String? = unwrap(this).getAuthType()

  public open fun authType(`value`: String) {
    unwrap(this).setAuthType(`value`)
  }

  public open fun certificateArn(): String? = unwrap(this).getCertificateArn()

  public open fun certificateArn(`value`: String) {
    unwrap(this).setCertificateArn(`value`)
  }

  public open fun customDomainName(): String? = unwrap(this).getCustomDomainName()

  public open fun customDomainName(`value`: String) {
    unwrap(this).setCustomDomainName(`value`)
  }

  public open fun dnsEntry(): Any? = unwrap(this).getDnsEntry()

  public open fun dnsEntry(`value`: IResolvable) {
    unwrap(this).setDnsEntry(`value`.let(IResolvable::unwrap))
  }

  public open fun dnsEntry(`value`: DnsEntryProperty) {
    unwrap(this).setDnsEntry(`value`.let(DnsEntryProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0d891f5f9ad9ada8d9d7f685e87e5b5ce1f87654c2ba613788a5a7b5ccdc0555")
  public open fun dnsEntry(`value`: DnsEntryProperty.Builder.() -> Unit): Unit =
      dnsEntry(DnsEntryProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun authType(authType: String) {
    }

    public fun certificateArn(certificateArn: String) {
    }

    public fun customDomainName(customDomainName: String) {
    }

    public fun dnsEntry(dnsEntry: IResolvable) {
    }

    public fun dnsEntry(dnsEntry: DnsEntryProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a5d85bee0e0b2a595414b10b92d2c2c90c4f1f8724a69c1c2639f996dee89289")
    public fun dnsEntry(dnsEntry: DnsEntryProperty.Builder.() -> Unit) {
    }

    public fun name(name: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.vpclattice.CfnService.Builder =
        software.amazon.awscdk.services.vpclattice.CfnService.Builder.create(scope, id)

    public override fun authType(authType: String) {
      cdkBuilder.authType(authType)
    }

    public override fun certificateArn(certificateArn: String) {
      cdkBuilder.certificateArn(certificateArn)
    }

    public override fun customDomainName(customDomainName: String) {
      cdkBuilder.customDomainName(customDomainName)
    }

    public override fun dnsEntry(dnsEntry: IResolvable) {
      cdkBuilder.dnsEntry(dnsEntry.let(IResolvable::unwrap))
    }

    public override fun dnsEntry(dnsEntry: DnsEntryProperty) {
      cdkBuilder.dnsEntry(dnsEntry.let(DnsEntryProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a5d85bee0e0b2a595414b10b92d2c2c90c4f1f8724a69c1c2639f996dee89289")
    public override fun dnsEntry(dnsEntry: DnsEntryProperty.Builder.() -> Unit): Unit =
        dnsEntry(DnsEntryProperty(dnsEntry))

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.vpclattice.CfnService = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnService {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnService(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnService): CfnService
        = CfnService(cdkObject)

    internal fun unwrap(wrapped: CfnService): software.amazon.awscdk.services.vpclattice.CfnService
        = wrapped.cdkObject
  }

  public interface DnsEntryProperty {
    public fun domainName(): String? = unwrap(this).getDomainName()

    public fun hostedZoneId(): String? = unwrap(this).getHostedZoneId()

    public interface Builder {
      public fun domainName(domainName: String) {
      }

      public fun hostedZoneId(hostedZoneId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnService.DnsEntryProperty.Builder =
          software.amazon.awscdk.services.vpclattice.CfnService.DnsEntryProperty.builder()

      public override fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
      }

      public override fun hostedZoneId(hostedZoneId: String) {
        cdkBuilder.hostedZoneId(hostedZoneId)
      }

      public fun build(): software.amazon.awscdk.services.vpclattice.CfnService.DnsEntryProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.vpclattice.CfnService.DnsEntryProperty,
    ) : DnsEntryProperty {
      public override fun domainName(): String? = unwrap(this).getDomainName()

      public override fun hostedZoneId(): String? = unwrap(this).getHostedZoneId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DnsEntryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnService.DnsEntryProperty):
          DnsEntryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DnsEntryProperty):
          software.amazon.awscdk.services.vpclattice.CfnService.DnsEntryProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
