@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTask
import software.constructs.Construct

@CdkDslMarker
public class CfnWirelessDeviceImportTaskDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnWirelessDeviceImportTask.Builder =
      CfnWirelessDeviceImportTask.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The name of the destination that describes the IoT rule to route messages from the Sidewalk
   * devices in the import task to other applications.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdeviceimporttask.html#cfn-iotwireless-wirelessdeviceimporttask-destinationname)
   * @param destinationName The name of the destination that describes the IoT rule to route
   * messages from the Sidewalk devices in the import task to other applications. 
   */
  public fun destinationName(destinationName: String) {
    cdkBuilder.destinationName(destinationName)
  }

  /**
   * The Sidewalk-related information of the wireless device import task.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdeviceimporttask.html#cfn-iotwireless-wirelessdeviceimporttask-sidewalk)
   * @param sidewalk The Sidewalk-related information of the wireless device import task. 
   */
  public fun sidewalk(sidewalk: IResolvable) {
    cdkBuilder.sidewalk(sidewalk)
  }

  /**
   * The Sidewalk-related information of the wireless device import task.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdeviceimporttask.html#cfn-iotwireless-wirelessdeviceimporttask-sidewalk)
   * @param sidewalk The Sidewalk-related information of the wireless device import task. 
   */
  public fun sidewalk(sidewalk: CfnWirelessDeviceImportTask.SidewalkProperty) {
    cdkBuilder.sidewalk(sidewalk)
  }

  /**
   * Adds to or modifies the tags of the given resource.
   *
   * Tags are metadata that you can use to manage a resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdeviceimporttask.html#cfn-iotwireless-wirelessdeviceimporttask-tags)
   * @param tags Adds to or modifies the tags of the given resource. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * Adds to or modifies the tags of the given resource.
   *
   * Tags are metadata that you can use to manage a resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdeviceimporttask.html#cfn-iotwireless-wirelessdeviceimporttask-tags)
   * @param tags Adds to or modifies the tags of the given resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnWirelessDeviceImportTask {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
