@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnThingGroup
import software.amazon.awscdk.services.iot.CfnThingGroupProps

@CdkDslMarker
public class CfnThingGroupPropsDsl {
  private val cdkBuilder: CfnThingGroupProps.Builder = CfnThingGroupProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param parentGroupName The parent thing group name.
   * A Dynamic Thing Group does not have `parentGroupName` defined.
   */
  public fun parentGroupName(parentGroupName: String) {
    cdkBuilder.parentGroupName(parentGroupName)
  }

  /**
   * @param queryString The dynamic thing group search query string.
   * The `queryString` attribute *is* required for `CreateDynamicThingGroup` . The `queryString`
   * attribute *is not* required for `CreateThingGroup` .
   */
  public fun queryString(queryString: String) {
    cdkBuilder.queryString(queryString)
  }

  /**
   * @param tags Metadata which can be used to manage the thing group or dynamic thing group.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags Metadata which can be used to manage the thing group or dynamic thing group.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param thingGroupName The thing group name.
   */
  public fun thingGroupName(thingGroupName: String) {
    cdkBuilder.thingGroupName(thingGroupName)
  }

  /**
   * @param thingGroupProperties Thing group properties.
   */
  public fun thingGroupProperties(thingGroupProperties: IResolvable) {
    cdkBuilder.thingGroupProperties(thingGroupProperties)
  }

  /**
   * @param thingGroupProperties Thing group properties.
   */
  public
      fun thingGroupProperties(thingGroupProperties: CfnThingGroup.ThingGroupPropertiesProperty) {
    cdkBuilder.thingGroupProperties(thingGroupProperties)
  }

  public fun build(): CfnThingGroupProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
