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
import software.amazon.awscdk.services.sagemaker.CfnDeviceFleet
import software.amazon.awscdk.services.sagemaker.CfnDeviceFleetProps

@CdkDslMarker
public class CfnDeviceFleetPropsDsl {
  private val cdkBuilder: CfnDeviceFleetProps.Builder = CfnDeviceFleetProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param description A description of the fleet.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param deviceFleetName Name of the device fleet. 
   */
  public fun deviceFleetName(deviceFleetName: String) {
    cdkBuilder.deviceFleetName(deviceFleetName)
  }

  /**
   * @param outputConfig The output configuration for storing sample data collected by the fleet. 
   */
  public fun outputConfig(outputConfig: IResolvable) {
    cdkBuilder.outputConfig(outputConfig)
  }

  /**
   * @param outputConfig The output configuration for storing sample data collected by the fleet. 
   */
  public fun outputConfig(outputConfig: CfnDeviceFleet.EdgeOutputConfigProperty) {
    cdkBuilder.outputConfig(outputConfig)
  }

  /**
   * @param roleArn The Amazon Resource Name (ARN) that has access to AWS Internet of Things (IoT). 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * @param tags An array of key-value pairs that contain metadata to help you categorize and
   * organize your device fleets.
   * Each tag consists of a key and a value, both of which you define.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An array of key-value pairs that contain metadata to help you categorize and
   * organize your device fleets.
   * Each tag consists of a key and a value, both of which you define.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDeviceFleetProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
