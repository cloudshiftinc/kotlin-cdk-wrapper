@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.docdb

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.docdb.CfnDBSubnetGroupProps

/**
 * Properties for defining a `CfnDBSubnetGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.docdb.*;
 * CfnDBSubnetGroupProps cfnDBSubnetGroupProps = CfnDBSubnetGroupProps.builder()
 * .dbSubnetGroupDescription("dbSubnetGroupDescription")
 * .subnetIds(List.of("subnetIds"))
 * // the properties below are optional
 * .dbSubnetGroupName("dbSubnetGroupName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbsubnetgroup.html)
 */
@CdkDslMarker
public class CfnDBSubnetGroupPropsDsl {
  private val cdkBuilder: CfnDBSubnetGroupProps.Builder = CfnDBSubnetGroupProps.builder()

  private val _subnetIds: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param dbSubnetGroupDescription The description for the subnet group. 
   */
  public fun dbSubnetGroupDescription(dbSubnetGroupDescription: String) {
    cdkBuilder.dbSubnetGroupDescription(dbSubnetGroupDescription)
  }

  /**
   * @param dbSubnetGroupName The name for the subnet group. This value is stored as a lowercase
   * string.
   * Constraints: Must contain no more than 255 letters, numbers, periods, underscores, spaces, or
   * hyphens. Must not be default.
   *
   * Example: `mySubnetgroup`
   */
  public fun dbSubnetGroupName(dbSubnetGroupName: String) {
    cdkBuilder.dbSubnetGroupName(dbSubnetGroupName)
  }

  /**
   * @param subnetIds The Amazon EC2 subnet IDs for the subnet group. 
   */
  public fun subnetIds(vararg subnetIds: String) {
    _subnetIds.addAll(listOf(*subnetIds))
  }

  /**
   * @param subnetIds The Amazon EC2 subnet IDs for the subnet group. 
   */
  public fun subnetIds(subnetIds: Collection<String>) {
    _subnetIds.addAll(subnetIds)
  }

  /**
   * @param tags The tags to be assigned to the subnet group.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags to be assigned to the subnet group.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDBSubnetGroupProps {
    if(_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
