@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for creating a prefix list.
 *
 * Example:
 *
 * ```
 * PrefixList.Builder.create(this, "EmptyPrefixList")
 * .maxEntries(100)
 * .build();
 * ```
 */
public interface PrefixListProps : PrefixListOptions {
  /**
   * The address family of the prefix list.
   *
   * Default: AddressFamily.IP_V4
   */
  public fun addressFamily(): AddressFamily? =
      unwrap(this).getAddressFamily()?.let(AddressFamily::wrap)

  /**
   * The list of entries for the prefix list.
   *
   * Default: []
   */
  public fun entries(): List<CfnPrefixList.EntryProperty> =
      unwrap(this).getEntries()?.map(CfnPrefixList.EntryProperty::wrap) ?: emptyList()

  /**
   * The name of the prefix list.
   *
   * Default: None
   */
  public fun prefixListName(): String? = unwrap(this).getPrefixListName()

  /**
   * A builder for [PrefixListProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param addressFamily The address family of the prefix list.
     */
    public fun addressFamily(addressFamily: AddressFamily)

    /**
     * @param entries The list of entries for the prefix list.
     */
    public fun entries(entries: List<CfnPrefixList.EntryProperty>)

    /**
     * @param entries The list of entries for the prefix list.
     */
    public fun entries(vararg entries: CfnPrefixList.EntryProperty)

    /**
     * @param maxEntries The maximum number of entries for the prefix list.
     */
    public fun maxEntries(maxEntries: Number)

    /**
     * @param prefixListName The name of the prefix list.
     */
    public fun prefixListName(prefixListName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.PrefixListProps.Builder =
        software.amazon.awscdk.services.ec2.PrefixListProps.builder()

    /**
     * @param addressFamily The address family of the prefix list.
     */
    override fun addressFamily(addressFamily: AddressFamily) {
      cdkBuilder.addressFamily(addressFamily.let(AddressFamily::unwrap))
    }

    /**
     * @param entries The list of entries for the prefix list.
     */
    override fun entries(entries: List<CfnPrefixList.EntryProperty>) {
      cdkBuilder.entries(entries.map(CfnPrefixList.EntryProperty::unwrap))
    }

    /**
     * @param entries The list of entries for the prefix list.
     */
    override fun entries(vararg entries: CfnPrefixList.EntryProperty): Unit =
        entries(entries.toList())

    /**
     * @param maxEntries The maximum number of entries for the prefix list.
     */
    override fun maxEntries(maxEntries: Number) {
      cdkBuilder.maxEntries(maxEntries)
    }

    /**
     * @param prefixListName The name of the prefix list.
     */
    override fun prefixListName(prefixListName: String) {
      cdkBuilder.prefixListName(prefixListName)
    }

    public fun build(): software.amazon.awscdk.services.ec2.PrefixListProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.PrefixListProps,
  ) : CdkObject(cdkObject), PrefixListProps {
    /**
     * The address family of the prefix list.
     *
     * Default: AddressFamily.IP_V4
     */
    override fun addressFamily(): AddressFamily? =
        unwrap(this).getAddressFamily()?.let(AddressFamily::wrap)

    /**
     * The list of entries for the prefix list.
     *
     * Default: []
     */
    override fun entries(): List<CfnPrefixList.EntryProperty> =
        unwrap(this).getEntries()?.map(CfnPrefixList.EntryProperty::wrap) ?: emptyList()

    /**
     * The maximum number of entries for the prefix list.
     *
     * Default: Automatically-calculated
     */
    override fun maxEntries(): Number? = unwrap(this).getMaxEntries()

    /**
     * The name of the prefix list.
     *
     * Default: None
     */
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
