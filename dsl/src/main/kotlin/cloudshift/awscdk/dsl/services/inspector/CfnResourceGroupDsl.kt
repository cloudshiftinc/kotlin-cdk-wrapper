@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.inspector

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.inspector.CfnResourceGroup
import software.constructs.Construct

/**
 * The `AWS::Inspector::ResourceGroup` resource is used to create Amazon Inspector resource groups.
 *
 * A resource group defines a set of tags that, when queried, identify the AWS resources that make
 * up the assessment target.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.inspector.*;
 * CfnResourceGroup cfnResourceGroup = CfnResourceGroup.Builder.create(this, "MyCfnResourceGroup")
 * .resourceGroupTags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-resourcegroup.html)
 */
@CdkDslMarker
public class CfnResourceGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnResourceGroup.Builder = CfnResourceGroup.Builder.create(scope, id)

  private val _resourceGroupTags: MutableList<Any> = mutableListOf()

  /**
   * The tags (key and value pairs) that will be associated with the resource group.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-resourcegroup.html#cfn-inspector-resourcegroup-resourcegrouptags)
   * @param resourceGroupTags The tags (key and value pairs) that will be associated with the
   * resource group. 
   */
  public fun resourceGroupTags(vararg resourceGroupTags: Any) {
    _resourceGroupTags.addAll(listOf(*resourceGroupTags))
  }

  /**
   * The tags (key and value pairs) that will be associated with the resource group.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-resourcegroup.html#cfn-inspector-resourcegroup-resourcegrouptags)
   * @param resourceGroupTags The tags (key and value pairs) that will be associated with the
   * resource group. 
   */
  public fun resourceGroupTags(resourceGroupTags: Collection<Any>) {
    _resourceGroupTags.addAll(resourceGroupTags)
  }

  /**
   * The tags (key and value pairs) that will be associated with the resource group.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-resourcegroup.html#cfn-inspector-resourcegroup-resourcegrouptags)
   * @param resourceGroupTags The tags (key and value pairs) that will be associated with the
   * resource group. 
   */
  public fun resourceGroupTags(resourceGroupTags: IResolvable) {
    cdkBuilder.resourceGroupTags(resourceGroupTags)
  }

  public fun build(): CfnResourceGroup {
    if(_resourceGroupTags.isNotEmpty()) cdkBuilder.resourceGroupTags(_resourceGroupTags)
    return cdkBuilder.build()
  }
}
