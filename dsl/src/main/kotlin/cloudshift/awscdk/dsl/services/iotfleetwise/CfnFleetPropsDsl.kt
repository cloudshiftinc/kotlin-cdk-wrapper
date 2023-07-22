@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.iotfleetwise.CfnFleetProps

/**
 * Properties for defining a `CfnFleet`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotfleetwise.*;
 * CfnFleetProps cfnFleetProps = CfnFleetProps.builder()
 * .id("id")
 * .signalCatalogArn("signalCatalogArn")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-fleet.html)
 */
@CdkDslMarker
public class CfnFleetPropsDsl {
  private val cdkBuilder: CfnFleetProps.Builder = CfnFleetProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param description (Optional) A brief description of the fleet.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param id The unique ID of the fleet. 
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param signalCatalogArn The ARN of the signal catalog associated with the fleet. 
   */
  public fun signalCatalogArn(signalCatalogArn: String) {
    cdkBuilder.signalCatalogArn(signalCatalogArn)
  }

  /**
   * @param tags (Optional) Metadata that can be used to manage the fleet.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags (Optional) Metadata that can be used to manage the fleet.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnFleetProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
