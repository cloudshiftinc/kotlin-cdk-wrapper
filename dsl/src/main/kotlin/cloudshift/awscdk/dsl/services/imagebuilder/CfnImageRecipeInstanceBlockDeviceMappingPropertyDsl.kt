@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnImageRecipe

@CdkDslMarker
public class CfnImageRecipeInstanceBlockDeviceMappingPropertyDsl {
  private val cdkBuilder: CfnImageRecipe.InstanceBlockDeviceMappingProperty.Builder =
      CfnImageRecipe.InstanceBlockDeviceMappingProperty.builder()

  /**
   * @param deviceName The device to which these mappings apply.
   */
  public fun deviceName(deviceName: String) {
    cdkBuilder.deviceName(deviceName)
  }

  /**
   * @param ebs Use to manage Amazon EBS-specific configuration for this mapping.
   */
  public fun ebs(ebs: IResolvable) {
    cdkBuilder.ebs(ebs)
  }

  /**
   * @param ebs Use to manage Amazon EBS-specific configuration for this mapping.
   */
  public fun ebs(ebs: CfnImageRecipe.EbsInstanceBlockDeviceSpecificationProperty) {
    cdkBuilder.ebs(ebs)
  }

  /**
   * @param noDevice Enter an empty string to remove a mapping from the parent image.
   * The following is an example of an empty string value in the `NoDevice` field.
   *
   * `NoDevice:""`
   */
  public fun noDevice(noDevice: String) {
    cdkBuilder.noDevice(noDevice)
  }

  /**
   * @param virtualName Manages the instance ephemeral devices.
   */
  public fun virtualName(virtualName: String) {
    cdkBuilder.virtualName(virtualName)
  }

  public fun build(): CfnImageRecipe.InstanceBlockDeviceMappingProperty = cdkBuilder.build()
}
