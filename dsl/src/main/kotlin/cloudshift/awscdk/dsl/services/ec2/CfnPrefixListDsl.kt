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
import software.amazon.awscdk.services.ec2.CfnPrefixList
import software.constructs.Construct

@CdkDslMarker
public class CfnPrefixListDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnPrefixList.Builder = CfnPrefixList.Builder.create(scope, id)

  private val _entries: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The IP address type.
   *
   * Valid Values: `IPv4` | `IPv6`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-prefixlist.html#cfn-ec2-prefixlist-addressfamily)
   * @param addressFamily The IP address type. 
   */
  public fun addressFamily(addressFamily: String) {
    cdkBuilder.addressFamily(addressFamily)
  }

  /**
   * One or more entries for the prefix list.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-prefixlist.html#cfn-ec2-prefixlist-entries)
   * @param entries One or more entries for the prefix list. 
   */
  public fun entries(vararg entries: Any) {
    _entries.addAll(listOf(*entries))
  }

  /**
   * One or more entries for the prefix list.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-prefixlist.html#cfn-ec2-prefixlist-entries)
   * @param entries One or more entries for the prefix list. 
   */
  public fun entries(entries: Collection<Any>) {
    _entries.addAll(entries)
  }

  /**
   * One or more entries for the prefix list.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-prefixlist.html#cfn-ec2-prefixlist-entries)
   * @param entries One or more entries for the prefix list. 
   */
  public fun entries(entries: IResolvable) {
    cdkBuilder.entries(entries)
  }

  /**
   * The maximum number of entries for the prefix list.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-prefixlist.html#cfn-ec2-prefixlist-maxentries)
   * @param maxEntries The maximum number of entries for the prefix list. 
   */
  public fun maxEntries(maxEntries: Number) {
    cdkBuilder.maxEntries(maxEntries)
  }

  /**
   * A name for the prefix list.
   *
   * Constraints: Up to 255 characters in length. The name cannot start with `com.amazonaws` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-prefixlist.html#cfn-ec2-prefixlist-prefixlistname)
   * @param prefixListName A name for the prefix list. 
   */
  public fun prefixListName(prefixListName: String) {
    cdkBuilder.prefixListName(prefixListName)
  }

  /**
   * The tags for the prefix list.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-prefixlist.html#cfn-ec2-prefixlist-tags)
   * @param tags The tags for the prefix list. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags for the prefix list.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-prefixlist.html#cfn-ec2-prefixlist-tags)
   * @param tags The tags for the prefix list. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnPrefixList {
    if(_entries.isNotEmpty()) cdkBuilder.entries(_entries)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
