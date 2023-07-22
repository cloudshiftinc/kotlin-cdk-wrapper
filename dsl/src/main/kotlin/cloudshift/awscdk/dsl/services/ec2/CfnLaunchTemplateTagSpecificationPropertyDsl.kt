@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@CdkDslMarker
public class CfnLaunchTemplateTagSpecificationPropertyDsl {
  private val cdkBuilder: CfnLaunchTemplate.TagSpecificationProperty.Builder =
      CfnLaunchTemplate.TagSpecificationProperty.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param resourceType The type of resource to tag.
   * The `Valid Values` are all the resource types that can be tagged. However, when creating a
   * launch template, you can specify tags for the following resource types only: `instance` | `volume`
   * | `elastic-gpu` | `network-interface` | `spot-instances-request`
   *
   * To tag a resource after it has been created, see
   * [CreateTags](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html) .
   */
  public fun resourceType(resourceType: String) {
    cdkBuilder.resourceType(resourceType)
  }

  /**
   * @param tags The tags to apply to the resource.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags to apply to the resource.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnLaunchTemplate.TagSpecificationProperty {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
