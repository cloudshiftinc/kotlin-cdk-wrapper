@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface PrefixListProps : PrefixListOptions {
  public fun addressFamily(): AddressFamily? =
      unwrap(this).getAddressFamily()?.let(AddressFamily::wrap)

  public fun entries(): List<CfnPrefixList.EntryProperty> =
      unwrap(this).getEntries()?.map(CfnPrefixList.EntryProperty::wrap) ?: emptyList()

  public fun prefixListName(): String? = unwrap(this).getPrefixListName()

  @CdkDslMarker
  public interface Builder {
    public fun addressFamily(addressFamily: AddressFamily)

    public fun entries(entries: List<CfnPrefixList.EntryProperty>)

    public fun entries(vararg entries: CfnPrefixList.EntryProperty)

    public fun maxEntries(maxEntries: Number)

    public fun prefixListName(prefixListName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.PrefixListProps.Builder =
        software.amazon.awscdk.services.ec2.PrefixListProps.builder()

    override fun addressFamily(addressFamily: AddressFamily) {
      cdkBuilder.addressFamily(addressFamily.let(AddressFamily::unwrap))
    }

    override fun entries(entries: List<CfnPrefixList.EntryProperty>) {
      cdkBuilder.entries(entries.map(CfnPrefixList.EntryProperty::unwrap))
    }

    override fun entries(vararg entries: CfnPrefixList.EntryProperty): Unit =
        entries(entries.toList())

    override fun maxEntries(maxEntries: Number) {
      cdkBuilder.maxEntries(maxEntries)
    }

    override fun prefixListName(prefixListName: String) {
      cdkBuilder.prefixListName(prefixListName)
    }

    public fun build(): software.amazon.awscdk.services.ec2.PrefixListProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.PrefixListProps,
  ) : CdkObject(cdkObject), PrefixListProps {
    override fun addressFamily(): AddressFamily? =
        unwrap(this).getAddressFamily()?.let(AddressFamily::wrap)

    override fun entries(): List<CfnPrefixList.EntryProperty> =
        unwrap(this).getEntries()?.map(CfnPrefixList.EntryProperty::wrap) ?: emptyList()

    override fun maxEntries(): Number? = unwrap(this).getMaxEntries()

    override fun prefixListName(): String? = unwrap(this).getPrefixListName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PrefixListProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.PrefixListProps):
        PrefixListProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PrefixListProps):
        software.amazon.awscdk.services.ec2.PrefixListProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.PrefixListProps
  }
}
