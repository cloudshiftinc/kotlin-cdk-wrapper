@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnPrefixListProps

@CdkDslMarker
public class CfnPrefixListPropsDsl {
  private val cdkBuilder: CfnPrefixListProps.Builder = CfnPrefixListProps.builder()

  private val _entries: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param addressFamily The IP address type. 
   * Valid Values: `IPv4` | `IPv6`
   */
  public fun addressFamily(addressFamily: String) {
    cdkBuilder.addressFamily(addressFamily)
  }

  /**
   * @param entries One or more entries for the prefix list.
   */
  public fun entries(vararg entries: Any) {
    _entries.addAll(listOf(*entries))
  }

  /**
   * @param entries One or more entries for the prefix list.
   */
  public fun entries(entries: Collection<Any>) {
    _entries.addAll(entries)
  }

  /**
   * @param entries One or more entries for the prefix list.
   */
  public fun entries(entries: IResolvable) {
    cdkBuilder.entries(entries)
  }

  /**
   * @param maxEntries The maximum number of entries for the prefix list. 
   */
  public fun maxEntries(maxEntries: Number) {
    cdkBuilder.maxEntries(maxEntries)
  }

  /**
   * @param prefixListName A name for the prefix list. 
   * Constraints: Up to 255 characters in length. The name cannot start with `com.amazonaws` .
   */
  public fun prefixListName(prefixListName: String) {
    cdkBuilder.prefixListName(prefixListName)
  }

  /**
   * @param tags The tags for the prefix list.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags for the prefix list.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnPrefixListProps {
    if(_entries.isNotEmpty()) cdkBuilder.entries(_entries)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
