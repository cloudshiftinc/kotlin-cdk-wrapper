@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnCapacityReservation

/**
 * An array of key-value pairs to apply to this resource.
 *
 * For more information, see
 * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * TagSpecificationProperty tagSpecificationProperty = TagSpecificationProperty.builder()
 * .resourceType("resourceType")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-capacityreservation-tagspecification.html)
 */
@CdkDslMarker
public class CfnCapacityReservationTagSpecificationPropertyDsl {
  private val cdkBuilder: CfnCapacityReservation.TagSpecificationProperty.Builder =
      CfnCapacityReservation.TagSpecificationProperty.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param resourceType The type of resource to tag.
   * Specify `capacity-reservation` .
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

  public fun build(): CfnCapacityReservation.TagSpecificationProperty {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
