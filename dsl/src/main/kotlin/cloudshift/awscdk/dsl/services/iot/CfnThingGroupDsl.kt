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
import software.constructs.Construct

@CdkDslMarker
public class CfnThingGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnThingGroup.Builder = CfnThingGroup.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The parent thing group name.
   *
   * A Dynamic Thing Group does not have `parentGroupName` defined.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thinggroup.html#cfn-iot-thinggroup-parentgroupname)
   * @param parentGroupName The parent thing group name. 
   */
  public fun parentGroupName(parentGroupName: String) {
    cdkBuilder.parentGroupName(parentGroupName)
  }

  /**
   * The dynamic thing group search query string.
   *
   * The `queryString` attribute *is* required for `CreateDynamicThingGroup` . The `queryString`
   * attribute *is not* required for `CreateThingGroup` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thinggroup.html#cfn-iot-thinggroup-querystring)
   * @param queryString The dynamic thing group search query string. 
   */
  public fun queryString(queryString: String) {
    cdkBuilder.queryString(queryString)
  }

  /**
   * Metadata which can be used to manage the thing group or dynamic thing group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thinggroup.html#cfn-iot-thinggroup-tags)
   * @param tags Metadata which can be used to manage the thing group or dynamic thing group. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * Metadata which can be used to manage the thing group or dynamic thing group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thinggroup.html#cfn-iot-thinggroup-tags)
   * @param tags Metadata which can be used to manage the thing group or dynamic thing group. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The thing group name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thinggroup.html#cfn-iot-thinggroup-thinggroupname)
   * @param thingGroupName The thing group name. 
   */
  public fun thingGroupName(thingGroupName: String) {
    cdkBuilder.thingGroupName(thingGroupName)
  }

  /**
   * Thing group properties.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thinggroup.html#cfn-iot-thinggroup-thinggroupproperties)
   * @param thingGroupProperties Thing group properties. 
   */
  public fun thingGroupProperties(thingGroupProperties: IResolvable) {
    cdkBuilder.thingGroupProperties(thingGroupProperties)
  }

  /**
   * Thing group properties.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thinggroup.html#cfn-iot-thinggroup-thinggroupproperties)
   * @param thingGroupProperties Thing group properties. 
   */
  public
      fun thingGroupProperties(thingGroupProperties: CfnThingGroup.ThingGroupPropertiesProperty) {
    cdkBuilder.thingGroupProperties(thingGroupProperties)
  }

  public fun build(): CfnThingGroup {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
