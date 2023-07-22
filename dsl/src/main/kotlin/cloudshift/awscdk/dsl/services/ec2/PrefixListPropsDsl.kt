@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.AddressFamily
import software.amazon.awscdk.services.ec2.CfnPrefixList
import software.amazon.awscdk.services.ec2.PrefixListProps

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
@CdkDslMarker
public class PrefixListPropsDsl {
  private val cdkBuilder: PrefixListProps.Builder = PrefixListProps.builder()

  private val _entries: MutableList<CfnPrefixList.EntryProperty> = mutableListOf()

  /**
   * @param addressFamily The address family of the prefix list.
   */
  public fun addressFamily(addressFamily: AddressFamily) {
    cdkBuilder.addressFamily(addressFamily)
  }

  /**
   * @param entries The list of entries for the prefix list.
   */
  public fun entries(entries: CfnPrefixListEntryPropertyDsl.() -> Unit) {
    _entries.add(CfnPrefixListEntryPropertyDsl().apply(entries).build())
  }

  /**
   * @param entries The list of entries for the prefix list.
   */
  public fun entries(entries: Collection<CfnPrefixList.EntryProperty>) {
    _entries.addAll(entries)
  }

  /**
   * @param maxEntries The maximum number of entries for the prefix list.
   */
  public fun maxEntries(maxEntries: Number) {
    cdkBuilder.maxEntries(maxEntries)
  }

  /**
   * @param prefixListName The name of the prefix list.
   */
  public fun prefixListName(prefixListName: String) {
    cdkBuilder.prefixListName(prefixListName)
  }

  public fun build(): PrefixListProps {
    if(_entries.isNotEmpty()) cdkBuilder.entries(_entries)
    return cdkBuilder.build()
  }
}
