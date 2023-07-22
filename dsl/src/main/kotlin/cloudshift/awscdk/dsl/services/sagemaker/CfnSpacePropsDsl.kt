@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnSpace
import software.amazon.awscdk.services.sagemaker.CfnSpaceProps

@CdkDslMarker
public class CfnSpacePropsDsl {
  private val cdkBuilder: CfnSpaceProps.Builder = CfnSpaceProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param domainId The ID of the associated Domain. 
   */
  public fun domainId(domainId: String) {
    cdkBuilder.domainId(domainId)
  }

  /**
   * @param spaceName The name of the space. 
   */
  public fun spaceName(spaceName: String) {
    cdkBuilder.spaceName(spaceName)
  }

  /**
   * @param spaceSettings A collection of space settings.
   */
  public fun spaceSettings(spaceSettings: IResolvable) {
    cdkBuilder.spaceSettings(spaceSettings)
  }

  /**
   * @param spaceSettings A collection of space settings.
   */
  public fun spaceSettings(spaceSettings: CfnSpace.SpaceSettingsProperty) {
    cdkBuilder.spaceSettings(spaceSettings)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnSpaceProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
