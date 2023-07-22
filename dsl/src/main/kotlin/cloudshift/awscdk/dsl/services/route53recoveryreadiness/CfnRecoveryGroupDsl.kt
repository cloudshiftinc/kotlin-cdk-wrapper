@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53recoveryreadiness

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroup
import software.constructs.Construct

@CdkDslMarker
public class CfnRecoveryGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnRecoveryGroup.Builder = CfnRecoveryGroup.Builder.create(scope, id)

  private val _cells: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * A list of the cell Amazon Resource Names (ARNs) in the recovery group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-recoverygroup.html#cfn-route53recoveryreadiness-recoverygroup-cells)
   * @param cells A list of the cell Amazon Resource Names (ARNs) in the recovery group. 
   */
  public fun cells(vararg cells: String) {
    _cells.addAll(listOf(*cells))
  }

  /**
   * A list of the cell Amazon Resource Names (ARNs) in the recovery group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-recoverygroup.html#cfn-route53recoveryreadiness-recoverygroup-cells)
   * @param cells A list of the cell Amazon Resource Names (ARNs) in the recovery group. 
   */
  public fun cells(cells: Collection<String>) {
    _cells.addAll(cells)
  }

  /**
   * The name of the recovery group to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-recoverygroup.html#cfn-route53recoveryreadiness-recoverygroup-recoverygroupname)
   * @param recoveryGroupName The name of the recovery group to create. 
   */
  public fun recoveryGroupName(recoveryGroupName: String) {
    cdkBuilder.recoveryGroupName(recoveryGroupName)
  }

  /**
   * A collection of tags associated with a resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-recoverygroup.html#cfn-route53recoveryreadiness-recoverygroup-tags)
   * @param tags A collection of tags associated with a resource. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * A collection of tags associated with a resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-recoverygroup.html#cfn-route53recoveryreadiness-recoverygroup-tags)
   * @param tags A collection of tags associated with a resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnRecoveryGroup {
    if(_cells.isNotEmpty()) cdkBuilder.cells(_cells)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
