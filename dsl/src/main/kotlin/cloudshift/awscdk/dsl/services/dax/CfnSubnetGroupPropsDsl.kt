@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dax

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.dax.CfnSubnetGroupProps

/**
 * Properties for defining a `CfnSubnetGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dax.*;
 * CfnSubnetGroupProps cfnSubnetGroupProps = CfnSubnetGroupProps.builder()
 * .subnetIds(List.of("subnetIds"))
 * // the properties below are optional
 * .description("description")
 * .subnetGroupName("subnetGroupName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-subnetgroup.html)
 */
@CdkDslMarker
public class CfnSubnetGroupPropsDsl {
  private val cdkBuilder: CfnSubnetGroupProps.Builder = CfnSubnetGroupProps.builder()

  private val _subnetIds: MutableList<String> = mutableListOf()

  /**
   * @param description The description of the subnet group.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param subnetGroupName The name of the subnet group.
   */
  public fun subnetGroupName(subnetGroupName: String) {
    cdkBuilder.subnetGroupName(subnetGroupName)
  }

  /**
   * @param subnetIds A list of VPC subnet IDs for the subnet group. 
   */
  public fun subnetIds(vararg subnetIds: String) {
    _subnetIds.addAll(listOf(*subnetIds))
  }

  /**
   * @param subnetIds A list of VPC subnet IDs for the subnet group. 
   */
  public fun subnetIds(subnetIds: Collection<String>) {
    _subnetIds.addAll(subnetIds)
  }

  public fun build(): CfnSubnetGroupProps {
    if(_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
    return cdkBuilder.build()
  }
}
