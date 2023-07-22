@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.inspector

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.inspector.CfnResourceGroupProps

@CdkDslMarker
public class CfnResourceGroupPropsDsl {
  private val cdkBuilder: CfnResourceGroupProps.Builder = CfnResourceGroupProps.builder()

  private val _resourceGroupTags: MutableList<Any> = mutableListOf()

  /**
   * @param resourceGroupTags The tags (key and value pairs) that will be associated with the
   * resource group. 
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun resourceGroupTags(vararg resourceGroupTags: Any) {
    _resourceGroupTags.addAll(listOf(*resourceGroupTags))
  }

  /**
   * @param resourceGroupTags The tags (key and value pairs) that will be associated with the
   * resource group. 
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun resourceGroupTags(resourceGroupTags: Collection<Any>) {
    _resourceGroupTags.addAll(resourceGroupTags)
  }

  /**
   * @param resourceGroupTags The tags (key and value pairs) that will be associated with the
   * resource group. 
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun resourceGroupTags(resourceGroupTags: IResolvable) {
    cdkBuilder.resourceGroupTags(resourceGroupTags)
  }

  public fun build(): CfnResourceGroupProps {
    if(_resourceGroupTags.isNotEmpty()) cdkBuilder.resourceGroupTags(_resourceGroupTags)
    return cdkBuilder.build()
  }
}
