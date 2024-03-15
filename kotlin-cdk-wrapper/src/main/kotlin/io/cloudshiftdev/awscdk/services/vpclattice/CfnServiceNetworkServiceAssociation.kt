@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.vpclattice

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnServiceNetworkServiceAssociation internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrDnsEntryDomainName(): String = unwrap(this).getAttrDnsEntryDomainName()

  public open fun attrDnsEntryHostedZoneId(): String = unwrap(this).getAttrDnsEntryHostedZoneId()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrServiceArn(): String = unwrap(this).getAttrServiceArn()

  public open fun attrServiceId(): String = unwrap(this).getAttrServiceId()

  public open fun attrServiceName(): String = unwrap(this).getAttrServiceName()

  public open fun attrServiceNetworkArn(): String = unwrap(this).getAttrServiceNetworkArn()

  public open fun attrServiceNetworkId(): String = unwrap(this).getAttrServiceNetworkId()

  public open fun attrServiceNetworkName(): String = unwrap(this).getAttrServiceNetworkName()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun dnsEntry(): Any? = unwrap(this).getDnsEntry()

  public open fun dnsEntry(`value`: IResolvable) {
    unwrap(this).setDnsEntry(`value`.let(IResolvable::unwrap))
  }

  public open fun dnsEntry(`value`: DnsEntryProperty) {
    unwrap(this).setDnsEntry(`value`.let(DnsEntryProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("286345466c63c9fc9562f56aed02421442fa6e09f970b231d637a7ca665e581c")
  public open fun dnsEntry(`value`: DnsEntryProperty.Builder.() -> Unit): Unit =
      dnsEntry(DnsEntryProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun serviceIdentifier(): String? = unwrap(this).getServiceIdentifier()

  public open fun serviceIdentifier(`value`: String) {
    unwrap(this).setServiceIdentifier(`value`)
  }

  public open fun serviceNetworkIdentifier(): String? = unwrap(this).getServiceNetworkIdentifier()

  public open fun serviceNetworkIdentifier(`value`: String) {
    unwrap(this).setServiceNetworkIdentifier(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun dnsEntry(dnsEntry: IResolvable)

    public fun dnsEntry(dnsEntry: DnsEntryProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9ad1387d452de79c879ccab8c9eb6ba9880df0588b344da8a7a79b571dad85f1")
    public fun dnsEntry(dnsEntry: DnsEntryProperty.Builder.() -> Unit)

    public fun serviceIdentifier(serviceIdentifier: String)

    public fun serviceNetworkIdentifier(serviceNetworkIdentifier: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation.Builder =
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation.Builder.create(scope,
        id)

    override fun dnsEntry(dnsEntry: IResolvable) {
      cdkBuilder.dnsEntry(dnsEntry.let(IResolvable::unwrap))
    }

    override fun dnsEntry(dnsEntry: DnsEntryProperty) {
      cdkBuilder.dnsEntry(dnsEntry.let(DnsEntryProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9ad1387d452de79c879ccab8c9eb6ba9880df0588b344da8a7a79b571dad85f1")
    override fun dnsEntry(dnsEntry: DnsEntryProperty.Builder.() -> Unit): Unit =
        dnsEntry(DnsEntryProperty(dnsEntry))

    override fun serviceIdentifier(serviceIdentifier: String) {
      cdkBuilder.serviceIdentifier(serviceIdentifier)
    }

    override fun serviceNetworkIdentifier(serviceNetworkIdentifier: String) {
      cdkBuilder.serviceNetworkIdentifier(serviceNetworkIdentifier)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build():
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnServiceNetworkServiceAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnServiceNetworkServiceAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation):
        CfnServiceNetworkServiceAssociation = CfnServiceNetworkServiceAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnServiceNetworkServiceAssociation):
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation =
        wrapped.cdkObject
  }

  public interface DnsEntryProperty {
    public fun domainName(): String? = unwrap(this).getDomainName()

    public fun hostedZoneId(): String? = unwrap(this).getHostedZoneId()

    @CdkDslMarker
    public interface Builder {
      public fun domainName(domainName: String)

      public fun hostedZoneId(hostedZoneId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation.DnsEntryProperty.Builder
          =
          software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation.DnsEntryProperty.builder()

      override fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
      }

      override fun hostedZoneId(hostedZoneId: String) {
        cdkBuilder.hostedZoneId(hostedZoneId)
      }

      public fun build():
          software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation.DnsEntryProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation.DnsEntryProperty,
    ) : CdkObject(cdkObject), DnsEntryProperty {
      override fun domainName(): String? = unwrap(this).getDomainName()

      override fun hostedZoneId(): String? = unwrap(this).getHostedZoneId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DnsEntryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation.DnsEntryProperty):
          DnsEntryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DnsEntryProperty):
          software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation.DnsEntryProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation.DnsEntryProperty
    }
  }
}
