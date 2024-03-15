@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.vpclattice

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnServiceNetworkServiceAssociationProps {
  public fun dnsEntry(): Any? = unwrap(this).getDnsEntry()

  public fun serviceIdentifier(): String? = unwrap(this).getServiceIdentifier()

  public fun serviceNetworkIdentifier(): String? = unwrap(this).getServiceNetworkIdentifier()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun dnsEntry(dnsEntry: IResolvable)

    public fun dnsEntry(dnsEntry: CfnServiceNetworkServiceAssociation.DnsEntryProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("99183e5e6a292090a3f0e8de85d98eb2ed2f27f781d8b3aae196eea08cacd0dc")
    public
        fun dnsEntry(dnsEntry: CfnServiceNetworkServiceAssociation.DnsEntryProperty.Builder.() -> Unit)

    public fun serviceIdentifier(serviceIdentifier: String)

    public fun serviceNetworkIdentifier(serviceNetworkIdentifier: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociationProps.Builder
        =
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociationProps.builder()

    override fun dnsEntry(dnsEntry: IResolvable) {
      cdkBuilder.dnsEntry(dnsEntry.let(IResolvable::unwrap))
    }

    override fun dnsEntry(dnsEntry: CfnServiceNetworkServiceAssociation.DnsEntryProperty) {
      cdkBuilder.dnsEntry(dnsEntry.let(CfnServiceNetworkServiceAssociation.DnsEntryProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("99183e5e6a292090a3f0e8de85d98eb2ed2f27f781d8b3aae196eea08cacd0dc")
    override
        fun dnsEntry(dnsEntry: CfnServiceNetworkServiceAssociation.DnsEntryProperty.Builder.() -> Unit):
        Unit = dnsEntry(CfnServiceNetworkServiceAssociation.DnsEntryProperty(dnsEntry))

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
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociationProps,
  ) : CdkObject(cdkObject), CfnServiceNetworkServiceAssociationProps {
    override fun dnsEntry(): Any? = unwrap(this).getDnsEntry()

    override fun serviceIdentifier(): String? = unwrap(this).getServiceIdentifier()

    override fun serviceNetworkIdentifier(): String? = unwrap(this).getServiceNetworkIdentifier()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnServiceNetworkServiceAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociationProps):
        CfnServiceNetworkServiceAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnServiceNetworkServiceAssociationProps):
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociationProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociationProps
  }
}
