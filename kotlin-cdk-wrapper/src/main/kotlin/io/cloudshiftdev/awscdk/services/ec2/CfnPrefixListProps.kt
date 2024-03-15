@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnPrefixListProps {
  public fun addressFamily(): String

  public fun entries(): Any? = unwrap(this).getEntries()

  public fun maxEntries(): Number? = unwrap(this).getMaxEntries()

  public fun prefixListName(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun addressFamily(addressFamily: String)

    public fun entries(entries: IResolvable)

    public fun entries(entries: List<Any>)

    public fun entries(vararg entries: Any)

    public fun maxEntries(maxEntries: Number)

    public fun prefixListName(prefixListName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnPrefixListProps.Builder =
        software.amazon.awscdk.services.ec2.CfnPrefixListProps.builder()

    override fun addressFamily(addressFamily: String) {
      cdkBuilder.addressFamily(addressFamily)
    }

    override fun entries(entries: IResolvable) {
      cdkBuilder.entries(entries.let(IResolvable::unwrap))
    }

    override fun entries(entries: List<Any>) {
      cdkBuilder.entries(entries)
    }

    override fun entries(vararg entries: Any): Unit = entries(entries.toList())

    override fun maxEntries(maxEntries: Number) {
      cdkBuilder.maxEntries(maxEntries)
    }

    override fun prefixListName(prefixListName: String) {
      cdkBuilder.prefixListName(prefixListName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnPrefixListProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnPrefixListProps,
  ) : CdkObject(cdkObject), CfnPrefixListProps {
    override fun addressFamily(): String = unwrap(this).getAddressFamily()

    override fun entries(): Any? = unwrap(this).getEntries()

    override fun maxEntries(): Number? = unwrap(this).getMaxEntries()

    override fun prefixListName(): String = unwrap(this).getPrefixListName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPrefixListProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnPrefixListProps):
        CfnPrefixListProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPrefixListProps):
        software.amazon.awscdk.services.ec2.CfnPrefixListProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnPrefixListProps
  }
}
